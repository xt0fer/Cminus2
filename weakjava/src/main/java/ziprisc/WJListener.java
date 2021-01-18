package ziprisc;

//import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;


public class WJListener implements WeakJavaListener {

    //private HashMap<String,String> symbol_table = new HashMap<>();
    private static final boolean DFLAG = true; //debug flag turns on tracing
    private String xarg0 = "x7";
    private String xarg1 = "x8";
    private String xarg2 = "x9";
    private String xarg3 = "xA";

    private int labelSerial = 1;

    private Stack<VarScope> scopes;

    public WJListener() {
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

    private String generateLabel() {
        String lstr = "L" + Integer.toString(this.labelSerial) + ":";
        this.labelSerial++;
        return lstr;
    }


    @Override
    public void visitTerminal(TerminalNode node) {
        if (DFLAG) emit("# token", node.getSymbol().getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        

    }

    @Override
    public void enterProgram(WeakJavaParser.ProgramContext ctx) {
        this.emitDirective(".OR", "0x0000");
        this.emitI("BRA", "main");
    }

    @Override
    public void exitProgram(WeakJavaParser.ProgramContext ctx) {
        
        if (DFLAG) emit("# exit");
        this.emitI("POP", xarg1);
        this.emitI("OUT", xarg1);
        this.emitI("HLT");
    }

    @Override public void enterProject(WeakJavaParser.ProjectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitProject(WeakJavaParser.ProjectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    public void enterFunctionList(WeakJavaParser.FunctionListContext ctx) {
        

    }

    @Override
    public void exitFunctionList(WeakJavaParser.FunctionListContext ctx) {
        

    }

    @Override
    public void enterMainFunction(WeakJavaParser.MainFunctionContext ctx) {
        scopes.push(new VarScope(scopes.peek()));

        this.emitLabel("main");
    }

    @Override
    public void exitMainFunction(WeakJavaParser.MainFunctionContext ctx) {
        scopes.pop();

    }

    @Override
    public void enterFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx) {
        scopes.push(new VarScope(scopes.peek()));

    }

    @Override
    public void exitFunctionDefinition(WeakJavaParser.FunctionDefinitionContext ctx) {
        scopes.pop();

    }

    @Override
    public void enterStatementList(WeakJavaParser.StatementListContext ctx) {
        

    }

    @Override
    public void exitStatementList(WeakJavaParser.StatementListContext ctx) {
    }

    @Override
    public void enterDeclarationList(WeakJavaParser.DeclarationListContext ctx) {
    }

    @Override
    public void exitDeclarationList(WeakJavaParser.DeclarationListContext ctx) {
    }

    @Override
    public void enterVariable(WeakJavaParser.VariableContext ctx) {
        if (DFLAG) System.out.println(">variable");
    }

    @Override
    public void exitVariable(WeakJavaParser.VariableContext ctx) {
        if (DFLAG) System.out.println("<variable");

    }

    @Override
    public void enterCompoundStatement(WeakJavaParser.CompoundStatementContext ctx) {
        

    }

    @Override
    public void exitCompoundStatement(WeakJavaParser.CompoundStatementContext ctx) {
        

    }

    @Override
    public void enterIfStatement(WeakJavaParser.IfStatementContext ctx) {
        

    }

    @Override
    public void exitIfStatement(WeakJavaParser.IfStatementContext ctx) {
        

    }

    @Override
    public void enterWhileStatement(WeakJavaParser.WhileStatementContext ctx) {
        

    }

    @Override
    public void exitWhileStatement(WeakJavaParser.WhileStatementContext ctx) {
        

    }

    @Override
    public void enterTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx) {
        if (DFLAG) emit("// TypeSpecifier", ctx.getText());

    }

    @Override
    public void exitTypeSpecifier(WeakJavaParser.TypeSpecifierContext ctx) {
        

    }

    @Override
    public void enterDeclaration(WeakJavaParser.DeclarationContext ctx) {
        if (DFLAG) System.out.println(">declaration");
        String varName = ctx.Identifier().getText();
        String ttype = ctx.typeSpecifier().getText();
        VarScope scope = scopes.peek();
        scope.put(varName, new LocalVar(varName,ttype));
    }

    @Override
    public void exitDeclaration(WeakJavaParser.DeclarationContext ctx) {
        if (DFLAG) System.out.println("<declaration");

    }

    @Override
    public void enterStatement(WeakJavaParser.StatementContext ctx) {
        if (DFLAG) System.out.println(">statement");
    }

    @Override
    public void exitStatement(WeakJavaParser.StatementContext ctx) {
        if (DFLAG) System.out.println("<statement");

    }

    @Override
    public void enterLexp(WeakJavaParser.LexpContext ctx) {
        if (DFLAG) System.out.println(">lexp");
    }

    @Override
    public void exitLexp(WeakJavaParser.LexpContext ctx) {
        if (DFLAG) System.out.println("<lexp");
        String vart = ctx.getText();

        if (checkVarName(vart)) {
            emitI("LD", xarg0, vart);
            emitI("PUSH", xarg0);
        }
    }

    @Override
    public void enterExpr(WeakJavaParser.ExprContext ctx) {
        if (DFLAG) System.out.println(">exp");
    }

    @Override
    public void exitExpr(WeakJavaParser.ExprContext ctx) {
        if (DFLAG) System.out.println("<exp");
        String foo = ctx.getText();
        this.emitI("LDI", xarg0, foo);
        this.emitI("PUSH", xarg0);

    }

    @Override
    public void enterBinaryOp(WeakJavaParser.BinaryOpContext ctx) {
        

    }

    @Override
    public void exitBinaryOp(WeakJavaParser.BinaryOpContext ctx) {
        

    }

    @Override
    public void enterRelationOp(WeakJavaParser.RelationOpContext ctx) {
        

    }

    @Override
    public void exitRelationOp(WeakJavaParser.RelationOpContext ctx) {
        

    }

    @Override
    public void enterUnop(WeakJavaParser.UnopContext ctx) {
        

    }

    @Override
    public void exitUnop(WeakJavaParser.UnopContext ctx) {
        

    }

    @Override
    public void enterPars(WeakJavaParser.ParsContext ctx) {
        

    }

    @Override
    public void exitPars(WeakJavaParser.ParsContext ctx) {
        

    }

    @Override
    public void enterBoolValue(WeakJavaParser.BoolValueContext ctx) {
        if (DFLAG) System.out.println(">boolvalue");
    }

    @Override
    public void exitBoolValue(WeakJavaParser.BoolValueContext ctx) {
        if (DFLAG) System.out.println("<boolvalue>");
    }

    @Override
    public void enterAssignStatement(WeakJavaParser.AssignStatementContext ctx) {
        if (DFLAG) System.out.println(">assignment");
    }

    @Override
    public void exitAssignStatement(WeakJavaParser.AssignStatementContext ctx) {
        if (DFLAG) System.out.println("<assignment");
        emitI("POP", xarg1);
        emitI("POP", xarg2);
        emitI("STR", xarg1, xarg2);

    }

    @Override
    public void enterReturnStatement(WeakJavaParser.ReturnStatementContext ctx) {
        if (DFLAG) System.out.println(">return");

    }

    @Override
    public void exitReturnStatement(WeakJavaParser.ReturnStatementContext ctx) {
        if (DFLAG) System.out.println("<return");

    }

    @Override
    public void enterFunctionCall(WeakJavaParser.FunctionCallContext ctx) {
        

    }

    @Override
    public void exitFunctionCall(WeakJavaParser.FunctionCallContext ctx) {
        

    }

}
