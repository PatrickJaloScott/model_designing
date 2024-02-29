public class Player {
    private int coordinateX, coordinateY, boardSize;

    public Player(int coordinateX, int coordinateY, int bounds) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.boardSize = bounds;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX += coordinateX;
        if(this.coordinateX < 0) {
            this.coordinateX = 0;
        }
        if(this.coordinateX >= this.boardSize) {
            this.coordinateX = this.boardSize-1;
        }
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY += coordinateY;
        if (this.coordinateY < 0) {
            this.coordinateY = 0;
        }
        if (this.coordinateY >= this.boardSize) {
            this.coordinateY = this.boardSize-1;
        }
    }

    public String getLocation() {
        return String.format("[%d,%d]", this.coordinateX, this.coordinateY);
    }
}
