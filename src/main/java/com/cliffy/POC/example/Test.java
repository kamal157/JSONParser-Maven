package com.cliffy.POC.example;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import com.cliffy.POC.grammar.JSONLexer;
import com.cliffy.POC.grammar.JSONParser;



public class Test{

	public static void main(String...arg) throws Exception{

		
		
		String filePath = System.getProperty("user.dir")+"/resources/cricket_matches.json";
		
		if(arg.length > 0) {
			filePath = arg[0];
		}
		System.out.println("Reading the file from ::: "+filePath +"\n\n");
		
		
	    ArrayList<String> lines=(ArrayList<String>) Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
	    StringBuffer jsonStrBuf = new StringBuffer("");
	    lines.stream().map(i->i+"\n").forEach(jsonStrBuf::append);
	    
	    String Str = jsonStrBuf.toString().trim();
	    JSONLexer lex = new JSONLexer(new ANTLRStringStream(Str));
		CommonTokenStream tokenStream = new CommonTokenStream(lex);
		JSONParser jP = new JSONParser(tokenStream);
		
		CommonTree tree = (CommonTree)jP.json().getTree();
		
		StringBuffer sbTemp = new StringBuffer("");
		System.out.println(getFormattedTreeString(tree,sbTemp,0,"\n","\t"));
	}
	
	
	public static String getFormattedTreeString(CommonTree tree,StringBuffer sb,int tabLength,String newLineChar,String tabChar) throws Exception
	 {
	
		 String endString=newLineChar;
		 if(tree.getChildCount()>0)
		 {
			 endString+=getRepeatedStringBylength(tabChar, tabLength)+"("+newLineChar;
		 }
	
		 sb.append(getRepeatedStringBylength(tabChar, tabLength)+tree.getText()+endString) ;	
	
		 for(int index=0;index<tree.getChildCount();index++)
		 {
			 CommonTree childNode=(CommonTree)tree.getChild(index);
			 getFormattedTreeString(childNode,sb,tabLength+1,newLineChar,tabChar);
		 }
		 if(tree.getChildCount()>0)
		 {
			 sb.append(getRepeatedStringBylength(tabChar, tabLength)+")"+newLineChar) ;	
		 }
		 return sb.toString();
	 }
	
	public static String getRepeatedStringBylength(String ch,int tabLength) {
		String temp = "";
		for (int i =0;i<tabLength;i++) {
			temp+=ch;
		}
		return temp;
	}
}
