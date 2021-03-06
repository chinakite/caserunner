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
	 * Enter a parse tree produced by {@link IdeaCaseParser#shownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShownStatement(IdeaCaseParser.ShownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#shownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShownStatement(IdeaCaseParser.ShownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#binaryStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinaryStatement(IdeaCaseParser.BinaryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#binaryStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinaryStatement(IdeaCaseParser.BinaryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#binaryPartStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPartStatement(IdeaCaseParser.BinaryPartStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#binaryPartStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPartStatement(IdeaCaseParser.BinaryPartStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodStatement(IdeaCaseParser.MethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#methodStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodStatement(IdeaCaseParser.MethodStatementContext ctx);
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
	 * Enter a parse tree produced by {@link IdeaCaseParser#dataParameterizeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataParameterizeStatement(IdeaCaseParser.DataParameterizeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dataParameterizeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataParameterizeStatement(IdeaCaseParser.DataParameterizeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#dataMethodStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataMethodStatement(IdeaCaseParser.DataMethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dataMethodStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataMethodStatement(IdeaCaseParser.DataMethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#dataPropertyStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataPropertyStatement(IdeaCaseParser.DataPropertyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dataPropertyStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataPropertyStatement(IdeaCaseParser.DataPropertyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#dataMethodParam1}.
	 * @param ctx the parse tree
	 */
	void enterDataMethodParam1(IdeaCaseParser.DataMethodParam1Context ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dataMethodParam1}.
	 * @param ctx the parse tree
	 */
	void exitDataMethodParam1(IdeaCaseParser.DataMethodParam1Context ctx);
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#dataMethodParam2}.
	 * @param ctx the parse tree
	 */
	void enterDataMethodParam2(IdeaCaseParser.DataMethodParam2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dataMethodParam2}.
	 * @param ctx the parse tree
	 */
	void exitDataMethodParam2(IdeaCaseParser.DataMethodParam2Context ctx);
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
	 * Enter a parse tree produced by {@link IdeaCaseParser#logicStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicStatement(IdeaCaseParser.LogicStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#logicStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicStatement(IdeaCaseParser.LogicStatementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link IdeaCaseParser#dependStatement}.
	 * @param ctx the parse tree
	 */
	void enterDependStatement(IdeaCaseParser.DependStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdeaCaseParser#dependStatement}.
	 * @param ctx the parse tree
	 */
	void exitDependStatement(IdeaCaseParser.DependStatementContext ctx);
}