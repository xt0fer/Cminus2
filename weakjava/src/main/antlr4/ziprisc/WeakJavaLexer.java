// Generated from /Volumes/DeVere/kristofer/Documents/Projects/WeakJava/weakjava/src/main/antlr4/ziprisc/WeakJava.g4 by ANTLR 4.9
package ziprisc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WeakJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Length=1, Else=2, If=3, Int=4, String=5, Rune=6, Boolean=7, Array=8, Return=9, 
		While=10, Func=11, Main=12, Read=13, Write=14, Class=15, Project=16, True=17, 
		False=18, Assign=19, EqualEqual=20, NotEqual=21, Paren=22, Thesis=23, 
		LeftBracket=24, RightBracket=25, LeftBrace=26, RightBrace=27, Less=28, 
		LessEqual=29, Greater=30, GreaterEqual=31, LeftShift=32, RightShift=33, 
		Plus=34, PlusPlus=35, Minus=36, MinusMinus=37, Star=38, Div=39, Mod=40, 
		And=41, Or=42, AndAnd=43, OrOr=44, Caret=45, Not=46, Tilde=47, Question=48, 
		Colon=49, Semi=50, Comma=51, Quote=52, Identifier=53, Number=54, QRune=55, 
		Qstr=56, Whitespace=57, Newline=58, LineComment=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Length", "Else", "If", "Int", "String", "Rune", "Boolean", "Array", 
			"Return", "While", "Func", "Main", "Read", "Write", "Class", "Project", 
			"True", "False", "Assign", "EqualEqual", "NotEqual", "Paren", "Thesis", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Quote", 
			"Identifier", "IdentifierNondigit", "Nondigit", "Digit", "Number", "QRune", 
			"Qstr", "Whitespace", "Newline", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'len'", "'else'", "'if'", "'int'", "'string'", "'rune'", "'boolean'", 
			"'array'", "'return'", "'while'", "'function'", "'main'", "'read'", "'write'", 
			"'class'", "'Project'", "'true'", "'false'", "'='", "'=='", "'!='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", 
			"'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", 
			"'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Length", "Else", "If", "Int", "String", "Rune", "Boolean", "Array", 
			"Return", "While", "Func", "Main", "Read", "Write", "Class", "Project", 
			"True", "False", "Assign", "EqualEqual", "NotEqual", "Paren", "Thesis", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Quote", 
			"Identifier", "Number", "QRune", "Qstr", "Whitespace", "Newline", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public WeakJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WeakJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\7\66\u013a\n\66\f\66\16\66\u013d"+
		"\13\66\3\67\3\67\38\38\39\39\3:\6:\u0146\n:\r:\16:\u0147\3;\3;\3;\3;\3"+
		"<\3<\6<\u0150\n<\r<\16<\u0151\3<\3<\3=\6=\u0157\n=\r=\16=\u0158\3=\3="+
		"\3>\3>\5>\u015f\n>\3>\5>\u0162\n>\3>\3>\3?\3?\3?\3?\7?\u016a\n?\f?\16"+
		"?\u016d\13?\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m\2o\2q\2s8u9w:y;{<}=\3\2\6\5\2C\\aac|\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0083\3\2\2\2\7\u0088\3\2\2\2\t\u008b"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0096\3\2\2\2\17\u009b\3\2\2\2\21\u00a3\3"+
		"\2\2\2\23\u00a9\3\2\2\2\25\u00b0\3\2\2\2\27\u00b6\3\2\2\2\31\u00bf\3\2"+
		"\2\2\33\u00c4\3\2\2\2\35\u00c9\3\2\2\2\37\u00cf\3\2\2\2!\u00d5\3\2\2\2"+
		"#\u00dd\3\2\2\2%\u00e2\3\2\2\2\'\u00e8\3\2\2\2)\u00ea\3\2\2\2+\u00ed\3"+
		"\2\2\2-\u00f0\3\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2\63\u00f6\3\2\2\2"+
		"\65\u00f8\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0101"+
		"\3\2\2\2?\u0103\3\2\2\2A\u0106\3\2\2\2C\u0109\3\2\2\2E\u010c\3\2\2\2G"+
		"\u010e\3\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M\u0116\3\2\2\2O\u0118\3\2"+
		"\2\2Q\u011a\3\2\2\2S\u011c\3\2\2\2U\u011e\3\2\2\2W\u0120\3\2\2\2Y\u0123"+
		"\3\2\2\2[\u0126\3\2\2\2]\u0128\3\2\2\2_\u012a\3\2\2\2a\u012c\3\2\2\2c"+
		"\u012e\3\2\2\2e\u0130\3\2\2\2g\u0132\3\2\2\2i\u0134\3\2\2\2k\u0136\3\2"+
		"\2\2m\u013e\3\2\2\2o\u0140\3\2\2\2q\u0142\3\2\2\2s\u0145\3\2\2\2u\u0149"+
		"\3\2\2\2w\u014d\3\2\2\2y\u0156\3\2\2\2{\u0161\3\2\2\2}\u0165\3\2\2\2\177"+
		"\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\4\3\2\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2"+
		"\u0087\6\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\b\3\2\2\2"+
		"\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\n\3\2"+
		"\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7i\2\2\u0095\f\3\2\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7w\2\2\u0098\u0099\7p\2\2\u0099\u009a\7g\2\2\u009a"+
		"\16\3\2\2\2\u009b\u009c\7d\2\2\u009c\u009d\7q\2\2\u009d\u009e\7q\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2"+
		"\u00a2\20\3\2\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7"+
		"t\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7{\2\2\u00a8\22\3\2\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7w\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1"+
		"\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\26\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7"+
		"p\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7p\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\32\3\2\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7f\2\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4 \3\2\2\2\u00d5\u00d6\7R\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7q\2"+
		"\2\u00d8\u00d9\7l\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0"+
		"\7w\2\2\u00e0\u00e1\7g\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"&\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00ef,\3"+
		"\2\2\2\u00f0\u00f1\7*\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3\60\3"+
		"\2\2\2\u00f4\u00f5\7]\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7\64"+
		"\3\2\2\2\u00f8\u00f9\7}\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fb"+
		"8\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100"+
		"\7?\2\2\u0100<\3\2\2\2\u0101\u0102\7@\2\2\u0102>\3\2\2\2\u0103\u0104\7"+
		"@\2\2\u0104\u0105\7?\2\2\u0105@\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108"+
		"\7>\2\2\u0108B\3\2\2\2\u0109\u010a\7@\2\2\u010a\u010b\7@\2\2\u010bD\3"+
		"\2\2\2\u010c\u010d\7-\2\2\u010dF\3\2\2\2\u010e\u010f\7-\2\2\u010f\u0110"+
		"\7-\2\2\u0110H\3\2\2\2\u0111\u0112\7/\2\2\u0112J\3\2\2\2\u0113\u0114\7"+
		"/\2\2\u0114\u0115\7/\2\2\u0115L\3\2\2\2\u0116\u0117\7,\2\2\u0117N\3\2"+
		"\2\2\u0118\u0119\7\61\2\2\u0119P\3\2\2\2\u011a\u011b\7\'\2\2\u011bR\3"+
		"\2\2\2\u011c\u011d\7(\2\2\u011dT\3\2\2\2\u011e\u011f\7~\2\2\u011fV\3\2"+
		"\2\2\u0120\u0121\7(\2\2\u0121\u0122\7(\2\2\u0122X\3\2\2\2\u0123\u0124"+
		"\7~\2\2\u0124\u0125\7~\2\2\u0125Z\3\2\2\2\u0126\u0127\7`\2\2\u0127\\\3"+
		"\2\2\2\u0128\u0129\7#\2\2\u0129^\3\2\2\2\u012a\u012b\7\u0080\2\2\u012b"+
		"`\3\2\2\2\u012c\u012d\7A\2\2\u012db\3\2\2\2\u012e\u012f\7<\2\2\u012fd"+
		"\3\2\2\2\u0130\u0131\7=\2\2\u0131f\3\2\2\2\u0132\u0133\7.\2\2\u0133h\3"+
		"\2\2\2\u0134\u0135\7)\2\2\u0135j\3\2\2\2\u0136\u013b\5m\67\2\u0137\u013a"+
		"\5m\67\2\u0138\u013a\5q9\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cl\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u013f\5o8\2\u013fn\3\2\2\2\u0140\u0141\t\2"+
		"\2\2\u0141p\3\2\2\2\u0142\u0143\t\3\2\2\u0143r\3\2\2\2\u0144\u0146\5q"+
		"9\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148t\3\2\2\2\u0149\u014a\5i\65\2\u014a\u014b\5m\67\2"+
		"\u014b\u014c\5i\65\2\u014cv\3\2\2\2\u014d\u014f\5i\65\2\u014e\u0150\5"+
		"m\67\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5i\65\2\u0154x\3\2\2\2"+
		"\u0155\u0157\t\4\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b=\2\2\u015b"+
		"z\3\2\2\2\u015c\u015e\7\17\2\2\u015d\u015f\7\f\2\2\u015e\u015d\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0162\7\f\2\2\u0161\u015c"+
		"\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b>\2\2\u0164"+
		"|\3\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7\61\2\2\u0167\u016b\3\2\2"+
		"\2\u0168\u016a\n\5\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\b?\2\2\u016f~\3\2\2\2\13\2\u0139\u013b\u0147\u0151\u0158\u015e"+
		"\u0161\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}