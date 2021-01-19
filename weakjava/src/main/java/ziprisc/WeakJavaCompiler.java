package ziprisc;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ziprisc.zas.CodeList;


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
        CodeList code = parser.parse(wjContent);
        code.emitAll();

    }
}
