// Generated from Cminus2.g4 by ANTLR 4.7.2
package ziprisc.parser;
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		Colon=44, Semi=45, Comma=46, Quote=47, Identifier=48, Number=49, QRune=50, 
		Qstr=51, Whitespace=52, Newline=53, LineComment=54;
	public static final int
		RULE_program = 0, RULE_functionList = 1, RULE_mainFunction = 2, RULE_functionDefinition = 3, 
		RULE_statementList = 4, RULE_declarationList = 5, RULE_variable = 6, RULE_compoundStatement = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_assignStatement = 10, 
		RULE_returnStatement = 11, RULE_functionCall = 12, RULE_typeSpecifier = 13, 
		RULE_declaration = 14, RULE_statement = 15, RULE_lexp = 16, RULE_exp = 17, 
		RULE_binop = 18, RULE_unop = 19, RULE_pars = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionList", "mainFunction", "functionDefinition", "statementList", 
			"declarationList", "variable", "compoundStatement", "ifStatement", "whileStatement", 
			"assignStatement", "returnStatement", "functionCall", "typeSpecifier", 
			"declaration", "statement", "lexp", "exp", "binop", "unop", "pars"
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
			"Semi", "Comma", "Quote", "Identifier", "Number", "QRune", "Qstr", "Whitespace", 
			"Newline", "LineComment"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			mainFunction();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Rune) {
				{
				setState(43);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitFunctionList(this);
		}
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
			setState(47);
			functionDefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
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
					setState(49);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(50);
					functionDefinition();
					}
					} 
				}
				setState(55);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitMainFunction(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Int);
			setState(57);
			match(Main);
			setState(58);
			match(Paren);
			setState(59);
			match(Thesis);
			setState(60);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			typeSpecifier(0);
			setState(63);
			match(Main);
			setState(64);
			match(Paren);
			setState(65);
			pars();
			setState(66);
			match(Thesis);
			setState(67);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitStatementList(this);
		}
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
			setState(70);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
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
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					statement();
					}
					} 
				}
				setState(78);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitDeclarationList(this);
		}
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
			setState(80);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
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
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					declaration();
					}
					} 
				}
				setState(88);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LeftBrace);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Rune) {
				{
				setState(92);
				declarationList(0);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Return) | (1L << While) | (1L << Read) | (1L << Write) | (1L << LeftBrace) | (1L << Identifier))) != 0)) {
				{
				setState(95);
				statementList(0);
				}
			}

			setState(98);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(If);
			setState(101);
			match(Paren);
			setState(102);
			exp(0);
			setState(103);
			match(Thesis);
			setState(104);
			compoundStatement();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(105);
				match(Else);
				setState(106);
				compoundStatement();
				}
				break;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(While);
			setState(110);
			match(Paren);
			setState(111);
			exp(0);
			setState(112);
			match(Thesis);
			setState(113);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public TerminalNode Assign() { return getToken(Cminus2Parser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semi() { return getToken(Cminus2Parser.Semi, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			lexp(0);
			setState(116);
			match(Assign);
			setState(117);
			exp(0);
			setState(118);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(Cminus2Parser.Return, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semi() { return getToken(Cminus2Parser.Semi, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Return);
			setState(121);
			exp(0);
			setState(122);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Cminus2Parser.Identifier, 0); }
		public TerminalNode Paren() { return getToken(Cminus2Parser.Paren, 0); }
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public TerminalNode Thesis() { return getToken(Cminus2Parser.Thesis, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Identifier);
			setState(125);
			match(Paren);
			setState(126);
			pars();
			setState(127);
			match(Thesis);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_typeSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				{
				setState(130);
				match(Int);
				}
				break;
			case Rune:
				{
				setState(131);
				match(Rune);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
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
					setState(134);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(135);
					match(LeftBracket);
					setState(136);
					exp(0);
					setState(137);
					match(RightBracket);
					}
					} 
				}
				setState(143);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			typeSpecifier(0);
			setState(145);
			match(Identifier);
			setState(146);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Write() { return getToken(Cminus2Parser.Write, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Read() { return getToken(Cminus2Parser.Read, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				assignStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				compoundStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				match(Write);
				setState(155);
				exp(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(Read);
				setState(157);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitLexp(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		return lexp(0);
	}

	private LexpContext lexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexpContext _localctx = new LexpContext(_ctx, _parentState);
		LexpContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
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
					setState(163);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(164);
					match(LeftBracket);
					setState(165);
					exp(0);
					setState(166);
					match(RightBracket);
					}
					} 
				}
				setState(172);
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
		public TerminalNode Number() { return getToken(Cminus2Parser.Number, 0); }
		public TerminalNode QRune() { return getToken(Cminus2Parser.QRune, 0); }
		public TerminalNode Length() { return getToken(Cminus2Parser.Length, 0); }
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(174);
				lexp(0);
				}
				break;
			case Minus:
			case Not:
				{
				setState(175);
				unop();
				setState(176);
				exp(5);
				}
				break;
			case Paren:
				{
				setState(178);
				match(Paren);
				setState(179);
				exp(0);
				setState(180);
				match(Thesis);
				}
				break;
			case Number:
				{
				setState(182);
				match(Number);
				}
				break;
			case QRune:
				{
				setState(183);
				match(QRune);
				}
				break;
			case Length:
				{
				setState(184);
				match(Length);
				setState(185);
				lexp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
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
					setState(188);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(189);
					binop();
					setState(190);
					exp(7);
					}
					} 
				}
				setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).enterPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cminus2Listener ) ((Cminus2Listener)listener).exitPars(this);
		}
	}

	public final ParsContext pars() throws RecognitionException {
		ParsContext _localctx = new ParsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pars);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Rune:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				typeSpecifier(0);
				setState(202);
				match(Identifier);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(203);
					match(Comma);
					setState(204);
					typeSpecifier(0);
					setState(205);
					match(Identifier);
					}
					}
					setState(211);
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
		case 13:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 16:
			return lexp_sempred((LexpContext)_localctx, predIndex);
		case 17:
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
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\t\3\t\5\t`\n\t\3\t\5\tc\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u0087\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u008e\n"+
		"\17\f\17\16\17\u0091\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00ab\n\22\f\22\16\22\u00ae\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00c3\n\23\f\23\16\23\u00c6\13\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5\13\26"+
		"\3\26\5\26\u00d8\n\26\3\26\2\b\4\n\f\34\"$\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\4\b\2\21\22\31\31\33\33\37\37!!#$\4\2!!++\2\u00dd"+
		"\2,\3\2\2\2\4\60\3\2\2\2\6:\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fQ\3\2\2\2\16"+
		"[\3\2\2\2\20]\3\2\2\2\22f\3\2\2\2\24o\3\2\2\2\26u\3\2\2\2\30z\3\2\2\2"+
		"\32~\3\2\2\2\34\u0086\3\2\2\2\36\u0092\3\2\2\2 \u00a0\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00bc\3\2\2\2&\u00c7\3\2\2\2(\u00c9\3\2\2\2*\u00d7\3\2\2\2,"+
		".\5\6\4\2-/\5\4\3\2.-\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60\61\b\3\1\2\61\62"+
		"\5\b\5\2\62\67\3\2\2\2\63\64\f\3\2\2\64\66\5\b\5\2\65\63\3\2\2\2\669\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\7\6\2\2;<\7"+
		"\r\2\2<=\7\23\2\2=>\7\24\2\2>?\5\20\t\2?\7\3\2\2\2@A\5\34\17\2AB\7\r\2"+
		"\2BC\7\23\2\2CD\5*\26\2DE\7\24\2\2EF\5\20\t\2F\t\3\2\2\2GH\b\6\1\2HI\5"+
		" \21\2IN\3\2\2\2JK\f\3\2\2KM\5 \21\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\b\7\1\2RS\5\36\20\2SX\3\2\2\2TU\f\3\2\2"+
		"UW\5\36\20\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2"+
		"\2\2[\\\7\62\2\2\\\17\3\2\2\2]_\7\27\2\2^`\5\f\7\2_^\3\2\2\2_`\3\2\2\2"+
		"`b\3\2\2\2ac\5\n\6\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\30\2\2e\21\3\2"+
		"\2\2fg\7\5\2\2gh\7\23\2\2hi\5$\23\2ij\7\24\2\2jm\5\20\t\2kl\7\4\2\2ln"+
		"\5\20\t\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2op\7\13\2\2pq\7\23\2\2qr\5$\23"+
		"\2rs\7\24\2\2st\5\20\t\2t\25\3\2\2\2uv\5\"\22\2vw\7\20\2\2wx\5$\23\2x"+
		"y\7/\2\2y\27\3\2\2\2z{\7\n\2\2{|\5$\23\2|}\7/\2\2}\31\3\2\2\2~\177\7\62"+
		"\2\2\177\u0080\7\23\2\2\u0080\u0081\5*\26\2\u0081\u0082\7\24\2\2\u0082"+
		"\33\3\2\2\2\u0083\u0084\b\17\1\2\u0084\u0087\7\6\2\2\u0085\u0087\7\b\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008f\3\2\2\2\u0088\u0089"+
		"\f\3\2\2\u0089\u008a\7\25\2\2\u008a\u008b\5$\23\2\u008b\u008c\7\26\2\2"+
		"\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\35\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\5\34\17\2\u0093\u0094\7\62\2\2\u0094\u0095\7/\2\2\u0095\37\3\2"+
		"\2\2\u0096\u00a1\5\22\n\2\u0097\u00a1\5\24\13\2\u0098\u00a1\5\26\f\2\u0099"+
		"\u00a1\5\30\r\2\u009a\u00a1\5\32\16\2\u009b\u00a1\5\20\t\2\u009c\u009d"+
		"\7\17\2\2\u009d\u00a1\5$\23\2\u009e\u009f\7\16\2\2\u009f\u00a1\5\"\22"+
		"\2\u00a0\u0096\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u0099"+
		"\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\b\22\1\2\u00a3\u00a4\7\62\2"+
		"\2\u00a4\u00ac\3\2\2\2\u00a5\u00a6\f\3\2\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\u00a8\5$\23\2\u00a8\u00a9\7\26\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\23\1\2\u00b0\u00bd\5\"\22"+
		"\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\5$\23\7\u00b3\u00bd\3\2\2\2\u00b4\u00b5"+
		"\7\23\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\7\24\2\2\u00b7\u00bd\3\2\2\2"+
		"\u00b8\u00bd\7\63\2\2\u00b9\u00bd\7\64\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bd"+
		"\5\"\22\2\u00bc\u00af\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b4\3\2\2\2"+
		"\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c4"+
		"\3\2\2\2\u00be\u00bf\f\b\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\5$\23\t\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\t\2\2\2\u00c8\'\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca)\3\2\2\2\u00cb\u00cc"+
		"\5\34\17\2\u00cc\u00d3\7\62\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\5\34"+
		"\17\2\u00cf\u00d0\7\62\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8+\3\2\2\2\21.\67NX_bm\u0086\u008f\u00a0\u00ac\u00bc"+
		"\u00c4\u00d3\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}