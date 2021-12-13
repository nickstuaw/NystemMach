package xyz.nsgw.compiler;

import xyz.nsgw.compiler.checkers.exceptions.InvalidSyntaxException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Splitter {

    private String notSplit;
    private int line;

    public Splitter(final String toSplit) {
        this.notSplit = toSplit;
    }

    public String[] split() throws InvalidSyntaxException {
        String[] split = new String[]{};
        // Index of equals sign
        int eI = find('=');
        // Index of open bracket
        int obI = find('(');
        // Index of closed bracket
        int cbI = find(')');
        if(obI > cbI) {
            throw new InvalidSyntaxException("Expected '(' before ')'", line);
        } else {
            if(eI < obI) {
                String id = notSplit.split("=")[0];
                if(id.length() < 1) {
                    throw new InvalidSyntaxException("No identifier found before '='");
                }
                List<String> proposal = Arrays.stream(notSplit.split("=")).collect(Collectors.toList());
                String proposedValue = String.join(String.join("=", proposal.subList(1, proposal.size())));
            }
        }
        return split;

    }

    private int find(final char ch) {

        return notSplit.indexOf(ch);

    }

    public String getStringToSplit() {
        return notSplit;
    }

    public void setStringToSplit(String notSplit) {
        this.notSplit = notSplit;
    }
}
