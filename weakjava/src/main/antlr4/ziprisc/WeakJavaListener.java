// Generated from /Volumes/DeVere/kristofer/Documents/Projects/WeakJava/weakjava/src/main/antlr4/ziprisc/WeakJava.g4 by ANTLR 4.9
package ziprisc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WeakJavaParser}.
 */
public interface WeakJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WeakJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WeakJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(WeakJavaParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(WeakJavaParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(WeakJavaParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(WeakJavaParser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(WeakJavaParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(WeakJavaParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(WeakJavaParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(WeakJavaParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(WeakJavaParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(WeakJavaParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(WeakJavaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(WeakJavaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(WeakJavaParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(WeakJavaParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(WeakJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(WeakJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(WeakJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(WeakJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(WeakJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(WeakJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(WeakJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(WeakJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(WeakJavaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(WeakJavaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(WeakJavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(WeakJavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WeakJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WeakJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterLexp(WeakJavaParser.LexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitLexp(WeakJavaParser.LexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WeakJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WeakJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(WeakJavaParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(WeakJavaParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#relationOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationOp(WeakJavaParser.RelationOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#relationOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationOp(WeakJavaParser.RelationOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(WeakJavaParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(WeakJavaParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#pars}.
	 * @param ctx the parse tree
	 */
	void enterPars(WeakJavaParser.ParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#pars}.
	 * @param ctx the parse tree
	 */
	void exitPars(WeakJavaParser.ParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeakJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(WeakJavaParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeakJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(WeakJavaParser.BoolValueContext ctx);
}