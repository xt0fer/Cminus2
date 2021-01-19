package ziprisc;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ziprisc.zas.Program;


/**
 * Hello world!
 *
 */
public class WeakJavaCompiler {
    private static final String PROGRAM = "class Project { \nint main() { return 0;\n}\n}";

    public static void main(String[] args) {
        String wjContent = WeakJavaCompiler.PROGRAM;
        WeakJavaLexer lexer = new WeakJavaLexer(CharStreams.fromString(wjContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WJParser parser = new WJParser(tokens);
        Program code = parser.parse(wjContent);
        code.emitAll();

    }
}
