// Generated from /home/kristofer/p/c-minus/cminus/src/main/java/ziprisc/Cminus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CminusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Break=3, Continue=4, Else=5, If=6, Var=7, Int=8, Bool=9, 
		StringType=10, Rune=11, Array=12, Return=13, Void=14, While=15, Func=16, 
		Main=17, True=18, False=19, Paren=20, Thesis=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Less=26, LessEqual=27, Greater=28, GreaterEqual=29, 
		LeftShift=30, RightShift=31, Plus=32, PlusPlus=33, Minus=34, MinusMinus=35, 
		Star=36, Div=37, Mod=38, And=39, Or=40, AndAnd=41, OrOr=42, Caret=43, 
		Not=44, Tilde=45, Question=46, Colon=47, Semi=48, Comma=49, Assign=50, 
		Identifier=51, Constant=52, DigitSequence=53, StringLiteral=54, Whitespace=55, 
		Newline=56, BlockComment=57, LineComment=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Break", "Continue", "Else", "If", "Var", "Int", "Bool", 
			"StringType", "Rune", "Array", "Return", "Void", "While", "Func", "Main", 
			"True", "False", "Paren", "Thesis", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
			"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", 
			"Colon", "Semi", "Comma", "Assign", "Identifier", "IdentifierNondigit", 
			"Nondigit", "Digit", "UniversalCharacterName", "HexQuad", "Constant", 
			"IntegerConstant", "BinaryConstant", "BooleanConstant", "DecimalConstant", 
			"OctalConstant", "HexadecimalConstant", "HexadecimalPrefix", "NonzeroDigit", 
			"OctalDigit", "HexadecimalDigit", "Sign", "DigitSequence", "HexadecimalDigitSequence", 
			"CharacterConstant", "CCharSequence", "CChar", "EscapeSequence", "SimpleEscapeSequence", 
			"OctalEscapeSequence", "HexadecimalEscapeSequence", "StringLiteral", 
			"SCharSequence", "SChar", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'!='", "'break'", "'continue'", "'else'", "'if'", "'var'", 
			"'int'", "'boolean'", "'string'", "'rune'", "'array'", "'return'", "'void'", 
			"'while'", "'function'", "'main'", "'true'", "'false'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", 
			"'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", 
			"'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Break", "Continue", "Else", "If", "Var", "Int", "Bool", 
			"StringType", "Rune", "Array", "Return", "Void", "While", "Func", "Main", 
			"True", "False", "Paren", "Thesis", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
			"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", 
			"Colon", "Semi", "Comma", "Assign", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public CminusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cminus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0237\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\64\7\64\u015f\n\64\f\64\16\64\u0162\13\64\3\65\3\65\5\65\u0166\n"+
		"\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\38\38\38\58\u0176\n8\39\3"+
		"9\39\39\39\3:\3:\5:\u017f\n:\3;\3;\3;\3;\3;\5;\u0186\n;\3<\3<\3<\6<\u018b"+
		"\n<\r<\16<\u018c\3=\3=\5=\u0191\n=\3>\3>\7>\u0195\n>\f>\16>\u0198\13>"+
		"\3?\3?\7?\u019c\n?\f?\16?\u019f\13?\3@\3@\6@\u01a3\n@\r@\16@\u01a4\3A"+
		"\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\6F\u01b3\nF\rF\16F\u01b4\3G\6G\u01b8"+
		"\nG\rG\16G\u01b9\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\5H\u01d2\nH\3I\6I\u01d5\nI\rI\16I\u01d6\3J\3J\5J\u01db\n"+
		"J\3K\3K\3K\3K\5K\u01e1\nK\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5"+
		"M\u01f1\nM\3N\3N\3N\3N\6N\u01f7\nN\rN\16N\u01f8\3O\3O\5O\u01fd\nO\3O\3"+
		"O\3P\6P\u0202\nP\rP\16P\u0203\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u020d\nQ\3R\6R\u0210"+
		"\nR\rR\16R\u0211\3R\3R\3S\3S\5S\u0218\nS\3S\5S\u021b\nS\3S\3S\3T\3T\3"+
		"T\3T\7T\u0223\nT\fT\16T\u0226\13T\3T\3T\3T\3T\3T\3U\3U\3U\3U\7U\u0231"+
		"\nU\fU\16U\u0234\13U\3U\3U\3\u0224\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2q\2s\66u\2w\2y\2{\2}\2\177\2\u0081"+
		"\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\67\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d8\u009f\2\u00a1\2\u00a39\u00a5"+
		":\u00a7;\u00a9<\3\2\20\5\2C\\aac|\3\2\62;\4\2DDdd\3\2\62\63\4\2ZZzz\3"+
		"\2\63;\3\2\629\5\2\62;CHch\4\2--//\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhp"+
		"pttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u0241\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2s\3\2\2\2\2\u008b\3\2\2\2\2\u009d\3\2"+
		"\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3"+
		"\u00ab\3\2\2\2\5\u00ae\3\2\2\2\7\u00b1\3\2\2\2\t\u00b7\3\2\2\2\13\u00c0"+
		"\3\2\2\2\r\u00c5\3\2\2\2\17\u00c8\3\2\2\2\21\u00cc\3\2\2\2\23\u00d0\3"+
		"\2\2\2\25\u00d8\3\2\2\2\27\u00df\3\2\2\2\31\u00e4\3\2\2\2\33\u00ea\3\2"+
		"\2\2\35\u00f1\3\2\2\2\37\u00f6\3\2\2\2!\u00fc\3\2\2\2#\u0105\3\2\2\2%"+
		"\u010a\3\2\2\2\'\u010f\3\2\2\2)\u0115\3\2\2\2+\u0117\3\2\2\2-\u0119\3"+
		"\2\2\2/\u011b\3\2\2\2\61\u011d\3\2\2\2\63\u011f\3\2\2\2\65\u0121\3\2\2"+
		"\2\67\u0123\3\2\2\29\u0126\3\2\2\2;\u0128\3\2\2\2=\u012b\3\2\2\2?\u012e"+
		"\3\2\2\2A\u0131\3\2\2\2C\u0133\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I"+
		"\u013b\3\2\2\2K\u013d\3\2\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2"+
		"\2\2S\u0145\3\2\2\2U\u0148\3\2\2\2W\u014b\3\2\2\2Y\u014d\3\2\2\2[\u014f"+
		"\3\2\2\2]\u0151\3\2\2\2_\u0153\3\2\2\2a\u0155\3\2\2\2c\u0157\3\2\2\2e"+
		"\u0159\3\2\2\2g\u015b\3\2\2\2i\u0165\3\2\2\2k\u0167\3\2\2\2m\u0169\3\2"+
		"\2\2o\u0175\3\2\2\2q\u0177\3\2\2\2s\u017e\3\2\2\2u\u0185\3\2\2\2w\u0187"+
		"\3\2\2\2y\u0190\3\2\2\2{\u0192\3\2\2\2}\u0199\3\2\2\2\177\u01a0\3\2\2"+
		"\2\u0081\u01a6\3\2\2\2\u0083\u01a9\3\2\2\2\u0085\u01ab\3\2\2\2\u0087\u01ad"+
		"\3\2\2\2\u0089\u01af\3\2\2\2\u008b\u01b2\3\2\2\2\u008d\u01b7\3\2\2\2\u008f"+
		"\u01d1\3\2\2\2\u0091\u01d4\3\2\2\2\u0093\u01da\3\2\2\2\u0095\u01e0\3\2"+
		"\2\2\u0097\u01e2\3\2\2\2\u0099\u01f0\3\2\2\2\u009b\u01f2\3\2\2\2\u009d"+
		"\u01fa\3\2\2\2\u009f\u0201\3\2\2\2\u00a1\u020c\3\2\2\2\u00a3\u020f\3\2"+
		"\2\2\u00a5\u021a\3\2\2\2\u00a7\u021e\3\2\2\2\u00a9\u022c\3\2\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\u00ad\7?\2\2\u00ad\4\3\2\2\2\u00ae\u00af\7#\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7m\2\2\u00b6\b\3\2\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7w\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\n\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c4\7g\2\2\u00c4\f\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7h\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\24\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7i\2\2"+
		"\u00de\26\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7"+
		"p\2\2\u00e2\u00e3\7g\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7{\2\2\u00e9"+
		"\32\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7w\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7p\2\2\u00f0\34\3\2\2\2\u00f1"+
		"\u00f2\7x\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7f\2\2"+
		"\u00f5\36\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7"+
		"k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb \3\2\2\2\u00fc\u00fd"+
		"\7h\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7e\2\2\u0100"+
		"\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2"+
		"\u0104\"\3\2\2\2\u0105\u0106\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7k"+
		"\2\2\u0108\u0109\7p\2\2\u0109$\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7w\2\2\u010d\u010e\7g\2\2\u010e&\3\2\2\2\u010f\u0110"+
		"\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0114\7g\2\2\u0114(\3\2\2\2\u0115\u0116\7*\2\2\u0116*\3\2\2\2\u0117\u0118"+
		"\7+\2\2\u0118,\3\2\2\2\u0119\u011a\7]\2\2\u011a.\3\2\2\2\u011b\u011c\7"+
		"_\2\2\u011c\60\3\2\2\2\u011d\u011e\7}\2\2\u011e\62\3\2\2\2\u011f\u0120"+
		"\7\177\2\2\u0120\64\3\2\2\2\u0121\u0122\7>\2\2\u0122\66\3\2\2\2\u0123"+
		"\u0124\7>\2\2\u0124\u0125\7?\2\2\u01258\3\2\2\2\u0126\u0127\7@\2\2\u0127"+
		":\3\2\2\2\u0128\u0129\7@\2\2\u0129\u012a\7?\2\2\u012a<\3\2\2\2\u012b\u012c"+
		"\7>\2\2\u012c\u012d\7>\2\2\u012d>\3\2\2\2\u012e\u012f\7@\2\2\u012f\u0130"+
		"\7@\2\2\u0130@\3\2\2\2\u0131\u0132\7-\2\2\u0132B\3\2\2\2\u0133\u0134\7"+
		"-\2\2\u0134\u0135\7-\2\2\u0135D\3\2\2\2\u0136\u0137\7/\2\2\u0137F\3\2"+
		"\2\2\u0138\u0139\7/\2\2\u0139\u013a\7/\2\2\u013aH\3\2\2\2\u013b\u013c"+
		"\7,\2\2\u013cJ\3\2\2\2\u013d\u013e\7\61\2\2\u013eL\3\2\2\2\u013f\u0140"+
		"\7\'\2\2\u0140N\3\2\2\2\u0141\u0142\7(\2\2\u0142P\3\2\2\2\u0143\u0144"+
		"\7~\2\2\u0144R\3\2\2\2\u0145\u0146\7(\2\2\u0146\u0147\7(\2\2\u0147T\3"+
		"\2\2\2\u0148\u0149\7~\2\2\u0149\u014a\7~\2\2\u014aV\3\2\2\2\u014b\u014c"+
		"\7`\2\2\u014cX\3\2\2\2\u014d\u014e\7#\2\2\u014eZ\3\2\2\2\u014f\u0150\7"+
		"\u0080\2\2\u0150\\\3\2\2\2\u0151\u0152\7A\2\2\u0152^\3\2\2\2\u0153\u0154"+
		"\7<\2\2\u0154`\3\2\2\2\u0155\u0156\7=\2\2\u0156b\3\2\2\2\u0157\u0158\7"+
		".\2\2\u0158d\3\2\2\2\u0159\u015a\7?\2\2\u015af\3\2\2\2\u015b\u0160\5i"+
		"\65\2\u015c\u015f\5i\65\2\u015d\u015f\5m\67\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161h\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0166\5k\66\2\u0164\u0166"+
		"\5o8\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166j\3\2\2\2\u0167\u0168"+
		"\t\2\2\2\u0168l\3\2\2\2\u0169\u016a\t\3\2\2\u016an\3\2\2\2\u016b\u016c"+
		"\7^\2\2\u016c\u016d\7w\2\2\u016d\u016e\3\2\2\2\u016e\u0176\5q9\2\u016f"+
		"\u0170\7^\2\2\u0170\u0171\7W\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5q9\2"+
		"\u0173\u0174\5q9\2\u0174\u0176\3\2\2\2\u0175\u016b\3\2\2\2\u0175\u016f"+
		"\3\2\2\2\u0176p\3\2\2\2\u0177\u0178\5\u0087D\2\u0178\u0179\5\u0087D\2"+
		"\u0179\u017a\5\u0087D\2\u017a\u017b\5\u0087D\2\u017br\3\2\2\2\u017c\u017f"+
		"\5u;\2\u017d\u017f\5\u008fH\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2"+
		"\u017ft\3\2\2\2\u0180\u0186\5{>\2\u0181\u0186\5}?\2\u0182\u0186\5\177"+
		"@\2\u0183\u0186\5w<\2\u0184\u0186\5y=\2\u0185\u0180\3\2\2\2\u0185\u0181"+
		"\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"v\3\2\2\2\u0187\u0188\7\62\2\2\u0188\u018a\t\4\2\2\u0189\u018b\t\5\2\2"+
		"\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018dx\3\2\2\2\u018e\u0191\5%\23\2\u018f\u0191\5\'\24\2\u0190"+
		"\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191z\3\2\2\2\u0192\u0196\5\u0083"+
		"B\2\u0193\u0195\5m\67\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197|\3\2\2\2\u0198\u0196\3\2\2\2"+
		"\u0199\u019d\7\62\2\2\u019a\u019c\5\u0085C\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e~\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u01a0\u01a2\5\u0081A\2\u01a1\u01a3\5\u0087D\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u0080\3\2\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8\t\6\2\2\u01a8"+
		"\u0082\3\2\2\2\u01a9\u01aa\t\7\2\2\u01aa\u0084\3\2\2\2\u01ab\u01ac\t\b"+
		"\2\2\u01ac\u0086\3\2\2\2\u01ad\u01ae\t\t\2\2\u01ae\u0088\3\2\2\2\u01af"+
		"\u01b0\t\n\2\2\u01b0\u008a\3\2\2\2\u01b1\u01b3\5m\67\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u008c\3\2\2\2\u01b6\u01b8\5\u0087D\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u008e\3\2\2\2\u01bb"+
		"\u01bc\7)\2\2\u01bc\u01bd\5\u0091I\2\u01bd\u01be\7)\2\2\u01be\u01d2\3"+
		"\2\2\2\u01bf\u01c0\7N\2\2\u01c0\u01c1\7)\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\5\u0091I\2\u01c3\u01c4\7)\2\2\u01c4\u01d2\3\2\2\2\u01c5\u01c6\7"+
		"w\2\2\u01c6\u01c7\7)\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\5\u0091I\2\u01c9"+
		"\u01ca\7)\2\2\u01ca\u01d2\3\2\2\2\u01cb\u01cc\7W\2\2\u01cc\u01cd\7)\2"+
		"\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\5\u0091I\2\u01cf\u01d0\7)\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01bb\3\2\2\2\u01d1\u01bf\3\2\2\2\u01d1\u01c5\3\2"+
		"\2\2\u01d1\u01cb\3\2\2\2\u01d2\u0090\3\2\2\2\u01d3\u01d5\5\u0093J\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u0092\3\2\2\2\u01d8\u01db\n\13\2\2\u01d9\u01db\5\u0095K\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u0094\3\2\2\2\u01dc\u01e1\5\u0097"+
		"L\2\u01dd\u01e1\5\u0099M\2\u01de\u01e1\5\u009bN\2\u01df\u01e1\5o8\2\u01e0"+
		"\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e1\u0096\3\2\2\2\u01e2\u01e3\7^\2\2\u01e3\u01e4\t\f\2\2\u01e4"+
		"\u0098\3\2\2\2\u01e5\u01e6\7^\2\2\u01e6\u01f1\5\u0085C\2\u01e7\u01e8\7"+
		"^\2\2\u01e8\u01e9\5\u0085C\2\u01e9\u01ea\5\u0085C\2\u01ea\u01f1\3\2\2"+
		"\2\u01eb\u01ec\7^\2\2\u01ec\u01ed\5\u0085C\2\u01ed\u01ee\5\u0085C\2\u01ee"+
		"\u01ef\5\u0085C\2\u01ef\u01f1\3\2\2\2\u01f0\u01e5\3\2\2\2\u01f0\u01e7"+
		"\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u009a\3\2\2\2\u01f2\u01f3\7^\2\2\u01f3"+
		"\u01f4\7z\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\5\u0087D\2\u01f6\u01f5\3"+
		"\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u009c\3\2\2\2\u01fa\u01fc\7$\2\2\u01fb\u01fd\5\u009fP\2\u01fc\u01fb\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\7$\2\2\u01ff"+
		"\u009e\3\2\2\2\u0200\u0202\5\u00a1Q\2\u0201\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u00a0\3\2\2\2\u0205"+
		"\u020d\n\r\2\2\u0206\u020d\5\u0095K\2\u0207\u0208\7^\2\2\u0208\u020d\7"+
		"\f\2\2\u0209\u020a\7^\2\2\u020a\u020b\7\17\2\2\u020b\u020d\7\f\2\2\u020c"+
		"\u0205\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020d\u00a2\3\2\2\2\u020e\u0210\t\16\2\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\bR\2\2\u0214\u00a4\3\2\2\2\u0215\u0217\7\17\2\2\u0216"+
		"\u0218\7\f\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021b\3\2"+
		"\2\2\u0219\u021b\7\f\2\2\u021a\u0215\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\bS\2\2\u021d\u00a6\3\2\2\2\u021e\u021f\7\61"+
		"\2\2\u021f\u0220\7,\2\2\u0220\u0224\3\2\2\2\u0221\u0223\13\2\2\2\u0222"+
		"\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0225\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7,\2\2\u0228"+
		"\u0229\7\61\2\2\u0229\u022a\3\2\2\2\u022a\u022b\bT\2\2\u022b\u00a8\3\2"+
		"\2\2\u022c\u022d\7\61\2\2\u022d\u022e\7\61\2\2\u022e\u0232\3\2\2\2\u022f"+
		"\u0231\n\17\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3"+
		"\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0236\bU\2\2\u0236\u00aa\3\2\2\2\36\2\u015e\u0160\u0165\u0175\u017e\u0185"+
		"\u018c\u0190\u0196\u019d\u01a4\u01b4\u01b9\u01d1\u01d6\u01da\u01e0\u01f0"+
		"\u01f8\u01fc\u0203\u020c\u0211\u0217\u021a\u0224\u0232\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}