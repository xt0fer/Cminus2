package ziprisc;

import antlr4.ziprisc.WeakJavaVisitor;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.ziprisc.WeakJavaParser;

public class WJVisitor implements WeakJavaVisitor<Program> {

	@Override
	public Program visitProgram(WeakJavaParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitProject(WeakJavaParser.ProjectContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitFunctionList(WeakJavaParser.FunctionListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitMainFunction(WeakJavaParser.MainFunctionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitStatementList(WeakJavaParser.StatementListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitDeclarationList(WeakJavaParser.DeclarationListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitVariable(WeakJavaParser.VariableContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitCompoundStatement(WeakJavaParser.CompoundStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitIfStatement(WeakJavaParser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitWhileStatement(WeakJavaParser.WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitAssignStatement(WeakJavaParser.AssignStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitReturnStatement(WeakJavaParser.ReturnStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitFunctionCall(WeakJavaParser.FunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitDeclaration(WeakJavaParser.DeclarationContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitStatement(WeakJavaParser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitLexp(WeakJavaParser.LexpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitExpr(WeakJavaParser.ExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitBinaryOp(WeakJavaParser.BinaryOpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitRelationOp(WeakJavaParser.RelationOpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitUnop(WeakJavaParser.UnopContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitPars(WeakJavaParser.ParsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visitBoolValue(WeakJavaParser.BoolValueContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Program visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
