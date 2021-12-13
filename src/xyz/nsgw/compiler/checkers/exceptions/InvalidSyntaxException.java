package xyz.nsgw.compiler.checkers.exceptions;

public class InvalidSyntaxException extends Exception {

    public InvalidSyntaxException() {
        super();
    }

    public InvalidSyntaxException(final String message, final Throwable cause) {
        super(message, cause);
    }
    public InvalidSyntaxException(final String message) {
        super(message);
    }
    public InvalidSyntaxException(final String message, final int line) {
        super(concatenate(message, line));
    }

    public InvalidSyntaxException(final Throwable cause) {
        super(cause);
    }

    private static String concatenate(final String message, final int line) {
        return "Line " + line + ": "+ message;
    }

}
