import java.util.HashMap;
import java.util.Map;

public class SpeciesMap {
    static final Map<Integer, String> SPECIES_MAP;

    static {
        SPECIES_MAP = new HashMap<>();
        SPECIES_MAP.put(1, "dog");
        SPECIES_MAP.put(2, "cat");
        SPECIES_MAP.put(3, "horse");
    }
}
