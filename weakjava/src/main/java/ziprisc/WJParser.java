package ziprisc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;

//import ziprisc.zas.Directive;
//import ziprisc.zas.Instruction;
//import ziprisc.zas.Label;
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

}
