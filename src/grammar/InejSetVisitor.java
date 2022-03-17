// Generated from /home/inejka/Документы/InejSet/grammar/InejSet.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InejSetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InejSetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InejSetParser#setExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpression(InejSetParser.SetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(InejSetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(InejSetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(InejSetParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#declarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationElement(InejSetParser.DeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(InejSetParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#printSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSet(InejSetParser.PrintSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(InejSetParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(InejSetParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(InejSetParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#signatureFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFunction(InejSetParser.SignatureFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(InejSetParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(InejSetParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(InejSetParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(InejSetParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#equalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCompare(InejSetParser.EqualCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(InejSetParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#simpleCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCompare(InejSetParser.SimpleCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#negationCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCompare(InejSetParser.NegationCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(InejSetParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(InejSetParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(InejSetParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(InejSetParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#getExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(InejSetParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#indexOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOfExpression(InejSetParser.IndexOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(InejSetParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InejSetParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(InejSetParser.ContentContext ctx);
}