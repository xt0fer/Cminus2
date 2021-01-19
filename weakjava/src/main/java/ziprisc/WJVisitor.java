package ziprisc;

//import antlr4.ziprisc.WeakJavaVisitor;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import ziprisc.zas.CodeList;
import ziprisc.zas.Directive;
import ziprisc.zas.Instruction;
import ziprisc.zas.Label;

//import antlr4.ziprisc.WeakJavaParser;

import static ziprisc.WeakJavaParser.*;

public class WJVisitor implements WeakJavaVisitor<CodeList> {

	@Override
	public CodeList visitProgram(ProgramContext ctx) {
		CodeList program = new CodeList();
		program.addAll(this.visitProject(ctx.project()));
		return program;
	}

	@Override
	public CodeList visitProject(ProjectContext ctx) {
		CodeList program = new CodeList();
		program.add(new Directive(".OR", "0x0000"));

		program.add(new Instruction("BRA", "_stackbase"));
		program.add(new Label("_main", ""));
		// preamble
		program.addAll(visitMainFunction(ctx.mainFunction()));
		// add all functions defs

		// add postamble, pop result of return, and Halt
		program.add(new Label("_quit", ""));
		program.add(new Instruction("POP", "xFP"));
		program.add(new Instruction("OUT", "xFP"));
		program.add(new Instruction("HLT", ""));
		program.add(new Directive(".OR", "0x7000"));
		program.add(new Label("_stackbase", ""));
		program.add(new Instruction("MOVI", "xFP", "_stackbase"));
		program.add(new Instruction("MOVI", "xSP", "_stackbase"));
		program.add(new Instruction("CALL", "_main"));
		program.add(new Instruction("BRA", "_quit"));

		return program;

		//return visitChildren(ctx);
	}

	@Override
	public CodeList visitFunctionList(FunctionListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitMainFunction(MainFunctionContext ctx) {
		CodeList program = new CodeList();
		// add all mainFunction contents
		program.add(new Instruction("MOVI", "xFP", "0"));
		return program;

		//return visitChildren(ctx);
	}

	@Override
	public CodeList visitFunctionDefinition(FunctionDefinitionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitStatementList(StatementListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitDeclarationList(DeclarationListContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitVariable(VariableContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitCompoundStatement(CompoundStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitIfStatement(IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitWhileStatement(WhileStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitAssignStatement(AssignStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitReturnStatement(ReturnStatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitFunctionCall(FunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitTypeSpecifier(TypeSpecifierContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitDeclaration(DeclarationContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitStatement(StatementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitLexp(LexpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitExpr(ExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitBinaryOp(BinaryOpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitRelationOp(RelationOpContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitUnop(UnopContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitPars(ParsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visitBoolValue(BoolValueContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public CodeList visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeList visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeList visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeList visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
