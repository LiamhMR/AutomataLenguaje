package main;
import java.util.HashMap;


//Generated from ParserT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTLexer;

/**
* This interface defines a complete generic visitor for a parse tree produced
* by {@link ParserTParser}.
*
* @param <T> The return type of the visit operation. Use {@link Void} for
* operations with no return type.
*/
public interface MyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBotar(ParserTParser.BotarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(ParserTParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratecompare(ParserTParser.IteratecompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsest(ParserTParser.ElsestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcontent(ParserTParser.IfcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfst(ParserTParser.IfstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ParserTParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilest(ParserTParser.WhilestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareint(ParserTParser.DeclareintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarestr(ParserTParser.DeclarestrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarebool(ParserTParser.DeclareboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaremat(ParserTParser.DeclarematContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParserTParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualto(ParserTParser.EqualtoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir(ParserTParser.DefinirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniciones(ParserTParser.DefinicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ParserTParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloperations(ParserTParser.AlloperationsContext ctx);
}

