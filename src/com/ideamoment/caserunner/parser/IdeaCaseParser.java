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
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, NUMBER=6, GROUP=7, CASE=8, RULE=9, 
		GET=10, POST=11, WAIT=12, INPUT=13, TO=14, CHECK=15, CLICK=16, ASSERT=17, 
		RESPONSE=18, TIMEOUT=19, WHEN=20, EXISTS=21, StringLiteral=22, ID=23, 
		COMMENT=24, LINE_COMMENT=25;
	public static final int
		RULE_parseRoot = 0, RULE_caseStatement = 1, RULE_commandStatement = 2, 
		RULE_groupStatement = 3, RULE_groupBody = 4, RULE_getStatement = 5, RULE_waitStatement = 6, 
		RULE_timeoutStatement = 7, RULE_assertStatement = 8, RULE_existsStatement = 9, 
		RULE_inputStatement = 10, RULE_clickStatement = 11, RULE_inputValue = 12, 
		RULE_inputTo = 13, RULE_conditionStatament = 14, RULE_whenStatement = 15;
	public static final String[] ruleNames = {
		"parseRoot", "caseStatement", "commandStatement", "groupStatement", "groupBody", 
		"getStatement", "waitStatement", "timeoutStatement", "assertStatement", 
		"existsStatement", "inputStatement", "clickStatement", "inputValue", "inputTo", 
		"conditionStatament", "whenStatement"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP) {
				{
				{
				setState(32);
				groupStatement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(38);
				caseStatement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(46);
			match(CASE);
			setState(47);
			match(ID);
			setState(48);
			match(T__0);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << WAIT) | (1L << INPUT) | (1L << CLICK) | (1L << ASSERT))) != 0)) {
				{
				{
				setState(49);
				commandStatement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				match(T__2);
				}
				}
				setState(61);
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
			setState(77);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				getStatement();
				setState(63);
				match(T__2);
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				waitStatement();
				setState(66);
				match(T__2);
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				assertStatement();
				setState(69);
				match(T__2);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				inputStatement();
				setState(72);
				match(T__2);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				clickStatement();
				setState(75);
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
			setState(79);
			match(GROUP);
			setState(80);
			match(ID);
			setState(81);
			match(T__0);
			setState(83);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(82);
				groupBody();
				}
			}

			setState(85);
			match(T__1);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(86);
				match(T__2);
				}
				}
				setState(91);
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
			setState(92);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(93);
				match(T__3);
				setState(94);
				match(ID);
				}
				}
				setState(99);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(GET);
			setState(101);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(WAIT);
				setState(104);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(WAIT);
				setState(106);
				match(RESPONSE);
				setState(108);
				_la = _input.LA(1);
				if (_la==TIMEOUT) {
					{
					setState(107);
					timeoutStatement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(WAIT);
				setState(111);
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
			setState(114);
			match(TIMEOUT);
			setState(115);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ASSERT);
			setState(118);
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
			setState(120);
			match(StringLiteral);
			setState(121);
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
		enterRule(_localctx, 20, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			inputValue();
			setState(124);
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
		enterRule(_localctx, 22, RULE_clickStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CLICK);
			setState(127);
			match(StringLiteral);
			setState(129);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(128);
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
		enterRule(_localctx, 24, RULE_inputValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(INPUT);
			setState(132);
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
		enterRule(_localctx, 26, RULE_inputTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TO);
			setState(135);
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
		enterRule(_localctx, 28, RULE_conditionStatament);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			existsStatement();
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
		enterRule(_localctx, 30, RULE_whenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHEN);
			setState(140);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5"+
		"\3\5\3\5\5\5V\n\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\7\6b\n\6"+
		"\f\6\16\6e\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\5\bs"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u0084\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u008f\2%\3\2\2"+
		"\2\4\60\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16r\3\2\2"+
		"\2\20t\3\2\2\2\22w\3\2\2\2\24z\3\2\2\2\26}\3\2\2\2\30\u0080\3\2\2\2\32"+
		"\u0085\3\2\2\2\34\u0088\3\2\2\2\36\u008b\3\2\2\2 \u008d\3\2\2\2\"$\5\b"+
		"\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*"+
		"\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2."+
		"/\7\2\2\3/\3\3\2\2\2\60\61\7\n\2\2\61\62\7\31\2\2\62\66\7\3\2\2\63\65"+
		"\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\66\3\2\2\29=\7\4\2\2:<\7\5\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\5\f\7\2AB\7\5\2\2BP\3\2\2\2CD\5\16\b\2D"+
		"E\7\5\2\2EP\3\2\2\2FG\5\22\n\2GH\7\5\2\2HP\3\2\2\2IJ\5\26\f\2JK\7\5\2"+
		"\2KP\3\2\2\2LM\5\30\r\2MN\7\5\2\2NP\3\2\2\2O@\3\2\2\2OC\3\2\2\2OF\3\2"+
		"\2\2OI\3\2\2\2OL\3\2\2\2P\7\3\2\2\2QR\7\t\2\2RS\7\31\2\2SU\7\3\2\2TV\5"+
		"\n\6\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\7\4\2\2XZ\7\5\2\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2][\3\2\2\2^c\7\31\2\2_`\7\6\2\2"+
		"`b\7\31\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2"+
		"\2\2fg\7\f\2\2gh\7\30\2\2h\r\3\2\2\2ij\7\16\2\2js\7\b\2\2kl\7\16\2\2l"+
		"n\7\24\2\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2os\3\2\2\2pq\7\16\2\2qs\7\24"+
		"\2\2ri\3\2\2\2rk\3\2\2\2rp\3\2\2\2s\17\3\2\2\2tu\7\25\2\2uv\7\b\2\2v\21"+
		"\3\2\2\2wx\7\23\2\2xy\5\36\20\2y\23\3\2\2\2z{\7\30\2\2{|\7\27\2\2|\25"+
		"\3\2\2\2}~\5\32\16\2~\177\5\34\17\2\177\27\3\2\2\2\u0080\u0081\7\22\2"+
		"\2\u0081\u0083\7\30\2\2\u0082\u0084\5 \21\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7\30"+
		"\2\2\u0087\33\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\30\2\2\u008a"+
		"\35\3\2\2\2\u008b\u008c\5\24\13\2\u008c\37\3\2\2\2\u008d\u008e\7\26\2"+
		"\2\u008e\u008f\5\36\20\2\u008f!\3\2\2\2\r%+\66=OU[cnr\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}