package main;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserTParser;
import ANTLR.ParserTLexer;

@SuppressWarnings("deprecation")
public class TooL{
	//@SuppressWarnings("unused")
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws Exception{
		//System.out.println(System.getProperty("java.classpath"));
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("./examp/test0"));
		ParserTLexer lexer = new ParserTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserTParser parser = new ParserTParser(tokens);  
        ParseTree tree = parser.program();
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);
	}
}