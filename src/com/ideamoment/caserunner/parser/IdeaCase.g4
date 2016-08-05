grammar IdeaCase;

options {
    language=Java;                                   // 使用java
}

parseRoot
    : groupStatement* caseStatement* EOF
    ;

caseStatement
    : CASE ID dependStatement?  '{' commandStatement* '}' ';'*
    ;

commandStatement
    : getStatement ';'
    | waitStatement ';'
    | assertStatement ';'
    | inputStatement ';'
    | clickStatement ';'
    ;

// STATEMENTS / BLOCKS
groupStatement
    : GROUP ID '{' groupBody? '}' ';'*
    ;

groupBody
    : ID (',' ID)*
    ;

getStatement
    : GET StringLiteral timeoutStatement?
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
    : ASSERT logicStatement
    | ASSERT binaryStatement
    | ASSERT conditionStatament
    ;

existsStatement
    : StringLiteral EXISTS
    ;

shownStatement
    : StringLiteral SHOWN
    ;

binaryStatement
    : binaryPartStatement BIN_OP binaryPartStatement
    ;

binaryPartStatement
    : StringLiteral'.'methodStatement
    | StringLiteral
    | NUMBER
    ;

LOGIC_OP
    : OP_AND
    | OP_OR
    ;

BIN_OP
    : OP_EQ
    | OP_NE
    | OP_LT
    | OP_LE
    | OP_GT
    | OP_GE
    ;

methodStatement
    : M_CSS'('StringLiteral')'
    | M_TEXT'()'
    | M_VAL'()'
    | M_ATTR'('StringLiteral')'
    ;

inputStatement
    : inputValue inputTo
    ;

clickStatement
    : CLICK StringLiteral whenStatement?
    ;

inputValue
    :   INPUT StringLiteral
    ;

inputTo
    :   TO StringLiteral
    ;

conditionStatament
    :   existsStatement
    |   shownStatement
    |   binaryStatement
    ;

logicStatement
    : conditionStatament LOGIC_OP conditionStatament
    ;

whenStatement
    :   WHEN conditionStatament timeoutStatement?
    ;

dependStatement
    :   DEPEND ID (',' ID)*
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
WHEN                : 'when';
DEPEND              : 'depend';

EXISTS              : 'exists';
SHOWN               : 'shown';

OP_EQ               : '=';
OP_NE               : '!=';
OP_GT               : '>';
OP_GE               : '>=';
OP_LT               : '<';
OP_LE               : '<=';
OP_AND              : '&&';
OP_OR               : '||';

M_CSS               : 'css';
M_TEXT              : 'text';
M_ATTR              : 'attr';
M_VAL               : 'val';

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

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;                        // 标识符，由0到多个小写字母组成


COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;