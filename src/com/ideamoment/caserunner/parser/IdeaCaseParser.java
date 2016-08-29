// Generated from D:/gitrepos/caserunner/src/com/ideamoment/caserunner/parser\IdeaCase.g4 by ANTLR 4.5.1
package com.ideamoment.caserunner.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IdeaCaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LOGIC_OP=9, 
		BIN_OP=10, WS=11, NUMBER=12, GROUP=13, CASE=14, RULE=15, GET=16, POST=17, 
		WAIT=18, INPUT=19, TO=20, CHECK=21, CLICK=22, ASSERT=23, RESPONSE=24, 
		TIMEOUT=25, WHEN=26, DEPEND=27, EXISTS=28, SHOWN=29, OP_EQ=30, OP_NE=31, 
		OP_GT=32, OP_GE=33, OP_LT=34, OP_LE=35, OP_AND=36, OP_OR=37, M_CSS=38, 
		M_TEXT=39, M_ATTR=40, M_VAL=41, D_RAND=42, D_SEQ=43, D_UNIQUE=44, D_REF=45, 
		D_PROP=46, StringLiteral=47, ID=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_parseRoot = 0, RULE_caseStatement = 1, RULE_commandStatement = 2, 
		RULE_groupStatement = 3, RULE_groupBody = 4, RULE_getStatement = 5, RULE_waitStatement = 6, 
		RULE_timeoutStatement = 7, RULE_assertStatement = 8, RULE_existsStatement = 9, 
		RULE_shownStatement = 10, RULE_binaryStatement = 11, RULE_binaryPartStatement = 12, 
		RULE_methodStatement = 13, RULE_inputStatement = 14, RULE_clickStatement = 15, 
		RULE_inputValue = 16, RULE_inputTo = 17, RULE_dataParameterizeStatement = 18, 
		RULE_dataMethodStatement = 19, RULE_dataPropertyStatement = 20, RULE_dataMethodParam1 = 21, 
		RULE_dataMethodParam2 = 22, RULE_conditionStatament = 23, RULE_logicStatement = 24, 
		RULE_whenStatement = 25, RULE_dependStatement = 26;
	public static final String[] ruleNames = {
		"parseRoot", "caseStatement", "commandStatement", "groupStatement", "groupBody", 
		"getStatement", "waitStatement", "timeoutStatement", "assertStatement", 
		"existsStatement", "shownStatement", "binaryStatement", "binaryPartStatement", 
		"methodStatement", "inputStatement", "clickStatement", "inputValue", "inputTo", 
		"dataParameterizeStatement", "dataMethodStatement", "dataPropertyStatement", 
		"dataMethodParam1", "dataMethodParam2", "conditionStatament", "logicStatement", 
		"whenStatement", "dependStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'.'", "'('", "')'", "'()'", null, null, 
		null, null, "'group'", "'case'", "'rule'", "'get'", "'post'", "'wait'", 
		"'input'", "'to'", "'check'", "'click'", "'assert'", "'response'", "'timeout'", 
		"'when'", "'depend'", "'exists'", "'shown'", "'='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'&&'", "'||'", "'css'", "'text'", "'attr'", "'val'", "'$rand'", 
		"'$seq'", "'$unique'", "'$ref'", "'$prop'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "LOGIC_OP", "BIN_OP", 
		"WS", "NUMBER", "GROUP", "CASE", "RULE", "GET", "POST", "WAIT", "INPUT", 
		"TO", "CHECK", "CLICK", "ASSERT", "RESPONSE", "TIMEOUT", "WHEN", "DEPEND", 
		"EXISTS", "SHOWN", "OP_EQ", "OP_NE", "OP_GT", "OP_GE", "OP_LT", "OP_LE", 
		"OP_AND", "OP_OR", "M_CSS", "M_TEXT", "M_ATTR", "M_VAL", "D_RAND", "D_SEQ", 
		"D_UNIQUE", "D_REF", "D_PROP", "StringLiteral", "ID", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "IdeaCase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IdeaCaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseRootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IdeaCaseParser.EOF, 0); }
		public List<GroupStatementContext> groupStatement() {
			return getRuleContexts(GroupStatementContext.class);
		}
		public GroupStatementContext groupStatement(int i) {
			return getRuleContext(GroupStatementContext.class,i);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public ParseRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterParseRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitParseRoot(this);
		}
	}

	public final ParseRootContext parseRoot() throws RecognitionException {
		ParseRootContext _localctx = new ParseRootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP) {
				{
				{
				setState(54);
				groupStatement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(60);
				caseStatement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(IdeaCaseParser.CASE, 0); }
		public TerminalNode ID() { return getToken(IdeaCaseParser.ID, 0); }
		public DependStatementContext dependStatement() {
			return getRuleContext(DependStatementContext.class,0);
		}
		public List<CommandStatementContext> commandStatement() {
			return getRuleContexts(CommandStatementContext.class);
		}
		public CommandStatementContext commandStatement(int i) {
			return getRuleContext(CommandStatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CASE);
			setState(69);
			match(ID);
			setState(71);
			_la = _input.LA(1);
			if (_la==DEPEND) {
				{
				setState(70);
				dependStatement();
				}
			}

			setState(73);
			match(T__0);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << WAIT) | (1L << INPUT) | (1L << CLICK) | (1L << ASSERT))) != 0)) {
				{
				{
				setState(74);
				commandStatement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__1);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(81);
				match(T__2);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandStatementContext extends ParserRuleContext {
		public GetStatementContext getStatement() {
			return getRuleContext(GetStatementContext.class,0);
		}
		public WaitStatementContext waitStatement() {
			return getRuleContext(WaitStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public ClickStatementContext clickStatement() {
			return getRuleContext(ClickStatementContext.class,0);
		}
		public CommandStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterCommandStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitCommandStatement(this);
		}
	}

	public final CommandStatementContext commandStatement() throws RecognitionException {
		CommandStatementContext _localctx = new CommandStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandStatement);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				getStatement();
				setState(88);
				match(T__2);
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				waitStatement();
				setState(91);
				match(T__2);
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				assertStatement();
				setState(94);
				match(T__2);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				inputStatement();
				setState(97);
				match(T__2);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				clickStatement();
				setState(100);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupStatementContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(IdeaCaseParser.GROUP, 0); }
		public TerminalNode ID() { return getToken(IdeaCaseParser.ID, 0); }
		public GroupBodyContext groupBody() {
			return getRuleContext(GroupBodyContext.class,0);
		}
		public GroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitGroupStatement(this);
		}
	}

	public final GroupStatementContext groupStatement() throws RecognitionException {
		GroupStatementContext _localctx = new GroupStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_groupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(GROUP);
			setState(105);
			match(ID);
			setState(106);
			match(T__0);
			setState(108);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(107);
				groupBody();
				}
			}

			setState(110);
			match(T__1);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(111);
				match(T__2);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupBodyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IdeaCaseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IdeaCaseParser.ID, i);
		}
		public GroupBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterGroupBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitGroupBody(this);
		}
	}

	public final GroupBodyContext groupBody() throws RecognitionException {
		GroupBodyContext _localctx = new GroupBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(118);
				match(T__3);
				setState(119);
				match(ID);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetStatementContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(IdeaCaseParser.GET, 0); }
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public TimeoutStatementContext timeoutStatement() {
			return getRuleContext(TimeoutStatementContext.class,0);
		}
		public GetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterGetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitGetStatement(this);
		}
	}

	public final GetStatementContext getStatement() throws RecognitionException {
		GetStatementContext _localctx = new GetStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_getStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(GET);
			setState(126);
			match(StringLiteral);
			setState(128);
			_la = _input.LA(1);
			if (_la==TIMEOUT) {
				{
				setState(127);
				timeoutStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitStatementContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(IdeaCaseParser.WAIT, 0); }
		public TerminalNode NUMBER() { return getToken(IdeaCaseParser.NUMBER, 0); }
		public TerminalNode RESPONSE() { return getToken(IdeaCaseParser.RESPONSE, 0); }
		public TimeoutStatementContext timeoutStatement() {
			return getRuleContext(TimeoutStatementContext.class,0);
		}
		public WaitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterWaitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitWaitStatement(this);
		}
	}

	public final WaitStatementContext waitStatement() throws RecognitionException {
		WaitStatementContext _localctx = new WaitStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_waitStatement);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(WAIT);
				setState(131);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(WAIT);
				setState(133);
				match(RESPONSE);
				setState(135);
				_la = _input.LA(1);
				if (_la==TIMEOUT) {
					{
					setState(134);
					timeoutStatement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(WAIT);
				setState(138);
				match(RESPONSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeoutStatementContext extends ParserRuleContext {
		public TerminalNode TIMEOUT() { return getToken(IdeaCaseParser.TIMEOUT, 0); }
		public TerminalNode NUMBER() { return getToken(IdeaCaseParser.NUMBER, 0); }
		public TimeoutStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeoutStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterTimeoutStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitTimeoutStatement(this);
		}
	}

	public final TimeoutStatementContext timeoutStatement() throws RecognitionException {
		TimeoutStatementContext _localctx = new TimeoutStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timeoutStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TIMEOUT);
			setState(142);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(IdeaCaseParser.ASSERT, 0); }
		public LogicStatementContext logicStatement() {
			return getRuleContext(LogicStatementContext.class,0);
		}
		public BinaryStatementContext binaryStatement() {
			return getRuleContext(BinaryStatementContext.class,0);
		}
		public ConditionStatamentContext conditionStatament() {
			return getRuleContext(ConditionStatamentContext.class,0);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assertStatement);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ASSERT);
				setState(145);
				logicStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ASSERT);
				setState(147);
				binaryStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ASSERT);
				setState(149);
				conditionStatament();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsStatementContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public TerminalNode EXISTS() { return getToken(IdeaCaseParser.EXISTS, 0); }
		public ExistsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterExistsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitExistsStatement(this);
		}
	}

	public final ExistsStatementContext existsStatement() throws RecognitionException {
		ExistsStatementContext _localctx = new ExistsStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_existsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(StringLiteral);
			setState(153);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShownStatementContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public TerminalNode SHOWN() { return getToken(IdeaCaseParser.SHOWN, 0); }
		public ShownStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shownStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterShownStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitShownStatement(this);
		}
	}

	public final ShownStatementContext shownStatement() throws RecognitionException {
		ShownStatementContext _localctx = new ShownStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shownStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(StringLiteral);
			setState(156);
			match(SHOWN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryStatementContext extends ParserRuleContext {
		public List<BinaryPartStatementContext> binaryPartStatement() {
			return getRuleContexts(BinaryPartStatementContext.class);
		}
		public BinaryPartStatementContext binaryPartStatement(int i) {
			return getRuleContext(BinaryPartStatementContext.class,i);
		}
		public TerminalNode BIN_OP() { return getToken(IdeaCaseParser.BIN_OP, 0); }
		public BinaryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterBinaryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitBinaryStatement(this);
		}
	}

	public final BinaryStatementContext binaryStatement() throws RecognitionException {
		BinaryStatementContext _localctx = new BinaryStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binaryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			binaryPartStatement();
			setState(159);
			match(BIN_OP);
			setState(160);
			binaryPartStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryPartStatementContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public MethodStatementContext methodStatement() {
			return getRuleContext(MethodStatementContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(IdeaCaseParser.NUMBER, 0); }
		public BinaryPartStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryPartStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterBinaryPartStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitBinaryPartStatement(this);
		}
	}

	public final BinaryPartStatementContext binaryPartStatement() throws RecognitionException {
		BinaryPartStatementContext _localctx = new BinaryPartStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binaryPartStatement);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(StringLiteral);
				setState(163);
				match(T__4);
				setState(164);
				methodStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodStatementContext extends ParserRuleContext {
		public TerminalNode M_CSS() { return getToken(IdeaCaseParser.M_CSS, 0); }
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public TerminalNode M_TEXT() { return getToken(IdeaCaseParser.M_TEXT, 0); }
		public TerminalNode M_VAL() { return getToken(IdeaCaseParser.M_VAL, 0); }
		public TerminalNode M_ATTR() { return getToken(IdeaCaseParser.M_ATTR, 0); }
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitMethodStatement(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodStatement);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case M_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(M_CSS);
				setState(170);
				match(T__5);
				setState(171);
				match(StringLiteral);
				setState(172);
				match(T__6);
				}
				break;
			case M_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(M_TEXT);
				setState(174);
				match(T__7);
				}
				break;
			case M_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(M_VAL);
				setState(176);
				match(T__7);
				}
				break;
			case M_ATTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(M_ATTR);
				setState(178);
				match(T__5);
				setState(179);
				match(StringLiteral);
				setState(180);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public InputValueContext inputValue() {
			return getRuleContext(InputValueContext.class,0);
		}
		public InputToContext inputTo() {
			return getRuleContext(InputToContext.class,0);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitInputStatement(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			inputValue();
			setState(184);
			inputTo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClickStatementContext extends ParserRuleContext {
		public TerminalNode CLICK() { return getToken(IdeaCaseParser.CLICK, 0); }
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public ClickStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clickStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterClickStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitClickStatement(this);
		}
	}

	public final ClickStatementContext clickStatement() throws RecognitionException {
		ClickStatementContext _localctx = new ClickStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clickStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CLICK);
			setState(187);
			match(StringLiteral);
			setState(189);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(188);
				whenStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputValueContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(IdeaCaseParser.INPUT, 0); }
		public List<DataParameterizeStatementContext> dataParameterizeStatement() {
			return getRuleContexts(DataParameterizeStatementContext.class);
		}
		public DataParameterizeStatementContext dataParameterizeStatement(int i) {
			return getRuleContext(DataParameterizeStatementContext.class,i);
		}
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public InputValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterInputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitInputValue(this);
		}
	}

	public final InputValueContext inputValue() throws RecognitionException {
		InputValueContext _localctx = new InputValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inputValue);
		int _la;
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INPUT);
				setState(192);
				dataParameterizeStatement();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(193);
					match(T__4);
					setState(194);
					dataParameterizeStatement();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(INPUT);
				setState(201);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(IdeaCaseParser.TO, 0); }
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public InputToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterInputTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitInputTo(this);
		}
	}

	public final InputToContext inputTo() throws RecognitionException {
		InputToContext _localctx = new InputToContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inputTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TO);
			setState(205);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataParameterizeStatementContext extends ParserRuleContext {
		public DataMethodStatementContext dataMethodStatement() {
			return getRuleContext(DataMethodStatementContext.class,0);
		}
		public DataPropertyStatementContext dataPropertyStatement() {
			return getRuleContext(DataPropertyStatementContext.class,0);
		}
		public DataParameterizeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataParameterizeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDataParameterizeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDataParameterizeStatement(this);
		}
	}

	public final DataParameterizeStatementContext dataParameterizeStatement() throws RecognitionException {
		DataParameterizeStatementContext _localctx = new DataParameterizeStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataParameterizeStatement);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case D_RAND:
			case D_SEQ:
			case D_UNIQUE:
			case D_REF:
			case D_PROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				dataMethodStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				dataPropertyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataMethodStatementContext extends ParserRuleContext {
		public TerminalNode D_RAND() { return getToken(IdeaCaseParser.D_RAND, 0); }
		public DataMethodParam1Context dataMethodParam1() {
			return getRuleContext(DataMethodParam1Context.class,0);
		}
		public DataMethodParam2Context dataMethodParam2() {
			return getRuleContext(DataMethodParam2Context.class,0);
		}
		public TerminalNode D_SEQ() { return getToken(IdeaCaseParser.D_SEQ, 0); }
		public TerminalNode D_UNIQUE() { return getToken(IdeaCaseParser.D_UNIQUE, 0); }
		public TerminalNode D_REF() { return getToken(IdeaCaseParser.D_REF, 0); }
		public TerminalNode D_PROP() { return getToken(IdeaCaseParser.D_PROP, 0); }
		public DataMethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataMethodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDataMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDataMethodStatement(this);
		}
	}

	public final DataMethodStatementContext dataMethodStatement() throws RecognitionException {
		DataMethodStatementContext _localctx = new DataMethodStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataMethodStatement);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(D_RAND);
				setState(212);
				match(T__5);
				setState(213);
				dataMethodParam1();
				setState(214);
				match(T__3);
				setState(215);
				dataMethodParam2();
				setState(216);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(D_SEQ);
				setState(219);
				match(T__5);
				setState(220);
				dataMethodParam1();
				setState(221);
				match(T__3);
				setState(222);
				dataMethodParam2();
				setState(223);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(D_UNIQUE);
				setState(226);
				match(T__5);
				setState(227);
				dataMethodParam1();
				setState(228);
				match(T__3);
				setState(229);
				dataMethodParam2();
				setState(230);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(D_RAND);
				setState(233);
				match(T__5);
				setState(234);
				dataMethodParam1();
				setState(235);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(D_SEQ);
				setState(238);
				match(T__5);
				setState(239);
				dataMethodParam1();
				setState(240);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(D_UNIQUE);
				setState(243);
				match(T__5);
				setState(244);
				dataMethodParam1();
				setState(245);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				match(D_REF);
				setState(248);
				match(T__5);
				setState(249);
				dataMethodParam1();
				setState(250);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(D_PROP);
				setState(253);
				match(T__5);
				setState(254);
				dataMethodParam1();
				setState(255);
				match(T__3);
				setState(256);
				dataMethodParam2();
				setState(257);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				match(D_PROP);
				setState(260);
				match(T__5);
				setState(261);
				dataMethodParam1();
				setState(262);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataPropertyStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IdeaCaseParser.ID, 0); }
		public DataPropertyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPropertyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDataPropertyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDataPropertyStatement(this);
		}
	}

	public final DataPropertyStatementContext dataPropertyStatement() throws RecognitionException {
		DataPropertyStatementContext _localctx = new DataPropertyStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataPropertyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataMethodParam1Context extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public DataMethodParam1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataMethodParam1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDataMethodParam1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDataMethodParam1(this);
		}
	}

	public final DataMethodParam1Context dataMethodParam1() throws RecognitionException {
		DataMethodParam1Context _localctx = new DataMethodParam1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataMethodParam1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataMethodParam2Context extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(IdeaCaseParser.StringLiteral, 0); }
		public DataMethodParam2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataMethodParam2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDataMethodParam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDataMethodParam2(this);
		}
	}

	public final DataMethodParam2Context dataMethodParam2() throws RecognitionException {
		DataMethodParam2Context _localctx = new DataMethodParam2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataMethodParam2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatamentContext extends ParserRuleContext {
		public ExistsStatementContext existsStatement() {
			return getRuleContext(ExistsStatementContext.class,0);
		}
		public ShownStatementContext shownStatement() {
			return getRuleContext(ShownStatementContext.class,0);
		}
		public BinaryStatementContext binaryStatement() {
			return getRuleContext(BinaryStatementContext.class,0);
		}
		public ConditionStatamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterConditionStatament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitConditionStatament(this);
		}
	}

	public final ConditionStatamentContext conditionStatament() throws RecognitionException {
		ConditionStatamentContext _localctx = new ConditionStatamentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionStatament);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				existsStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				shownStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				binaryStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicStatementContext extends ParserRuleContext {
		public List<ConditionStatamentContext> conditionStatament() {
			return getRuleContexts(ConditionStatamentContext.class);
		}
		public ConditionStatamentContext conditionStatament(int i) {
			return getRuleContext(ConditionStatamentContext.class,i);
		}
		public TerminalNode LOGIC_OP() { return getToken(IdeaCaseParser.LOGIC_OP, 0); }
		public LogicStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterLogicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitLogicStatement(this);
		}
	}

	public final LogicStatementContext logicStatement() throws RecognitionException {
		LogicStatementContext _localctx = new LogicStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			conditionStatament();
			setState(278);
			match(LOGIC_OP);
			setState(279);
			conditionStatament();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenStatementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(IdeaCaseParser.WHEN, 0); }
		public ConditionStatamentContext conditionStatament() {
			return getRuleContext(ConditionStatamentContext.class,0);
		}
		public TimeoutStatementContext timeoutStatement() {
			return getRuleContext(TimeoutStatementContext.class,0);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitWhenStatement(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(WHEN);
			setState(282);
			conditionStatament();
			setState(284);
			_la = _input.LA(1);
			if (_la==TIMEOUT) {
				{
				setState(283);
				timeoutStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DependStatementContext extends ParserRuleContext {
		public TerminalNode DEPEND() { return getToken(IdeaCaseParser.DEPEND, 0); }
		public List<TerminalNode> ID() { return getTokens(IdeaCaseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IdeaCaseParser.ID, i);
		}
		public DependStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).enterDependStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IdeaCaseListener ) ((IdeaCaseListener)listener).exitDependStatement(this);
		}
	}

	public final DependStatementContext dependStatement() throws RecognitionException {
		DependStatementContext _localctx = new DependStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dependStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(DEPEND);
			setState(287);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(288);
				match(T__3);
				setState(289);
				match(ID);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3"+
		"\5\7\5s\n\5\f\5\16\5v\13\5\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\7\3\7"+
		"\3\7\5\7\u0083\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\5\b\u008e"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00aa\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\22\3\22\5\22\u00cd\n\22\3\23"+
		"\3\23\3\23\3\24\3\24\5\24\u00d4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u010b\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\5\31\u0116\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u011f"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u0125\n\34\f\34\16\34\u0128\13\34\3\34"+
		"\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2"+
		"\2\u0135\2;\3\2\2\2\4F\3\2\2\2\6h\3\2\2\2\bj\3\2\2\2\nw\3\2\2\2\f\177"+
		"\3\2\2\2\16\u008d\3\2\2\2\20\u008f\3\2\2\2\22\u0098\3\2\2\2\24\u009a\3"+
		"\2\2\2\26\u009d\3\2\2\2\30\u00a0\3\2\2\2\32\u00a9\3\2\2\2\34\u00b7\3\2"+
		"\2\2\36\u00b9\3\2\2\2 \u00bc\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d3"+
		"\3\2\2\2(\u010a\3\2\2\2*\u010c\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60"+
		"\u0115\3\2\2\2\62\u0117\3\2\2\2\64\u011b\3\2\2\2\66\u0120\3\2\2\28:\5"+
		"\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7"+
		"\2\2\3E\3\3\2\2\2FG\7\20\2\2GI\7\62\2\2HJ\5\66\34\2IH\3\2\2\2IJ\3\2\2"+
		"\2JK\3\2\2\2KO\7\3\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PR\3\2\2\2QO\3\2\2\2RV\7\4\2\2SU\7\5\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2W\5\3\2\2\2XV\3\2\2\2YZ\5\f\7\2Z[\7\5\2\2[i\3\2\2\2\\]\5\16"+
		"\b\2]^\7\5\2\2^i\3\2\2\2_`\5\22\n\2`a\7\5\2\2ai\3\2\2\2bc\5\36\20\2cd"+
		"\7\5\2\2di\3\2\2\2ef\5 \21\2fg\7\5\2\2gi\3\2\2\2hY\3\2\2\2h\\\3\2\2\2"+
		"h_\3\2\2\2hb\3\2\2\2he\3\2\2\2i\7\3\2\2\2jk\7\17\2\2kl\7\62\2\2ln\7\3"+
		"\2\2mo\5\n\6\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\7\4\2\2qs\7\5\2\2rq\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vt\3\2\2\2w|\7\62\2\2xy\7"+
		"\6\2\2y{\7\62\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2\2"+
		"~|\3\2\2\2\177\u0080\7\22\2\2\u0080\u0082\7\61\2\2\u0081\u0083\5\20\t"+
		"\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085"+
		"\7\24\2\2\u0085\u008e\7\16\2\2\u0086\u0087\7\24\2\2\u0087\u0089\7\32\2"+
		"\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008e\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008e\7\32\2\2\u008d\u0084\3"+
		"\2\2\2\u008d\u0086\3\2\2\2\u008d\u008b\3\2\2\2\u008e\17\3\2\2\2\u008f"+
		"\u0090\7\33\2\2\u0090\u0091\7\16\2\2\u0091\21\3\2\2\2\u0092\u0093\7\31"+
		"\2\2\u0093\u0099\5\62\32\2\u0094\u0095\7\31\2\2\u0095\u0099\5\30\r\2\u0096"+
		"\u0097\7\31\2\2\u0097\u0099\5\60\31\2\u0098\u0092\3\2\2\2\u0098\u0094"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b\7\61\2\2\u009b"+
		"\u009c\7\36\2\2\u009c\25\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\37"+
		"\2\2\u009f\27\3\2\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\f\2\2\u00a2"+
		"\u00a3\5\32\16\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\7"+
		"\2\2\u00a6\u00aa\5\34\17\2\u00a7\u00aa\7\61\2\2\u00a8\u00aa\7\16\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\33\3\2\2"+
		"\2\u00ab\u00ac\7(\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00b8"+
		"\7\t\2\2\u00af\u00b0\7)\2\2\u00b0\u00b8\7\n\2\2\u00b1\u00b2\7+\2\2\u00b2"+
		"\u00b8\7\n\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\7\61"+
		"\2\2\u00b6\u00b8\7\t\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\5\"\22"+
		"\2\u00ba\u00bb\5$\23\2\u00bb\37\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00bf"+
		"\7\61\2\2\u00be\u00c0\5\64\33\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2"+
		"\2\u00c0!\3\2\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c7\5&\24\2\u00c3\u00c4"+
		"\7\7\2\2\u00c4\u00c6\5&\24\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cd\7\61\2\2\u00cc\u00c1\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\7\61\2"+
		"\2\u00d0%\3\2\2\2\u00d1\u00d4\5(\25\2\u00d2\u00d4\5*\26\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6"+
		"\u00d7\7\b\2\2\u00d7\u00d8\5,\27\2\u00d8\u00d9\7\6\2\2\u00d9\u00da\5."+
		"\30\2\u00da\u00db\7\t\2\2\u00db\u010b\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd"+
		"\u00de\7\b\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5."+
		"\30\2\u00e1\u00e2\7\t\2\2\u00e2\u010b\3\2\2\2\u00e3\u00e4\7.\2\2\u00e4"+
		"\u00e5\7\b\2\2\u00e5\u00e6\5,\27\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8\5."+
		"\30\2\u00e8\u00e9\7\t\2\2\u00e9\u010b\3\2\2\2\u00ea\u00eb\7,\2\2\u00eb"+
		"\u00ec\7\b\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\t\2\2\u00ee\u010b\3\2"+
		"\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5,\27\2\u00f2"+
		"\u00f3\7\t\2\2\u00f3\u010b\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5\u00f6\7\b"+
		"\2\2\u00f6\u00f7\5,\27\2\u00f7\u00f8\7\t\2\2\u00f8\u010b\3\2\2\2\u00f9"+
		"\u00fa\7/\2\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd\7\t"+
		"\2\2\u00fd\u010b\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff\u0100\7\b\2\2\u0100"+
		"\u0101\5,\27\2\u0101\u0102\7\6\2\2\u0102\u0103\5.\30\2\u0103\u0104\7\t"+
		"\2\2\u0104\u010b\3\2\2\2\u0105\u0106\7\60\2\2\u0106\u0107\7\b\2\2\u0107"+
		"\u0108\5,\27\2\u0108\u0109\7\t\2\2\u0109\u010b\3\2\2\2\u010a\u00d5\3\2"+
		"\2\2\u010a\u00dc\3\2\2\2\u010a\u00e3\3\2\2\2\u010a\u00ea\3\2\2\2\u010a"+
		"\u00ef\3\2\2\2\u010a\u00f4\3\2\2\2\u010a\u00f9\3\2\2\2\u010a\u00fe\3\2"+
		"\2\2\u010a\u0105\3\2\2\2\u010b)\3\2\2\2\u010c\u010d\7\62\2\2\u010d+\3"+
		"\2\2\2\u010e\u010f\7\61\2\2\u010f-\3\2\2\2\u0110\u0111\7\61\2\2\u0111"+
		"/\3\2\2\2\u0112\u0116\5\24\13\2\u0113\u0116\5\26\f\2\u0114\u0116\5\30"+
		"\r\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\61\3\2\2\2\u0117\u0118\5\60\31\2\u0118\u0119\7\13\2\2\u0119\u011a\5\60"+
		"\31\2\u011a\63\3\2\2\2\u011b\u011c\7\34\2\2\u011c\u011e\5\60\31\2\u011d"+
		"\u011f\5\20\t\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\65\3\2\2"+
		"\2\u0120\u0121\7\35\2\2\u0121\u0126\7\62\2\2\u0122\u0123\7\6\2\2\u0123"+
		"\u0125\7\62\2\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\67\3\2\2\2\u0128\u0126\3\2\2\2\31;AI"+
		"OVhnt|\u0082\u0089\u008d\u0098\u00a9\u00b7\u00bf\u00c7\u00cc\u00d3\u010a"+
		"\u0115\u011e\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}