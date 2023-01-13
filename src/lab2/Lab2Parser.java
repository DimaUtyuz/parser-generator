package lab2;

import java.io.InputStream;
import java.text.ParseException;
import java.util.Set;

import utils.Tree;

public class Lab2Parser {

    private Lab2LexicalAnalyzer lex;

    Tree<Object> start() throws ParseException {
        if (Set.of(Lab2Token.NAME).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.NAME) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> NAME = new Tree<>("NAME");
            NAME.setValue(null);
            lex.nextToken();
            Tree<Object> r = r();
            Tree<Object> t = t();
            Tree<Object> result = new Tree<>("start", NAME, r, t);
            result.setValue(null);
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<Object> r() throws ParseException {
        if (Set.of(Lab2Token.AMPERSAND).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.AMPERSAND) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> AMPERSAND = new Tree<>("AMPERSAND");
            AMPERSAND.setValue(null);
            lex.nextToken();
            if (lex.curToken() != Lab2Token.NAME) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> NAME = new Tree<>("NAME");
            NAME.setValue(null);
            lex.nextToken();
            Tree<Object> result = new Tree<>("r", AMPERSAND, NAME);
            result.setValue(null);
            return result;
        } else if (Set.of(Lab2Token.ASTERISK, Lab2Token.NAME).contains(lex.curToken())) {
            Tree<Object> v = v();
            Tree<Object> result = new Tree<>("r", v);
            result.setValue(null);
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<Object> v() throws ParseException {
        if (Set.of(Lab2Token.ASTERISK).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.ASTERISK) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> ASTERISK = new Tree<>("ASTERISK");
            ASTERISK.setValue(null);
            lex.nextToken();
            Tree<Object> v = v();
            Tree<Object> result = new Tree<>("v", ASTERISK, v);
            result.setValue(null);
            return result;
        } else if (Set.of(Lab2Token.NAME).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.NAME) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> NAME = new Tree<>("NAME");
            NAME.setValue(null);
            lex.nextToken();
            Tree<Object> result = new Tree<>("v", NAME);
            result.setValue(null);
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<Object> t() throws ParseException {
        if (Set.of(Lab2Token.COMMA).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.COMMA) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> COMMA = new Tree<>("COMMA");
            COMMA.setValue(null);
            lex.nextToken();
            Tree<Object> r = r();
            Tree<Object> t = t();
            Tree<Object> result = new Tree<>("t", COMMA, r, t);
            result.setValue(null);
            return result;
        } else if (Set.of(Lab2Token.SEMICOLON).contains(lex.curToken())) {
            if (lex.curToken() != Lab2Token.SEMICOLON) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<Object> SEMICOLON = new Tree<>("SEMICOLON");
            SEMICOLON.setValue(null);
            lex.nextToken();
            Tree<Object> result = new Tree<>("t", SEMICOLON);
            result.setValue(null);
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    public Tree<Object> parse(InputStream is) throws ParseException {
        lex = new Lab2LexicalAnalyzer(is);
        lex.nextToken();
        return start();
    }



}
