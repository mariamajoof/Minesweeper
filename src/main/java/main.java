import minesweeper.Game;
import minesweeper.Tile;
import minesweeper.GridLayout;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Game game = new Game();
        game.mapCreation(16, 16);
        game.createMap();
        game.scanGrid(game.map);
       /** System.out.println(game);

        GridLayout  gridLayout= new GridLayout();
        System.out.println(gridLayout);

        Tile tile = new Tile(false);
        System.out.println(tile);**/

        /**Scanner  myScannerInput = new Scanner(System.in);

        System.out.print("Welcome to Minesweeper Game, Select any key to begin:");
        int selectKeyToStart = myScannerInput.nextInt();
         boolean selectKeyToStart = false
        if (selectKeyToStart == true) {

         System.out.println("Enter a number: ");
        }


        int widthSize = myScannerInput.nextInt();**/

        /**if (select a bomb) {

            System.out.println("Game Over: ");
        } else if () {
            // User flag a bomb, game continue
        }else {
           // game continue
        }**/




    }
}
