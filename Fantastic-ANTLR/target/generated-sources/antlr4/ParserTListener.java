// Generated from ParserT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 */
	void enterBotar(ParserTParser.BotarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#botar}.
	 * @param ctx the parse tree
	 */
	void exitBotar(ParserTParser.BotarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ParserTParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ParserTParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 */
	void enterIteratecompare(ParserTParser.IteratecompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#iteratecompare}.
	 * @param ctx the parse tree
	 */
	void exitIteratecompare(ParserTParser.IteratecompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 */
	void enterElsest(ParserTParser.ElsestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#elsest}.
	 * @param ctx the parse tree
	 */
	void exitElsest(ParserTParser.ElsestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 */
	void enterIfcontent(ParserTParser.IfcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#ifcontent}.
	 * @param ctx the parse tree
	 */
	void exitIfcontent(ParserTParser.IfcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfst(ParserTParser.IfstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfst(ParserTParser.IfstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ParserTParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ParserTParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 */
	void enterWhilest(ParserTParser.WhilestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#whilest}.
	 * @param ctx the parse tree
	 */
	void exitWhilest(ParserTParser.WhilestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#tatoo}.
	 * @param ctx the parse tree
	 */
	void enterTatoo(ParserTParser.TatooContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#tatoo}.
	 * @param ctx the parse tree
	 */
	void exitTatoo(ParserTParser.TatooContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathvar}.
	 * @param ctx the parse tree
	 */
	void enterMathvar(ParserTParser.MathvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathvar}.
	 * @param ctx the parse tree
	 */
	void exitMathvar(ParserTParser.MathvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathop}.
	 * @param ctx the parse tree
	 */
	void enterMathop(ParserTParser.MathopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathop}.
	 * @param ctx the parse tree
	 */
	void exitMathop(ParserTParser.MathopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathplus}.
	 * @param ctx the parse tree
	 */
	void enterMathplus(ParserTParser.MathplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathplus}.
	 * @param ctx the parse tree
	 */
	void exitMathplus(ParserTParser.MathplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathless}.
	 * @param ctx the parse tree
	 */
	void enterMathless(ParserTParser.MathlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathless}.
	 * @param ctx the parse tree
	 */
	void exitMathless(ParserTParser.MathlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathmult}.
	 * @param ctx the parse tree
	 */
	void enterMathmult(ParserTParser.MathmultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathmult}.
	 * @param ctx the parse tree
	 */
	void exitMathmult(ParserTParser.MathmultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathsplit}.
	 * @param ctx the parse tree
	 */
	void enterMathsplit(ParserTParser.MathsplitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathsplit}.
	 * @param ctx the parse tree
	 */
	void exitMathsplit(ParserTParser.MathsplitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(ParserTParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(ParserTParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathpot}.
	 * @param ctx the parse tree
	 */
	void enterMathpot(ParserTParser.MathpotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathpot}.
	 * @param ctx the parse tree
	 */
	void exitMathpot(ParserTParser.MathpotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mathfact}.
	 * @param ctx the parse tree
	 */
	void enterMathfact(ParserTParser.MathfactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mathfact}.
	 * @param ctx the parse tree
	 */
	void exitMathfact(ParserTParser.MathfactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 */
	void enterDeclareint(ParserTParser.DeclareintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declareint}.
	 * @param ctx the parse tree
	 */
	void exitDeclareint(ParserTParser.DeclareintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 */
	void enterDeclarestr(ParserTParser.DeclarestrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declarestr}.
	 * @param ctx the parse tree
	 */
	void exitDeclarestr(ParserTParser.DeclarestrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void enterDeclarebool(ParserTParser.DeclareboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void exitDeclarebool(ParserTParser.DeclareboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 */
	void enterDeclaremat(ParserTParser.DeclarematContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaremat}.
	 * @param ctx the parse tree
	 */
	void exitDeclaremat(ParserTParser.DeclarematContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserTParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 */
	void enterEqualto(ParserTParser.EqualtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#equalto}.
	 * @param ctx the parse tree
	 */
	void exitEqualto(ParserTParser.EqualtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 */
	void enterDefinir(ParserTParser.DefinirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#definir}.
	 * @param ctx the parse tree
	 */
	void exitDefinir(ParserTParser.DefinirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void enterDefiniciones(ParserTParser.DefinicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void exitDefiniciones(ParserTParser.DefinicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ParserTParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ParserTParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 */
	void enterAlloperations(ParserTParser.AlloperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#alloperations}.
	 * @param ctx the parse tree
	 */
	void exitAlloperations(ParserTParser.AlloperationsContext ctx);
}