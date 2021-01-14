// Generated from /Volumes/DeVere/kristofer/Documents/Projects/Cminus2/cminus2/src/main/antlr4/Cminus2.g4 by ANTLR 4.9
package antlr4.ziprisc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cminus2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Cminus2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Cminus2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#functionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionList(Cminus2Parser.FunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(Cminus2Parser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(Cminus2Parser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(Cminus2Parser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(Cminus2Parser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Cminus2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Cminus2Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Cminus2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Cminus2Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(Cminus2Parser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Cminus2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Cminus2Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(Cminus2Parser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Cminus2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Cminus2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(Cminus2Parser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(Cminus2Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(Cminus2Parser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(Cminus2Parser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cminus2Parser#pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(Cminus2Parser.ParsContext ctx);
}