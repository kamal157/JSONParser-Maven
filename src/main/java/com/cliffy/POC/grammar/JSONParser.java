// $ANTLR 3.5.2 JSONParser.g 2020-01-28 19:57:19

	package com.cliffy.POC.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JSONParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN_OPTIONS", "COLON", "ESC", 
		"EXP", "FBRACE_CLOSE", "FBRACE_OPEN", "HEX", "INT", "JSON_ARRAY", "JSON_OBJECT", 
		"KEY", "KEY_VALUE_PAIR", "NULL_TEXT", "NUMBER", "SBRACE_CLOSE", "SBRACE_OPEN", 
		"SEP", "STRING", "UNICODE", "VALUE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JSONParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JSONParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JSONParser.tokenNames; }
	@Override public String getGrammarFileName() { return "JSONParser.g"; }


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// JSONParser.g:18:10: fragment value : ( NUMBER | STRING | object | array | BOOLEAN_OPTIONS | NULL_TEXT );
	public final JSONParser.value_return value() throws RecognitionException {
		JSONParser.value_return retval = new JSONParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUMBER1=null;
		Token STRING2=null;
		Token BOOLEAN_OPTIONS5=null;
		Token NULL_TEXT6=null;
		ParserRuleReturnScope object3 =null;
		ParserRuleReturnScope array4 =null;

		CommonTree NUMBER1_tree=null;
		CommonTree STRING2_tree=null;
		CommonTree BOOLEAN_OPTIONS5_tree=null;
		CommonTree NULL_TEXT6_tree=null;

		try {
			// JSONParser.g:19:2: ( NUMBER | STRING | object | array | BOOLEAN_OPTIONS | NULL_TEXT )
			int alt1=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt1=1;
				}
				break;
			case STRING:
				{
				alt1=2;
				}
				break;
			case FBRACE_OPEN:
				{
				alt1=3;
				}
				break;
			case SBRACE_OPEN:
				{
				alt1=4;
				}
				break;
			case BOOLEAN_OPTIONS:
				{
				alt1=5;
				}
				break;
			case NULL_TEXT:
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// JSONParser.g:19:6: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					NUMBER1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value67); 
					NUMBER1_tree = (CommonTree)adaptor.create(NUMBER1);
					adaptor.addChild(root_0, NUMBER1_tree);

					}
					break;
				case 2 :
					// JSONParser.g:20:6: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_value74); 
					STRING2_tree = (CommonTree)adaptor.create(STRING2);
					adaptor.addChild(root_0, STRING2_tree);

					}
					break;
				case 3 :
					// JSONParser.g:21:6: object
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_object_in_value81);
					object3=object();
					state._fsp--;

					adaptor.addChild(root_0, object3.getTree());

					}
					break;
				case 4 :
					// JSONParser.g:22:6: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_value90);
					array4=array();
					state._fsp--;

					adaptor.addChild(root_0, array4.getTree());

					}
					break;
				case 5 :
					// JSONParser.g:23:6: BOOLEAN_OPTIONS
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN_OPTIONS5=(Token)match(input,BOOLEAN_OPTIONS,FOLLOW_BOOLEAN_OPTIONS_in_value100); 
					BOOLEAN_OPTIONS5_tree = (CommonTree)adaptor.create(BOOLEAN_OPTIONS5);
					adaptor.addChild(root_0, BOOLEAN_OPTIONS5_tree);

					}
					break;
				case 6 :
					// JSONParser.g:24:6: NULL_TEXT
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL_TEXT6=(Token)match(input,NULL_TEXT,FOLLOW_NULL_TEXT_in_value108); 
					NULL_TEXT6_tree = (CommonTree)adaptor.create(NULL_TEXT6);
					adaptor.addChild(root_0, NULL_TEXT6_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class pair_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pair"
	// JSONParser.g:27:10: fragment pair : key= STRING COLON val= value -> ^( KEY_VALUE_PAIR ^( KEY $key) ^( VALUE $val) ) ;
	public final JSONParser.pair_return pair() throws RecognitionException {
		JSONParser.pair_return retval = new JSONParser.pair_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token key=null;
		Token COLON7=null;
		ParserRuleReturnScope val =null;

		CommonTree key_tree=null;
		CommonTree COLON7_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// JSONParser.g:27:14: (key= STRING COLON val= value -> ^( KEY_VALUE_PAIR ^( KEY $key) ^( VALUE $val) ) )
			// JSONParser.g:27:18: key= STRING COLON val= value
			{
			key=(Token)match(input,STRING,FOLLOW_STRING_in_pair123);  
			stream_STRING.add(key);

			COLON7=(Token)match(input,COLON,FOLLOW_COLON_in_pair125);  
			stream_COLON.add(COLON7);

			pushFollow(FOLLOW_value_in_pair129);
			val=value();
			state._fsp--;

			stream_value.add(val.getTree());
			// AST REWRITE
			// elements: val, key
			// token labels: key
			// rule labels: val, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_key=new RewriteRuleTokenStream(adaptor,"token key",key);
			RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 27:46: -> ^( KEY_VALUE_PAIR ^( KEY $key) ^( VALUE $val) )
			{
				// JSONParser.g:27:49: ^( KEY_VALUE_PAIR ^( KEY $key) ^( VALUE $val) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY_VALUE_PAIR, "KEY_VALUE_PAIR"), root_1);
				// JSONParser.g:27:66: ^( KEY $key)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEY, "KEY"), root_2);
				adaptor.addChild(root_2, stream_key.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// JSONParser.g:27:78: ^( VALUE $val)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_2);
				adaptor.addChild(root_2, stream_val.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair"


	public static class object_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "object"
	// JSONParser.g:28:10: fragment object : FBRACE_OPEN (each+= pair )? ( SEP each+= pair )* FBRACE_CLOSE -> ^( JSON_OBJECT ( $each)* ) ;
	public final JSONParser.object_return object() throws RecognitionException {
		JSONParser.object_return retval = new JSONParser.object_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FBRACE_OPEN8=null;
		Token SEP9=null;
		Token FBRACE_CLOSE10=null;
		List<Object> list_each=null;
		RuleReturnScope each = null;
		CommonTree FBRACE_OPEN8_tree=null;
		CommonTree SEP9_tree=null;
		CommonTree FBRACE_CLOSE10_tree=null;
		RewriteRuleTokenStream stream_FBRACE_OPEN=new RewriteRuleTokenStream(adaptor,"token FBRACE_OPEN");
		RewriteRuleTokenStream stream_FBRACE_CLOSE=new RewriteRuleTokenStream(adaptor,"token FBRACE_CLOSE");
		RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
		RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");

		try {
			// JSONParser.g:28:17: ( FBRACE_OPEN (each+= pair )? ( SEP each+= pair )* FBRACE_CLOSE -> ^( JSON_OBJECT ( $each)* ) )
			// JSONParser.g:28:19: FBRACE_OPEN (each+= pair )? ( SEP each+= pair )* FBRACE_CLOSE
			{
			FBRACE_OPEN8=(Token)match(input,FBRACE_OPEN,FOLLOW_FBRACE_OPEN_in_object159);  
			stream_FBRACE_OPEN.add(FBRACE_OPEN8);

			// JSONParser.g:28:35: (each+= pair )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// JSONParser.g:28:35: each+= pair
					{
					pushFollow(FOLLOW_pair_in_object163);
					each=pair();
					state._fsp--;

					stream_pair.add(each.getTree());
					if (list_each==null) list_each=new ArrayList<Object>();
					list_each.add(each.getTree());
					}
					break;

			}

			// JSONParser.g:28:43: ( SEP each+= pair )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==SEP) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// JSONParser.g:28:44: SEP each+= pair
					{
					SEP9=(Token)match(input,SEP,FOLLOW_SEP_in_object167);  
					stream_SEP.add(SEP9);

					pushFollow(FOLLOW_pair_in_object171);
					each=pair();
					state._fsp--;

					stream_pair.add(each.getTree());
					if (list_each==null) list_each=new ArrayList<Object>();
					list_each.add(each.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			FBRACE_CLOSE10=(Token)match(input,FBRACE_CLOSE,FOLLOW_FBRACE_CLOSE_in_object177);  
			stream_FBRACE_CLOSE.add(FBRACE_CLOSE10);

			// AST REWRITE
			// elements: each
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: each
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_each=new RewriteRuleSubtreeStream(adaptor,"token each",list_each);
			root_0 = (CommonTree)adaptor.nil();
			// 28:76: -> ^( JSON_OBJECT ( $each)* )
			{
				// JSONParser.g:28:79: ^( JSON_OBJECT ( $each)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JSON_OBJECT, "JSON_OBJECT"), root_1);
				// JSONParser.g:28:94: ( $each)*
				while ( stream_each.hasNext() ) {
					adaptor.addChild(root_1, stream_each.nextTree());
				}
				stream_each.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object"


	public static class array_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array"
	// JSONParser.g:29:10: fragment array : SBRACE_OPEN (each+= value )? ( SEP each+= value )* SBRACE_CLOSE -> ^( JSON_ARRAY ( $each)* ) ;
	public final JSONParser.array_return array() throws RecognitionException {
		JSONParser.array_return retval = new JSONParser.array_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SBRACE_OPEN11=null;
		Token SEP12=null;
		Token SBRACE_CLOSE13=null;
		List<Object> list_each=null;
		RuleReturnScope each = null;
		CommonTree SBRACE_OPEN11_tree=null;
		CommonTree SEP12_tree=null;
		CommonTree SBRACE_CLOSE13_tree=null;
		RewriteRuleTokenStream stream_SBRACE_OPEN=new RewriteRuleTokenStream(adaptor,"token SBRACE_OPEN");
		RewriteRuleTokenStream stream_SBRACE_CLOSE=new RewriteRuleTokenStream(adaptor,"token SBRACE_CLOSE");
		RewriteRuleTokenStream stream_SEP=new RewriteRuleTokenStream(adaptor,"token SEP");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// JSONParser.g:29:16: ( SBRACE_OPEN (each+= value )? ( SEP each+= value )* SBRACE_CLOSE -> ^( JSON_ARRAY ( $each)* ) )
			// JSONParser.g:29:19: SBRACE_OPEN (each+= value )? ( SEP each+= value )* SBRACE_CLOSE
			{
			SBRACE_OPEN11=(Token)match(input,SBRACE_OPEN,FOLLOW_SBRACE_OPEN_in_array197);  
			stream_SBRACE_OPEN.add(SBRACE_OPEN11);

			// JSONParser.g:29:35: (each+= value )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==BOOLEAN_OPTIONS||LA4_0==FBRACE_OPEN||(LA4_0 >= NULL_TEXT && LA4_0 <= NUMBER)||LA4_0==SBRACE_OPEN||LA4_0==STRING) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// JSONParser.g:29:35: each+= value
					{
					pushFollow(FOLLOW_value_in_array201);
					each=value();
					state._fsp--;

					stream_value.add(each.getTree());
					if (list_each==null) list_each=new ArrayList<Object>();
					list_each.add(each.getTree());
					}
					break;

			}

			// JSONParser.g:29:44: ( SEP each+= value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==SEP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// JSONParser.g:29:45: SEP each+= value
					{
					SEP12=(Token)match(input,SEP,FOLLOW_SEP_in_array205);  
					stream_SEP.add(SEP12);

					pushFollow(FOLLOW_value_in_array209);
					each=value();
					state._fsp--;

					stream_value.add(each.getTree());
					if (list_each==null) list_each=new ArrayList<Object>();
					list_each.add(each.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			SBRACE_CLOSE13=(Token)match(input,SBRACE_CLOSE,FOLLOW_SBRACE_CLOSE_in_array215);  
			stream_SBRACE_CLOSE.add(SBRACE_CLOSE13);

			// AST REWRITE
			// elements: each
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: each
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_each=new RewriteRuleSubtreeStream(adaptor,"token each",list_each);
			root_0 = (CommonTree)adaptor.nil();
			// 29:78: -> ^( JSON_ARRAY ( $each)* )
			{
				// JSONParser.g:29:81: ^( JSON_ARRAY ( $each)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JSON_ARRAY, "JSON_ARRAY"), root_1);
				// JSONParser.g:29:95: ( $each)*
				while ( stream_each.hasNext() ) {
					adaptor.addChild(root_1, stream_each.nextTree());
				}
				stream_each.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array"


	public static class json_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "json"
	// JSONParser.g:30:10: fragment json : ( object | array );
	public final JSONParser.json_return json() throws RecognitionException {
		JSONParser.json_return retval = new JSONParser.json_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope object14 =null;
		ParserRuleReturnScope array15 =null;


		try {
			// JSONParser.g:30:14: ( object | array )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==FBRACE_OPEN) ) {
				alt6=1;
			}
			else if ( (LA6_0==SBRACE_OPEN) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// JSONParser.g:30:18: object
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_object_in_json235);
					object14=object();
					state._fsp--;

					adaptor.addChild(root_0, object14.getTree());

					}
					break;
				case 2 :
					// JSONParser.g:30:29: array
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_in_json241);
					array15=array();
					state._fsp--;

					adaptor.addChild(root_0, array15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "json"

	// Delegated rules



	public static final BitSet FOLLOW_NUMBER_in_value67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_object_in_value81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_value90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPTIONS_in_value100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_TEXT_in_value108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_pair123 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_pair125 = new BitSet(new long[]{0x00000000002B0210L});
	public static final BitSet FOLLOW_value_in_pair129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FBRACE_OPEN_in_object159 = new BitSet(new long[]{0x0000000000300100L});
	public static final BitSet FOLLOW_pair_in_object163 = new BitSet(new long[]{0x0000000000100100L});
	public static final BitSet FOLLOW_SEP_in_object167 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_pair_in_object171 = new BitSet(new long[]{0x0000000000100100L});
	public static final BitSet FOLLOW_FBRACE_CLOSE_in_object177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SBRACE_OPEN_in_array197 = new BitSet(new long[]{0x00000000003F0210L});
	public static final BitSet FOLLOW_value_in_array201 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_SEP_in_array205 = new BitSet(new long[]{0x00000000002B0210L});
	public static final BitSet FOLLOW_value_in_array209 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_SBRACE_CLOSE_in_array215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_object_in_json235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_json241 = new BitSet(new long[]{0x0000000000000002L});
}
