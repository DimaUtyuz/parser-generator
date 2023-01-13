// Generated from /home/dima-utyuz/itmo/mt/lab4/src/Grammar.g4 by ANTLR 4.10.1

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammar_name}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_name(GrammarParser.Grammar_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammar_name}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_name(GrammarParser.Grammar_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(GrammarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(GrammarParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rule_list}.
	 * @param ctx the parse tree
	 */
	void enterRule_list(GrammarParser.Rule_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rule_list}.
	 * @param ctx the parse tree
	 */
	void exitRule_list(GrammarParser.Rule_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rule_obj}.
	 * @param ctx the parse tree
	 */
	void enterRule_obj(GrammarParser.Rule_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rule_obj}.
	 * @param ctx the parse tree
	 */
	void exitRule_obj(GrammarParser.Rule_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#branch_list}.
	 * @param ctx the parse tree
	 */
	void enterBranch_list(GrammarParser.Branch_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#branch_list}.
	 * @param ctx the parse tree
	 */
	void exitBranch_list(GrammarParser.Branch_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(GrammarParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(GrammarParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#calc_result}.
	 * @param ctx the parse tree
	 */
	void enterCalc_result(GrammarParser.Calc_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#calc_result}.
	 * @param ctx the parse tree
	 */
	void exitCalc_result(GrammarParser.Calc_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#element_list}.
	 * @param ctx the parse tree
	 */
	void enterElement_list(GrammarParser.Element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#element_list}.
	 * @param ctx the parse tree
	 */
	void exitElement_list(GrammarParser.Element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token_list}.
	 * @param ctx the parse tree
	 */
	void enterToken_list(GrammarParser.Token_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token_list}.
	 * @param ctx the parse tree
	 */
	void exitToken_list(GrammarParser.Token_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token_tail}.
	 * @param ctx the parse tree
	 */
	void enterToken_tail(GrammarParser.Token_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token_tail}.
	 * @param ctx the parse tree
	 */
	void exitToken_tail(GrammarParser.Token_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code_part}.
	 * @param ctx the parse tree
	 */
	void enterCode_part(GrammarParser.Code_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code_part}.
	 * @param ctx the parse tree
	 */
	void exitCode_part(GrammarParser.Code_partContext ctx);
}