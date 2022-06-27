package main;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Generated from ParserT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser.ProgramContext;
/**
* This interface defines a complete generic visitor for a parse tree produced
* by {@link ParserTParser}.
*
* @param <T> The return type of the visit operation. Use {@link Void} for
* operations with no return type.
*/
public interface MyVisitor<T> extends ParseTreeVisitor<T> {
	Map<String, String>  variables = new HashMap<String, String>();
	
}

