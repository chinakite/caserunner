// Generated from D:/gitrepos/caserunner/src/com/ideamoment/caserunner/parser\IdeaCase.g4 by ANTLR 4.5.1
package com.ideamoment.caserunner.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IdeaCaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, NUMBER=6, GROUP=7, CASE=8, RULE=9, 
		GET=10, POST=11, WAIT=12, INPUT=13, TO=14, CHECK=15, CLICK=16, ASSERT=17, 
		RESPONSE=18, TIMEOUT=19, WHEN=20, EXISTS=21, StringLiteral=22, ID=23, 
		COMMENT=24, LINE_COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "WS", "NUMBER", "DIGIT", "GROUP", "CASE", 
		"RULE", "GET", "POST", "WAIT", "INPUT", "TO", "CHECK", "CLICK", "ASSERT", 
		"RESPONSE", "TIMEOUT", "WHEN", "EXISTS", "HexDigits", "HexDigitOrUnderscore", 
		"HexDigit", "StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"UnicodeEscape", "ZeroToThree", "ID", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", null, null, "'group'", "'case'", "'rule'", 
		"'get'", "'post'", "'wait'", "'input'", "'to'", "'check'", "'click'", 
		"'assert'", "'response'", "'timeout'", "'when'", "'exists'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WS", "NUMBER", "GROUP", "CASE", "RULE", 
		"GET", "POST", "WAIT", "INPUT", "TO", "CHECK", "CLICK", "ASSERT", "RESPONSE", 
		"TIMEOUT", "WHEN", "EXISTS", "StringLiteral", "ID", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public IdeaCaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IdeaCase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6Q\n\6\r\6"+
		"\16\6R\3\6\3\6\3\7\6\7X\n\7\r\7\16\7Y\3\7\6\7]\n\7\r\7\16\7^\3\7\3\7\7"+
		"\7c\n\7\f\7\16\7f\13\7\3\7\3\7\6\7j\n\7\r\7\16\7k\5\7n\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\7\30\u00cb\n\30\f\30\16\30\u00ce\13\30\3\30\5\30\u00d1\n\30\3\31\3"+
		"\31\5\31\u00d5\n\31\3\32\3\32\3\33\3\33\5\33\u00db\n\33\3\33\3\33\3\34"+
		"\6\34\u00e0\n\34\r\34\16\34\u00e1\3\35\3\35\5\35\u00e6\n\35\3\36\3\36"+
		"\3\36\5\36\u00eb\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\7"+
		"!\u00f8\n!\f!\16!\u00fb\13!\3\"\3\"\3\"\3\"\7\"\u0101\n\"\f\"\16\"\u0104"+
		"\13\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u010f\n#\f#\16#\u0112\13#\3#"+
		"\3#\3\u0102\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r"+
		"\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\2\61\2\63\2\65\30\67"+
		"\29\2;\2=\2?\2A\31C\32E\33\3\2\13\5\2\13\f\17\17\"\"\3\2\62;\5\2\62;C"+
		"Hch\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\5\2C\\aac|\6\2\62;C\\aac|\4"+
		"\2\f\f\17\17\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2"+
		"\2\tM\3\2\2\2\13P\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23w\3\2\2"+
		"\2\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2\35\u008f"+
		"\3\2\2\2\37\u0095\3\2\2\2!\u0098\3\2\2\2#\u009e\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00b4\3\2\2\2+\u00bc\3\2\2\2-\u00c1\3\2\2\2/\u00c8\3"+
		"\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67\u00df\3\2"+
		"\2\29\u00e5\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00f3\3\2\2\2A\u00f5"+
		"\3\2\2\2C\u00fc\3\2\2\2E\u010a\3\2\2\2GH\7}\2\2H\4\3\2\2\2IJ\7\177\2\2"+
		"J\6\3\2\2\2KL\7=\2\2L\b\3\2\2\2MN\7.\2\2N\n\3\2\2\2OQ\t\2\2\2PO\3\2\2"+
		"\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\6\2\2U\f\3\2\2\2VX\5\17"+
		"\b\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zn\3\2\2\2[]\5\17\b\2\\[\3"+
		"\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`d\7\60\2\2ac\5\17\b\2"+
		"ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2en\3\2\2\2fd\3\2\2\2gi\7\60\2"+
		"\2hj\5\17\b\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mW\3\2"+
		"\2\2m\\\3\2\2\2mg\3\2\2\2n\16\3\2\2\2op\t\3\2\2p\20\3\2\2\2qr\7i\2\2r"+
		"s\7t\2\2st\7q\2\2tu\7w\2\2uv\7r\2\2v\22\3\2\2\2wx\7e\2\2xy\7c\2\2yz\7"+
		"u\2\2z{\7g\2\2{\24\3\2\2\2|}\7t\2\2}~\7w\2\2~\177\7n\2\2\177\u0080\7g"+
		"\2\2\u0080\26\3\2\2\2\u0081\u0082\7i\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7v\2\2\u0084\30\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7v\2\2\u0089\32\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7k\2\2\u008d\u008e\7v\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7r\2\2\u0092\u0093\7w\2\2\u0093"+
		"\u0094\7v\2\2\u0094\36\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7q\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7j\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7e\2\2\u009c\u009d\7m\2\2\u009d\"\3\2\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7m\2\2"+
		"\u00a3$\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7u\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7v\2\2\u00aa&\3\2"+
		"\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7r\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7w\2\2"+
		"\u00ba\u00bb\7v\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2"+
		"\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7v\2\2\u00c6\u00c7\7u\2\2\u00c7.\3\2\2\2\u00c8\u00d0\5\63\32\2\u00c9"+
		"\u00cb\5\61\31\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\5\63\32\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\60\3\2"+
		"\2\2\u00d2\u00d5\5\63\32\2\u00d3\u00d5\7a\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\t\4\2\2\u00d7\64\3\2\2\2\u00d8"+
		"\u00da\7$\2\2\u00d9\u00db\5\67\34\2\u00da\u00d9\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\66\3\2\2\2\u00de\u00e0"+
		"\59\35\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e28\3\2\2\2\u00e3\u00e6\n\5\2\2\u00e4\u00e6\5;\36\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7"+
		"^\2\2\u00e8\u00eb\t\6\2\2\u00e9\u00eb\5=\37\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\5\63\32\2\u00ef\u00f0\5\63\32\2\u00f0\u00f1\5\63\32\2\u00f1\u00f2"+
		"\5\63\32\2\u00f2>\3\2\2\2\u00f3\u00f4\t\7\2\2\u00f4@\3\2\2\2\u00f5\u00f9"+
		"\t\b\2\2\u00f6\u00f8\t\t\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faB\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7,\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101"+
		"\13\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\7,\2\2\u0106\u0107\7\61\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\"\2\2\u0109"+
		"D\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u010c\7\61\2\2\u010c\u0110\3\2\2"+
		"\2\u010d\u010f\n\n\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\b#\2\2\u0114F\3\2\2\2\23\2RY^dkm\u00cc\u00d0\u00d4\u00da\u00e1"+
		"\u00e5\u00ea\u00f9\u0102\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}