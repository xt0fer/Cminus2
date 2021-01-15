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
    private static final boolean DFLAG = false; //debug flag turns on tracing
    private String xarg0 = "x7";
    private String xarg1 = "x8";
    private String xarg2 = "x9";
    private String xarg3 = "xA";

    private Stack<VarScope> scopes;

    public Cm2Listener() {
        scopes = new Stack<VarScope>();
        scopes.push(new VarScope(null));
    } 

    private boolean checkVarName(String varName) {
        VarScope scope = scopes.peek();
        if(scope.inScope(varName)) {
            if (DFLAG) System.out.println("# Var in scope: " + varName);
            return true;
        }
        else {
            if (DFLAG) System.out.println("# Var not in scope: " + varName);
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
        if (DFLAG) emit("# token", node.getSymbol().getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (DFLAG) System.out.print("");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        this.emitDirective(".OR", "0x0000");
        this.emitI("BRA", "main");
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        if (DFLAG) System.out.print("");
        if (DFLAG) emit("# exit");
        this.emitI("POP", xarg1);
        this.emitI("OUT", xarg1);
        this.emitI("HLT");
    }

    public void enterFunctionList(FunctionListContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitFunctionList(FunctionListContext ctx) {
        if (DFLAG) System.out.print("");

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
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitStatementList(StatementListContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterDeclarationList(DeclarationListContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitDeclarationList(DeclarationListContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterVariable(VariableContext ctx) {
        if (DFLAG) System.out.println(">variable");
    }

    @Override
    public void exitVariable(VariableContext ctx) {
        if (DFLAG) System.out.println("<variable");

    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterIfStatement(IfStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitIfStatement(IfStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterWhileStatement(WhileStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitWhileStatement(WhileStatementContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterTypeSpecifier(TypeSpecifierContext ctx) {
        if (DFLAG) emit("// TypeSpecifier", ctx.getText());

    }

    @Override
    public void exitTypeSpecifier(TypeSpecifierContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {
        if (DFLAG) System.out.println(">declaration");
        String varName = ctx.Identifier().getText();
        VarScope scope = scopes.peek();
        scope.add(varName);
    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {
        if (DFLAG) System.out.println("<declaration");

    }

    @Override
    public void enterStatement(StatementContext ctx) {
        if (DFLAG) System.out.println(">statement");
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        if (DFLAG) System.out.println("<statement");

    }

    @Override
    public void enterLexp(LexpContext ctx) {
        if (DFLAG) System.out.println(">lexp");
    }

    @Override
    public void exitLexp(LexpContext ctx) {
        if (DFLAG) System.out.println("<lexp");
        String vart = ctx.getText();
        if (checkVarName(vart)) {
            emitI("LD", xarg0, vart);
            emitI("PUSH", xarg0);
        }
    }

    @Override
    public void enterExp(ExpContext ctx) {
        if (DFLAG) System.out.println(">exp");
    }

    @Override
    public void exitExp(ExpContext ctx) {
        if (DFLAG) System.out.println("<exp");
        String foo = ctx.getText();
        this.emitI("LDI", xarg0, foo);
        this.emitI("PUSH", xarg0);

    }

    @Override
    public void enterBinop(BinopContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitBinop(BinopContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterUnop(UnopContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitUnop(UnopContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterPars(ParsContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitPars(ParsContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void enterAssignStatement(AssignStatementContext ctx) {
        if (DFLAG) System.out.println(">assignment");
    }

    @Override
    public void exitAssignStatement(AssignStatementContext ctx) {
        if (DFLAG) System.out.println("<assignment");
        emitI("POP", xarg1);
        emitI("POP", xarg2);
        emitI("STR", xarg1, xarg2);

    }

    @Override
    public void enterReturnStatement(ReturnStatementContext ctx) {
        if (DFLAG) System.out.println(">return");

    }

    @Override
    public void exitReturnStatement(ReturnStatementContext ctx) {
        if (DFLAG) System.out.println("<return");

    }

    @Override
    public void enterFunctionCall(FunctionCallContext ctx) {
        if (DFLAG) System.out.print("");

    }

    @Override
    public void exitFunctionCall(FunctionCallContext ctx) {
        if (DFLAG) System.out.print("");

    }

}
