package main;

import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR.ParserTParser;
import ANTLR.ParserTLexer;

//@SupressWarnings("deprecation");
public class Tool{
	public static void main(String[],args)throws Exception{
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("example/ejemplo0.txt"));
		ParserTestLexer lexer = new ParserTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParserTestParser parser = new ParserTestParser(tokens);  
        ParseTree tree = parser.program();
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);
		
	}
}
