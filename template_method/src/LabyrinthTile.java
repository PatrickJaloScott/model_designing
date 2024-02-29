public class LabyrinthTile {
    private int coorinateX, coordinateY, direction;
    private final LabyrinthTileType tileType;
    private String storedTreasure;
    public LabyrinthTile(int x, int y, int dir, LabyrinthTileType tileType, String treasure) {
        this.coorinateX = x;
        this.coordinateY = y;
        this.direction = dir;
        this.tileType = tileType;
        this.storedTreasure = treasure;
    }

    public int getCoorinateX() {
        return coorinateX;
    }
    public void moveX(int direction) {
        this.coorinateX += direction;
    }

    public int getCoordinateY() {
        return coordinateY;
    }
    public void moveY(int direction) {
        this.coordinateY += direction;
    }

    public int getDirection() {
        return direction;
    }

    public LabyrinthTileType getTileType() {
        return tileType;
    }

    public String getStoredTreasure() {
        return storedTreasure;
    }
    public void collectTreasure() {
        this.storedTreasure = "";
    }
}
