package ziprisc;

import antlr4.ziprisc.WeakJavaLexer;
import antlr4.ziprisc.WeakJavaParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


/**
 * Hello world!
 *
 */
public class WeakJavaCompiler {
    private static final String PROGRAM = "class Project { \nint main() { int i; \ni = 0;\n return i;\n}\n}";

    public static void main(String[] args) {
        String wjContent = WeakJavaCompiler.PROGRAM;
        WeakJavaLexer lexer = new WeakJavaLexer(CharStreams.fromString(wjContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WeakJavaParser parser = new WeakJavaParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        WJListener listener = new WJListener();
        walker.walk(listener, tree);
        System.out.println(tree.toStringTree(parser));

    }
}
