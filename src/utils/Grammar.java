package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import generator.LexicalAnalyzerGenerator;
import generator.ParserGenerator;
import generator.TokenGenerator;
import grammar.GrammarParser;

public class Grammar {

    private final String name;
    private final String variableType;
    private final List<String> headers;
    private final List<Rule> rules;
    private final List<Token> tokens;
    private final String codePart;
    private String epsRule;

    public Grammar(GrammarParser.StartContext startContext) {
        this.name = startContext.grammarName.name.getText();

        var typeName = startContext.grammarType.name;
        if (typeName != null) {
            String s = typeName.getText();
            this.variableType = s.substring(1, s.length() - 1);
        } else {
            this.variableType = "Object";
        }

        String headers = startContext.headerList.headers.getText();
        this.headers = List.of(headers.substring(2, headers.length() - 2).split("\n"));

        this.rules = new ArrayList<>();
        GrammarParser.Rule_listContext ruleList = startContext.ruleList;
        while (ruleList.rule_ != null) {
            this.rules.add(new Rule(ruleList.rule_));
            ruleList = ruleList.tail;
        }

        this.epsRule = "null";
        this.tokens = new ArrayList<>();
        GrammarParser.Token_listContext tokenList = startContext.tokenList;
        while (tokenList.headToken != null) {
            if (!tokenList.headToken.name.getText().equals("EPS")) {
                this.tokens.add(new Token(tokenList.headToken));
            } else {
                String s = tokenList.headToken.tail.calcResult.val.getText();
                this.epsRule = s.substring(1, s.length() - 1);
            }
            tokenList = tokenList.tail;
        }

        var code = startContext.codePart.code;
        if (code != null) {
            String s = code.getText();
            this.codePart = s.substring(1, s.length() - 1);
        } else {
            this.codePart = "";
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public String getVariableType() {
        return variableType;
    }

    public String getCodePart() {
        return codePart;
    }

    public String getEpsRule() {
        return epsRule;
    }

    public void generateParser() {
        Path path = Path.of("src", this.name.toLowerCase());
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create directory");
        }

        TokenGenerator.generateTokens(path, this);
        LexicalAnalyzerGenerator.generateLexicalAnalyzer(path, this);
        ParserGenerator.generateParser(path, this);
    }

}
