grammar IdeaCase;

options {
    language=Java;                                   // 使用java
}

parseRoot
    : groupStatement* caseStatement* EOF
    ;

caseStatement
    : CASE ID '{' commandStatement* '}' ';'*
    ;

commandStatement
    : getStatement ';'
    | waitStatement ';'
    | assertStatement ';'
    | inputStatement ';'
    ;

// STATEMENTS / BLOCKS
groupStatement
    : GROUP ID '{' groupBody? '}' ';'*
    ;

groupBody
    : ID (',' ID)*
    ;

getStatement
    : GET StringLiteral
    ;

waitStatement
    : WAIT NUMBER
    | WAIT RESPONSE timeoutStatement?
    | WAIT RESPONSE
    ;

timeoutStatement
    : TIMEOUT NUMBER
    ;

assertStatement
    : existsStatement
    ;

existsStatement
    : ASSERT StringLiteral EXISTS
    ;

inputStatement
    : inputValue inputValueTo
    ;
    
WS
    : [ \t\n\r]+ -> skip
    ;                            // 空白， 后面的->skip表示antlr4在分析语言的文本时，符合这个规则的词法将被无视

NUMBER
    : DIGIT+
    | DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;                        // 数字

fragment DIGIT : [0-9];

// LEXER
// Keywords
GROUP               : 'group';
CASE                : 'case';
RULE                : 'rule';
GET                 : 'get';
POST                : 'post';
WAIT                : 'wait';
INPUT               : 'input';
TO                  : 'to';
CHECK               : 'check';
CLICK               : 'click';
ASSERT              : 'assert';
RESPONSE            : 'response';
TIMEOUT             : 'timeout';

EXISTS              : 'exists';

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

// §3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   UnicodeEscape
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;
    
fragment
inputValue
    :   INPUT StringLiteral
    ;
    
fragment
inputValueTo
    :   TO StringLiteral
    ;

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;                        // 标识符，由0到多个小写字母组成


COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;