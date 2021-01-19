package ziprisc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;

import ziprisc.zas.Directive;
import ziprisc.zas.Instruction;
import ziprisc.zas.Label;
import ziprisc.zas.CodeList;


public class WJParser extends Parser {

    public WJParser(TokenStream input) {
        super(input);
    }

    public CodeList parse(String sourceCode) {
            WeakJavaLexer lexer = new WeakJavaLexer(CharStreams.fromString(sourceCode));
            TokenStream tokens = new CommonTokenStream(lexer);
            WeakJavaParser parser = new WeakJavaParser(tokens);

            WJVisitor visitor = new WJVisitor();
            CodeList code = visitor.visitProgram(parser.program());
            return code;
        }

    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }

    private static class ProgramVisitor extends WeakJavaBaseVisitor<CodeList> {
            @Override
            public CodeList visitProgram(WeakJavaParser.ProgramContext ctx) {
                //String className = ctx.className().getText();
                ProjectVisitor projectVisitor = new ProjectVisitor();
                CodeList program = new CodeList();
//                List<Method> methods = ctx.method()
//                        .stream()
//                        .map(method -> method.accept(methodVisitor))
//                        .collect(toList());
                program.addAll(projectVisitor.visitProject(ctx.project()));
                return program;
            }
        }
//    @Override public T visitProgram(WeakJavaParser.ProgramContext ctx) { return visitChildren(ctx); }
private static class ProjectVisitor extends WeakJavaBaseVisitor<CodeList> {
    @Override
    public CodeList visitProject(WeakJavaParser.ProjectContext ctx) {
        CodeList program = new CodeList();
        MainFunctionVisitor mainVisitor = new MainFunctionVisitor();
        program.add(new Directive(".OR", "0x0000"));

        program.add(new Instruction("BRA", "_stackbase"));
        program.add(new Label("_main", ""));
        // preamble
        program.addAll(mainVisitor.visitMainFunction(ctx.mainFunction()));
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
    }
}
//    @Override public T visitProject(WeakJavaParser.ProjectContext ctx) { return visitChildren(ctx); }
//    @Override public T visitFunctionList(WeakJavaParser.FunctionListContext ctx) { return visitChildren(ctx); }
//    @Override public T visitMainFunction(WeakJavaParser.MainFunctionContext ctx) { return visitChildren(ctx); }
//    @Override public T visitFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx) { return visitChildren(ctx); }
//    @Override public T visitStatementList(WeakJavaParser.StatementListContext ctx) { return visitChildren(ctx); }
//    @Override public T visitDeclarationList(WeakJavaParser.DeclarationListContext ctx) { return visitChildren(ctx); }
//    @Override public T visitVariable(WeakJavaParser.VariableContext ctx) { return visitChildren(ctx); }
//    @Override public T visitCompoundStatement(WeakJavaParser.CompoundStatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitIfStatement(WeakJavaParser.IfStatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitWhileStatement(WeakJavaParser.WhileStatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitAssignStatement(WeakJavaParser.AssignStatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitReturnStatement(WeakJavaParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitFunctionCall(WeakJavaParser.FunctionCallContext ctx) { return visitChildren(ctx); }
//    @Override public T visitTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx) { return visitChildren(ctx); }
//    @Override public T visitDeclaration(WeakJavaParser.DeclarationContext ctx) { return visitChildren(ctx); }
//    @Override public T visitStatement(WeakJavaParser.StatementContext ctx) { return visitChildren(ctx); }
//    @Override public T visitLexp(WeakJavaParser.LexpContext ctx) { return visitChildren(ctx); }
//    @Override public T visitExpr(WeakJavaParser.ExprContext ctx) { return visitChildren(ctx); }
//    @Override public T visitBinaryOp(WeakJavaParser.BinaryOpContext ctx) { return visitChildren(ctx); }
//    @Override public T visitRelationOp(WeakJavaParser.RelationOpContext ctx) { return visitChildren(ctx); }
//    @Override public T visitUnop(WeakJavaParser.UnopContext ctx) { return visitChildren(ctx); }
//    @Override public T visitPars(WeakJavaParser.ParsContext ctx) { return visitChildren(ctx); }
//    @Override public T visitBoolValue(WeakJavaParser.BoolValueContext ctx) { return visitChildren(ctx); }

    private static class MainFunctionVisitor extends WeakJavaBaseVisitor<CodeList> {
        @Override
        public CodeList visitMainFunction(WeakJavaParser.MainFunctionContext ctx) {
//            String methodName = ctx.methodName().getText();
//            InstructionVisitor instructionVisitor = new InstructionVisitor();
//            List<Instruction> instructions = ctx.instruction()
//                    .stream()
//                    .map(instruction -> instruction.accept(instructionVisitor))
//                    .collect(toList());
            CodeList program = new CodeList();
            // add all mainFunction contents
            program.add(new Instruction("MOVI", "xFP", "0"));
            return program;
        }
    }

    //    @Override public T visitReturnStatement(WeakJavaParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
    private static class ReturnStatementVisitor extends WeakJavaBaseVisitor<CodeList> {
        public CodeList visitReturnStatement(WeakJavaParser.ReturnStatementContext ctx) {
            return visitChildren(ctx);
        }
    }

//    private static class FunctionVisitor extends WeakJavaBaseVisitor<Method> {
//        @Override
//        public Method visitMethod(@NotNull WeakJavaParser.MethodContext ctx) {
//            String methodName = ctx.methodName().getText();
//            InstructionVisitor instructionVisitor = new InstructionVisitor();
//            List<Instruction> instructions = ctx.instruction()
//                    .stream()
//                    .map(instruction -> instruction.accept(instructionVisitor))
//                    .collect(toList());
//            return new Method(methodName, instructions);
//        }
//    }

//        private static class InstructionVisitor extends  WeakJavaBaseVisitor<Instruction> {
//
//            @Override
//            public Instruction visitInstruction(@NotNull WeakJavaParser.InstructionContext ctx) {
//                String instructionName = ctx.getText();
//                return new Instruction(instructionName);
//            }
//        }
    

}
