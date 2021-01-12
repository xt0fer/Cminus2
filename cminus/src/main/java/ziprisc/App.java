package ziprisc;

// import CminusLexer;

// /**
//  * Hello world!
//  *
//  */
// public class App 
// {
//     public static void main( String[] args )
//     {
//         String cminusClassContent = "var foo = int(0); var bar = int(1);";
//         CminusLexer lexer = new CminusLexer(CharStreams.fromString(cminusClassContent));
//         CommonTokenStream tokens = new CommonTokenStream(lexer);
//         CminusParser parser = new CminusParser(tokens);
//         ParseTree tree = parser.compilationUnit();
//         ParseTreeWalker walker = new ParseTreeWalker();
//         UppercaseMethodListener listener = new UppercaseMethodListener();
//         walker.walk(listener, tree);
//     }
// }
