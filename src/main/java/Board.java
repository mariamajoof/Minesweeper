public class Board {
    private Tile[][] board = new Tile[GameLayout.y][GameLayout.x];

    public Board(){
        int excessTile = GameLayout.bombCount;
        double probability = (double) GameLayout.bombCount / (GameLayout.x * GameLayout.y);
        for (int i = 0; i < GameLayout.y; i++) {
            for (int j = 0; j < GameLayout.x; j++) {
                if (Math.random() < probability && excessTile > 0) {
                    board[i][j] = new Tile(true);
                    excessTile--;

                }else{
                    board[i][j] = new Tile(false);
                }

            }

        }

    }
    //Creating a method to calculate nearby  bomb each tile
    private void bombCalculator(){
        for (int k = 0; k < GameLayout.y; k++) {
            for (int l = 0; l < GameLayout.x; l++) {
                if (!board[k][l].hasBomb()) {
                    int count = 0;

                    //Checking up
                    if (k > 0 && board[k-1][l].hasBomb())
                        count++;
                    //Checking down
                    if ( k < GameLayout.y-1 && board[k+1][l].hasBomb())
                        count++;
                    //Checking left
                    if (l > 0 && board[k][l-1].hasBomb())
                    count++;
                    //Checking right
                    if (l < GameLayout.x-1 && board[k][l+1].hasBomb())
                    count++;
                    //Checking top-left
                    if (l > 0 && k > 0 && board[k-1][l-1].hasBomb())
                    count++;
                    //checking top-right
                    if (l < GameLayout.x-1 && k > 0 && board[k-1][l+1].hasBomb())
                    count++;
                    //Checking down-left
                    if (l > 0 && k < GameLayout.y-1 && board[k+1][l-1].hasBomb())
                    count++;
                    //Checking down-right
                    if (k < GameLayout.x-1 && k < GameLayout.y-1  && board[k+1][l+1].hasBomb())
                    count++;

                    board[k][l].setBombNearby(count);
                }

            }
        }
    }

}
