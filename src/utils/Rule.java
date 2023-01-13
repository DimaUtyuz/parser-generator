package utils;

import java.util.ArrayList;
import java.util.List;

import grammar.GrammarParser;

public class Rule {

    private final String left;
    private final List<RuleBranch> branches;

    public Rule(GrammarParser.Rule_objContext ruleContext) {
        this.left = ruleContext.name.getText();

        this.branches = new ArrayList<>();
        GrammarParser.Branch_listContext branchList = ruleContext.branchList;
        while (branchList.headBranch != null) {
            branches.add(new RuleBranch(branchList.headBranch));
            branchList = branchList.tail;
        }
    }

    public String getLeft() {
        return left;
    }

    public List<RuleBranch> getBranches() {
        return branches;
    }

}
