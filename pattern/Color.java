package pattern;

public enum Color {
    UNKNOWN("unknown"),
    BROWN("brown"),
    WHITE("white"),
    BLACK("black");

    String color;

    Color(String color) {
        this.color = color;
    }

    public static Color stringToColor(String colorString) {
        switch (colorString) {
            case "brown" -> {
                return Color.BROWN;
            }
            case "white" -> {
                return Color.WHITE;
            }
            case "black" -> {
                return Color.BLACK;
            }
            default -> {
                return Color.UNKNOWN;
            }
        }
    }
}
