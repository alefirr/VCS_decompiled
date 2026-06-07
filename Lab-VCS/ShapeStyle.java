public enum ShapeStyle {
    BORDER_3PX(1),
    DEFAULT(3),
    BORDER_7PX(4),
    GRADIENT(7),
    RED(8);

    private final int code;

    ShapeStyle(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}