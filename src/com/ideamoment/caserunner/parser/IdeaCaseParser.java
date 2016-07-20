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
		RESPONSE=18, TIMEOUT=19, WHEN=20, DEPEND=21, EXISTS=22, SHOWN=23, StringLiteral=24, 
		ID=25, COMMENT=26, LINE_COMMENT=27;
	public static final int
		RULE_parseRoot = 0, RULE_caseStatement = 1, RULE_commandStatement = 2, 
		RULE_groupStatement = 3, RULE_groupBody = 4, RULE_getStatement = 5, RULE_waitStatement = 6, 
		RULE_timeoutStatement = 7, RULE_assertStatement = 8, RULE_existsStatement = 9, 
		RULE_shownStatement = 10, RULE_inputStatement = 11, RULE_clickStatement = 12, 
		RULE_inputValue = 13, RULE_inputTo = 14, RULE_conditionStatament = 15, 
		RULE_whenStatement = 16, RULE_dependStatement = 17;
	public static final String[] ruleNames = {
		"parseRoot", "caseStatement", "commandStatement", "groupStatement", "groupBody", 
		"getStatement", "waitStatement", "timeoutStatement", "assertStatement", 
		"existsStatement", "shownStatement", "inputStatement", "clickStatement", 
		"inputValue", "inputTo", "conditionStatament", "whenStatement", "dependStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", null, null, "'group'", "'case'", "'rule'", 
		"'get'", "'post'", "'wait'", "'input'", "'to'", "'check'", "'click'", 
		"'assert'", "'response'", "'timeout'", "'when'", "'depend'", "'exists'", 
		"'shown'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WS", "NUMBER", "GROUP", "CASE", "RULE", 
		"GET", "POST", "WAIT", "INPUT", "TO", "CHECK", "CLICK", "ASSERT", "RESPONSE", 
		"TIMEOUT", "WHEN", "DEPEND", "EXISTS", "SHOWN", "StringLiteral", "ID", 
		"COMMENT", "LINE_COMMENT"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP) {
				{
				{
				setState(36);
				groupStatement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(42);
				caseStatement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
			setState(50);
			match(CASE);
			setState(51);
			match(ID);
			setState(53);
			_la = _input.LA(1);
			if (_la==DEPEND) {
				{
				setState(52);
				dependStatement();
				}
			}

			setState(55);
			match(T__0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << WAIT) | (1L << INPUT) | (1L << CLICK) | (1L << ASSERT))) != 0)) {
				{
				{
				setState(56);
				commandStatement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__1);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(63);
				match(T__2);
				}
				}
				setState(68);
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
			setState(84);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				getStatement();
				setState(70);
				match(T__2);
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				waitStatement();
				setState(73);
				match(T__2);
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				assertStatement();
				setState(76);
				match(T__2);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				inputStatement();
				setState(79);
				match(T__2);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				clickStatement();
				setState(82);
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
			setState(86);
			match(GROUP);
			setState(87);
			match(ID);
			setState(88);
			match(T__0);
			setState(90);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(89);
				groupBody();
				}
			}

			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(93);
				match(T__2);
				}
				}
				setState(98);
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
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(100);
				match(T__3);
				setState(101);
				match(ID);
				}
				}
				setState(106);
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
			setState(107);
			match(GET);
			setState(108);
			match(StringLiteral);
			setState(110);
			_la = _input.LA(1);
			if (_la==TIMEOUT) {
				{
				setState(109);
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
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(WAIT);
				setState(113);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(WAIT);
				setState(115);
				match(RESPONSE);
				setState(117);
				_la = _input.LA(1);
				if (_la==TIMEOUT) {
					{
					setState(116);
					timeoutStatement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(WAIT);
				setState(120);
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
			setState(123);
			match(TIMEOUT);
			setState(124);
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
			setState(126);
			match(ASSERT);
			setState(127);
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
			setState(129);
			match(StringLiteral);
			setState(130);
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
			setState(132);
			match(StringLiteral);
			setState(133);
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
		enterRule(_localctx, 22, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			inputValue();
			setState(136);
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
		enterRule(_localctx, 24, RULE_clickStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CLICK);
			setState(139);
			match(StringLiteral);
			setState(141);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(140);
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
		enterRule(_localctx, 26, RULE_inputValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(INPUT);
			setState(144);
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
		enterRule(_localctx, 28, RULE_inputTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TO);
			setState(147);
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
		enterRule(_localctx, 30, RULE_conditionStatament);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				existsStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				shownStatement();
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
		enterRule(_localctx, 32, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHEN);
			setState(154);
			conditionStatament();
			setState(156);
			_la = _input.LA(1);
			if (_la==TIMEOUT) {
				{
				setState(155);
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
		enterRule(_localctx, 34, RULE_dependStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DEPEND);
			setState(159);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(160);
				match(T__3);
				setState(161);
				match(ID);
				}
				}
				setState(166);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\5\38\n\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\7"+
		"\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\7\5a\n\5\f\5\16"+
		"\5d\13\5\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\5\7q\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\5\bx\n\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0090\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u009a\n\21\3\22\3\22\3\22\5\22"+
		"\u009f\n\22\3\23\3\23\3\23\3\23\7\23\u00a5\n\23\f\23\16\23\u00a8\13\23"+
		"\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00ab\2)\3"+
		"\2\2\2\4\64\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\ne\3\2\2\2\fm\3\2\2\2\16{\3"+
		"\2\2\2\20}\3\2\2\2\22\u0080\3\2\2\2\24\u0083\3\2\2\2\26\u0086\3\2\2\2"+
		"\30\u0089\3\2\2\2\32\u008c\3\2\2\2\34\u0091\3\2\2\2\36\u0094\3\2\2\2 "+
		"\u0099\3\2\2\2\"\u009b\3\2\2\2$\u00a0\3\2\2\2&(\5\b\5\2\'&\3\2\2\2(+\3"+
		"\2\2\2)\'\3\2\2\2)*\3\2\2\2*/\3\2\2\2+)\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3"+
		"\63\3\3\2\2\2\64\65\7\n\2\2\65\67\7\33\2\2\668\5$\23\2\67\66\3\2\2\2\67"+
		"8\3\2\2\289\3\2\2\29=\7\3\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\7\4\2\2AC\7\5\2\2BA\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH\5\f\7\2HI\7\5\2\2IW\3\2\2"+
		"\2JK\5\16\b\2KL\7\5\2\2LW\3\2\2\2MN\5\22\n\2NO\7\5\2\2OW\3\2\2\2PQ\5\30"+
		"\r\2QR\7\5\2\2RW\3\2\2\2ST\5\32\16\2TU\7\5\2\2UW\3\2\2\2VG\3\2\2\2VJ\3"+
		"\2\2\2VM\3\2\2\2VP\3\2\2\2VS\3\2\2\2W\7\3\2\2\2XY\7\t\2\2YZ\7\33\2\2Z"+
		"\\\7\3\2\2[]\5\n\6\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\7\4\2\2_a\7\5\2"+
		"\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2ej\7\33"+
		"\2\2fg\7\6\2\2gi\7\33\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13"+
		"\3\2\2\2lj\3\2\2\2mn\7\f\2\2np\7\32\2\2oq\5\20\t\2po\3\2\2\2pq\3\2\2\2"+
		"q\r\3\2\2\2rs\7\16\2\2s|\7\b\2\2tu\7\16\2\2uw\7\24\2\2vx\5\20\t\2wv\3"+
		"\2\2\2wx\3\2\2\2x|\3\2\2\2yz\7\16\2\2z|\7\24\2\2{r\3\2\2\2{t\3\2\2\2{"+
		"y\3\2\2\2|\17\3\2\2\2}~\7\25\2\2~\177\7\b\2\2\177\21\3\2\2\2\u0080\u0081"+
		"\7\23\2\2\u0081\u0082\5 \21\2\u0082\23\3\2\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\7\30\2\2\u0085\25\3\2\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7\31"+
		"\2\2\u0088\27\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\5\36\20\2\u008b"+
		"\31\3\2\2\2\u008c\u008d\7\22\2\2\u008d\u008f\7\32\2\2\u008e\u0090\5\""+
		"\22\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\33\3\2\2\2\u0091\u0092"+
		"\7\17\2\2\u0092\u0093\7\32\2\2\u0093\35\3\2\2\2\u0094\u0095\7\20\2\2\u0095"+
		"\u0096\7\32\2\2\u0096\37\3\2\2\2\u0097\u009a\5\24\13\2\u0098\u009a\5\26"+
		"\f\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a!\3\2\2\2\u009b\u009c"+
		"\7\26\2\2\u009c\u009e\5 \21\2\u009d\u009f\5\20\t\2\u009e\u009d\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f#\3\2\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a6\7"+
		"\33\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a5\7\33\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7%\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\22)/\67=DV\\bjpw{\u008f\u0099\u009e\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}