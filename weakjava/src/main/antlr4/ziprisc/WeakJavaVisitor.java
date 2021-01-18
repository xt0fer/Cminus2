// Generated from /Volumes/DeVere/kristofer/Documents/Projects/WeakJava/weakjava/src/main/antlr4/ziprisc/WeakJava.g4 by ANTLR 4.9
package ziprisc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WeakJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WeakJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WeakJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(WeakJavaParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#functionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionList(WeakJavaParser.FunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(WeakJavaParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(WeakJavaParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(WeakJavaParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(WeakJavaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(WeakJavaParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(WeakJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(WeakJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(WeakJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(WeakJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(WeakJavaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WeakJavaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WeakJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(WeakJavaParser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(WeakJavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(WeakJavaParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#relationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOp(WeakJavaParser.RelationOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(WeakJavaParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(WeakJavaParser.ParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WeakJavaParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(WeakJavaParser.BoolValueContext ctx);
}