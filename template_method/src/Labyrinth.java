public class Labyrinth extends Game {
    private final int boardSize = 8;
    private LabyrinthTile[][] tiles;
    private final String[] treasures = new String[] {
            "Dragon",
            "Goblet",
            "Necklace",
            "Painting",
            "Jar",
            "Diamond",
            "Ring",
            "Ghost",
            "Crown",
            "Scarab",
            "Keys",
            "Lizard",
            "Map",
            "Book",
            "Fairy",
            "Skull",
            "Owl",
            "Mouse",
            "Bat",
            "Treasure Chest",
            "Gem",
            "Helmet",
            "Sword",
            "Candlestick"
    };
    private int[] playerCollectedTreasures;
    private Player[] players;
    private int winner = 0;

    @Override
    void initializeGame() {
        tiles = new LabyrinthTile[boardSize][boardSize];
        randomizeBoard();
        playerCollectedTreasures = new int[playersCount];
        players = new Player[playersCount];
        players[0] = new Player(0,0, boardSize);
        players[1] = new Player(0,boardSize-1, boardSize);
        players[2] = new Player(boardSize-1,0, boardSize);
        players[3] = new Player(boardSize-1,boardSize-1, boardSize);
    }

    @Override
    void makePlay(int player) {
        Player currentPlayer = players[player];
        int randomDir = (int)(Math.random()*4);
        if(randomDir < 2) {
            int xDir = randomDir == 0 ? -1 : 1;
            currentPlayer.setCoordinateX(xDir);
        } else {
            int yDir = randomDir == 2 ? -1 : 1;
            currentPlayer.setCoordinateY(yDir);
        }
        LabyrinthTile currentTile = tiles[currentPlayer.getCoordinateX()][currentPlayer.getCoordinateY()];
        if(!currentTile.getStoredTreasure().isEmpty()) {
            playerCollectedTreasures[player]++;
            System.out.printf("Player %d found a treasure. They now have %d/6 treasures.\t", player+1, playerCollectedTreasures[player]);
            currentTile.collectTreasure();
        }
        System.out.printf("Player %d is now at tile %s\n", player+1, currentPlayer.getLocation());
    }

    @Override
    boolean endOfGame() {
        for (int i = 0; i < playersCount; i++) {
            if(playerCollectedTreasures[i] == 6) {
                winner = i;
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.printf("Player %s is the winner!", winner+1);
    }

    void randomizeBoard() {
        int randomTileDir, randomTileType, currentTreasureIndex = 0;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                randomTileDir = (int)(Math.random()*4);
                randomTileType = (int)(Math.random()*4);
                LabyrinthTileType tileType = LabyrinthTileType.fromInt(randomTileType);
                boolean hasTreasure = Math.random() > 0.3 && currentTreasureIndex < treasures.length-1;
                tiles[i][j] = new LabyrinthTile(i, j,
                        randomTileDir,
                        tileType,
                        (hasTreasure ? treasures[currentTreasureIndex++] : ""));
            }
        }
    }
}