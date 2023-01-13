package utils;

import java.util.ArrayList;
import java.util.List;

import grammar.GrammarParser;

public class RuleBranch {

    private final List<String> elements;
    private final String code;

    public RuleBranch(GrammarParser.BranchContext branchContext) {
        this.elements = new ArrayList<>();
        GrammarParser.Element_listContext elementList = branchContext.elementList;
        while (elementList.headElement != null) {
            this.elements.add(elementList.headElement.getText());
            elementList = elementList.tail;
        }
        if (this.elements.size() == 0) {
            this.elements.add("EPS");
        }

        GrammarParser.Calc_resultContext calcResult = branchContext.calcResult;
        if (calcResult.val != null) {
            String s = calcResult.val.getText();
            this.code = s.substring(1, s.length() - 1);
        } else {
            this.code = "null";
        }
    }

    public List<String> getElements() {
        return elements;
    }

    public String getCode() {
        return code;
    }
}
