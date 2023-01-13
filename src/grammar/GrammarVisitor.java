// Generated from /home/dima-utyuz/itmo/mt/lab4/src/Grammar.g4 by ANTLR 4.10.1

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammar_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_name(GrammarParser.Grammar_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(GrammarParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rule_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_list(GrammarParser.Rule_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rule_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_obj(GrammarParser.Rule_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#branch_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_list(GrammarParser.Branch_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(GrammarParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#calc_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc_result(GrammarParser.Calc_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_list(GrammarParser.Element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#token_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_list(GrammarParser.Token_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(GrammarParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#token_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_tail(GrammarParser.Token_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_part(GrammarParser.Code_partContext ctx);
}