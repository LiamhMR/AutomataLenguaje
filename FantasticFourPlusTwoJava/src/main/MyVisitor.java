package main;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.PrintStream;

//Generated from ParserT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTVisitor;
import ANTLR.ParserTParser.MathopContext;
import ANTLR.ParserTParser.MathvarContext;
import ANTLR.ParserTParser.ProgramContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ParserTVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MyVisitor<T> extends AbstractParseTreeVisitor<T> implements ParserTVisitor<T> {
	private Map<String, String>  var = new HashMap<String, String>();
	private String lastVisited;
	private boolean lastCmp;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCompare(@NotNull ParserTParser.CompareContext ctx) { 
		String cmp=ctx.getChild(1).getText().toString();
		String condA=ctx.getChild(0).getText().toString();
		String condB=ctx.getChild(2).getText().toString();
		if(var.containsKey(condA)) {condA=var.get(condA);};
		if(var.containsKey(condB)) {condB=var.get(condB);};
		
		if (cmp.equals("NOIGUALITO")) {
			if(condA.equals(condB)) {lastCmp=false;}else {
				lastCmp=true;
			}
		}
		if (cmp.equals("IGUALITO")) {
			if(condA.equals(condB)) {lastCmp=true;}else {
				lastCmp=false;
			}
		}
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMathmult(@NotNull ParserTParser.MathmultContext ctx ) { 
		int val = Integer.parseInt(ctx.getChild(0).getText())*Integer.parseInt(ctx.getChild(2).getText());
		//System.out.println("Owner var:"+lastVisited);
		var.replace(lastVisited, String.valueOf(val));
		//System.out.println("lVV value:"+varInt.get(lastVisited));
		return visitChildren(ctx);
		} 
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefinir(@NotNull ParserTParser.DefinirContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProgram(@NotNull ParserTParser.ProgramContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfst(@NotNull ParserTParser.IfstContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclarebool(@NotNull ParserTParser.DeclareboolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLoop(@NotNull ParserTParser.LoopContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTatoo(@NotNull ParserTParser.TatooContext ctx) { 
		char start=((ctx.getChild(1).getText()).toString().charAt(0));
		if (start=="!".charAt(0)) {
			String value=(ctx.getChild(1).getText()).toString();
			value=value.replace("!","");
			value=value.replace("¡","");
			System.out.println(value);
		}else {
			String id=(ctx.getChild(1).getText()).toString();
			System.out.println(var.get(id));
		}
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaremat(@NotNull ParserTParser.DeclarematContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitElsest(@NotNull ParserTParser.ElsestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMathless(@NotNull ParserTParser.MathlessContext ctx) { 
		int val = Integer.parseInt(ctx.getChild(0).getText())-Integer.parseInt(ctx.getChild(2).getText());
		//System.out.println("Owner var:"+lastVisited);
		var.replace(lastVisited, String.valueOf(val));
		//System.out.println("lVV value:"+varInt.get(lastVisited));
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMathsplit(@NotNull ParserTParser.MathsplitContext ctx) { 
		int val = Integer.parseInt(ctx.getChild(0).getText())/Integer.parseInt(ctx.getChild(2).getText());
		//System.out.println("Owner var:"+lastVisited);
		var.replace(lastVisited, String.valueOf(val));
		//System.out.println("lVV value:"+varInt.get(lastVisited));
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMathplus(@NotNull ParserTParser.MathplusContext ctx) { 
		int val = Integer.parseInt(ctx.getChild(0).getText())+Integer.parseInt(ctx.getChild(2).getText());
		//System.out.println("Owner var:"+lastVisited);
		var.replace(lastVisited, String.valueOf(val));
		//System.out.println("lVV value:"+varInt.get(lastVisited));
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAlloperations(@NotNull ParserTParser.AlloperationsContext ctx) { 
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBotar(@NotNull ParserTParser.BotarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclareint(@NotNull ParserTParser.DeclareintContext ctx) {
		String id = ctx.getChild(0).getText();        
        int value = 0;        
        var.put(id, String.valueOf(value));
        lastVisited=id;
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhilest(@NotNull ParserTParser.WhilestContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclarestr(@NotNull ParserTParser.DeclarestrContext ctx) { 
		String id = ctx.getChild(0).getText();    
		String value=(ctx.getChild(4).getText()).toString();
		value=value.replace("!","");
		value=value.replace("¡","");
		//System.out.println("var:"+id);
		//System.out.println("string:"+value);
		var.put(id, String.valueOf(value));
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEqualto(@NotNull ParserTParser.EqualtoContext ctx) { 
		lastVisited=ctx.getChild(0).getText();
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaration(@NotNull ParserTParser.DeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIteratecompare(@NotNull ParserTParser.IteratecompareContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMath(@NotNull ParserTParser.MathContext ctx) { 
		int val=0;
		for (int i=0;i<ctx.getChildCount();i=i+2) {
			int tempVal=0;
			if (var.containsKey(ctx.getChild(i).getText())) {
				if (isNumeric(var.get(ctx.getChild(i).getText())))
				{
					tempVal=Integer.parseInt(var.get(ctx.getChild(i).getText()));
				}else {
					System.err.println("CAN'T OPERATE WITH NON NUMERIC TYPE <"+ ctx.getChild(i).getText()+">");
					System.exit(1);
				}
			}else {
				tempVal=Integer.parseInt(ctx.getChild(i).getText());
			}
			if(i==0) {
				val=tempVal;
			}
			if (i!=0) {
				String tempOp=ctx.getChild(i-1).getText().toString();
				if(tempOp.equals("+")) {
					val=val+tempVal;
				}else if(tempOp.equals("-")) {
					val=val-tempVal;
				}else if(tempOp.equals("*")) {
					val=val*tempVal;
				}else if(tempOp.equals("/")) {
					val=val/tempVal;
				}
			}
		}
		var.replace(lastVisited, String.valueOf(val));
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 *
	 * {@link Void}
	 */
	@Override public T visitIfcontent(ParserTParser.IfcontentContext ctx) { 
		if (lastCmp==true) {
			visitChildren(ctx);
		}
		return defaultResult();
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefiniciones(@NotNull ParserTParser.DefinicionesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperation(@NotNull ParserTParser.OperationContext ctx) { return visitChildren(ctx); }
	@Override
	public T visitMathvar(MathvarContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T visitMathop(MathopContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static boolean isNumeric(String str) {
		if (str==null) {
			return false;
		}
		try {
			@SuppressWarnings("unused")
			double d=Double.parseDouble(str);
		}catch(NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
}

