public enum ShapeType {
    HEXAGON_LIKE(1),
    STAR(3),
    SQUARE(5),
    TRIANGLE(7),
    CIRCLE_WITH_CUT(9);

    private final int code;

    ShapeType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}