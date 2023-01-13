package generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

import utils.Grammar;
import utils.Token;

public class TokenGenerator {

    private static final String tokenEnumTemplate =
            """
                    package %s;
                    
                    public enum %sToken {
                        %s
                    }
                    """;

    public static void generateTokens(Path path, Grammar grammar) {
        Path tokenPath = path.resolve(grammar.getName() + "Token.java");
        try (var writer = Files.newBufferedWriter(tokenPath)) {
            String tokenList = grammar.getTokens().stream().map(Token::getName).collect(Collectors.joining(", ", "", ", END, EPS"));
            writer.write(String.format(tokenEnumTemplate, grammar.getName().toLowerCase(), grammar.getName(), tokenList));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
