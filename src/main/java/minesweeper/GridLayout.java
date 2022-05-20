package minesweeper;

public class GridLayout {

    private Game layout;

    // Rows and Columns
    private static final int numOfRows = 12;
    private static final int numOfCols = 12;

    public static int bombCount = 30;

    private int flags;

    public static  int x = 25;

    public static int y = 15;

    //Constructors

    public GridLayout() {

        //layout = new Game();
        flags = bombCount;

        for (int row = 0; row < numOfRows; row++) {
            String index = String.format("%1$2s", row + 1);
            System.out.print(index + " |");
            for (int column = 0; column < numOfCols; column++) {
                System.out.print("_ \t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
