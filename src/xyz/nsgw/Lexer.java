package xyz.nsgw;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

    private final String target;

    public Lexer(final String target) {
        this.target = target;
    }

    public List<TokenType> createTokens() {

        Comparator[] comparators = new Comparator[] {
                new ContainedComparator("0123456789", TokenType.DIGIT),
                new DirectComparator('+', TokenType.PLUS),
                new DirectComparator('-', TokenType.MINUS),
                new DirectComparator('*', TokenType.MUL),
                new DirectComparator('/', TokenType.DIV),
                new DirectComparator('(', TokenType.LBRACKET),
                new DirectComparator(')', TokenType.RBRACKET)
        };
        List<TokenType> tokens = new ArrayList<>();
        // The current character for the loop.
        char current;
        for(int i = 0; i < target.length(); i++) {
            current = target.charAt(i);
            for(Comparator c : comparators) {
                if(c.runCheck(current)) {
                    tokens.add(c.getTokenType());
                }
            }
        }

        return tokens;

    }

    public void makeNumber(String number) {
        boolean isFloating;
        for(char ch : number.toCharArray()) {
            if(ch == '.') {
                isFloating = true;
                break;
            }
        }
    }

}
