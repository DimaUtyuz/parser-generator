package main;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.function.Function;

import expression.ExpressionParser;
import grammar.GrammarLexer;
import grammar.GrammarParser;
import lab2.Lab2Parser;
import lab3.Lab3Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import utils.Grammar;
import utils.Tree;

public class Main {

    public static void main(String[] args) throws IOException {
//        generateGrammar("expression.txt");
//        generateGrammar("lab2.txt");
//        generateGrammar("lab3.txt");
//        testLab2();
        testExpression();
//        testLab3();
    }

    private static void testExpression() {
        String input = "1.0 - 2.0 - 3.0";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ExpressionParser parser = new ExpressionParser();
        try {
            Tree<Function<Double, Double>> result = parser.parse(inputStream);
            System.out.println(result.getValue().apply(0D));
            result.getDigraph();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void testLab2() {
        String input = "char **a, t, &p;";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        Lab2Parser parser = new Lab2Parser();
        try {
            Tree<Object> result = parser.parse(inputStream);
            result.getDigraph();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void testLab3() {
        String input = "comb if > 2 3 print 3 if > 4 - 7 2 comb print + 3 4 print / 650 78 = left right comb print == + 3 5 - 12 4 comb = hello * 4 89 comb while or a b print - 60 3 while and a b comb = t 5 = r 7";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        Lab3Parser parser = new Lab3Parser();
        try {
            Tree<String> result = parser.parse(inputStream);
            System.out.println(result.getValue());
            result.getDigraph();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void generateGrammar(String fileName) throws IOException {
        InputStream is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
        GrammarLexer lex = new GrammarLexer(input);
        lex.setTokenFactory(new CommonTokenFactory(true));
        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lex);
        GrammarParser parser = new GrammarParser(tokens);
        parser.setBuildParseTree(false);
        GrammarParser.StartContext startContext = parser.start();

        Grammar grammar = new Grammar(startContext);
        grammar.generateParser();
    }

}
