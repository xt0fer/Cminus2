package ziprisc;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ziprisc.parser.Cminus2Lexer;
import ziprisc.parser.Cminus2Listener;
import ziprisc.parser.Cminus2Parser;

/**
 * Hello world!
 *
 */
public class Cminus2 {
    public static void main(String[] args) {
        String cminusContent = "int main() {\nint i;\n i = 0;\n return 0\n}";
        Cminus2Lexer lexer = new Cminus2Lexer(CharStreams.fromString(cminusContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Cminus2Parser parser = new Cminus2Parser(tokens);
        String[] rules = parser.getRuleNames();
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        Cminus2Listener listener = new Cm2Listener();
        walker.walk(listener, tree);
    }
}
