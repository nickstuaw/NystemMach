package xyz.nsgw;

import java.util.ArrayList;
import java.util.List;

public class ContainedComparator extends Comparator {

    private final Character[] array;

    public ContainedComparator(String array, TokenType type) {
        super(type);
        List<Character> tmp = new ArrayList<>();
        for(char ch : array.toCharArray()) {
            tmp.add(ch);
        }
        this.array = tmp.toArray(Character[]::new);

    }

    @Override
    public boolean runCheck(char ch) {

        return List.of(array).contains(ch);

    }

}
