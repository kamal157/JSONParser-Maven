// $ANTLR 3.5.2 JSONLexer.g 2020-01-28 19:57:19

	package com.cliffy.POC.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JSONLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BOOLEAN_OPTIONS=4;
	public static final int COLON=5;
	public static final int ESC=6;
	public static final int EXP=7;
	public static final int FBRACE_CLOSE=8;
	public static final int FBRACE_OPEN=9;
	public static final int HEX=10;
	public static final int INT=11;
	public static final int JSON_ARRAY=12;
	public static final int JSON_OBJECT=13;
	public static final int KEY=14;
	public static final int KEY_VALUE_PAIR=15;
	public static final int NULL_TEXT=16;
	public static final int NUMBER=17;
	public static final int SBRACE_CLOSE=18;
	public static final int SBRACE_OPEN=19;
	public static final int SEP=20;
	public static final int STRING=21;
	public static final int UNICODE=22;
	public static final int VALUE=23;
	public static final int WS=24;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JSONLexer() {} 
	public JSONLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JSONLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "JSONLexer.g"; }

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:20:2: ( ( '-' )? INT | ( '-' )? INT EXP | ( '-' )? INT '.' ( '0' .. '9' )+ ( EXP )? )
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// JSONLexer.g:20:5: ( '-' )? INT
					{
					// JSONLexer.g:20:5: ( '-' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='-') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// JSONLexer.g:20:5: '-'
							{
							match('-'); 
							}
							break;

					}

					mINT(); 

					}
					break;
				case 2 :
					// JSONLexer.g:21:5: ( '-' )? INT EXP
					{
					// JSONLexer.g:21:5: ( '-' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='-') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// JSONLexer.g:21:5: '-'
							{
							match('-'); 
							}
							break;

					}

					mINT(); 

					mEXP(); 

					}
					break;
				case 3 :
					// JSONLexer.g:22:5: ( '-' )? INT '.' ( '0' .. '9' )+ ( EXP )?
					{
					// JSONLexer.g:22:5: ( '-' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='-') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// JSONLexer.g:22:5: '-'
							{
							match('-'); 
							}
							break;

					}

					mINT(); 

					match('.'); 
					// JSONLexer.g:22:18: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// JSONLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// JSONLexer.g:22:30: ( EXP )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// JSONLexer.g:22:30: EXP
							{
							mEXP(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			// JSONLexer.g:24:14: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='0') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// JSONLexer.g:24:18: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// JSONLexer.g:24:24: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// JSONLexer.g:24:34: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// JSONLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "UNICODE"
	public final void mUNICODE() throws RecognitionException {
		try {
			int _type = UNICODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:26:9: ( HEX HEX HEX HEX )
			// JSONLexer.g:26:12: HEX HEX HEX HEX
			{
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			// JSONLexer.g:27:14: ( ( ( '0' .. '9' ) ( 'a' .. 'f' ) ( 'A' .. 'F' ) ) )
			// JSONLexer.g:27:16: ( ( '0' .. '9' ) ( 'a' .. 'f' ) ( 'A' .. 'F' ) )
			{
			// JSONLexer.g:27:16: ( ( '0' .. '9' ) ( 'a' .. 'f' ) ( 'A' .. 'F' ) )
			// JSONLexer.g:27:17: ( '0' .. '9' ) ( 'a' .. 'f' ) ( 'A' .. 'F' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:29:8: ( '\"' ( ESC |~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
			// JSONLexer.g:29:11: '\"' ( ESC |~ ( '\"' | '\\n' | '\\r' ) )* '\"'
			{
			match('\"'); 
			// JSONLexer.g:29:15: ( ESC |~ ( '\"' | '\\n' | '\\r' ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					int LA9_2 = input.LA(2);
					if ( ((LA9_2 >= '0' && LA9_2 <= '9')) ) {
						int LA9_4 = input.LA(3);
						if ( ((LA9_4 >= 'a' && LA9_4 <= 'f')) ) {
							int LA9_5 = input.LA(4);
							if ( ((LA9_5 >= 'A' && LA9_5 <= 'F')) ) {
								int LA9_6 = input.LA(5);
								if ( ((LA9_6 >= '0' && LA9_6 <= '9')) ) {
									int LA9_7 = input.LA(6);
									if ( ((LA9_7 >= 'a' && LA9_7 <= 'f')) ) {
										int LA9_8 = input.LA(7);
										if ( ((LA9_8 >= 'A' && LA9_8 <= 'F')) ) {
											int LA9_9 = input.LA(8);
											if ( ((LA9_9 >= '0' && LA9_9 <= '9')) ) {
												int LA9_10 = input.LA(9);
												if ( ((LA9_10 >= 'a' && LA9_10 <= 'f')) ) {
													int LA9_11 = input.LA(10);
													if ( ((LA9_11 >= 'A' && LA9_11 <= 'F')) ) {
														int LA9_12 = input.LA(11);
														if ( ((LA9_12 >= '0' && LA9_12 <= '9')) ) {
															int LA9_13 = input.LA(12);
															if ( ((LA9_13 >= 'a' && LA9_13 <= 'f')) ) {
																int LA9_14 = input.LA(13);
																if ( ((LA9_14 >= 'A' && LA9_14 <= 'F')) ) {
																	alt9=1;
																}
																else if ( ((LA9_14 >= '\u0000' && LA9_14 <= '\t')||(LA9_14 >= '\u000B' && LA9_14 <= '\f')||(LA9_14 >= '\u000E' && LA9_14 <= '@')||(LA9_14 >= 'G' && LA9_14 <= '\uFFFF')) ) {
																	alt9=2;
																}

															}
															else if ( ((LA9_13 >= '\u0000' && LA9_13 <= '\t')||(LA9_13 >= '\u000B' && LA9_13 <= '\f')||(LA9_13 >= '\u000E' && LA9_13 <= '`')||(LA9_13 >= 'g' && LA9_13 <= '\uFFFF')) ) {
																alt9=2;
															}

														}
														else if ( ((LA9_12 >= '\u0000' && LA9_12 <= '\t')||(LA9_12 >= '\u000B' && LA9_12 <= '\f')||(LA9_12 >= '\u000E' && LA9_12 <= '/')||(LA9_12 >= ':' && LA9_12 <= '\uFFFF')) ) {
															alt9=2;
														}

													}
													else if ( ((LA9_11 >= '\u0000' && LA9_11 <= '\t')||(LA9_11 >= '\u000B' && LA9_11 <= '\f')||(LA9_11 >= '\u000E' && LA9_11 <= '@')||(LA9_11 >= 'G' && LA9_11 <= '\uFFFF')) ) {
														alt9=2;
													}

												}
												else if ( ((LA9_10 >= '\u0000' && LA9_10 <= '\t')||(LA9_10 >= '\u000B' && LA9_10 <= '\f')||(LA9_10 >= '\u000E' && LA9_10 <= '`')||(LA9_10 >= 'g' && LA9_10 <= '\uFFFF')) ) {
													alt9=2;
												}

											}
											else if ( ((LA9_9 >= '\u0000' && LA9_9 <= '\t')||(LA9_9 >= '\u000B' && LA9_9 <= '\f')||(LA9_9 >= '\u000E' && LA9_9 <= '/')||(LA9_9 >= ':' && LA9_9 <= '\uFFFF')) ) {
												alt9=2;
											}

										}
										else if ( ((LA9_8 >= '\u0000' && LA9_8 <= '\t')||(LA9_8 >= '\u000B' && LA9_8 <= '\f')||(LA9_8 >= '\u000E' && LA9_8 <= '@')||(LA9_8 >= 'G' && LA9_8 <= '\uFFFF')) ) {
											alt9=2;
										}

									}
									else if ( ((LA9_7 >= '\u0000' && LA9_7 <= '\t')||(LA9_7 >= '\u000B' && LA9_7 <= '\f')||(LA9_7 >= '\u000E' && LA9_7 <= '`')||(LA9_7 >= 'g' && LA9_7 <= '\uFFFF')) ) {
										alt9=2;
									}

								}
								else if ( ((LA9_6 >= '\u0000' && LA9_6 <= '\t')||(LA9_6 >= '\u000B' && LA9_6 <= '\f')||(LA9_6 >= '\u000E' && LA9_6 <= '/')||(LA9_6 >= ':' && LA9_6 <= '\uFFFF')) ) {
									alt9=2;
								}

							}
							else if ( ((LA9_5 >= '\u0000' && LA9_5 <= '\t')||(LA9_5 >= '\u000B' && LA9_5 <= '\f')||(LA9_5 >= '\u000E' && LA9_5 <= '@')||(LA9_5 >= 'G' && LA9_5 <= '\uFFFF')) ) {
								alt9=2;
							}

						}
						else if ( ((LA9_4 >= '\u0000' && LA9_4 <= '\t')||(LA9_4 >= '\u000B' && LA9_4 <= '\f')||(LA9_4 >= '\u000E' && LA9_4 <= '`')||(LA9_4 >= 'g' && LA9_4 <= '\uFFFF')) ) {
							alt9=2;
						}

					}
					else if ( ((LA9_2 >= '\u0000' && LA9_2 <= '\t')||(LA9_2 >= '\u000B' && LA9_2 <= '\f')||(LA9_2 >= '\u000E' && LA9_2 <= '/')||(LA9_2 >= ':' && LA9_2 <= '\uFFFF')) ) {
						alt9=2;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// JSONLexer.g:29:16: ESC
					{
					mESC(); 

					}
					break;
				case 2 :
					// JSONLexer.g:29:22: ~ ( '\"' | '\\n' | '\\r' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			int _type = ESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:30:5: ( '\\\\' ( UNICODE ) )
			// JSONLexer.g:30:9: '\\\\' ( UNICODE )
			{
			match('\\'); 
			// JSONLexer.g:30:14: ( UNICODE )
			// JSONLexer.g:30:15: UNICODE
			{
			mUNICODE(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:33:5: ( ( 'e' ( '+' | '-' )? INT ) )
			// JSONLexer.g:33:8: ( 'e' ( '+' | '-' )? INT )
			{
			// JSONLexer.g:33:8: ( 'e' ( '+' | '-' )? INT )
			// JSONLexer.g:33:9: 'e' ( '+' | '-' )? INT
			{
			match('e'); 
			// JSONLexer.g:33:13: ( '+' | '-' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='+'||LA10_0=='-') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// JSONLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:34:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// JSONLexer.g:34:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// JSONLexer.g:34:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// JSONLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "FBRACE_OPEN"
	public final void mFBRACE_OPEN() throws RecognitionException {
		try {
			int _type = FBRACE_OPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:36:13: ( '{' )
			// JSONLexer.g:36:15: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FBRACE_OPEN"

	// $ANTLR start "FBRACE_CLOSE"
	public final void mFBRACE_CLOSE() throws RecognitionException {
		try {
			int _type = FBRACE_CLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:37:14: ( '}' )
			// JSONLexer.g:37:16: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FBRACE_CLOSE"

	// $ANTLR start "SBRACE_OPEN"
	public final void mSBRACE_OPEN() throws RecognitionException {
		try {
			int _type = SBRACE_OPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:38:13: ( '[' )
			// JSONLexer.g:38:15: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SBRACE_OPEN"

	// $ANTLR start "SBRACE_CLOSE"
	public final void mSBRACE_CLOSE() throws RecognitionException {
		try {
			int _type = SBRACE_CLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:39:14: ( ']' )
			// JSONLexer.g:39:16: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SBRACE_CLOSE"

	// $ANTLR start "BOOLEAN_OPTIONS"
	public final void mBOOLEAN_OPTIONS() throws RecognitionException {
		try {
			int _type = BOOLEAN_OPTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:40:17: ( 'true' | 'false' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='t') ) {
				alt12=1;
			}
			else if ( (LA12_0=='f') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// JSONLexer.g:40:18: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// JSONLexer.g:40:25: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_OPTIONS"

	// $ANTLR start "NULL_TEXT"
	public final void mNULL_TEXT() throws RecognitionException {
		try {
			int _type = NULL_TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:41:10: ( 'null' )
			// JSONLexer.g:41:11: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL_TEXT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:42:7: ( ':' )
			// JSONLexer.g:42:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEP"
	public final void mSEP() throws RecognitionException {
		try {
			int _type = SEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JSONLexer.g:43:5: ( ',' )
			// JSONLexer.g:43:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEP"

	@Override
	public void mTokens() throws RecognitionException {
		// JSONLexer.g:1:8: ( NUMBER | UNICODE | STRING | ESC | EXP | WS | FBRACE_OPEN | FBRACE_CLOSE | SBRACE_OPEN | SBRACE_CLOSE | BOOLEAN_OPTIONS | NULL_TEXT | COLON | SEP )
		int alt13=14;
		switch ( input.LA(1) ) {
		case '-':
			{
			alt13=1;
			}
			break;
		case '0':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA13_16 = input.LA(3);
				if ( ((LA13_16 >= 'A' && LA13_16 <= 'F')) ) {
					alt13=2;
				}
				else if ( (LA13_16=='+'||LA13_16=='-'||(LA13_16 >= '0' && LA13_16 <= '9')) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'f':
				{
				alt13=2;
				}
				break;
			default:
				alt13=1;
			}
			}
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA13_16 = input.LA(3);
				if ( ((LA13_16 >= 'A' && LA13_16 <= 'F')) ) {
					alt13=2;
				}
				else if ( (LA13_16=='+'||LA13_16=='-'||(LA13_16 >= '0' && LA13_16 <= '9')) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'f':
				{
				alt13=2;
				}
				break;
			default:
				alt13=1;
			}
			}
			break;
		case '\"':
			{
			alt13=3;
			}
			break;
		case '\\':
			{
			alt13=4;
			}
			break;
		case 'e':
			{
			alt13=5;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt13=6;
			}
			break;
		case '{':
			{
			alt13=7;
			}
			break;
		case '}':
			{
			alt13=8;
			}
			break;
		case '[':
			{
			alt13=9;
			}
			break;
		case ']':
			{
			alt13=10;
			}
			break;
		case 'f':
		case 't':
			{
			alt13=11;
			}
			break;
		case 'n':
			{
			alt13=12;
			}
			break;
		case ':':
			{
			alt13=13;
			}
			break;
		case ',':
			{
			alt13=14;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 13, 0, input);
			throw nvae;
		}
		switch (alt13) {
			case 1 :
				// JSONLexer.g:1:10: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 2 :
				// JSONLexer.g:1:17: UNICODE
				{
				mUNICODE(); 

				}
				break;
			case 3 :
				// JSONLexer.g:1:25: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// JSONLexer.g:1:32: ESC
				{
				mESC(); 

				}
				break;
			case 5 :
				// JSONLexer.g:1:36: EXP
				{
				mEXP(); 

				}
				break;
			case 6 :
				// JSONLexer.g:1:40: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// JSONLexer.g:1:43: FBRACE_OPEN
				{
				mFBRACE_OPEN(); 

				}
				break;
			case 8 :
				// JSONLexer.g:1:55: FBRACE_CLOSE
				{
				mFBRACE_CLOSE(); 

				}
				break;
			case 9 :
				// JSONLexer.g:1:68: SBRACE_OPEN
				{
				mSBRACE_OPEN(); 

				}
				break;
			case 10 :
				// JSONLexer.g:1:80: SBRACE_CLOSE
				{
				mSBRACE_CLOSE(); 

				}
				break;
			case 11 :
				// JSONLexer.g:1:93: BOOLEAN_OPTIONS
				{
				mBOOLEAN_OPTIONS(); 

				}
				break;
			case 12 :
				// JSONLexer.g:1:109: NULL_TEXT
				{
				mNULL_TEXT(); 

				}
				break;
			case 13 :
				// JSONLexer.g:1:119: COLON
				{
				mCOLON(); 

				}
				break;
			case 14 :
				// JSONLexer.g:1:125: SEP
				{
				mSEP(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\2\uffff\2\4\3\uffff\1\4";
	static final String DFA6_eofS =
		"\10\uffff";
	static final String DFA6_minS =
		"\1\55\1\60\2\56\3\uffff\1\56";
	static final String DFA6_maxS =
		"\2\71\2\145\3\uffff\1\145";
	static final String DFA6_acceptS =
		"\4\uffff\1\1\1\2\1\3\1\uffff";
	static final String DFA6_specialS =
		"\10\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\2\uffff\1\2\11\3",
			"\1\2\11\3",
			"\1\6\66\uffff\1\5",
			"\1\6\1\uffff\12\7\53\uffff\1\5",
			"",
			"",
			"",
			"\1\6\1\uffff\12\7\53\uffff\1\5"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "19:1: NUMBER : ( ( '-' )? INT | ( '-' )? INT EXP | ( '-' )? INT '.' ( '0' .. '9' )+ ( EXP )? );";
		}
	}

}
