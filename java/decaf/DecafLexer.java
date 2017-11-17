// Generated from /home/aluno/Ednilson/lab02/provided/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS_", "SL_COMMENT", "EXCLAMA", "NUM_INT", "NUM_HEX", "PONTO_VIRGULA", 
		"PL", "PR", "LCURLY", "RCURLY", "CL", "CR", "VIRGULA", "BOOL_WORDS", "PROGRAM", 
		"CLASS", "VOID", "FOR", "RETURN", "CONTINUE", "IF", "ELSE", "BREAK", "CALLOUT", 
		"INT", "BOOLEAN", "OPERADOR_BIN", "OPERADOR_IGUAL", "OPERADOR_MENOS", 
		"OPERADOR_ASSING", "OPERADORES", "CHAR_LITERAL", "CHAR", "STRING", "ID", 
		"LETRAS", "ESC"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5b\n\5\r\5\16\5c"+
		"\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\6\6m\n\6\r\6\16\6n\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u00de\n\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00ec\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0104\n \3!\3!\3!\5!\u0109"+
		"\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0112\n\"\3#\3#\3#\7#\u0117\n#\f#\16"+
		"#\u011a\13#\3#\3#\3$\3$\3$\5$\u0121\n$\6$\u0123\n$\r$\16$\u0124\3%\3%"+
		"\3&\3&\3&\2\2\'\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31"+
		"\17\33\20\35\21\37\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65"+
		"\35\67\369\37; =!?\"A#C\2E$G%I\2K\2\3\2\f\5\2\13\f\17\17\"\"\3\2\f\f\5"+
		"\2\62;CHch\7\2,-//\61\61>>@@\4\2>>@@\6\2\'\',-//\61\61\6\2\"#%(*]_\u0080"+
		"\5\2C\\aac|\4\2C\\c|\b\2$$))^^ppttvv\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7^\3\2\2\2\tf"+
		"\3\2\2\2\13h\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25"+
		"x\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0089\3\2\2\2\37\u008b"+
		"\3\2\2\2!\u0093\3\2\2\2#\u0099\3\2\2\2%\u009e\3\2\2\2\'\u00a2\3\2\2\2"+
		")\u00a9\3\2\2\2+\u00b2\3\2\2\2-\u00b5\3\2\2\2/\u00ba\3\2\2\2\61\u00c0"+
		"\3\2\2\2\63\u00c8\3\2\2\2\65\u00cc\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2"+
		"\2\2;\u00e1\3\2\2\2=\u00eb\3\2\2\2?\u0103\3\2\2\2A\u0105\3\2\2\2C\u0111"+
		"\3\2\2\2E\u0113\3\2\2\2G\u0122\3\2\2\2I\u0126\3\2\2\2K\u0128\3\2\2\2M"+
		"N\t\2\2\2NO\3\2\2\2OP\b\2\2\2P\4\3\2\2\2QR\7\61\2\2RS\7\61\2\2SW\3\2\2"+
		"\2TV\n\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2"+
		"\2Z[\7\f\2\2[\\\3\2\2\2\\]\b\3\2\2]\6\3\2\2\2^_\7#\2\2_\b\3\2\2\2`b\4"+
		"\62;\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2eg\5\13\6\2fa"+
		"\3\2\2\2fe\3\2\2\2g\n\3\2\2\2hi\7\62\2\2ij\7z\2\2jl\3\2\2\2km\t\4\2\2"+
		"lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\f\3\2\2\2pq\7=\2\2q\16\3\2\2"+
		"\2rs\7*\2\2s\20\3\2\2\2tu\7+\2\2u\22\3\2\2\2vw\7}\2\2w\24\3\2\2\2xy\7"+
		"\177\2\2y\26\3\2\2\2z{\7]\2\2{\30\3\2\2\2|}\7_\2\2}\32\3\2\2\2~\177\7"+
		".\2\2\177\34\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7u\2\2\u0084\u008a\7g\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008a\7g\2\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0085\3\2\2\2\u008a\36\3\2\2\2\u008b\u008c\7R\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7q\2\2\u008e\u008f\7i\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7o\2\2\u0092 \3\2\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096\u0097\7u\2\2\u0097\u0098\7u\2\2"+
		"\u0098\"\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7q\2\2\u009b\u009c\7k"+
		"\2\2\u009c\u009d\7f\2\2\u009d$\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7t\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7k\2"+
		"\2\u00b3\u00b4\7h\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
		"n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7d\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7m\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7w\2\2"+
		"\u00c6\u00c7\7v\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7"+
		"p\2\2\u00ca\u00cb\7v\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7p\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5"+
		"\u00de\7?\2\2\u00d6\u00d7\7@\2\2\u00d7\u00de\7?\2\2\u00d8\u00d9\7#\2\2"+
		"\u00d9\u00de\7?\2\2\u00da\u00db\7?\2\2\u00db\u00de\7?\2\2\u00dc\u00de"+
		"\t\5\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de8\3\2\2\2\u00df\u00e0\7?\2\2\u00e0"+
		":\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4"+
		"\u00ec\7?\2\2\u00e5\u00e6\7-\2\2\u00e6\u00ec\7?\2\2\u00e7\u00e8\7/\2\2"+
		"\u00e8\u00ec\7?\2\2\u00e9\u00ea\7,\2\2\u00ea\u00ec\7?\2\2\u00eb\u00e3"+
		"\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		">\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u0104\7?\2\2\u00ef\u00f0\7?\2\2\u00f0"+
		"\u0104\7?\2\2\u00f1\u0104\t\6\2\2\u00f2\u00f3\7(\2\2\u00f3\u0104\7(\2"+
		"\2\u00f4\u00f5\7~\2\2\u00f5\u0104\7~\2\2\u00f6\u0104\t\7\2\2\u00f7\u00f8"+
		"\7>\2\2\u00f8\u0104\7?\2\2\u00f9\u00fa\7@\2\2\u00fa\u0104\7?\2\2\u00fb"+
		"\u00fc\7\61\2\2\u00fc\u0104\7?\2\2\u00fd\u00fe\7-\2\2\u00fe\u0104\7?\2"+
		"\2\u00ff\u0100\7/\2\2\u0100\u0104\7?\2\2\u0101\u0102\7,\2\2\u0102\u0104"+
		"\7?\2\2\u0103\u00ed\3\2\2\2\u0103\u00ef\3\2\2\2\u0103\u00f1\3\2\2\2\u0103"+
		"\u00f2\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f6\3\2\2\2\u0103\u00f7\3\2"+
		"\2\2\u0103\u00f9\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104@\3\2\2\2\u0105\u0108\7)\2\2\u0106"+
		"\u0109\5K&\2\u0107\u0109\5C\"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2"+
		"\2\u0109\u010a\3\2\2\2\u010a\u010b\7)\2\2\u010bB\3\2\2\2\u010c\u0112\t"+
		"\b\2\2\u010d\u010e\7^\2\2\u010e\u0112\7v\2\2\u010f\u0110\7^\2\2\u0110"+
		"\u0112\7^\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112D\3\2\2\2\u0113\u0118\7$\2\2\u0114\u0117\5K&\2\u0115\u0117\5"+
		"C\"\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011c\7$\2\2\u011cF\3\2\2\2\u011d\u0123\t\t\2\2\u011e\u0121"+
		"\t\t\2\2\u011f\u0121\5\t\5\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125H\3\2\2\2\u0126\u0127"+
		"\t\n\2\2\u0127J\3\2\2\2\u0128\u0129\7^\2\2\u0129\u012a\t\13\2\2\u012a"+
		"L\3\2\2\2\22\2Wcfn\u0089\u00dd\u00eb\u0103\u0108\u0111\u0116\u0118\u0120"+
		"\u0122\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}