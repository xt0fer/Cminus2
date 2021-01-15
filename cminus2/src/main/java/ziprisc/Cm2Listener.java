package ziprisc;

//import java.util.HashMap;
import antlr4.ziprisc.Cminus2Listener;
import antlr4.ziprisc.Cminus2Parser;
import antlr4.ziprisc.Cminus2Parser.FunctionListContext;
import antlr4.ziprisc.Cminus2Parser.MainFunctionContext;
import antlr4.ziprisc.Cminus2Parser.ProgramContext;
import antlr4.ziprisc.Cminus2Parser.FunctionDefinitionContext;
import antlr4.ziprisc.Cminus2Parser.StatementListContext;
import antlr4.ziprisc.Cminus2Parser.DeclarationListContext;
import antlr4.ziprisc.Cminus2Parser.VariableContext;
import antlr4.ziprisc.Cminus2Parser.CompoundStatementContext;
import antlr4.ziprisc.Cminus2Parser.IfStatementContext;
import antlr4.ziprisc.Cminus2Parser.WhileStatementContext;
import antlr4.ziprisc.Cminus2Parser.TypeSpecifierContext;
import antlr4.ziprisc.Cminus2Parser.DeclarationContext;
import antlr4.ziprisc.Cminus2Parser.StatementContext;
import antlr4.ziprisc.Cminus2Parser.LexpContext;
import antlr4.ziprisc.Cminus2Parser.ExpContext;
import antlr4.ziprisc.Cminus2Parser.BinopContext;
import antlr4.ziprisc.Cminus2Parser.UnopContext;
import antlr4.ziprisc.Cminus2Parser.ParsContext;
import antlr4.ziprisc.Cminus2Parser.AssignStatementContext;
import antlr4.ziprisc.Cminus2Parser.ReturnStatementContext;
import antlr4.ziprisc.Cminus2Parser.FunctionCallContext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;


public class Cm2Listener implements Cminus2Listener {

    //private HashMap<String,String> symbol_table = new HashMap<>();
    
    private Stack<VarScope> scopes;

    public Cm2Listener() {
        scopes = new Stack<VarScope>();
        scopes.push(new VarScope(null));
    } 

    private boolean checkVarName(String varName) {
        VarScope scope = scopes.peek();
        if(scope.inScope(varName)) {
            System.out.println("Var in scope: " + varName);
            return true;
        }
        else {
            System.out.println("Var not in scope: " + varName);
            return false;
        }
    }
    private void emit(String... args) {
        for (String a : args) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    private void emitLabel(String l) {
        System.out.printf("%s:\n", l);
    }

    private void emitDirective(String d, String... args) {
        System.out.printf("%s ", d);
        for (String a : args) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    private void emitI(String d, String... args) {
        System.out.printf("\t%s ", d);
        for (String a : args) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        emit("// token", node.getSymbol().getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.err.print("");

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.err.print("");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        this.emitDirective(".OR", "0x0000");
        this.emitI("BRA", "main");
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        System.err.print("");
        emit("// exit program");
        this.emitI("POP", "x8");
        this.emitI("OUT", "x8");
        this.emitI("HLT");
    }

    public void enterFunctionList(FunctionListContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitFunctionList(FunctionListContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterMainFunction(MainFunctionContext ctx) {
        scopes.push(new VarScope(scopes.peek()));

        this.emitLabel("main");
    }

    @Override
    public void exitMainFunction(MainFunctionContext ctx) {
        scopes.pop();

    }

    @Override
    public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
        scopes.push(new VarScope(scopes.peek()));

    }

    @Override
    public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
        scopes.pop();

    }

    @Override
    public void enterStatementList(StatementListContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitStatementList(StatementListContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterDeclarationList(DeclarationListContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitDeclarationList(DeclarationListContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterVariable(VariableContext ctx) {
        System.err.println(">variable");
    }

    @Override
    public void exitVariable(VariableContext ctx) {
        String varName = ctx.Identifier().getText();
        VarScope scope = scopes.peek();
        scope.add(varName);
        System.err.println("<variable");

    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterIfStatement(IfStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitIfStatement(IfStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterWhileStatement(WhileStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitWhileStatement(WhileStatementContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterTypeSpecifier(TypeSpecifierContext ctx) {
        emit("// TypeSpecifier", ctx.getText());

    }

    @Override
    public void exitTypeSpecifier(TypeSpecifierContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {
        System.err.println(">declaration");
    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {
        System.err.println("<declaration");

    }

    @Override
    public void enterStatement(StatementContext ctx) {
        System.err.println(">statement");
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        System.err.println("<statement");

    }

    @Override
    public void enterLexp(LexpContext ctx) {
        System.err.println(">lexp");
    }

    @Override
    public void exitLexp(LexpContext ctx) {
        System.err.println("<lexp");
        String vart = ctx.getText();
        if (checkVarName(vart)) {
            emitI("LD", "x7", vart);
            emitI("PUSH", "x7");
        }
    }

    @Override
    public void enterExp(ExpContext ctx) {
        System.err.println(">exp");
    }

    @Override
    public void exitExp(ExpContext ctx) {
        System.err.println("<exp");
        String foo = ctx.getText();
        this.emitI("LDI", "x7", foo);
        this.emitI("PUSH", "x7");

    }

    @Override
    public void enterBinop(BinopContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitBinop(BinopContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterUnop(UnopContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitUnop(UnopContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterPars(ParsContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitPars(ParsContext ctx) {
        System.err.print("");

    }

    @Override
    public void enterAssignStatement(AssignStatementContext ctx) {
        System.err.println(">assignment");
    }

    @Override
    public void exitAssignStatement(AssignStatementContext ctx) {
        System.err.println("<assignment");

    }

    @Override
    public void enterReturnStatement(ReturnStatementContext ctx) {
        System.err.println(">return");

    }

    @Override
    public void exitReturnStatement(ReturnStatementContext ctx) {
        System.err.println("<return");

    }

    @Override
    public void enterFunctionCall(FunctionCallContext ctx) {
        System.err.print("");

    }

    @Override
    public void exitFunctionCall(FunctionCallContext ctx) {
        System.err.print("");

    }

}
