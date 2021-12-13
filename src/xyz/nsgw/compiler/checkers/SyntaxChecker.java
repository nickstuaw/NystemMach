package xyz.nsgw.compiler.checkers;

public class SyntaxChecker {

    private final String s;

    public SyntaxChecker(final String str) {
        this.s = str;
    }

    public void checkBounds(char ch1, char ch2) {
        int i1 = findFirst(ch1), i2 = findFirst(ch2);
        if(i1 < 0) {

        }
    }


    private int findFirst(final char ch) {
        return s.indexOf(ch);
    }

}
