package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBotar(@NotNull ParserTParser.BotarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull ParserTParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareint(@NotNull ParserTParser.DeclareintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir(@NotNull ParserTParser.DefinirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilest(@NotNull ParserTParser.WhilestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarestr(@NotNull ParserTParser.DeclarestrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualto(@NotNull ParserTParser.EqualtoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull ParserTParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfst(@NotNull ParserTParser.IfstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratecompare(@NotNull ParserTParser.IteratecompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarebool(@NotNull ParserTParser.DeclareboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull ParserTParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#tatoo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTatoo(@NotNull ParserTParser.TatooContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaremat(@NotNull ParserTParser.DeclarematContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsest(@NotNull ParserTParser.ElsestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcontent(@NotNull ParserTParser.IfcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniciones(@NotNull ParserTParser.DefinicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull ParserTParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloperations(@NotNull ParserTParser.AlloperationsContext ctx);
}