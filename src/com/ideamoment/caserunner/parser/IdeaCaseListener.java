// Generated from D:/gitrepos/caserunner/src/com/ideamoment/caserunner/parser\IdeaCase.g4 by ANTLR 4.5.1
package com.ideamoment.caserunner.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IdeaCaseParser}.
 */
public interface IdeaCaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#parseRoot}.
	 * @param ctx the parse tree
	 */
	void enterParseRoot(IdeaCaseParser.ParseRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#parseRoot}.
	 * @param ctx the parse tree
	 */
	void exitParseRoot(IdeaCaseParser.ParseRootContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(IdeaCaseParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(IdeaCaseParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatement(IdeaCaseParser.CommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatement(IdeaCaseParser.CommandStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#groupStatement}.
	 * @param ctx the parse tree
	 */
	void enterGroupStatement(IdeaCaseParser.GroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#groupStatement}.
	 * @param ctx the parse tree
	 */
	void exitGroupStatement(IdeaCaseParser.GroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#groupBody}.
	 * @param ctx the parse tree
	 */
	void enterGroupBody(IdeaCaseParser.GroupBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#groupBody}.
	 * @param ctx the parse tree
	 */
	void exitGroupBody(IdeaCaseParser.GroupBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void enterGetStatement(IdeaCaseParser.GetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#getStatement}.
	 * @param ctx the parse tree
	 */
	void exitGetStatement(IdeaCaseParser.GetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaitStatement(IdeaCaseParser.WaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaitStatement(IdeaCaseParser.WaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#timeoutStatement}.
	 * @param ctx the parse tree
	 */
	void enterTimeoutStatement(IdeaCaseParser.TimeoutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#timeoutStatement}.
	 * @param ctx the parse tree
	 */
	void exitTimeoutStatement(IdeaCaseParser.TimeoutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(IdeaCaseParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(IdeaCaseParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#existsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExistsStatement(IdeaCaseParser.ExistsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#existsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExistsStatement(IdeaCaseParser.ExistsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(IdeaCaseParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(IdeaCaseParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#clickStatement}.
	 * @param ctx the parse tree
	 */
	void enterClickStatement(IdeaCaseParser.ClickStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#clickStatement}.
	 * @param ctx the parse tree
	 */
	void exitClickStatement(IdeaCaseParser.ClickStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#inputValue}.
	 * @param ctx the parse tree
	 */
	void enterInputValue(IdeaCaseParser.InputValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#inputValue}.
	 * @param ctx the parse tree
	 */
	void exitInputValue(IdeaCaseParser.InputValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#inputTo}.
	 * @param ctx the parse tree
	 */
	void enterInputTo(IdeaCaseParser.InputToContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#inputTo}.
	 * @param ctx the parse tree
	 */
	void exitInputTo(IdeaCaseParser.InputToContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#conditionStatament}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatament(IdeaCaseParser.ConditionStatamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#conditionStatament}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatament(IdeaCaseParser.ConditionStatamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStatement(IdeaCaseParser.WhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStatement(IdeaCaseParser.WhenStatementContext ctx);
}