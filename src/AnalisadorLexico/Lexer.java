/* The following code was generated by JFlex 1.7.0 */

/*Imports*/
package AnalisadorLexico;

import static AnalisadorLexico.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\2\3\1\13\1\30\1\30\1\14\22\0\1\12\1\11\1\4"+
    "\2\11\1\35\1\11\1\5\1\36\1\37\1\10\1\32\1\2\1\33"+
    "\1\11\1\34\12\1\1\27\1\40\1\24\1\26\1\25\2\11\32\7"+
    "\4\11\1\7\1\11\1\16\1\6\1\53\1\20\1\45\1\44\1\6"+
    "\1\51\1\43\2\6\1\46\1\55\1\17\1\21\1\56\1\6\1\22"+
    "\1\47\1\23\1\52\1\54\1\50\3\6\1\41\1\15\1\42\7\11"+
    "\1\31\150\11\u1f3a\0\1\30\1\30\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\4\7\1\12\1\13\1\14\1\1\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\10\7\1\26\1\0\2\7\1\27\1\7\1\30\1\31"+
    "\1\0\1\32\1\33\1\0\1\7\1\34\10\7\1\26"+
    "\1\0\2\35\1\36\1\37\1\7\2\0\1\40\4\7"+
    "\1\41\5\7\1\0\1\2\1\7\1\42\1\7\1\43"+
    "\1\44\1\45\1\46\1\47\1\7\1\50\1\51\1\52"+
    "\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\57\0\57\0\57\0\274"+
    "\0\353\0\57\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205"+
    "\0\57\0\u0234\0\57\0\57\0\57\0\57\0\u0263\0\57"+
    "\0\57\0\57\0\57\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e"+
    "\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\274"+
    "\0\u04c6\0\57\0\57\0\u04f5\0\57\0\57\0\u0524\0\u0553"+
    "\0\274\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\u06fa\0\215\0\57\0\u0439\0\274\0\274\0\u0729"+
    "\0\u0758\0\u0787\0\274\0\u07b6\0\u07e5\0\u0814\0\u0843\0\274"+
    "\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\57\0\u098c"+
    "\0\274\0\u09bb\0\274\0\274\0\274\0\274\0\274\0\u09ea"+
    "\0\u095d\0\274\0\274\0\274";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\2\1\5\1\12\1\5\1\2\1\13\1\14"+
    "\1\10\1\15\1\16\1\10\1\17\1\20\1\21\1\22"+
    "\2\0\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\2\10\1\37\2\10"+
    "\1\40\1\41\1\42\1\43\60\0\1\3\1\44\55\0"+
    "\1\44\56\0\1\10\4\0\2\10\5\0\7\10\17\0"+
    "\14\10\10\0\1\45\47\0\1\10\4\0\2\10\5\0"+
    "\2\10\1\46\4\10\17\0\14\10\1\0\1\10\4\0"+
    "\2\10\5\0\4\10\1\47\2\10\17\0\14\10\1\0"+
    "\1\10\4\0\2\10\5\0\5\10\1\50\1\10\17\0"+
    "\14\10\1\0\1\10\4\0\2\10\5\0\7\10\17\0"+
    "\2\10\1\51\11\10\25\0\1\52\1\53\55\0\1\54"+
    "\1\55\56\0\1\56\63\0\1\57\24\0\1\10\4\0"+
    "\2\10\5\0\2\10\1\60\4\10\17\0\1\10\1\61"+
    "\12\10\1\0\1\10\4\0\2\10\5\0\7\10\17\0"+
    "\3\10\1\62\10\10\1\0\1\10\4\0\2\10\5\0"+
    "\7\10\17\0\3\10\1\63\10\10\1\0\1\10\4\0"+
    "\2\10\5\0\7\10\17\0\6\10\1\64\5\10\1\0"+
    "\1\10\4\0\2\10\5\0\7\10\17\0\6\10\1\65"+
    "\5\10\1\0\1\10\4\0\2\10\5\0\1\10\1\66"+
    "\2\10\1\67\2\10\17\0\14\10\1\0\1\10\4\0"+
    "\2\10\5\0\1\10\1\70\5\10\17\0\14\10\1\0"+
    "\1\10\4\0\2\10\5\0\5\10\1\71\1\10\17\0"+
    "\14\10\1\0\1\72\1\73\55\0\2\45\1\0\7\45"+
    "\2\74\1\75\12\45\1\0\26\45\1\0\1\10\4\0"+
    "\2\10\5\0\3\10\1\76\3\10\17\0\14\10\1\0"+
    "\1\10\4\0\2\10\5\0\6\10\1\77\17\0\14\10"+
    "\1\0\1\10\4\0\2\10\5\0\6\10\1\100\17\0"+
    "\14\10\13\101\2\0\13\101\2\0\25\101\1\0\1\102"+
    "\56\0\1\10\4\0\2\10\5\0\6\10\1\103\17\0"+
    "\14\10\1\0\1\10\4\0\2\10\5\0\4\10\1\104"+
    "\2\10\17\0\14\10\1\0\1\10\4\0\2\10\5\0"+
    "\7\10\17\0\4\10\1\105\7\10\1\0\1\10\4\0"+
    "\2\10\5\0\7\10\17\0\1\106\13\10\1\0\1\10"+
    "\4\0\2\10\5\0\1\10\1\107\5\10\17\0\14\10"+
    "\1\0\1\10\4\0\2\10\5\0\5\10\1\110\1\10"+
    "\17\0\14\10\1\0\1\10\4\0\2\10\5\0\7\10"+
    "\17\0\1\111\13\10\1\0\1\10\4\0\2\10\5\0"+
    "\7\10\17\0\1\112\13\10\1\0\1\10\4\0\2\10"+
    "\5\0\2\10\1\113\1\10\1\114\2\10\17\0\14\10"+
    "\1\0\1\72\1\44\55\0\1\10\4\0\2\10\5\0"+
    "\7\10\17\0\7\10\1\115\4\10\13\101\2\0\7\101"+
    "\1\116\3\101\2\0\25\101\1\0\1\102\35\0\1\117"+
    "\20\0\1\10\4\0\2\10\5\0\1\10\1\120\5\10"+
    "\17\0\14\10\1\0\1\10\4\0\2\10\5\0\7\10"+
    "\17\0\2\10\1\121\11\10\1\0\1\10\4\0\2\10"+
    "\5\0\7\10\17\0\3\10\1\122\10\10\1\0\1\10"+
    "\4\0\2\10\5\0\5\10\1\123\1\10\17\0\14\10"+
    "\1\0\1\10\4\0\2\10\5\0\3\10\1\124\3\10"+
    "\17\0\14\10\1\0\1\10\4\0\2\10\5\0\2\10"+
    "\1\125\4\10\17\0\14\10\1\0\1\10\4\0\2\10"+
    "\5\0\6\10\1\126\17\0\14\10\1\0\1\10\4\0"+
    "\2\10\5\0\7\10\17\0\10\10\1\127\3\10\1\0"+
    "\1\10\4\0\2\10\5\0\5\10\1\130\1\10\17\0"+
    "\14\10\13\101\2\0\7\101\1\131\3\101\2\0\25\101"+
    "\1\0\1\10\4\0\2\10\5\0\6\10\1\132\17\0"+
    "\14\10\1\0\1\10\4\0\2\10\5\0\7\10\17\0"+
    "\2\10\1\133\11\10\1\0\1\10\4\0\2\10\5\0"+
    "\2\10\1\134\4\10\17\0\14\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2585];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\3\11\2\1\1\11\6\1\1\11"+
    "\1\1\4\11\1\1\4\11\11\1\1\0\4\1\2\11"+
    "\1\0\2\11\1\0\13\1\1\0\1\11\4\1\2\0"+
    "\13\1\1\0\1\11\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ERROR;
            } 
            // fall through
          case 44: break;
          case 2: 
            { lexeme=yytext(); return NUMERO;
            } 
            // fall through
          case 45: break;
          case 3: 
            { lexeme = yytext(); return VIRGULA;
            } 
            // fall through
          case 46: break;
          case 4: 
            { /*Ignore*/
            } 
            // fall through
          case 47: break;
          case 5: 
            { lexeme = yytext(); return ASPAS;
            } 
            // fall through
          case 48: break;
          case 6: 
            { lexeme = yytext(); return ASPASIMPLES;
            } 
            // fall through
          case 49: break;
          case 7: 
            { lexeme =yytext(); return ID;
            } 
            // fall through
          case 50: break;
          case 8: 
            { lexeme = yytext(); return OP_MULT;
            } 
            // fall through
          case 51: break;
          case 9: 
            { lexeme = yytext(); return LINHA;
            } 
            // fall through
          case 52: break;
          case 10: 
            { lexeme = yytext(); return OP_MENOR;
            } 
            // fall through
          case 53: break;
          case 11: 
            { lexeme = yytext(); return OP_MAIOR;
            } 
            // fall through
          case 54: break;
          case 12: 
            { lexeme = yytext(); return OP_IGUAL;
            } 
            // fall through
          case 55: break;
          case 13: 
            { lexeme = yytext(); return OP_ADD;
            } 
            // fall through
          case 56: break;
          case 14: 
            { lexeme = yytext(); return OP_SUB;
            } 
            // fall through
          case 57: break;
          case 15: 
            { lexeme = yytext(); return OP_DIV;
            } 
            // fall through
          case 58: break;
          case 16: 
            { lexeme = yytext(); return OP_PERCENT;
            } 
            // fall through
          case 59: break;
          case 17: 
            { lexeme = yytext(); return PAR_ESQ;
            } 
            // fall through
          case 60: break;
          case 18: 
            { lexeme = yytext(); return PAR_DIR;
            } 
            // fall through
          case 61: break;
          case 19: 
            { lexeme = yytext(); return PR_PTVIRGULA;
            } 
            // fall through
          case 62: break;
          case 20: 
            { lexeme = yytext(); return CHAVE_ESQ;
            } 
            // fall through
          case 63: break;
          case 21: 
            { lexeme = yytext(); return CHAVE_DIR;
            } 
            // fall through
          case 64: break;
          case 22: 
            { lexeme = yytext(); return NUMERO_DECIMAL;
            } 
            // fall through
          case 65: break;
          case 23: 
            { lexeme = yytext(); return OP_LOGICO_OR;
            } 
            // fall through
          case 66: break;
          case 24: 
            { lexeme = yytext(); return OP_DIFERENTE;
            } 
            // fall through
          case 67: break;
          case 25: 
            { lexeme = yytext(); return OP_MENORIGUAL;
            } 
            // fall through
          case 68: break;
          case 26: 
            { lexeme = yytext(); return OP_MAIORIGUAL;
            } 
            // fall through
          case 69: break;
          case 27: 
            { lexeme = yytext(); return OP_ATRIBUICAO;
            } 
            // fall through
          case 70: break;
          case 28: 
            { lexeme = yytext(); return PR_IF;
            } 
            // fall through
          case 71: break;
          case 29: 
            { lexeme = yytext(); return COMENTARIO_SIMPLES;
            } 
            // fall through
          case 72: break;
          case 30: 
            { lexeme = yytext(); return OP_LOGICO_AND;
            } 
            // fall through
          case 73: break;
          case 31: 
            { lexeme = yytext(); return OP_LOGICO_NOT;
            } 
            // fall through
          case 74: break;
          case 32: 
            { lexeme = yytext(); return PR_INT;
            } 
            // fall through
          case 75: break;
          case 33: 
            { lexeme = yytext(); return PR_VAR;
            } 
            // fall through
          case 76: break;
          case 34: 
            { lexeme = yytext(); return PR_ELSE;
            } 
            // fall through
          case 77: break;
          case 35: 
            { lexeme = yytext(); return PR_CHAR;
            } 
            // fall through
          case 78: break;
          case 36: 
            { lexeme = yytext(); return PR_VOID;
            } 
            // fall through
          case 79: break;
          case 37: 
            { lexeme = yytext(); return PR_MAIN;
            } 
            // fall through
          case 80: break;
          case 38: 
            { lexeme = yytext(); return PR_PRNT;
            } 
            // fall through
          case 81: break;
          case 39: 
            { lexeme = yytext(); return PR_PROC;
            } 
            // fall through
          case 82: break;
          case 40: 
            { lexeme = yytext(); return COMENTARIO;
            } 
            // fall through
          case 83: break;
          case 41: 
            { lexeme = yytext(); return PR_FLOAT;
            } 
            // fall through
          case 84: break;
          case 42: 
            { lexeme = yytext(); return PR_WHILE;
            } 
            // fall through
          case 85: break;
          case 43: 
            { lexeme = yytext(); return PR_RETURN;
            } 
            // fall through
          case 86: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
