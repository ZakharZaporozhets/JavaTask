import java.util.ArrayList;
import java.util.List;

class Constant {

    public static final String ONLY_LETTERS_REGEX = "[a-zA-Z]+";
    static final List<String> BAD_WORDS;
    static final List<String> COLORS;

    static {
        BAD_WORDS = new ArrayList<>();
        BAD_WORDS.add("Motherfucker");
        BAD_WORDS.add("Asshole");

        COLORS = new ArrayList<>();
        COLORS.add("brown");
        COLORS.add("white");
        COLORS.add("black");
    }

    private Constant() {
    }
}
