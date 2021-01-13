package ziprisc;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import ziprisc.parser.Cminus2Listener;
import ziprisc.parser.Cminus2Parser.BinopContext;
import ziprisc.parser.Cminus2Parser.CompoundStatementContext;
import ziprisc.parser.Cminus2Parser.DeclarationContext;
import ziprisc.parser.Cminus2Parser.DeclarationListContext;
import ziprisc.parser.Cminus2Parser.ExpContext;
import ziprisc.parser.Cminus2Parser.FunctionDefinitionContext;
import ziprisc.parser.Cminus2Parser.FunctionListContext;
import ziprisc.parser.Cminus2Parser.IfStatementContext;
import ziprisc.parser.Cminus2Parser.LexpContext;
import ziprisc.parser.Cminus2Parser.MainFunctionContext;
import ziprisc.parser.Cminus2Parser.ParsContext;
import ziprisc.parser.Cminus2Parser.ProgramContext;
import ziprisc.parser.Cminus2Parser.StatementContext;
import ziprisc.parser.Cminus2Parser.StatementListContext;
import ziprisc.parser.Cminus2Parser.TypeSpecifierContext;
import ziprisc.parser.Cminus2Parser.UnopContext;
import ziprisc.parser.Cminus2Parser.VariableContext;
import ziprisc.parser.Cminus2Parser.WhileStatementContext;

public class Cm2Listener implements Cminus2Listener {

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        int rulenum = ctx.getRuleIndex();
        System.err.printf("Rule %d Named:\n", rulenum);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterFunctionList(FunctionListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitFunctionList(FunctionListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMainFunction(MainFunctionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMainFunction(MainFunctionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterStatementList(StatementListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitStatementList(StatementListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterDeclarationList(DeclarationListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitDeclarationList(DeclarationListContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterVariable(VariableContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitVariable(VariableContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterIfStatement(IfStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitIfStatement(IfStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterWhileStatement(WhileStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitWhileStatement(WhileStatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTypeSpecifier(TypeSpecifierContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTypeSpecifier(TypeSpecifierContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterDeclaration(DeclarationContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitDeclaration(DeclarationContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterStatement(StatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitStatement(StatementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLexp(LexpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLexp(LexpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterExp(ExpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitExp(ExpContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBinop(BinopContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBinop(BinopContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterUnop(UnopContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitUnop(UnopContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterPars(ParsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitPars(ParsContext ctx) {
        // TODO Auto-generated method stub

    }
    
}
