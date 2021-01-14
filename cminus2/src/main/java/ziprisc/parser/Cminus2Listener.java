// Generated from Cminus2.g4 by ANTLR 4.7.2
package ziprisc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cminus2Parser}.
 */
public interface Cminus2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Cminus2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Cminus2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(Cminus2Parser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(Cminus2Parser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(Cminus2Parser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(Cminus2Parser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(Cminus2Parser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(Cminus2Parser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(Cminus2Parser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(Cminus2Parser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(Cminus2Parser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(Cminus2Parser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Cminus2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Cminus2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Cminus2Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Cminus2Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Cminus2Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Cminus2Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Cminus2Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Cminus2Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(Cminus2Parser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(Cminus2Parser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Cminus2Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Cminus2Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Cminus2Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Cminus2Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(Cminus2Parser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(Cminus2Parser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Cminus2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Cminus2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Cminus2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Cminus2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterLexp(Cminus2Parser.LexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitLexp(Cminus2Parser.LexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(Cminus2Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(Cminus2Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(Cminus2Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(Cminus2Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(Cminus2Parser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(Cminus2Parser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cminus2Parser#pars}.
	 * @param ctx the parse tree
	 */
	void enterPars(Cminus2Parser.ParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cminus2Parser#pars}.
	 * @param ctx the parse tree
	 */
	void exitPars(Cminus2Parser.ParsContext ctx);
}