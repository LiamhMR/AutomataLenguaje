package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 */
	void enterBotar(@NotNull ParserTParser.BotarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 */
	void exitBotar(@NotNull ParserTParser.BotarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull ParserTParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull ParserTParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 */
	void enterDeclareint(@NotNull ParserTParser.DeclareintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 */
	void exitDeclareint(@NotNull ParserTParser.DeclareintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir(@NotNull ParserTParser.DefinirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir(@NotNull ParserTParser.DefinirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 */
	void enterWhilest(@NotNull ParserTParser.WhilestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 */
	void exitWhilest(@NotNull ParserTParser.WhilestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 */
	void enterDeclarestr(@NotNull ParserTParser.DeclarestrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 */
	void exitDeclarestr(@NotNull ParserTParser.DeclarestrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 */
	void enterEqualto(@NotNull ParserTParser.EqualtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 */
	void exitEqualto(@NotNull ParserTParser.EqualtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ParserTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ParserTParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfst(@NotNull ParserTParser.IfstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfst(@NotNull ParserTParser.IfstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 */
	void enterIteratecompare(@NotNull ParserTParser.IteratecompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 */
	void exitIteratecompare(@NotNull ParserTParser.IteratecompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void enterDeclarebool(@NotNull ParserTParser.DeclareboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void exitDeclarebool(@NotNull ParserTParser.DeclareboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ParserTParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ParserTParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#tatoo}.
	 * @param ctx the parse tree
	 */
	void enterTatoo(@NotNull ParserTParser.TatooContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#tatoo}.
	 * @param ctx the parse tree
	 */
	void exitTatoo(@NotNull ParserTParser.TatooContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 */
	void enterDeclaremat(@NotNull ParserTParser.DeclarematContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 */
	void exitDeclaremat(@NotNull ParserTParser.DeclarematContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 */
	void enterElsest(@NotNull ParserTParser.ElsestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 */
	void exitElsest(@NotNull ParserTParser.ElsestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 */
	void enterIfcontent(@NotNull ParserTParser.IfcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 */
	void exitIfcontent(@NotNull ParserTParser.IfcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void enterDefiniciones(@NotNull ParserTParser.DefinicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void exitDefiniciones(@NotNull ParserTParser.DefinicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull ParserTParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull ParserTParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 */
	void enterAlloperations(@NotNull ParserTParser.AlloperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 */
	void exitAlloperations(@NotNull ParserTParser.AlloperationsContext ctx);
}