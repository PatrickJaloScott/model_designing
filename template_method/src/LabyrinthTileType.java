public enum LabyrinthTileType {
    STRAIGHT, BEND, T_SECTION, CROSS_SECTION;

    public static LabyrinthTileType fromInt(int x) {
        return switch (x) {
            case 0 -> STRAIGHT;
            case 1 -> BEND;
            case 2 -> T_SECTION;
            case 3 -> CROSS_SECTION;
            default -> null;
        };
    }
}
