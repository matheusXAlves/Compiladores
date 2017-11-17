// Generated from /home/aluno/Ednilson/lab02/provided/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, WS_=2, SL_COMMENT=3, EXCLAMA=4, NUM_INT=5, NUM_HEX=6, PONTO_VIRGULA=7, 
		PL=8, PR=9, LCURLY=10, RCURLY=11, CL=12, CR=13, VIRGULA=14, BOOL_WORDS=15, 
		PROGRAM=16, CLASS=17, VOID=18, FOR=19, RETURN=20, CONTINUE=21, IF=22, 
		ELSE=23, BREAK=24, CALLOUT=25, INT=26, BOOLEAN=27, OPERADOR_BIN=28, OPERADOR_IGUAL=29, 
		OPERADOR_MENOS=30, OPERADOR_ASSING=31, OPERADORES=32, CHAR_LITERAL=33, 
		STRING=34, ID=35;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_field_decl = 2, RULE_method_decl = 3, 
		RULE_block = 4, RULE_var_decl = 5, RULE_statement = 6, RULE_method_call = 7, 
		RULE_method_name = 8, RULE_location = 9, RULE_expr = 10, RULE_callout_arg = 11, 
		RULE_literal = 12;
	public static final String[] ruleNames = {
		"program", "type", "field_decl", "method_decl", "block", "var_decl", "statement", 
		"method_call", "method_name", "location", "expr", "callout_arg", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'!'", null, null, "';'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", null, "'Program'", "'class'", "'void'", "'for'", 
		"'return'", "'continue'", "'if'", "'else'", "'break'", "'callout'", "'int'", 
		"'boolean'", null, "'='", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "WS_", "SL_COMMENT", "EXCLAMA", "NUM_INT", "NUM_HEX", 
		"PONTO_VIRGULA", "PL", "PR", "LCURLY", "RCURLY", "CL", "CR", "VIRGULA", 
		"BOOL_WORDS", "PROGRAM", "CLASS", "VOID", "FOR", "RETURN", "CONTINUE", 
		"IF", "ELSE", "BREAK", "CALLOUT", "INT", "BOOLEAN", "OPERADOR_BIN", "OPERADOR_IGUAL", 
		"OPERADOR_MENOS", "OPERADOR_ASSING", "OPERADORES", "CHAR_LITERAL", "STRING", 
		"ID"
	};
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
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(CLASS);
			setState(27);
			match(PROGRAM);
			setState(28);
			match(LCURLY);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					field_decl();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(35);
				method_decl();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RCURLY);
			setState(42);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOLEAN) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(DecafParser.PONTO_VIRGULA, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> CL() { return getTokens(DecafParser.CL); }
		public TerminalNode CL(int i) {
			return getToken(DecafParser.CL, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(DecafParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(DecafParser.NUM_INT, i);
		}
		public List<TerminalNode> CR() { return getTokens(DecafParser.CR); }
		public TerminalNode CR(int i) {
			return getToken(DecafParser.CR, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(46);
					type();
					setState(47);
					match(ID);
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(48);
						match(VIRGULA);
						setState(49);
						type();
						setState(50);
						match(ID);
						}
						}
						setState(56);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(57);
					type();
					setState(58);
					match(ID);
					setState(59);
					match(CL);
					setState(60);
					match(NUM_INT);
					setState(61);
					match(CR);
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(62);
						match(VIRGULA);
						setState(63);
						type();
						setState(64);
						match(ID);
						setState(65);
						match(CL);
						setState(66);
						match(NUM_INT);
						setState(67);
						match(CR);
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(PONTO_VIRGULA);
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

	public static class Method_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PL() { return getToken(DecafParser.PL, 0); }
		public TerminalNode PR() { return getToken(DecafParser.PR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
				{
				setState(81);
				type();
				}
				break;
			case VOID:
				{
				setState(82);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			match(ID);
			setState(86);
			match(PL);
			setState(98);
			_la = _input.LA(1);
			if (_la==INT || _la==BOOLEAN) {
				{
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(89);
					match(VIRGULA);
					setState(90);
					type();
					setState(91);
					match(ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(PR);
			setState(101);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LCURLY);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(104);
				var_decl();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << FOR) | (1L << RETURN) | (1L << CONTINUE) | (1L << IF) | (1L << BREAK) | (1L << CALLOUT) | (1L << ID))) != 0)) {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(RCURLY);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(DecafParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(120);
				match(VIRGULA);
				setState(121);
				match(ID);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(PONTO_VIRGULA);
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
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(DecafParser.PONTO_VIRGULA, 0); }
		public TerminalNode OPERADOR_IGUAL() { return getToken(DecafParser.OPERADOR_IGUAL, 0); }
		public TerminalNode OPERADOR_ASSING() { return getToken(DecafParser.OPERADOR_ASSING, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode PL() { return getToken(DecafParser.PL, 0); }
		public TerminalNode PR() { return getToken(DecafParser.PR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode VIRGULA() { return getToken(DecafParser.VIRGULA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				location();
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==OPERADOR_IGUAL || _la==OPERADOR_ASSING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(131);
				expr(0);
				setState(132);
				match(PONTO_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				method_call();
				setState(135);
				match(PONTO_VIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(IF);
				setState(138);
				match(PL);
				setState(139);
				expr(0);
				setState(140);
				match(PR);
				setState(141);
				block();
				setState(144);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(142);
					match(ELSE);
					setState(143);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(FOR);
				setState(147);
				match(ID);
				setState(148);
				match(OPERADOR_IGUAL);
				setState(149);
				expr(0);
				setState(150);
				match(VIRGULA);
				setState(151);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(RETURN);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					expr(0);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMA) | (1L << NUM_INT) | (1L << PL) | (1L << BOOL_WORDS) | (1L << CALLOUT) | (1L << OPERADOR_BIN) | (1L << OPERADOR_MENOS) | (1L << CHAR_LITERAL) | (1L << ID))) != 0) );
				setState(159);
				match(PONTO_VIRGULA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(BREAK);
				setState(162);
				match(PONTO_VIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(CONTINUE);
				setState(164);
				match(PONTO_VIRGULA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				block();
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode PL() { return getToken(DecafParser.PL, 0); }
		public TerminalNode PR() { return getToken(DecafParser.PR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(203);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				method_name();
				setState(169);
				match(PL);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMA) | (1L << NUM_INT) | (1L << PL) | (1L << BOOL_WORDS) | (1L << CALLOUT) | (1L << OPERADOR_BIN) | (1L << OPERADOR_MENOS) | (1L << CHAR_LITERAL) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					expr(0);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(171);
						match(VIRGULA);
						setState(172);
						expr(0);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(PR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(CALLOUT);
				setState(186);
				match(PL);
				setState(187);
				match(STRING);
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					match(VIRGULA);
					setState(189);
					callout_arg();
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(190);
							match(VIRGULA);
							setState(191);
							callout_arg();
							}
							} 
						}
						setState(196);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VIRGULA );
				setState(201);
				match(PR);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode CL() { return getToken(DecafParser.CL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CR() { return getToken(DecafParser.CR, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_location);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ID);
				setState(209);
				match(CL);
				setState(210);
				expr(0);
				setState(211);
				match(CR);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERADOR_BIN() { return getToken(DecafParser.OPERADOR_BIN, 0); }
		public TerminalNode OPERADOR_MENOS() { return getToken(DecafParser.OPERADOR_MENOS, 0); }
		public TerminalNode EXCLAMA() { return getToken(DecafParser.EXCLAMA, 0); }
		public TerminalNode PL() { return getToken(DecafParser.PL, 0); }
		public TerminalNode PR() { return getToken(DecafParser.PR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(216);
				location();
				}
				break;
			case 2:
				{
				setState(217);
				method_call();
				}
				break;
			case 3:
				{
				setState(218);
				literal();
				}
				break;
			case 4:
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==OPERADOR_BIN || _la==OPERADOR_MENOS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(220);
				expr(3);
				}
				break;
			case 5:
				{
				setState(221);
				match(EXCLAMA);
				setState(222);
				expr(2);
				}
				break;
			case 6:
				{
				setState(223);
				match(PL);
				setState(224);
				expr(0);
				setState(225);
				match(PR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(229);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==OPERADOR_BIN || _la==OPERADOR_MENOS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(231);
					expr(5);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callout_arg);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case EXCLAMA:
			case NUM_INT:
			case PL:
			case BOOL_WORDS:
			case CALLOUT:
			case OPERADOR_BIN:
			case OPERADOR_MENOS:
			case CHAR_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(STRING);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(DecafParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_WORDS() { return getToken(DecafParser.BOOL_WORDS, 0); }
		public TerminalNode NUM_INT() { return getToken(DecafParser.NUM_INT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_INT) | (1L << BOOL_WORDS) | (1L << CHAR_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\5\3"+
		"\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\5"+
		"\5e\n\5\3\5\3\5\3\5\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\7\6r\n\6\f\6\16"+
		"\6u\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009e\n\b\r\b\16\b\u009f"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b0"+
		"\n\t\f\t\16\t\u00b3\13\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t\6\t\u00c8\n"+
		"\t\r\t\16\t\u00c9\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00d8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00e6\n\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\r\3\r"+
		"\5\r\u00f2\n\r\3\16\3\16\3\16\2\3\26\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\6\3\2\34\35\4\2\37\37!!\4\2\36\36  \5\2\7\7\21\21##\u010a\2\34\3"+
		"\2\2\2\4.\3\2\2\2\6N\3\2\2\2\bU\3\2\2\2\ni\3\2\2\2\fx\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00cd\3\2\2\2\22\u00cf\3\2\2\2\24\u00d7\3\2\2\2\26\u00e5\3"+
		"\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2\2\34\35\7\23\2\2\35\36\7\22\2\2"+
		"\36\"\7\f\2\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2"+
		"#(\3\2\2\2$\"\3\2\2\2%\'\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)+\3\2\2\2*(\3\2\2\2+,\7\r\2\2,-\7\2\2\3-\3\3\2\2\2./\t\2\2\2/\5\3"+
		"\2\2\2\60\61\5\4\3\2\618\7%\2\2\62\63\7\20\2\2\63\64\5\4\3\2\64\65\7%"+
		"\2\2\65\67\3\2\2\2\66\62\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29M\3"+
		"\2\2\2:8\3\2\2\2;<\5\4\3\2<=\7%\2\2=>\7\16\2\2>?\7\7\2\2?I\7\17\2\2@A"+
		"\7\20\2\2AB\5\4\3\2BC\7%\2\2CD\7\16\2\2DE\7\7\2\2EF\7\17\2\2FH\3\2\2\2"+
		"G@\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2L\60\3\2\2"+
		"\2L;\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\t\2"+
		"\2R\7\3\2\2\2SV\5\4\3\2TV\7\24\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7%"+
		"\2\2Xd\7\n\2\2YZ\5\4\3\2Za\7%\2\2[\\\7\20\2\2\\]\5\4\3\2]^\7%\2\2^`\3"+
		"\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2dY\3"+
		"\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\13\2\2gh\5\n\6\2h\t\3\2\2\2im\7\f\2\2j"+
		"l\5\f\7\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2"+
		"pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\7\r\2\2w\13\3\2\2\2xy\5\4\3\2y~\7%\2\2z{\7\20\2\2{}\7%\2\2|z\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0082\7\t\2\2\u0082\r\3\2\2\2\u0083\u0084\5\24\13\2\u0084"+
		"\u0085\t\3\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\t\2\2\u0087\u00a9\3"+
		"\2\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\t\2\2\u008a\u00a9\3\2\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7"+
		"\13\2\2\u008f\u0092\5\n\6\2\u0090\u0091\7\31\2\2\u0091\u0093\5\n\6\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a9\3\2\2\2\u0094\u0095\7\25"+
		"\2\2\u0095\u0096\7%\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\26\f\2\u0098"+
		"\u0099\7\20\2\2\u0099\u009a\5\26\f\2\u009a\u00a9\3\2\2\2\u009b\u009d\7"+
		"\26\2\2\u009c\u009e\5\26\f\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\t"+
		"\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4\7\32\2\2\u00a4\u00a9\7\t\2\2\u00a5"+
		"\u00a6\7\27\2\2\u00a6\u00a9\7\t\2\2\u00a7\u00a9\5\n\6\2\u00a8\u0083\3"+
		"\2\2\2\u00a8\u0088\3\2\2\2\u00a8\u008b\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8"+
		"\u009b\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00b6\7\n\2\2\u00ac\u00b1"+
		"\5\26\f\2\u00ad\u00ae\7\20\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00ce\3\2\2\2\u00bb\u00bc\7\33\2\2\u00bc"+
		"\u00bd\7\n\2\2\u00bd\u00c7\7$\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c4\5\30"+
		"\r\2\u00c0\u00c1\7\20\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00be\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\13"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00aa\3\2\2\2\u00cd\u00bb\3\2\2\2\u00ce"+
		"\21\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0\23\3\2\2\2\u00d1\u00d8\7%\2\2\u00d2"+
		"\u00d3\7%\2\2\u00d3\u00d4\7\16\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7"+
		"\17\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8"+
		"\25\3\2\2\2\u00d9\u00da\b\f\1\2\u00da\u00e6\5\24\13\2\u00db\u00e6\5\20"+
		"\t\2\u00dc\u00e6\5\32\16\2\u00dd\u00de\t\4\2\2\u00de\u00e6\5\26\f\5\u00df"+
		"\u00e0\7\6\2\2\u00e0\u00e6\5\26\f\4\u00e1\u00e2\7\n\2\2\u00e2\u00e3\5"+
		"\26\f\2\u00e3\u00e4\7\13\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5"+
		"\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\6\2\2\u00e8"+
		"\u00e9\t\4\2\2\u00e9\u00eb\5\26\f\7\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f2\5\26\f\2\u00f0\u00f2\7$\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\31\3\2\2\2\u00f3\u00f4\t\5\2\2\u00f4\33"+
		"\3\2\2\2\32\"(8ILNUadms~\u0092\u009f\u00a8\u00b1\u00b6\u00c4\u00c9\u00cd"+
		"\u00d7\u00e5\u00ec\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}