/* Generated By:JavaCC: Do not edit this line. TrabalhoLexico.java */
    public class TrabalhoLexico implements TrabalhoLexicoConstants {
        public static void main(String[] args){
            try{
                new TrabalhoLexico(new java.io.FileInputStream(args[0])).Start();
            } catch (java.io.FileNotFoundException ex) {
                System.out.println("Arquivo " + args[0] + " nao foi encontrado");
                System.exit(-1);
            }catch (ParseException ex) {
                System.out.println(ex.getMessage());
                System.exit(-1);
            } catch (TokenMgrError ex) {
                System.out.println(ex.getMessage());
                System.exit(-1);
            }
        }

//TOKEN: { <INTEGER: (<DIGIT>)+> }

/* Início */
  static final public void Start() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
    case ELSEDEF:
    case IF:
    case IFDEF:
    case ELSIF:
    case ELSIFDEF:
    case WHILE:
    case BREAK:
    case RETURN:
    case FOR:
    case FUNCTION:
    case TYPE:
    case PROCEDURE:
    case GLOBAL:
    case PUBLIC:
    case EXPORT:
    case OVERRIDE:
    case ATOM:
    case INTEGER:
    case SEQUENCE:
    case OBJECT:
    case NAMESPACE:
    case CONSTANT:
    case ENUM:
    case BY:
    case SWITCH:
    case DO:
    case THEN:
    case CASE:
    case CONTINUE:
    case RETRY:
    case EXIT:
    case TO:
    case WITH:
    case WITHOUT:
    case PROFILE:
    case PROFILE_TIME:
    case TRACE:
    case BATCH:
    case TYPE_CHECK:
    case INDIRECT_INCLUDES:
    case INLINE:
    case WARNING:
    case SAVE:
    case RESTORE:
    case STRICT:
    case FALLTHRU:
    case ENTRY:
    case LOOP:
    case GOTO:
    case NOT:
    case AND:
    case OR:
    case XOR:
    case INCLUDE:
    case AS:
    case LABEL:
    case COMMA:
    case SEMICOLON:
    case LPAREN:
    case RPAREN:
    case LCHAVE:
    case RCHAVE:
    case LCOLCH:
    case RCOLCH:
    case NEWLINE:
    case INDENT:
    case MUL_OP:
    case ADD_OP:
    case ASSIGN_OP:
    case REL_OP:
    case EQUAL_SIGN:
    case USCORE:
    case CHAR:
    case ESCCHAR:
    case NUMBER:
    case STRING:
    case IDENTIFIER:
    case ATOMINTEGER:
    case ATOMREAL:
      Read();
      break;
    case 0:
      jj_consume_token(0);
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Read() throws ParseException, TokenMgrError, ParseException {
    Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      t = jj_consume_token(ELSE);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctELSE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ELSEDEF:
      t = jj_consume_token(ELSEDEF);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctELSEDEF\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case IF:
      t = jj_consume_token(IF);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctIF\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case IFDEF:
      t = jj_consume_token(IFDEF);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctIFDEF\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ELSIF:
      t = jj_consume_token(ELSIF);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctELSIF\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ELSIFDEF:
      t = jj_consume_token(ELSIFDEF);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctELSIFDEF\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case WHILE:
      t = jj_consume_token(WHILE);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctWHILE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case BREAK:
      t = jj_consume_token(BREAK);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctBREAK\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RETURN:
      t = jj_consume_token(RETURN);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRETURN\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case FOR:
      t = jj_consume_token(FOR);
             System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctFOR\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case FUNCTION:
      t = jj_consume_token(FUNCTION);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctFUNCTION\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case TYPE:
      t = jj_consume_token(TYPE);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctTYPE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case PROCEDURE:
      t = jj_consume_token(PROCEDURE);
                   System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctPROCEDURE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case GLOBAL:
      t = jj_consume_token(GLOBAL);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctGLOBAL\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case PUBLIC:
      t = jj_consume_token(PUBLIC);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctPUBLIC\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case EXPORT:
      t = jj_consume_token(EXPORT);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctEXPORT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case OVERRIDE:
      t = jj_consume_token(OVERRIDE);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctOVERRIDE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ATOM:
      t = jj_consume_token(ATOM);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctATOM\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case INTEGER:
      t = jj_consume_token(INTEGER);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctINTEGER\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case SEQUENCE:
      t = jj_consume_token(SEQUENCE);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSEQUENCE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case OBJECT:
      t = jj_consume_token(OBJECT);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctOBJECT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case NAMESPACE:
      t = jj_consume_token(NAMESPACE);
                   System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctNAMESPACE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case CONSTANT:
      t = jj_consume_token(CONSTANT);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctCONSTANT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ENUM:
      t = jj_consume_token(ENUM);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctENUM\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case BY:
      t = jj_consume_token(BY);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctBY\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case SWITCH:
      t = jj_consume_token(SWITCH);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSWITCH\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case DO:
      t = jj_consume_token(DO);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctDO\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case THEN:
      t = jj_consume_token(THEN);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctTHEN\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case CASE:
      t = jj_consume_token(CASE);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctCASE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case CONTINUE:
      t = jj_consume_token(CONTINUE);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctCONTINUE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RETRY:
      t = jj_consume_token(RETRY);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRETRY\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case EXIT:
      t = jj_consume_token(EXIT);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctEXIT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case TO:
      t = jj_consume_token(TO);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctTO\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case WITH:
      t = jj_consume_token(WITH);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctWITH\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case WITHOUT:
      t = jj_consume_token(WITHOUT);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctWITHOUT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case PROFILE:
      t = jj_consume_token(PROFILE);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctPROFILE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case PROFILE_TIME:
      t = jj_consume_token(PROFILE_TIME);
                      System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctPROFILE_TIME\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case TRACE:
      t = jj_consume_token(TRACE);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctTRACE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case BATCH:
      t = jj_consume_token(BATCH);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctBATCH\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case TYPE_CHECK:
      t = jj_consume_token(TYPE_CHECK);
                    System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctTYPE_CHECK\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case INDIRECT_INCLUDES:
      t = jj_consume_token(INDIRECT_INCLUDES);
                           System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctINDIRECT_INCLUDES\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case INLINE:
      t = jj_consume_token(INLINE);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctINLINE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case WARNING:
      t = jj_consume_token(WARNING);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctWARNING\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case SAVE:
      t = jj_consume_token(SAVE);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSAVE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RESTORE:
      t = jj_consume_token(RESTORE);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRESTORE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case STRICT:
      t = jj_consume_token(STRICT);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSTRICT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case FALLTHRU:
      t = jj_consume_token(FALLTHRU);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctFALLTHRU\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ENTRY:
      t = jj_consume_token(ENTRY);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctENTRY\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case LOOP:
      t = jj_consume_token(LOOP);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctLOOP\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case GOTO:
      t = jj_consume_token(GOTO);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctGOTO\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case NOT:
      t = jj_consume_token(NOT);
             System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctNOT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case AND:
      t = jj_consume_token(AND);
             System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctAND\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case OR:
      t = jj_consume_token(OR);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctOR\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case XOR:
      t = jj_consume_token(XOR);
             System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctXOR\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case INCLUDE:
      t = jj_consume_token(INCLUDE);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctINCLUDE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case AS:
      t = jj_consume_token(AS);
            System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctAS\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case LABEL:
      t = jj_consume_token(LABEL);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctLABEL\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case COMMA:
      t = jj_consume_token(COMMA);
               System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctCOMMA\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case SEMICOLON:
      t = jj_consume_token(SEMICOLON);
                   System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSEMICOLON\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case LPAREN:
      t = jj_consume_token(LPAREN);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctLPAREN\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RPAREN:
      t = jj_consume_token(RPAREN);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRPAREN\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case LCHAVE:
      t = jj_consume_token(LCHAVE);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctLCHAVE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RCHAVE:
      t = jj_consume_token(RCHAVE);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRCHAVE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case LCOLCH:
      t = jj_consume_token(LCOLCH);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctLCOLCH\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case RCOLCH:
      t = jj_consume_token(RCOLCH);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctRCOLCH\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case NEWLINE:
      t = jj_consume_token(NEWLINE);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctNEWLINE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case INDENT:
      t = jj_consume_token(INDENT);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctINDENT\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case MUL_OP:
      t = jj_consume_token(MUL_OP);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctMUL_OP\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ADD_OP:
      t = jj_consume_token(ADD_OP);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctADD_OP\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ASSIGN_OP:
      t = jj_consume_token(ASSIGN_OP);
                   System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctASSIGN_OP\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case REL_OP:
      t = jj_consume_token(REL_OP);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctREL_OP\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case EQUAL_SIGN:
      t = jj_consume_token(EQUAL_SIGN);
                    System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctEQUAL_SIGN\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case USCORE:
      t = jj_consume_token(USCORE);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctUSCORE\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case CHAR:
      t = jj_consume_token(CHAR);
              System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctCHAR\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ESCCHAR:
      t = jj_consume_token(ESCCHAR);
                 System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctESCCHAR\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case NUMBER:
      t = jj_consume_token(NUMBER);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctNUMBER\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case IDENTIFIER:
      t = jj_consume_token(IDENTIFIER);
                    System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctIDENTIFIER\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case STRING:
      t = jj_consume_token(STRING);
                System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctSTRING\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ATOMINTEGER:
      t = jj_consume_token(ATOMINTEGER);
                     System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctATOMINTEGER\u005ct\u005ct - "+t.toString());
      Start();
      break;
    case ATOMREAL:
      t = jj_consume_token(ATOMREAL);
                  System.out.println("@("+t.beginLine+","+t.beginColumn+")\u005ctATOMREAL\u005ct\u005ct - "+t.toString());
      Start();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public TrabalhoLexicoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xffffffe1,0xffffffe0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xffffffff,0xffffffff,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x7f9fff,0x7f9fff,};
   }

  /** Constructor with InputStream. */
  public TrabalhoLexico(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public TrabalhoLexico(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new TrabalhoLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public TrabalhoLexico(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new TrabalhoLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public TrabalhoLexico(TrabalhoLexicoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TrabalhoLexicoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[87];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 87; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

    }
