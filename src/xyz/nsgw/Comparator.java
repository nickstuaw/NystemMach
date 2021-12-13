package xyz.nsgw;

public abstract class Comparator {

    private TokenType tokenType;

    public Comparator(TokenType type) {
        this.tokenType = type;
    }

    public abstract boolean runCheck(char ch);

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

}
