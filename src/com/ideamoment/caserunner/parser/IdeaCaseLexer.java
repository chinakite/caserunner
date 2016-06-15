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
		RESPONSE=18, TIMEOUT=19, EXISTS=20, StringLiteral=21, ID=22, COMMENT=23, 
		LINE_COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "WS", "NUMBER", "DIGIT", "GROUP", "CASE", 
		"RULE", "GET", "POST", "WAIT", "INPUT", "TO", "CHECK", "CLICK", "ASSERT", 
		"RESPONSE", "TIMEOUT", "EXISTS", "HexDigits", "HexDigitOrUnderscore", 
		"HexDigit", "StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"UnicodeEscape", "ZeroToThree", "ID", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", null, null, "'group'", "'case'", "'rule'", 
		"'get'", "'post'", "'wait'", "'input'", "'to'", "'check'", "'click'", 
		"'assert'", "'response'", "'timeout'", "'exists'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WS", "NUMBER", "GROUP", "CASE", "RULE", 
		"GET", "POST", "WAIT", "INPUT", "TO", "CHECK", "CLICK", "ASSERT", "RESPONSE", 
		"TIMEOUT", "EXISTS", "StringLiteral", "ID", "COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u010e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6O\n\6\r\6\16\6"+
		"P\3\6\3\6\3\7\6\7V\n\7\r\7\16\7W\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\7\7a"+
		"\n\7\f\7\16\7d\13\7\3\7\3\7\6\7h\n\7\r\7\16\7i\5\7l\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00c4\n\27\f\27\16"+
		"\27\u00c7\13\27\3\27\5\27\u00ca\n\27\3\30\3\30\5\30\u00ce\n\30\3\31\3"+
		"\31\3\32\3\32\5\32\u00d4\n\32\3\32\3\32\3\33\6\33\u00d9\n\33\r\33\16\33"+
		"\u00da\3\34\3\34\5\34\u00df\n\34\3\35\3\35\3\35\5\35\u00e4\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \7 \u00f1\n \f \16 \u00f4"+
		"\13 \3!\3!\3!\3!\7!\u00fa\n!\f!\16!\u00fd\13!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\7\"\u0108\n\"\f\"\16\"\u010b\13\"\3\"\3\"\3\u00fb\2#\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#"+
		"\22%\23\'\24)\25+\26-\2/\2\61\2\63\27\65\2\67\29\2;\2=\2?\30A\31C\32\3"+
		"\2\13\5\2\13\f\17\17\"\"\3\2\62;\5\2\62;CHch\4\2$$^^\n\2$$))^^ddhhppt"+
		"tvv\3\2\62\65\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\u0115\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13N\3\2\2\2\rk\3\2\2\2"+
		"\17m\3\2\2\2\21o\3\2\2\2\23u\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0083"+
		"\3\2\2\2\33\u0088\3\2\2\2\35\u008d\3\2\2\2\37\u0093\3\2\2\2!\u0096\3\2"+
		"\2\2#\u009c\3\2\2\2%\u00a2\3\2\2\2\'\u00a9\3\2\2\2)\u00b2\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00c1\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2"+
		"\2\65\u00d8\3\2\2\2\67\u00de\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00ee\3\2\2\2A\u00f5\3\2\2\2C\u0103\3\2\2\2EF\7}\2\2F\4\3\2"+
		"\2\2GH\7\177\2\2H\6\3\2\2\2IJ\7=\2\2J\b\3\2\2\2KL\7.\2\2L\n\3\2\2\2MO"+
		"\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\6\2\2S"+
		"\f\3\2\2\2TV\5\17\b\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xl\3\2\2"+
		"\2Y[\5\17\b\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\7"+
		"\60\2\2_a\5\17\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cl\3\2\2\2d"+
		"b\3\2\2\2eg\7\60\2\2fh\5\17\b\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jl\3\2\2\2kU\3\2\2\2kZ\3\2\2\2ke\3\2\2\2l\16\3\2\2\2mn\t\3\2\2n\20\3"+
		"\2\2\2op\7i\2\2pq\7t\2\2qr\7q\2\2rs\7w\2\2st\7r\2\2t\22\3\2\2\2uv\7e\2"+
		"\2vw\7c\2\2wx\7u\2\2xy\7g\2\2y\24\3\2\2\2z{\7t\2\2{|\7w\2\2|}\7n\2\2}"+
		"~\7g\2\2~\26\3\2\2\2\177\u0080\7i\2\2\u0080\u0081\7g\2\2\u0081\u0082\7"+
		"v\2\2\u0082\30\3\2\2\2\u0083\u0084\7r\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7v\2\2\u0087\32\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7r\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7v\2\2\u0092\36\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7q\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7j\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7m\2\2\u009b\"\3\2\2\2\u009c\u009d\7e\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7m\2\2"+
		"\u00a1$\3\2\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7u\2"+
		"\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7v\2\2\u00a8&\3\2"+
		"\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad"+
		"\7r\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7o\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7w\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7z\2"+
		"\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0,\3\2\2\2\u00c1\u00c9\5\61\31\2\u00c2\u00c4\5/\30\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\61\31\2\u00c9"+
		"\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca.\3\2\2\2\u00cb\u00ce\5\61\31"+
		"\2\u00cc\u00ce\7a\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\60"+
		"\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0\62\3\2\2\2\u00d1\u00d3\7$\2\2\u00d2"+
		"\u00d4\5\65\33\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\7$\2\2\u00d6\64\3\2\2\2\u00d7\u00d9\5\67\34\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\66\3\2\2\2\u00dc\u00df\n\5\2\2\u00dd\u00df\59\35\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df8\3\2\2\2\u00e0\u00e1\7^\2\2\u00e1\u00e4"+
		"\t\6\2\2\u00e2\u00e4\5;\36\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		":\3\2\2\2\u00e5\u00e6\7^\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\5\61\31\2"+
		"\u00e8\u00e9\5\61\31\2\u00e9\u00ea\5\61\31\2\u00ea\u00eb\5\61\31\2\u00eb"+
		"<\3\2\2\2\u00ec\u00ed\t\7\2\2\u00ed>\3\2\2\2\u00ee\u00f2\t\b\2\2\u00ef"+
		"\u00f1\t\t\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3@\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6"+
		"\7\61\2\2\u00f6\u00f7\7,\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\13\2\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff"+
		"\u0100\7\61\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b!\2\2\u0102B\3\2\2\2"+
		"\u0103\u0104\7\61\2\2\u0104\u0105\7\61\2\2\u0105\u0109\3\2\2\2\u0106\u0108"+
		"\n\n\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\b\""+
		"\2\2\u010dD\3\2\2\2\23\2PW\\bik\u00c5\u00c9\u00cd\u00d3\u00da\u00de\u00e3"+
		"\u00f2\u00fb\u0109\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}