package lab3;
import java.util.stream.Collectors;
import java.util.Arrays;

import java.io.InputStream;
import java.text.ParseException;
import java.util.Set;

import utils.Tree;

public class Lab3Parser {

    private Lab3LexicalAnalyzer lex;

    Tree<String> start() throws ParseException {
        if (Set.of(Lab3Token.PRINT, Lab3Token.ASSIGMENT, Lab3Token.WHILE, Lab3Token.IF, Lab3Token.COMB).contains(lex.curToken())) {
            Tree<String> block = block();
            Tree<String> result = new Tree<>("start", block);
            result.setValue(block.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> block() throws ParseException {
        if (Set.of(Lab3Token.COMB).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.COMB) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> COMB = new Tree<>("COMB");
            COMB.setValue(null);
            lex.nextToken();
            Tree<String> act = act();
            Tree<String> block = block();
            Tree<String> result = new Tree<>("block", COMB, act, block);
            result.setValue(String.format("%s\n%s", act.getValue(), block.getValue()));
            return result;
        } else if (Set.of(Lab3Token.PRINT, Lab3Token.ASSIGMENT, Lab3Token.WHILE, Lab3Token.IF).contains(lex.curToken())) {
            Tree<String> act = act();
            Tree<String> result = new Tree<>("block", act);
            result.setValue(act.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> act() throws ParseException {
        if (Set.of(Lab3Token.IF).contains(lex.curToken())) {
            Tree<String> fi = fi();
            Tree<String> result = new Tree<>("act", fi);
            result.setValue(fi.getValue());
            return result;
        } else if (Set.of(Lab3Token.PRINT, Lab3Token.ASSIGMENT, Lab3Token.WHILE).contains(lex.curToken())) {
            Tree<String> func = func();
            Tree<String> result = new Tree<>("act", func);
            result.setValue(func.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> func() throws ParseException {
        if (Set.of(Lab3Token.ASSIGMENT).contains(lex.curToken())) {
            Tree<String> assigning = assigning();
            Tree<String> result = new Tree<>("func", assigning);
            result.setValue(assigning.getValue());
            return result;
        } else if (Set.of(Lab3Token.PRINT).contains(lex.curToken())) {
            Tree<String> print = print();
            Tree<String> result = new Tree<>("func", print);
            result.setValue(print.getValue());
            return result;
        } else if (Set.of(Lab3Token.WHILE).contains(lex.curToken())) {
            Tree<String> wh = wh();
            Tree<String> result = new Tree<>("func", wh);
            result.setValue(wh.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> wh() throws ParseException {
        if (Set.of(Lab3Token.WHILE).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.WHILE) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> WHILE = new Tree<>("WHILE");
            WHILE.setValue(null);
            lex.nextToken();
            Tree<String> expr = expr();
            Tree<String> block = block();
            Tree<String> result = new Tree<>("wh", WHILE, expr, block);
            result.setValue(String.format("while %s:\n%s", expr.getValue(), Arrays.stream(block.getValue().split("\n")).collect(Collectors.joining("\n    ", "    ", ""))));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> expr() throws ParseException {
        if (Set.of(Lab3Token.DIV, Lab3Token.ADD, Lab3Token.SUB, Lab3Token.OR, Lab3Token.EQUALS, Lab3Token.MUL, Lab3Token.AND, Lab3Token.GREATER, Lab3Token.LESS, Lab3Token.XOR).contains(lex.curToken())) {
            Tree<String> op = op();
            Tree<String> expr = expr();
            Tree<String> r_expr = r_expr();
            Tree<String> result = new Tree<>("expr", op, expr, r_expr);
            result.setValue(String.format("(%s %s %s)", expr.getValue(), op.getValue(), r_expr.getValue()));
            return result;
        } else if (Set.of(Lab3Token.NUM).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.NUM) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> NUM = new Tree<>("NUM");
            NUM.setValue(lex.curValue());
            lex.nextToken();
            Tree<String> result = new Tree<>("expr", NUM);
            result.setValue(NUM.getValue());
            return result;
        } else if (Set.of(Lab3Token.VAR).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.VAR) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> VAR = new Tree<>("VAR");
            VAR.setValue(lex.curValue());
            lex.nextToken();
            Tree<String> result = new Tree<>("expr", VAR);
            result.setValue(VAR.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> r_expr() throws ParseException {
        if (Set.of(Lab3Token.DIV, Lab3Token.ADD, Lab3Token.SUB, Lab3Token.OR, Lab3Token.EQUALS, Lab3Token.MUL, Lab3Token.VAR, Lab3Token.NUM, Lab3Token.AND, Lab3Token.GREATER, Lab3Token.LESS, Lab3Token.XOR).contains(lex.curToken())) {
            Tree<String> expr = expr();
            Tree<String> result = new Tree<>("r_expr", expr);
            result.setValue(expr.getValue());
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> fi() throws ParseException {
        if (Set.of(Lab3Token.IF).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.IF) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> IF = new Tree<>("IF");
            IF.setValue(null);
            lex.nextToken();
            Tree<String> expr = expr();
            Tree<String> block = block();
            Tree<String> else_block = else_block();
            Tree<String> result = new Tree<>("fi", IF, expr, block, else_block);
            result.setValue(String.format("if %s:\n%s%s", expr.getValue(), Arrays.stream(block.getValue().split("\n")).collect(Collectors.joining("\n    ", "    ", "")), else_block.getValue()));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> else_block() throws ParseException {
        if (Set.of(Lab3Token.PRINT, Lab3Token.ASSIGMENT, Lab3Token.WHILE).contains(lex.curToken())) {
            Tree<String> func = func();
            Tree<String> result = new Tree<>("else_block", func);
            result.setValue(String.format("\nelse:\n%s", Arrays.stream(func.getValue().split("\n")).collect(Collectors.joining("\n    ", "    ", ""))));
            return result;
        } else if (Set.of(Lab3Token.IF).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.IF) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> IF = new Tree<>("IF");
            IF.setValue(null);
            lex.nextToken();
            Tree<String> expr = expr();
            Tree<String> block = block();
            Tree<String> else_block = else_block();
            Tree<String> result = new Tree<>("else_block", IF, expr, block, else_block);
            result.setValue(String.format("\nelif %s:\n%s%s", expr.getValue(), Arrays.stream(block.getValue().split("\n")).collect(Collectors.joining("\n    ", "    ", "")), else_block.getValue()));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> assigning() throws ParseException {
        if (Set.of(Lab3Token.ASSIGMENT).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.ASSIGMENT) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> ASSIGMENT = new Tree<>("ASSIGMENT");
            ASSIGMENT.setValue(null);
            lex.nextToken();
            if (lex.curToken() != Lab3Token.VAR) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> VAR = new Tree<>("VAR");
            VAR.setValue(lex.curValue());
            lex.nextToken();
            Tree<String> expr = expr();
            Tree<String> result = new Tree<>("assigning", ASSIGMENT, VAR, expr);
            result.setValue(String.format("%s = %s", VAR.getValue(), expr.getValue()));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> print() throws ParseException {
        if (Set.of(Lab3Token.PRINT).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.PRINT) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> PRINT = new Tree<>("PRINT");
            PRINT.setValue(null);
            lex.nextToken();
            Tree<String> s_expr = s_expr();
            Tree<String> result = new Tree<>("print", PRINT, s_expr);
            result.setValue(String.format("print%s", s_expr.getValue()));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> s_expr() throws ParseException {
        if (Set.of(Lab3Token.DIV, Lab3Token.ADD, Lab3Token.SUB, Lab3Token.OR, Lab3Token.EQUALS, Lab3Token.MUL, Lab3Token.AND, Lab3Token.GREATER, Lab3Token.LESS, Lab3Token.XOR).contains(lex.curToken())) {
            Tree<String> op = op();
            Tree<String> expr = expr();
            Tree<String> r_expr = r_expr();
            Tree<String> result = new Tree<>("s_expr", op, expr, r_expr);
            result.setValue(String.format("(%s %s %s)", expr.getValue(), op.getValue(), r_expr.getValue()));
            return result;
        } else if (Set.of(Lab3Token.NUM).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.NUM) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> NUM = new Tree<>("NUM");
            NUM.setValue(lex.curValue());
            lex.nextToken();
            Tree<String> result = new Tree<>("s_expr", NUM);
            result.setValue(String.format("(%s)", NUM.getValue()));
            return result;
        } else if (Set.of(Lab3Token.VAR).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.VAR) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> VAR = new Tree<>("VAR");
            VAR.setValue(lex.curValue());
            lex.nextToken();
            Tree<String> result = new Tree<>("s_expr", VAR);
            result.setValue(String.format("(%s)", VAR.getValue()));
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    Tree<String> op() throws ParseException {
        if (Set.of(Lab3Token.ADD).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.ADD) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> ADD = new Tree<>("ADD");
            ADD.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", ADD);
            result.setValue("+");
            return result;
        } else if (Set.of(Lab3Token.SUB).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.SUB) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> SUB = new Tree<>("SUB");
            SUB.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", SUB);
            result.setValue("-");
            return result;
        } else if (Set.of(Lab3Token.MUL).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.MUL) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> MUL = new Tree<>("MUL");
            MUL.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", MUL);
            result.setValue("*");
            return result;
        } else if (Set.of(Lab3Token.DIV).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.DIV) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> DIV = new Tree<>("DIV");
            DIV.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", DIV);
            result.setValue("/");
            return result;
        } else if (Set.of(Lab3Token.LESS).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.LESS) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> LESS = new Tree<>("LESS");
            LESS.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", LESS);
            result.setValue("<");
            return result;
        } else if (Set.of(Lab3Token.GREATER).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.GREATER) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> GREATER = new Tree<>("GREATER");
            GREATER.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", GREATER);
            result.setValue(">");
            return result;
        } else if (Set.of(Lab3Token.AND).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.AND) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> AND = new Tree<>("AND");
            AND.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", AND);
            result.setValue("and");
            return result;
        } else if (Set.of(Lab3Token.OR).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.OR) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> OR = new Tree<>("OR");
            OR.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", OR);
            result.setValue("or");
            return result;
        } else if (Set.of(Lab3Token.XOR).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.XOR) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> XOR = new Tree<>("XOR");
            XOR.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", XOR);
            result.setValue("xor");
            return result;
        } else if (Set.of(Lab3Token.EQUALS).contains(lex.curToken())) {
            if (lex.curToken() != Lab3Token.EQUALS) {
                throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
            }
            Tree<String> EQUALS = new Tree<>("EQUALS");
            EQUALS.setValue(null);
            lex.nextToken();
            Tree<String> result = new Tree<>("op", EQUALS);
            result.setValue("==");
            return result;
        }
        throw new ParseException("Expected another token at position " + lex.curPos(), lex.curPos());
    }

    public Tree<String> parse(InputStream is) throws ParseException {
        lex = new Lab3LexicalAnalyzer(is);
        lex.nextToken();
        return start();
    }



}
