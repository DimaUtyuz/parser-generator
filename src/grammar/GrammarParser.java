// Generated from /home/dima-utyuz/itmo/mt/lab4/src/Grammar.g4 by ANTLR 4.10.1

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, REGEX=9, 
		CODE=10, NOT_WS=11;
	public static final int
		RULE_start = 0, RULE_grammar_name = 1, RULE_type_name = 2, RULE_header = 3, 
		RULE_rule_list = 4, RULE_rule_obj = 5, RULE_branch_list = 6, RULE_branch = 7, 
		RULE_calc_result = 8, RULE_element_list = 9, RULE_token_list = 10, RULE_token = 11, 
		RULE_token_tail = 12, RULE_code_part = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "grammar_name", "type_name", "header", "rule_list", "rule_obj", 
			"branch_list", "branch", "calc_result", "element_list", "token_list", 
			"token", "token_tail", "code_part"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'type'", "'@header'", "'|'", "':'", "'-> skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "REGEX", "CODE", 
			"NOT_WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Grammar_nameContext grammarName;
		public Type_nameContext grammarType;
		public HeaderContext headerList;
		public Rule_listContext ruleList;
		public Token_listContext tokenList;
		public Code_partContext codePart;
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public Grammar_nameContext grammar_name() {
			return getRuleContext(Grammar_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public Rule_listContext rule_list() {
			return getRuleContext(Rule_listContext.class,0);
		}
		public Token_listContext token_list() {
			return getRuleContext(Token_listContext.class,0);
		}
		public Code_partContext code_part() {
			return getRuleContext(Code_partContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((StartContext)_localctx).grammarName = grammar_name();
			setState(29);
			((StartContext)_localctx).grammarType = type_name();
			setState(30);
			((StartContext)_localctx).headerList = header();
			setState(31);
			((StartContext)_localctx).ruleList = rule_list();
			setState(32);
			((StartContext)_localctx).tokenList = token_list();
			setState(33);
			((StartContext)_localctx).codePart = code_part();
			setState(34);
			match(EOF);
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

	public static class Grammar_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode NOT_WS() { return getToken(GrammarParser.NOT_WS, 0); }
		public Grammar_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGrammar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGrammar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGrammar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_nameContext grammar_name() throws RecognitionException {
		Grammar_nameContext _localctx = new Grammar_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammar_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			((Grammar_nameContext)_localctx).name = match(NOT_WS);
			setState(38);
			match(T__1);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_name);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__2);
				setState(41);
				((Type_nameContext)_localctx).name = match(CODE);
				setState(42);
				match(T__1);
				}
				break;
			case T__3:
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

	public static class HeaderContext extends ParserRuleContext {
		public Token headers;
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__3);
			setState(47);
			((HeaderContext)_localctx).headers = match(CODE);
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

	public static class Rule_listContext extends ParserRuleContext {
		public Rule_objContext rule_;
		public Rule_listContext tail;
		public Rule_objContext rule_obj() {
			return getRuleContext(Rule_objContext.class,0);
		}
		public Rule_listContext rule_list() {
			return getRuleContext(Rule_listContext.class,0);
		}
		public Rule_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRule_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRule_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRule_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_listContext rule_list() throws RecognitionException {
		Rule_listContext _localctx = new Rule_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_list);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((Rule_listContext)_localctx).rule_ = rule_obj();
				setState(50);
				((Rule_listContext)_localctx).tail = rule_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Rule_objContext extends ParserRuleContext {
		public Token name;
		public Branch_listContext branchList;
		public TerminalNode NOT_WS() { return getToken(GrammarParser.NOT_WS, 0); }
		public Branch_listContext branch_list() {
			return getRuleContext(Branch_listContext.class,0);
		}
		public Rule_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRule_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRule_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRule_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_objContext rule_obj() throws RecognitionException {
		Rule_objContext _localctx = new Rule_objContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rule_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((Rule_objContext)_localctx).name = match(NOT_WS);
			setState(56);
			((Rule_objContext)_localctx).branchList = branch_list();
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

	public static class Branch_listContext extends ParserRuleContext {
		public BranchContext headBranch;
		public Branch_listContext tail;
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Branch_listContext branch_list() {
			return getRuleContext(Branch_listContext.class,0);
		}
		public Branch_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBranch_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBranch_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBranch_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_listContext branch_list() throws RecognitionException {
		Branch_listContext _localctx = new Branch_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_branch_list);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__4);
				setState(59);
				((Branch_listContext)_localctx).headBranch = branch();
				setState(60);
				((Branch_listContext)_localctx).tail = branch_list();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__1);
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

	public static class BranchContext extends ParserRuleContext {
		public Element_listContext elementList;
		public Calc_resultContext calcResult;
		public Element_listContext element_list() {
			return getRuleContext(Element_listContext.class,0);
		}
		public Calc_resultContext calc_result() {
			return getRuleContext(Calc_resultContext.class,0);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branch);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((BranchContext)_localctx).elementList = element_list();
				setState(66);
				((BranchContext)_localctx).calcResult = calc_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((BranchContext)_localctx).calcResult = calc_result();
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

	public static class Calc_resultContext extends ParserRuleContext {
		public Token val;
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public Calc_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCalc_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCalc_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCalc_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_resultContext calc_result() throws RecognitionException {
		Calc_resultContext _localctx = new Calc_resultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_calc_result);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((Calc_resultContext)_localctx).val = match(CODE);
				}
				break;
			case T__1:
			case T__4:
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

	public static class Element_listContext extends ParserRuleContext {
		public Token headElement;
		public Element_listContext tail;
		public TerminalNode NOT_WS() { return getToken(GrammarParser.NOT_WS, 0); }
		public Element_listContext element_list() {
			return getRuleContext(Element_listContext.class,0);
		}
		public Element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_listContext element_list() throws RecognitionException {
		Element_listContext _localctx = new Element_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_element_list);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((Element_listContext)_localctx).headElement = match(NOT_WS);
				setState(76);
				((Element_listContext)_localctx).tail = element_list();
				}
				break;
			case T__1:
			case T__4:
			case CODE:
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

	public static class Token_listContext extends ParserRuleContext {
		public TokenContext headToken;
		public Token_listContext tail;
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public Token_listContext token_list() {
			return getRuleContext(Token_listContext.class,0);
		}
		public Token_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_listContext token_list() throws RecognitionException {
		Token_listContext _localctx = new Token_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_token_list);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((Token_listContext)_localctx).headToken = token();
				setState(81);
				((Token_listContext)_localctx).tail = token_list();
				}
				break;
			case EOF:
			case REGEX:
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

	public static class TokenContext extends ParserRuleContext {
		public Token name;
		public Token regex;
		public Token_tailContext tail;
		public TerminalNode NOT_WS() { return getToken(GrammarParser.NOT_WS, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public Token_tailContext token_tail() {
			return getRuleContext(Token_tailContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((TokenContext)_localctx).name = match(NOT_WS);
			setState(87);
			match(T__5);
			setState(88);
			((TokenContext)_localctx).regex = match(REGEX);
			setState(89);
			((TokenContext)_localctx).tail = token_tail();
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

	public static class Token_tailContext extends ParserRuleContext {
		public Token val;
		public Calc_resultContext calcResult;
		public Calc_resultContext calc_result() {
			return getRuleContext(Calc_resultContext.class,0);
		}
		public Token_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_tailContext token_tail() throws RecognitionException {
		Token_tailContext _localctx = new Token_tailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_token_tail);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((Token_tailContext)_localctx).val = match(T__6);
				setState(92);
				((Token_tailContext)_localctx).calcResult = calc_result();
				setState(93);
				match(T__1);
				}
				break;
			case T__1:
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((Token_tailContext)_localctx).calcResult = calc_result();
				setState(96);
				((Token_tailContext)_localctx).val = match(T__1);
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

	public static class Code_partContext extends ParserRuleContext {
		public Token code;
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public Code_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCode_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_partContext code_part() throws RecognitionException {
		Code_partContext _localctx = new Code_partContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code_part);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((Code_partContext)_localctx).code = match(REGEX);
				}
				break;
			case EOF:
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

	public static final String _serializedATN =
		"\u0004\u0001\u000bi\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006@\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007F\b\u0007\u0001\b\u0001\b\u0003\bJ\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0003\tO\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"U\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fc\b\f\u0001"+
		"\r\u0001\r\u0003\rg\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000c\u0000\u001c"+
		"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004,\u0001\u0000"+
		"\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000"+
		"\n7\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eE\u0001\u0000"+
		"\u0000\u0000\u0010I\u0001\u0000\u0000\u0000\u0012N\u0001\u0000\u0000\u0000"+
		"\u0014T\u0001\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018b"+
		"\u0001\u0000\u0000\u0000\u001af\u0001\u0000\u0000\u0000\u001c\u001d\u0003"+
		"\u0002\u0001\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0003"+
		"\u0006\u0003\u0000\u001f \u0003\b\u0004\u0000 !\u0003\u0014\n\u0000!\""+
		"\u0003\u001a\r\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u000b\u0000\u0000&\'\u0005\u0002"+
		"\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0003\u0000\u0000"+
		")*\u0005\n\u0000\u0000*-\u0005\u0002\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",(\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0005\u0001\u0000"+
		"\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005\n\u0000\u00000\u0007\u0001"+
		"\u0000\u0000\u000012\u0003\n\u0005\u000023\u0003\b\u0004\u000036\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005\u000b\u0000"+
		"\u000089\u0003\f\u0006\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\u0005"+
		"\u0000\u0000;<\u0003\u000e\u0007\u0000<=\u0003\f\u0006\u0000=@\u0001\u0000"+
		"\u0000\u0000>@\u0005\u0002\u0000\u0000?:\u0001\u0000\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@\r\u0001\u0000\u0000\u0000AB\u0003\u0012\t\u0000BC"+
		"\u0003\u0010\b\u0000CF\u0001\u0000\u0000\u0000DF\u0003\u0010\b\u0000E"+
		"A\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u000f\u0001\u0000"+
		"\u0000\u0000GJ\u0005\n\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0011\u0001\u0000\u0000\u0000"+
		"KL\u0005\u000b\u0000\u0000LO\u0003\u0012\t\u0000MO\u0001\u0000\u0000\u0000"+
		"NK\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0013\u0001\u0000"+
		"\u0000\u0000PQ\u0003\u0016\u000b\u0000QR\u0003\u0014\n\u0000RU\u0001\u0000"+
		"\u0000\u0000SU\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000U\u0015\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000"+
		"\u0000WX\u0005\u0006\u0000\u0000XY\u0005\t\u0000\u0000YZ\u0003\u0018\f"+
		"\u0000Z\u0017\u0001\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000\\]\u0003"+
		"\u0010\b\u0000]^\u0005\u0002\u0000\u0000^c\u0001\u0000\u0000\u0000_`\u0003"+
		"\u0010\b\u0000`a\u0005\u0002\u0000\u0000ac\u0001\u0000\u0000\u0000b[\u0001"+
		"\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000c\u0019\u0001\u0000\u0000"+
		"\u0000dg\u0005\t\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000g\u001b\u0001\u0000\u0000\u0000\t,5?E"+
		"INTbf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}