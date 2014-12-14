// Generated from BigDataScript.g4 by ANTLR 4.2.2
package ca.mcgill.mcb.pcingola.bigDataScript.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigDataScriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__67=1, T__66=2, T__65=3, T__64=4, T__63=5, T__62=6, T__61=7, T__60=8, 
		T__59=9, T__58=10, T__57=11, T__56=12, T__55=13, T__54=14, T__53=15, T__52=16, 
		T__51=17, T__50=18, T__49=19, T__48=20, T__47=21, T__46=22, T__45=23, 
		T__44=24, T__43=25, T__42=26, T__41=27, T__40=28, T__39=29, T__38=30, 
		T__37=31, T__36=32, T__35=33, T__34=34, T__33=35, T__32=36, T__31=37, 
		T__30=38, T__29=39, T__28=40, T__27=41, T__26=42, T__25=43, T__24=44, 
		T__23=45, T__22=46, T__21=47, T__20=48, T__19=49, T__18=50, T__17=51, 
		T__16=52, T__15=53, T__14=54, T__13=55, T__12=56, T__11=57, T__10=58, 
		T__9=59, T__8=60, T__7=61, T__6=62, T__5=63, T__4=64, T__3=65, T__2=66, 
		T__1=67, T__0=68, BOOL_LITERAL=69, INT_LITERAL=70, REAL_LITERAL=71, STRING_LITERAL=72, 
		STRING_LITERAL_SINGLE=73, SYS_LITERAL=74, TASK_LITERAL=75, COMMENT=76, 
		COMMENT_LINE=77, COMMENT_LINE_HASH=78, ID=79, WS=80;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+='", "'!='", "'while'", "'{'", "'void'", "'&&'", "'='", "'^'", "'for'", 
		"'error'", "'|='", "'int'", "'include'", "'task'", "'('", "'-='", "','", 
		"'/='", "'kill'", "'<-'", "'\n'", "'println'", "'exit'", "'>='", "'<'", 
		"'++'", "']'", "'~'", "'wait'", "'dep'", "'+'", "'goal'", "'*='", "'/'", 
		"'continue'", "'&='", "'return'", "'||'", "';'", "'}'", "'if'", "'?'", 
		"'warning'", "':='", "'<='", "'break'", "'&'", "'print'", "'*'", "'.'", 
		"'parallel'", "'par'", "':'", "'['", "'=='", "'--'", "'|'", "'>'", "'bool'", 
		"'=>'", "'!'", "'string'", "'checkpoint'", "'%'", "'else'", "')'", "'-'", 
		"'real'", "BOOL_LITERAL", "INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", 
		"STRING_LITERAL_SINGLE", "SYS_LITERAL", "TASK_LITERAL", "COMMENT", "COMMENT_LINE", 
		"COMMENT_LINE_HASH", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__67", "T__66", "T__65", "T__64", "T__63", "T__62", "T__61", "T__60", 
		"T__59", "T__58", "T__57", "T__56", "T__55", "T__54", "T__53", "T__52", 
		"T__51", "T__50", "T__49", "T__48", "T__47", "T__46", "T__45", "T__44", 
		"T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", 
		"T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", 
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "IntegerNumber", "EscapeSequence", "EscapedNewLine", 
		"Exponent", "HexPrefix", "HexDigit", "NonIntegerNumber", "SysMultiLine", 
		"BOOL_LITERAL", "INT_LITERAL", "REAL_LITERAL", "STRING_LITERAL", "STRING_LITERAL_SINGLE", 
		"SYS_LITERAL", "TASK_LITERAL", "COMMENT", "COMMENT_LINE", "COMMENT_LINE_HASH", 
		"ID", "WS"
	};


	public BigDataScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigDataScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 83: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 84: COMMENT_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 85: COMMENT_LINE_HASH_action((RuleContext)_localctx, actionIndex); break;

		case 87: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_LINE_HASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void COMMENT_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2R\u0285\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:"+
		"\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E"+
		"\3F\3F\3F\7F\u01b7\nF\fF\16F\u01ba\13F\3F\3F\6F\u01be\nF\rF\16F\u01bf"+
		"\3F\3F\6F\u01c4\nF\rF\16F\u01c5\5F\u01c8\nF\3G\3G\3G\3G\3G\3G\3G\3G\5"+
		"G\u01d2\nG\3H\3H\3H\3H\5H\u01d8\nH\3I\3I\5I\u01dc\nI\3I\6I\u01df\nI\r"+
		"I\16I\u01e0\3J\3J\3J\3J\5J\u01e7\nJ\3K\3K\3L\6L\u01ec\nL\rL\16L\u01ed"+
		"\3L\3L\7L\u01f2\nL\fL\16L\u01f5\13L\3L\5L\u01f8\nL\3L\3L\6L\u01fc\nL\r"+
		"L\16L\u01fd\3L\5L\u0201\nL\3L\6L\u0204\nL\rL\16L\u0205\3L\3L\6L\u020a"+
		"\nL\rL\16L\u020b\5L\u020e\nL\3M\3M\7M\u0212\nM\fM\16M\u0215\13M\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\5N\u0220\nN\3O\3O\3P\3P\3Q\3Q\3Q\3Q\7Q\u022a\nQ"+
		"\fQ\16Q\u022d\13Q\3Q\3Q\3R\3R\7R\u0233\nR\fR\16R\u0236\13R\3R\3R\3S\3"+
		"S\3S\3S\3S\6S\u023f\nS\rS\16S\u0240\3S\3S\3T\3T\3T\3T\3T\3T\6T\u024b\n"+
		"T\rT\16T\u024c\3T\3T\3T\3U\3U\3U\3U\7U\u0256\nU\fU\16U\u0259\13U\3U\3"+
		"U\3U\3U\3U\3V\3V\3V\3V\7V\u0264\nV\fV\16V\u0267\13V\3V\3V\3W\3W\7W\u026d"+
		"\nW\fW\16W\u0270\13W\3W\3W\3X\3X\7X\u0276\nX\fX\16X\u0279\13X\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\5Y\u0282\nY\3Y\3Y\3\u0257\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2"+
		"\u0095\2\u0097\2\u0099\2\u009bG\u009dH\u009fI\u00a1J\u00a3K\u00a5L\u00a7"+
		"M\u00a9N\u00abO\u00adP\u00afQ\u00b1R\3\2\16\n\2$$))^^ddhhppttvv\4\2\f"+
		"\f\17\17\4\2GGgg\4\2--//\5\2\62;CHch\4\2$$^^\3\2))\4\2\13\13\"\"\6\2\f"+
		"\f\17\17**}}\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\u02a2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2\2\5\u00b6\3\2\2\2\7\u00b9\3\2\2\2\t\u00bf"+
		"\3\2\2\2\13\u00c1\3\2\2\2\r\u00c6\3\2\2\2\17\u00c9\3\2\2\2\21\u00cb\3"+
		"\2\2\2\23\u00cd\3\2\2\2\25\u00d1\3\2\2\2\27\u00d7\3\2\2\2\31\u00da\3\2"+
		"\2\2\33\u00de\3\2\2\2\35\u00e6\3\2\2\2\37\u00eb\3\2\2\2!\u00ed\3\2\2\2"+
		"#\u00f0\3\2\2\2%\u00f2\3\2\2\2\'\u00f5\3\2\2\2)\u00fa\3\2\2\2+\u00fd\3"+
		"\2\2\2-\u00ff\3\2\2\2/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u010f\3\2\2\2"+
		"\65\u0111\3\2\2\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011d"+
		"\3\2\2\2?\u0121\3\2\2\2A\u0123\3\2\2\2C\u0128\3\2\2\2E\u012b\3\2\2\2G"+
		"\u012d\3\2\2\2I\u0136\3\2\2\2K\u0139\3\2\2\2M\u0140\3\2\2\2O\u0143\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u0147\3\2\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u0154"+
		"\3\2\2\2[\u0157\3\2\2\2]\u015a\3\2\2\2_\u0160\3\2\2\2a\u0162\3\2\2\2c"+
		"\u0168\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2\2\2i\u0175\3\2\2\2k\u0179\3\2"+
		"\2\2m\u017b\3\2\2\2o\u017d\3\2\2\2q\u0180\3\2\2\2s\u0183\3\2\2\2u\u0185"+
		"\3\2\2\2w\u0187\3\2\2\2y\u018c\3\2\2\2{\u018f\3\2\2\2}\u0191\3\2\2\2\177"+
		"\u0198\3\2\2\2\u0081\u01a3\3\2\2\2\u0083\u01a5\3\2\2\2\u0085\u01aa\3\2"+
		"\2\2\u0087\u01ac\3\2\2\2\u0089\u01ae\3\2\2\2\u008b\u01c7\3\2\2\2\u008d"+
		"\u01c9\3\2\2\2\u008f\u01d3\3\2\2\2\u0091\u01d9\3\2\2\2\u0093\u01e6\3\2"+
		"\2\2\u0095\u01e8\3\2\2\2\u0097\u020d\3\2\2\2\u0099\u0213\3\2\2\2\u009b"+
		"\u021f\3\2\2\2\u009d\u0221\3\2\2\2\u009f\u0223\3\2\2\2\u00a1\u0225\3\2"+
		"\2\2\u00a3\u0230\3\2\2\2\u00a5\u0239\3\2\2\2\u00a7\u0244\3\2\2\2\u00a9"+
		"\u0251\3\2\2\2\u00ab\u025f\3\2\2\2\u00ad\u026a\3\2\2\2\u00af\u0273\3\2"+
		"\2\2\u00b1\u0281\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7?\2\2\u00b5\4"+
		"\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7?\2\2\u00b8\6\3\2\2\2\u00b9\u00ba"+
		"\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7}\2\2\u00c0\n\3\2\2\2\u00c1"+
		"\u00c2\7x\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7f\2\2"+
		"\u00c5\f\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7(\2\2\u00c8\16\3\2\2"+
		"\2\u00c9\u00ca\7?\2\2\u00ca\20\3\2\2\2\u00cb\u00cc\7`\2\2\u00cc\22\3\2"+
		"\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\24"+
		"\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8"+
		"\u00d9\7?\2\2\u00d9\30\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\32\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7f\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7"+
		"c\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7m\2\2\u00ea\36\3\2\2\2\u00eb\u00ec"+
		"\7*\2\2\u00ec \3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef\7?\2\2\u00ef\"\3"+
		"\2\2\2\u00f0\u00f1\7.\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7n\2\2\u00f8\u00f9\7n\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc"+
		"\7/\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7\f\2\2\u00fe,\3\2\2\2\u00ff\u0100"+
		"\7r\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7v\2\2\u0104\u0105\7n\2\2\u0105\u0106\7p\2\2\u0106.\3\2\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7z\2\2\u0109\u010a\7k\2\2\u010a\u010b\7v\2\2"+
		"\u010b\60\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\7?\2\2\u010e\62\3\2\2"+
		"\2\u010f\u0110\7>\2\2\u0110\64\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113"+
		"\7-\2\2\u0113\66\3\2\2\2\u0114\u0115\7_\2\2\u01158\3\2\2\2\u0116\u0117"+
		"\7\u0080\2\2\u0117:\3\2\2\2\u0118\u0119\7y\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7k\2\2\u011b\u011c\7v\2\2\u011c<\3\2\2\2\u011d\u011e\7f\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7r\2\2\u0120>\3\2\2\2\u0121\u0122\7-\2\2\u0122"+
		"@\3\2\2\2\u0123\u0124\7i\2\2\u0124\u0125\7q\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7n\2\2\u0127B\3\2\2\2\u0128\u0129\7,\2\2\u0129\u012a\7?\2\2\u012a"+
		"D\3\2\2\2\u012b\u012c\7\61\2\2\u012cF\3\2\2\2\u012d\u012e\7e\2\2\u012e"+
		"\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7p\2\2\u0133\u0134\7w\2\2\u0134\u0135\7g\2\2\u0135H\3\2\2"+
		"\2\u0136\u0137\7(\2\2\u0137\u0138\7?\2\2\u0138J\3\2\2\2\u0139\u013a\7"+
		"t\2\2\u013a\u013b\7g\2\2\u013b\u013c\7v\2\2\u013c\u013d\7w\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7p\2\2\u013fL\3\2\2\2\u0140\u0141\7~\2\2\u0141\u0142"+
		"\7~\2\2\u0142N\3\2\2\2\u0143\u0144\7=\2\2\u0144P\3\2\2\2\u0145\u0146\7"+
		"\177\2\2\u0146R\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149\7h\2\2\u0149T\3"+
		"\2\2\2\u014a\u014b\7A\2\2\u014bV\3\2\2\2\u014c\u014d\7y\2\2\u014d\u014e"+
		"\7c\2\2\u014e\u014f\7t\2\2\u014f\u0150\7p\2\2\u0150\u0151\7k\2\2\u0151"+
		"\u0152\7p\2\2\u0152\u0153\7i\2\2\u0153X\3\2\2\2\u0154\u0155\7<\2\2\u0155"+
		"\u0156\7?\2\2\u0156Z\3\2\2\2\u0157\u0158\7>\2\2\u0158\u0159\7?\2\2\u0159"+
		"\\\3\2\2\2\u015a\u015b\7d\2\2\u015b\u015c\7t\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\7c\2\2\u015e\u015f\7m\2\2\u015f^\3\2\2\2\u0160\u0161\7(\2\2\u0161"+
		"`\3\2\2\2\u0162\u0163\7r\2\2\u0163\u0164\7t\2\2\u0164\u0165\7k\2\2\u0165"+
		"\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167b\3\2\2\2\u0168\u0169\7,\2\2\u0169"+
		"d\3\2\2\2\u016a\u016b\7\60\2\2\u016bf\3\2\2\2\u016c\u016d\7r\2\2\u016d"+
		"\u016e\7c\2\2\u016e\u016f\7t\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2"+
		"\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173\u0174\7n\2\2\u0174h\3\2\2"+
		"\2\u0175\u0176\7r\2\2\u0176\u0177\7c\2\2\u0177\u0178\7t\2\2\u0178j\3\2"+
		"\2\2\u0179\u017a\7<\2\2\u017al\3\2\2\2\u017b\u017c\7]\2\2\u017cn\3\2\2"+
		"\2\u017d\u017e\7?\2\2\u017e\u017f\7?\2\2\u017fp\3\2\2\2\u0180\u0181\7"+
		"/\2\2\u0181\u0182\7/\2\2\u0182r\3\2\2\2\u0183\u0184\7~\2\2\u0184t\3\2"+
		"\2\2\u0185\u0186\7@\2\2\u0186v\3\2\2\2\u0187\u0188\7d\2\2\u0188\u0189"+
		"\7q\2\2\u0189\u018a\7q\2\2\u018a\u018b\7n\2\2\u018bx\3\2\2\2\u018c\u018d"+
		"\7?\2\2\u018d\u018e\7@\2\2\u018ez\3\2\2\2\u018f\u0190\7#\2\2\u0190|\3"+
		"\2\2\2\u0191\u0192\7u\2\2\u0192\u0193\7v\2\2\u0193\u0194\7t\2\2\u0194"+
		"\u0195\7k\2\2\u0195\u0196\7p\2\2\u0196\u0197\7i\2\2\u0197~\3\2\2\2\u0198"+
		"\u0199\7e\2\2\u0199\u019a\7j\2\2\u019a\u019b\7g\2\2\u019b\u019c\7e\2\2"+
		"\u019c\u019d\7m\2\2\u019d\u019e\7r\2\2\u019e\u019f\7q\2\2\u019f\u01a0"+
		"\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7v\2\2\u01a2\u0080\3\2\2\2\u01a3"+
		"\u01a4\7\'\2\2\u01a4\u0082\3\2\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7n\2"+
		"\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7g\2\2\u01a9\u0084\3\2\2\2\u01aa\u01ab"+
		"\7+\2\2\u01ab\u0086\3\2\2\2\u01ac\u01ad\7/\2\2\u01ad\u0088\3\2\2\2\u01ae"+
		"\u01af\7t\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7n\2\2"+
		"\u01b2\u008a\3\2\2\2\u01b3\u01c8\7\62\2\2\u01b4\u01b8\4\63;\2\u01b5\u01b7"+
		"\4\62;\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01c8\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\7\62"+
		"\2\2\u01bc\u01be\4\629\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c8\3\2\2\2\u01c1\u01c3\5\u0093"+
		"J\2\u01c2\u01c4\5\u0095K\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01b3\3\2"+
		"\2\2\u01c7\u01b4\3\2\2\2\u01c7\u01bb\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c8"+
		"\u008c\3\2\2\2\u01c9\u01d1\7^\2\2\u01ca\u01d2\t\2\2\2\u01cb\u01cc\4\62"+
		"\65\2\u01cc\u01cd\4\629\2\u01cd\u01d2\4\629\2\u01ce\u01cf\4\629\2\u01cf"+
		"\u01d2\4\629\2\u01d0\u01d2\4\629\2\u01d1\u01ca\3\2\2\2\u01d1\u01cb\3\2"+
		"\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u008e\3\2\2\2\u01d3"+
		"\u01d7\7^\2\2\u01d4\u01d8\t\3\2\2\u01d5\u01d6\7\17\2\2\u01d6\u01d8\7\f"+
		"\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u0090\3\2\2\2\u01d9"+
		"\u01db\t\4\2\2\u01da\u01dc\t\5\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01de\3\2\2\2\u01dd\u01df\4\62;\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u0092\3\2"+
		"\2\2\u01e2\u01e3\7\62\2\2\u01e3\u01e7\7z\2\2\u01e4\u01e5\7\62\2\2\u01e5"+
		"\u01e7\7Z\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u0094\3\2"+
		"\2\2\u01e8\u01e9\t\6\2\2\u01e9\u0096\3\2\2\2\u01ea\u01ec\4\62;\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\7\60\2\2\u01f0\u01f2\4\62;\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\5\u0091I\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u020e\3\2\2\2\u01f9\u01fb\7\60"+
		"\2\2\u01fa\u01fc\4\62;\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\5\u0091"+
		"I\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u020e\3\2\2\2\u0202"+
		"\u0204\4\62;\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020e\5\u0091I\2\u0208"+
		"\u020a\4\62;\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u01eb\3\2\2\2\u020d"+
		"\u01f9\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0209\3\2\2\2\u020e\u0098\3\2"+
		"\2\2\u020f\u0212\5\u008fH\2\u0210\u0212\n\3\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u009a\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7v\2\2\u0217"+
		"\u0218\7t\2\2\u0218\u0219\7w\2\2\u0219\u0220\7g\2\2\u021a\u021b\7h\2\2"+
		"\u021b\u021c\7c\2\2\u021c\u021d\7n\2\2\u021d\u021e\7u\2\2\u021e\u0220"+
		"\7g\2\2\u021f\u0216\3\2\2\2\u021f\u021a\3\2\2\2\u0220\u009c\3\2\2\2\u0221"+
		"\u0222\5\u008bF\2\u0222\u009e\3\2\2\2\u0223\u0224\5\u0097L\2\u0224\u00a0"+
		"\3\2\2\2\u0225\u022b\7$\2\2\u0226\u022a\n\7\2\2\u0227\u0228\7^\2\2\u0228"+
		"\u022a\13\2\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3"+
		"\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u022f\7$\2\2\u022f\u00a2\3\2\2\2\u0230\u0234\7)\2"+
		"\2\u0231\u0233\n\b\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\7)\2\2\u0238\u00a4\3\2\2\2\u0239\u023a\7u\2\2\u023a\u023b\7{\2"+
		"\2\u023b\u023c\7u\2\2\u023c\u023e\3\2\2\2\u023d\u023f\t\t\2\2\u023e\u023d"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\5\u0099M\2\u0243\u00a6\3\2\2\2\u0244\u0245"+
		"\7v\2\2\u0245\u0246\7c\2\2\u0246\u0247\7u\2\2\u0247\u0248\7m\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u024b\t\t\2\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\n\n\2\2\u024f\u0250\5\u0099M\2\u0250\u00a8\3\2\2\2\u0251\u0252"+
		"\7\61\2\2\u0252\u0253\7,\2\2\u0253\u0257\3\2\2\2\u0254\u0256\13\2\2\2"+
		"\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0258\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7,\2\2\u025b"+
		"\u025c\7\61\2\2\u025c\u025d\3\2\2\2\u025d\u025e\bU\2\2\u025e\u00aa\3\2"+
		"\2\2\u025f\u0260\7\61\2\2\u0260\u0261\7\61\2\2\u0261\u0265\3\2\2\2\u0262"+
		"\u0264\n\3\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u0269\bV\3\2\u0269\u00ac\3\2\2\2\u026a\u026e\7%\2\2\u026b\u026d\n\3\2"+
		"\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\bW\4\2\u0272"+
		"\u00ae\3\2\2\2\u0273\u0277\t\13\2\2\u0274\u0276\t\f\2\2\u0275\u0274\3"+
		"\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u00b0\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u0282\t\r\2\2\u027b\u027c\7^"+
		"\2\2\u027c\u0282\7\f\2\2\u027d\u027e\7^\2\2\u027e\u027f\7\17\2\2\u027f"+
		"\u0282\7\f\2\2\u0280\u0282\7\16\2\2\u0281\u027a\3\2\2\2\u0281\u027b\3"+
		"\2\2\2\u0281\u027d\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\bY\5\2\u0284\u00b2\3\2\2\2!\2\u01b8\u01bf\u01c5\u01c7\u01d1\u01d7"+
		"\u01db\u01e0\u01e6\u01ed\u01f3\u01f7\u01fd\u0200\u0205\u020b\u020d\u0211"+
		"\u0213\u021f\u0229\u022b\u0234\u0240\u024c\u0257\u0265\u026e\u0277\u0281"+
		"\6\3U\2\3V\3\3W\4\3Y\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}