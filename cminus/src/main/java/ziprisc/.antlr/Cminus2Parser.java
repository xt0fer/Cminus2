// Generated from /home/kristofer/p/c-minus/cminus/src/main/java/ziprisc/Cminus2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cminus2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Length=1, Else=2, If=3, Int=4, String=5, Rune=6, Array=7, Return=8, While=9, 
		Func=10, Main=11, Read=12, Write=13, Assign=14, EqualEqual=15, NotEqual=16, 
		Paren=17, Thesis=18, LeftBracket=19, RightBracket=20, LeftBrace=21, RightBrace=22, 
		Less=23, LessEqual=24, Greater=25, GreaterEqual=26, LeftShift=27, RightShift=28, 
		Plus=29, PlusPlus=30, Minus=31, MinusMinus=32, Star=33, Div=34, Mod=35, 
		And=36, Or=37, AndAnd=38, OrOr=39, Caret=40, Not=41, Tilde=42, Question=43, 
		Colon=44, Semi=45, Comma=46, Quote=47, Identifier=48, DigitSequence=49, 
		QRune=50, Qstr=51, Whitespace=52, Newline=53, LineComment=54;
	public static final int
		RULE_program = 0, RULE_functionList = 1, RULE_mainFunction = 2, RULE_functionDefinition = 3, 
		RULE_statementList = 4, RULE_declarationList = 5, RULE_variable = 6, RULE_compoundStatement = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_typeSpecifier = 10, 
		RULE_declaration = 11, RULE_statement = 12, RULE_lexp = 13, RULE_exp = 14, 
		RULE_binop = 15, RULE_unop = 16, RULE_pars = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionList", "mainFunction", "functionDefinition", "statementList", 
			"declarationList", "variable", "compoundStatement", "ifStatement", "whileStatement", 
			"typeSpecifier", "declaration", "statement", "lexp", "exp", "binop", 
			"unop", "pars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'len'", "'else'", "'if'", "'int'", "'string'", "'rune'", "'array'", 
			"'return'", "'while'", "'function'", "'main'", "'read'", "'write'", "'='", 
			"'=='", "'!='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
			"'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
			"';'", "','", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Length", "Else", "If", "Int", "String", "Rune", "Array", "Return", 
			"While", "Func", "Main", "Read", "Write", "Assign", "EqualEqual", "NotEqual", 
			"Paren", "Thesis", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
			"Semi", "Comma", "Quote", "Identifier", "DigitSequence", "QRune", "Qstr", 
			"Whitespace", "Newline", "LineComment"
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

	@Override
	public String getGrammarFileName() { return "Cminus2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Cminus2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			mainFunction();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Rune) {
				{
				setState(37);
				functionList(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
	}

	public final FunctionListContext functionList() throws RecognitionException {
		return functionList(0);
	}

	private FunctionListContext functionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionListContext _localctx = new FunctionListContext(_ctx, _parentState);
		FunctionListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_functionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			functionDefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_functionList);
					setState(43);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(44);
					functionDefinition();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(Cminus2Parser.Int, 0); }
		public TerminalNode Main() { return getToken(Cminus2Parser.Main, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Int);
			setState(51);
			match(Main);
			setState(52);
			match(Paren);
			setState(53);
			match(Thesis);
			setState(54);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Main() { return getToken(Cminus2Parser.Main, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			typeSpecifier(0);
			setState(57);
			match(Main);
			setState(58);
			match(Paren);
			setState(59);
			pars();
			setState(60);
			match(Thesis);
			setState(61);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					statement();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(76);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(77);
					declaration();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(Cminus2Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(Cminus2Parser.RightBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LeftBrace);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Rune) {
				{
				setState(86);
				declarationList(0);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Return) | (1L << While) | (1L << Read) | (1L << Write) | (1L << LeftBrace) | (1L << Identifier))) != 0)) {
				{
				setState(89);
				statementList(0);
				}
			}

			setState(92);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(Cminus2Parser.If, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(Cminus2Parser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(If);
			setState(95);
			match(Paren);
			setState(96);
			exp(0);
			setState(97);
			match(Thesis);
			setState(98);
			compoundStatement();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(99);
				match(Else);
				setState(100);
				compoundStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(Cminus2Parser.While, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(While);
			setState(104);
			match(Paren);
			setState(105);
			exp(0);
			setState(106);
			match(Thesis);
			setState(107);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(Cminus2Parser.Int, 0); }
		public TerminalNode Rune() { return getToken(Cminus2Parser.Rune, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(Cminus2Parser.LeftBracket, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(Cminus2Parser.RightBracket, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_typeSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				{
				setState(110);
				match(Int);
				}
				break;
			case Rune:
				{
				setState(111);
				match(Rune);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(115);
					match(LeftBracket);
					setState(116);
					exp(0);
					setState(117);
					match(RightBracket);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(Cminus2Parser.Semi, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			typeSpecifier(0);
			setState(125);
			match(Identifier);
			setState(126);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(Cminus2Parser.If, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(Cminus2Parser.Else, 0); }
		public TerminalNode While() { return getToken(Cminus2Parser.While, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public TerminalNode Assign() { return getToken(Cminus2Parser.Assign, 0); }
		public TerminalNode Return() { return getToken(Cminus2Parser.Return, 0); }
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode Write() { return getToken(Cminus2Parser.Write, 0); }
		public TerminalNode Read() { return getToken(Cminus2Parser.Read, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(If);
				setState(129);
				match(Paren);
				setState(130);
				exp(0);
				setState(131);
				match(Thesis);
				setState(132);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(If);
				setState(135);
				match(Paren);
				setState(136);
				exp(0);
				setState(137);
				match(Thesis);
				setState(138);
				compoundStatement();
				setState(139);
				match(Else);
				setState(140);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(While);
				setState(143);
				match(Paren);
				setState(144);
				exp(0);
				setState(145);
				match(Thesis);
				setState(146);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				lexp(0);
				setState(149);
				match(Assign);
				setState(150);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(Return);
				setState(153);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(Identifier);
				setState(155);
				match(Paren);
				setState(156);
				pars();
				setState(157);
				match(Thesis);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				compoundStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				match(Write);
				setState(161);
				exp(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				match(Read);
				setState(163);
				lexp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexpContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(Cminus2Parser.LeftBracket, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(Cminus2Parser.RightBracket, 0); }
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
	}

	public final LexpContext lexp() throws RecognitionException {
		return lexp(0);
	}

	private LexpContext lexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexpContext _localctx = new LexpContext(_ctx, _parentState);
		LexpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lexp);
					setState(169);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(170);
					match(LeftBracket);
					setState(171);
					exp(0);
					setState(172);
					match(RightBracket);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public TerminalNode DigitSequence() { return getToken(Cminus2Parser.DigitSequence, 0); }
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode QRune() { return getToken(Cminus2Parser.QRune, 0); }
		public TerminalNode Length() { return getToken(Cminus2Parser.Length, 0); }
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(180);
				lexp(0);
				}
				break;
			case 2:
				{
				setState(181);
				unop();
				setState(182);
				exp(6);
				}
				break;
			case 3:
				{
				setState(184);
				match(Paren);
				setState(185);
				exp(0);
				setState(186);
				match(Thesis);
				}
				break;
			case 4:
				{
				setState(188);
				match(DigitSequence);
				}
				break;
			case 5:
				{
				setState(189);
				match(Identifier);
				setState(190);
				match(Paren);
				setState(191);
				pars();
				setState(192);
				match(Thesis);
				}
				break;
			case 6:
				{
				setState(194);
				match(QRune);
				}
				break;
			case 7:
				{
				setState(195);
				match(Length);
				setState(196);
				lexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(199);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(200);
					binop();
					setState(201);
					exp(8);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(Cminus2Parser.Minus, 0); }
		public TerminalNode Plus() { return getToken(Cminus2Parser.Plus, 0); }
		public TerminalNode Star() { return getToken(Cminus2Parser.Star, 0); }
		public TerminalNode Div() { return getToken(Cminus2Parser.Div, 0); }
		public TerminalNode EqualEqual() { return getToken(Cminus2Parser.EqualEqual, 0); }
		public TerminalNode NotEqual() { return getToken(Cminus2Parser.NotEqual, 0); }
		public TerminalNode Greater() { return getToken(Cminus2Parser.Greater, 0); }
		public TerminalNode Less() { return getToken(Cminus2Parser.Less, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EqualEqual) | (1L << NotEqual) | (1L << Less) | (1L << Greater) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnopContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(Cminus2Parser.Minus, 0); }
		public TerminalNode Not() { return getToken(Cminus2Parser.Not, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Not) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParsContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Cminus2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Cminus2Parser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(Cminus2Parser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(Cminus2Parser.Comma, i);
		}
		public ParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pars; }
	}

	public final ParsContext pars() throws RecognitionException {
		ParsContext _localctx = new ParsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pars);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Rune:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				typeSpecifier(0);
				setState(213);
				match(Identifier);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(214);
					match(Comma);
					setState(215);
					typeSpecifier(0);
					setState(216);
					match(Identifier);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Thesis:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return functionList_sempred((FunctionListContext)_localctx, predIndex);
		case 4:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 5:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		case 10:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 13:
			return lexp_sempred((LexpContext)_localctx, predIndex);
		case 14:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionList_sempred(FunctionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lexp_sempred(LexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7"+
		"T\13\7\3\b\3\b\3\t\3\t\5\tZ\n\t\3\t\5\t]\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fs\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c8\n\20\3\20\3\20\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1"+
		"\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00dd\n"+
		"\23\f\23\16\23\u00e0\13\23\3\23\5\23\u00e3\n\23\3\23\2\b\4\n\f\26\34\36"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\b\2\21\22\31\31\33"+
		"\33\37\37!!#$\4\2!!++\2\u00ed\2&\3\2\2\2\4*\3\2\2\2\6\64\3\2\2\2\b:\3"+
		"\2\2\2\nA\3\2\2\2\fK\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22`\3\2\2\2\24i\3"+
		"\2\2\2\26r\3\2\2\2\30~\3\2\2\2\32\u00a6\3\2\2\2\34\u00a8\3\2\2\2\36\u00c7"+
		"\3\2\2\2 \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00e2\3\2\2\2&(\5\6\4\2\')\5"+
		"\4\3\2(\'\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\b\3\1\2+,\5\b\5\2,\61\3\2\2\2"+
		"-.\f\3\2\2.\60\5\b\5\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\7\6\2\2\65\66\7\r\2\2\66\67\7\23\2"+
		"\2\678\7\24\2\289\5\20\t\29\7\3\2\2\2:;\5\26\f\2;<\7\r\2\2<=\7\23\2\2"+
		"=>\5$\23\2>?\7\24\2\2?@\5\20\t\2@\t\3\2\2\2AB\b\6\1\2BC\5\32\16\2CH\3"+
		"\2\2\2DE\f\3\2\2EG\5\32\16\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I"+
		"\13\3\2\2\2JH\3\2\2\2KL\b\7\1\2LM\5\30\r\2MR\3\2\2\2NO\f\3\2\2OQ\5\30"+
		"\r\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UV\7"+
		"\62\2\2V\17\3\2\2\2WY\7\27\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2"+
		"\2[]\5\n\6\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\30\2\2_\21\3\2\2\2`a"+
		"\7\5\2\2ab\7\23\2\2bc\5\36\20\2cd\7\24\2\2dg\5\20\t\2ef\7\4\2\2fh\5\20"+
		"\t\2ge\3\2\2\2gh\3\2\2\2h\23\3\2\2\2ij\7\13\2\2jk\7\23\2\2kl\5\36\20\2"+
		"lm\7\24\2\2mn\5\20\t\2n\25\3\2\2\2op\b\f\1\2ps\7\6\2\2qs\7\b\2\2ro\3\2"+
		"\2\2rq\3\2\2\2s{\3\2\2\2tu\f\3\2\2uv\7\25\2\2vw\5\36\20\2wx\7\26\2\2x"+
		"z\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}{\3\2\2"+
		"\2~\177\5\26\f\2\177\u0080\7\62\2\2\u0080\u0081\7/\2\2\u0081\31\3\2\2"+
		"\2\u0082\u0083\7\5\2\2\u0083\u0084\7\23\2\2\u0084\u0085\5\36\20\2\u0085"+
		"\u0086\7\24\2\2\u0086\u0087\5\20\t\2\u0087\u00a7\3\2\2\2\u0088\u0089\7"+
		"\5\2\2\u0089\u008a\7\23\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7\24\2\2"+
		"\u008c\u008d\5\20\t\2\u008d\u008e\7\4\2\2\u008e\u008f\5\20\t\2\u008f\u00a7"+
		"\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\23\2\2\u0092\u0093\5\36\20"+
		"\2\u0093\u0094\7\24\2\2\u0094\u0095\5\20\t\2\u0095\u00a7\3\2\2\2\u0096"+
		"\u0097\5\34\17\2\u0097\u0098\7\20\2\2\u0098\u0099\5\36\20\2\u0099\u00a7"+
		"\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u00a7\5\36\20\2\u009c\u009d\7\62\2"+
		"\2\u009d\u009e\7\23\2\2\u009e\u009f\5$\23\2\u009f\u00a0\7\24\2\2\u00a0"+
		"\u00a7\3\2\2\2\u00a1\u00a7\5\20\t\2\u00a2\u00a3\7\17\2\2\u00a3\u00a7\5"+
		"\36\20\2\u00a4\u00a5\7\16\2\2\u00a5\u00a7\5\34\17\2\u00a6\u0082\3\2\2"+
		"\2\u00a6\u0088\3\2\2\2\u00a6\u0090\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u009a"+
		"\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\b\17\1\2\u00a9\u00aa\7\62"+
		"\2\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\u00ae\5\36\20\2\u00ae\u00af\7\26\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ab"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\35\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\b\20\1\2\u00b6\u00c8\5\34"+
		"\17\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\5\36\20\b\u00b9\u00c8\3\2\2\2\u00ba"+
		"\u00bb\7\23\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7\24\2\2\u00bd\u00c8"+
		"\3\2\2\2\u00be\u00c8\7\63\2\2\u00bf\u00c0\7\62\2\2\u00c0\u00c1\7\23\2"+
		"\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7\24\2\2\u00c3\u00c8\3\2\2\2\u00c4"+
		"\u00c8\7\64\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c8\5\34\17\2\u00c7\u00b5"+
		"\3\2\2\2\u00c7\u00b7\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cf\3\2"+
		"\2\2\u00c9\u00ca\f\t\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\5\36\20\n\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\t\2\2\2\u00d3!\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5#\3\2\2\2\u00d6\u00d7"+
		"\5\26\f\2\u00d7\u00de\7\62\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00da\5\26\f"+
		"\2\u00da\u00db\7\62\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3%\3\2\2\2\21(\61HRY\\gr{\u00a6\u00b2\u00c7\u00cf\u00de"+
		"\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}