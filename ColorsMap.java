import java.util.HashMap;
import java.util.Map;

public class ColorsMap {
    static final Map<Integer, String> COLORS_MAP;

    static {
        COLORS_MAP = new HashMap<>();
        COLORS_MAP.put(1, "brown");
        COLORS_MAP.put(2, "white");
        COLORS_MAP.put(3, "black");
    }
}