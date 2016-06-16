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
		RESPONSE=18, TIMEOUT=19, EXISTS=20, StringLiteral=21, ID=22, COMMENT=23, 
		LINE_COMMENT=24;
	public static final int
		RULE_parseRoot = 0, RULE_caseStatement = 1, RULE_commandStatement = 2, 
		RULE_groupStatement = 3, RULE_groupBody = 4, RULE_getStatement = 5, RULE_waitStatement = 6, 
		RULE_timeoutStatement = 7, RULE_assertStatement = 8, RULE_existsStatement = 9, 
		RULE_inputStatement = 10, RULE_clickStatement = 11, RULE_inputValue = 12, 
		RULE_inputTo = 13;
	public static final String[] ruleNames = {
		"parseRoot", "caseStatement", "commandStatement", "groupStatement", "groupBody", 
		"getStatement", "waitStatement", "timeoutStatement", "assertStatement", 
		"existsStatement", "inputStatement", "clickStatement", "inputValue", "inputTo"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP) {
				{
				{
				setState(28);
				groupStatement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(34);
				caseStatement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(42);
			match(CASE);
			setState(43);
			match(ID);
			setState(44);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << WAIT) | (1L << INPUT) | (1L << CLICK) | (1L << ASSERT))) != 0)) {
				{
				{
				setState(45);
				commandStatement();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(52);
				match(T__2);
				}
				}
				setState(57);
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
			setState(73);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				getStatement();
				setState(59);
				match(T__2);
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				waitStatement();
				setState(62);
				match(T__2);
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				assertStatement();
				setState(65);
				match(T__2);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				inputStatement();
				setState(68);
				match(T__2);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				clickStatement();
				setState(71);
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
			setState(75);
			match(GROUP);
			setState(76);
			match(ID);
			setState(77);
			match(T__0);
			setState(79);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				groupBody();
				}
			}

			setState(81);
			match(T__1);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(82);
				match(T__2);
				}
				}
				setState(87);
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
			setState(88);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(89);
				match(T__3);
				setState(90);
				match(ID);
				}
				}
				setState(95);
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
			setState(96);
			match(GET);
			setState(97);
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
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(WAIT);
				setState(100);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(WAIT);
				setState(102);
				match(RESPONSE);
				setState(104);
				_la = _input.LA(1);
				if (_la==TIMEOUT) {
					{
					setState(103);
					timeoutStatement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(WAIT);
				setState(107);
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
			setState(110);
			match(TIMEOUT);
			setState(111);
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
		public ExistsStatementContext existsStatement() {
			return getRuleContext(ExistsStatementContext.class,0);
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
			setState(113);
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

	public static class ExistsStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(IdeaCaseParser.ASSERT, 0); }
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
			setState(115);
			match(ASSERT);
			setState(116);
			match(StringLiteral);
			setState(117);
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
			setState(119);
			inputValue();
			setState(120);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CLICK);
			setState(123);
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
			setState(125);
			match(INPUT);
			setState(126);
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
			setState(128);
			match(TO);
			setState(129);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\5\5R\n\5\3\5"+
		"\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\u0085\2!\3\2"+
		"\2\2\4,\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\nZ\3\2\2\2\fb\3\2\2\2\16n\3\2\2"+
		"\2\20p\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26y\3\2\2\2\30|\3\2\2\2\32\177"+
		"\3\2\2\2\34\u0082\3\2\2\2\36 \5\b\5\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\7\n\2"+
		"\2-.\7\30\2\2.\62\7\3\2\2/\61\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\7\4\2\2\668\7\5"+
		"\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3\2\2"+
		"\2<=\5\f\7\2=>\7\5\2\2>L\3\2\2\2?@\5\16\b\2@A\7\5\2\2AL\3\2\2\2BC\5\22"+
		"\n\2CD\7\5\2\2DL\3\2\2\2EF\5\26\f\2FG\7\5\2\2GL\3\2\2\2HI\5\30\r\2IJ\7"+
		"\5\2\2JL\3\2\2\2K<\3\2\2\2K?\3\2\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2L\7"+
		"\3\2\2\2MN\7\t\2\2NO\7\30\2\2OQ\7\3\2\2PR\5\n\6\2QP\3\2\2\2QR\3\2\2\2"+
		"RS\3\2\2\2SW\7\4\2\2TV\7\5\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"X\t\3\2\2\2YW\3\2\2\2Z_\7\30\2\2[\\\7\6\2\2\\^\7\30\2\2][\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2\2bc\7\f\2\2cd\7\27\2\2"+
		"d\r\3\2\2\2ef\7\16\2\2fo\7\b\2\2gh\7\16\2\2hj\7\24\2\2ik\5\20\t\2ji\3"+
		"\2\2\2jk\3\2\2\2ko\3\2\2\2lm\7\16\2\2mo\7\24\2\2ne\3\2\2\2ng\3\2\2\2n"+
		"l\3\2\2\2o\17\3\2\2\2pq\7\25\2\2qr\7\b\2\2r\21\3\2\2\2st\5\24\13\2t\23"+
		"\3\2\2\2uv\7\23\2\2vw\7\27\2\2wx\7\26\2\2x\25\3\2\2\2yz\5\32\16\2z{\5"+
		"\34\17\2{\27\3\2\2\2|}\7\22\2\2}~\7\27\2\2~\31\3\2\2\2\177\u0080\7\17"+
		"\2\2\u0080\u0081\7\27\2\2\u0081\33\3\2\2\2\u0082\u0083\7\20\2\2\u0083"+
		"\u0084\7\27\2\2\u0084\35\3\2\2\2\f!\'\629KQW_jn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}