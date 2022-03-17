// Generated from /home/inejka/Документы/InejSet/grammar/InejSet.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InejSetParser}.
 */
public interface InejSetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InejSetParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetExpression(InejSetParser.SetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetExpression(InejSetParser.SetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(InejSetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(InejSetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(InejSetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(InejSetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(InejSetParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(InejSetParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationElement(InejSetParser.DeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationElement(InejSetParser.DeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(InejSetParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(InejSetParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#printSet}.
	 * @param ctx the parse tree
	 */
	void enterPrintSet(InejSetParser.PrintSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#printSet}.
	 * @param ctx the parse tree
	 */
	void exitPrintSet(InejSetParser.PrintSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(InejSetParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(InejSetParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(InejSetParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(InejSetParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(InejSetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(InejSetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignatureFunction(InejSetParser.SignatureFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignatureFunction(InejSetParser.SignatureFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(InejSetParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(InejSetParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(InejSetParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(InejSetParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(InejSetParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(InejSetParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(InejSetParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(InejSetParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void enterEqualCompare(InejSetParser.EqualCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void exitEqualCompare(InejSetParser.EqualCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(InejSetParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(InejSetParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCompare(InejSetParser.SimpleCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCompare(InejSetParser.SimpleCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void enterNegationCompare(InejSetParser.NegationCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void exitNegationCompare(InejSetParser.NegationCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(InejSetParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(InejSetParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(InejSetParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(InejSetParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(InejSetParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(InejSetParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(InejSetParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(InejSetParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetExpression(InejSetParser.GetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetExpression(InejSetParser.GetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexOfExpression(InejSetParser.IndexOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexOfExpression(InejSetParser.IndexOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(InejSetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(InejSetParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InejSetParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(InejSetParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InejSetParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(InejSetParser.ContentContext ctx);
}