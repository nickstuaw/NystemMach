package xyz.nsgw;

public class DirectComparator extends Comparator {

    private char character;

    public DirectComparator(char ch, TokenType type) {

        super(type);
        this.character = ch;

    }

    @Override
    public boolean runCheck(char ch) {
        return ch == character;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }


}
