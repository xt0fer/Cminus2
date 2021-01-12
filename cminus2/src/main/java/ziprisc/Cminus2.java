package ziprisc;

import CminusLexer;

/**
 * Hello world!
 *
 */
public class Cminus2 
{
    public static void main( String[] args )
    {
        String cminusClassContent = "main() {int i; i = 0; return 0;}";
        CminusLexer lexer = new CminusLexer(CharStreams.fromString(cminusClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CminusParser parser = new CminusParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        UppercaseMethodListener listener = new UppercaseMethodListener();
        walker.walk(listener, tree);
    }
}
