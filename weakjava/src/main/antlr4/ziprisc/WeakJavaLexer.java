// Generated from /Volumes/DeVere/kristofer/Documents/Projects/WeakJava/weakjava/src/main/antlr4/ziprisc/WeakJava.g4 by ANTLR 4.9
package antlr4.ziprisc;
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
		Length=1, Else=2, If=3, Int=4, String=5, Rune=6, Array=7, Return=8, While=9, 
		Func=10, Main=11, Read=12, Write=13, Class=14, Project=15, Assign=16, 
		EqualEqual=17, NotEqual=18, Paren=19, Thesis=20, LeftBracket=21, RightBracket=22, 
		LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, Greater=27, GreaterEqual=28, 
		LeftShift=29, RightShift=30, Plus=31, PlusPlus=32, Minus=33, MinusMinus=34, 
		Star=35, Div=36, Mod=37, And=38, Or=39, AndAnd=40, OrOr=41, Caret=42, 
		Not=43, Tilde=44, Question=45, Colon=46, Semi=47, Comma=48, Quote=49, 
		Identifier=50, Number=51, QRune=52, Qstr=53, Whitespace=54, Newline=55, 
		LineComment=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Length", "Else", "If", "Int", "String", "Rune", "Array", "Return", "While", 
			"Func", "Main", "Read", "Write", "Class", "Project", "Assign", "EqualEqual", 
			"NotEqual", "Paren", "Thesis", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
			"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", 
			"Colon", "Semi", "Comma", "Quote", "Identifier", "IdentifierNondigit", 
			"Nondigit", "Digit", "Number", "QRune", "Qstr", "Whitespace", "Newline", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'len'", "'else'", "'if'", "'int'", "'string'", "'rune'", "'array'", 
			"'return'", "'while'", "'function'", "'main'", "'read'", "'write'", "'class'", 
			"'Project'", "'='", "'=='", "'!='", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Length", "Else", "If", "Int", "String", "Rune", "Array", "Return", 
			"While", "Func", "Main", "Read", "Write", "Class", "Project", "Assign", 
			"EqualEqual", "NotEqual", "Paren", "Thesis", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Question", "Colon", "Semi", "Comma", "Quote", "Identifier", 
			"Number", "QRune", "Qstr", "Whitespace", "Newline", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\7\63\u0121\n\63\f\63\16\63\u0124\13\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\6\67\u012d\n\67\r\67\16\67\u012e\38\38\38\38\39\39\69\u0137"+
		"\n9\r9\169\u0138\39\39\3:\6:\u013e\n:\r:\16:\u013f\3:\3:\3;\3;\5;\u0146"+
		"\n;\3;\5;\u0149\n;\3;\3;\3<\3<\3<\3<\7<\u0151\n<\f<\16<\u0154\13<\3<\3"+
		"<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k"+
		"\2m\65o\66q\67s8u9w:\3\2\6\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\2\u015b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3\2\2\2\7\u0082\3\2\2"+
		"\2\t\u0085\3\2\2\2\13\u0089\3\2\2\2\r\u0090\3\2\2\2\17\u0095\3\2\2\2\21"+
		"\u009b\3\2\2\2\23\u00a2\3\2\2\2\25\u00a8\3\2\2\2\27\u00b1\3\2\2\2\31\u00b6"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00c1\3\2\2\2\37\u00c7\3\2\2\2!\u00cf\3\2"+
		"\2\2#\u00d1\3\2\2\2%\u00d4\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db"+
		"\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2"+
		"\2\65\u00e5\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ed\3\2\2\2=\u00f0"+
		"\3\2\2\2?\u00f3\3\2\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0101\3\2\2\2M\u0103\3\2\2\2O\u0105\3\2"+
		"\2\2Q\u0107\3\2\2\2S\u010a\3\2\2\2U\u010d\3\2\2\2W\u010f\3\2\2\2Y\u0111"+
		"\3\2\2\2[\u0113\3\2\2\2]\u0115\3\2\2\2_\u0117\3\2\2\2a\u0119\3\2\2\2c"+
		"\u011b\3\2\2\2e\u011d\3\2\2\2g\u0125\3\2\2\2i\u0127\3\2\2\2k\u0129\3\2"+
		"\2\2m\u012c\3\2\2\2o\u0130\3\2\2\2q\u0134\3\2\2\2s\u013d\3\2\2\2u\u0148"+
		"\3\2\2\2w\u014c\3\2\2\2yz\7n\2\2z{\7g\2\2{|\7p\2\2|\4\3\2\2\2}~\7g\2\2"+
		"~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\6\3\2\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084\b\3\2\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\n\3\2\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7i\2\2\u008f\f\3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w"+
		"\2\2\u0092\u0093\7p\2\2\u0093\u0094\7g\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7t\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7{\2\2\u009a\20\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\22\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7"+
		"k\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\24\3\2\2\2\u00a8\u00a9"+
		"\7h\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\26\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7"+
		"k\2\2\u00b4\u00b5\7p\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7f\2\2\u00ba\32\3\2\2\2\u00bb\u00bc"+
		"\7y\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7u\2\2\u00c6\36\3\2\2\2\u00c7"+
		"\u00c8\7R\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7l\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7v\2\2\u00ce \3\2\2"+
		"\2\u00cf\u00d0\7?\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d3\7"+
		"?\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d6&\3\2"+
		"\2\2\u00d7\u00d8\7*\2\2\u00d8(\3\2\2\2\u00d9\u00da\7+\2\2\u00da*\3\2\2"+
		"\2\u00db\u00dc\7]\2\2\u00dc,\3\2\2\2\u00dd\u00de\7_\2\2\u00de.\3\2\2\2"+
		"\u00df\u00e0\7}\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2\62\3"+
		"\2\2\2\u00e3\u00e4\7>\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7@\2\2\u00e98\3\2\2\2\u00ea\u00eb"+
		"\7@\2\2\u00eb\u00ec\7?\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef"+
		"\7>\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2\7@\2\2\u00f2>\3"+
		"\2\2\2\u00f3\u00f4\7-\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f7"+
		"\7-\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7"+
		"/\2\2\u00fb\u00fc\7/\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7,\2\2\u00feH\3\2"+
		"\2\2\u00ff\u0100\7\61\2\2\u0100J\3\2\2\2\u0101\u0102\7\'\2\2\u0102L\3"+
		"\2\2\2\u0103\u0104\7(\2\2\u0104N\3\2\2\2\u0105\u0106\7~\2\2\u0106P\3\2"+
		"\2\2\u0107\u0108\7(\2\2\u0108\u0109\7(\2\2\u0109R\3\2\2\2\u010a\u010b"+
		"\7~\2\2\u010b\u010c\7~\2\2\u010cT\3\2\2\2\u010d\u010e\7`\2\2\u010eV\3"+
		"\2\2\2\u010f\u0110\7#\2\2\u0110X\3\2\2\2\u0111\u0112\7\u0080\2\2\u0112"+
		"Z\3\2\2\2\u0113\u0114\7A\2\2\u0114\\\3\2\2\2\u0115\u0116\7<\2\2\u0116"+
		"^\3\2\2\2\u0117\u0118\7=\2\2\u0118`\3\2\2\2\u0119\u011a\7.\2\2\u011ab"+
		"\3\2\2\2\u011b\u011c\7)\2\2\u011cd\3\2\2\2\u011d\u0122\5g\64\2\u011e\u0121"+
		"\5g\64\2\u011f\u0121\5k\66\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123f\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0125\u0126\5i\65\2\u0126h\3\2\2\2\u0127\u0128\t"+
		"\2\2\2\u0128j\3\2\2\2\u0129\u012a\t\3\2\2\u012al\3\2\2\2\u012b\u012d\5"+
		"k\66\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fn\3\2\2\2\u0130\u0131\5c\62\2\u0131\u0132\5g\64\2"+
		"\u0132\u0133\5c\62\2\u0133p\3\2\2\2\u0134\u0136\5c\62\2\u0135\u0137\5"+
		"g\64\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\5c\62\2\u013br\3\2\2\2"+
		"\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b:\2\2\u0142"+
		"t\3\2\2\2\u0143\u0145\7\17\2\2\u0144\u0146\7\f\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0149\7\f\2\2\u0148\u0143"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b;\2\2\u014b"+
		"v\3\2\2\2\u014c\u014d\7\61\2\2\u014d\u014e\7\61\2\2\u014e\u0152\3\2\2"+
		"\2\u014f\u0151\n\5\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\b<\2\2\u0156x\3\2\2\2\13\2\u0120\u0122\u012e\u0138\u013f\u0145"+
		"\u0148\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}