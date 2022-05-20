package minesweeper;

import java.util.Scanner;

public class Game{

    //private Tile[][] Game = new Tile[GridLayout.y][GridLayout.x];
    public  Tile[][] map;

    public int length;


   /** public Game(){
        int excessTile = GridLayout.bombCount;
        double probability = (double) GridLayout.bombCount / (GridLayout.x * GridLayout.y);
        for (int i = 0; i < GridLayout.y; i++) {
            for (int j = 0; j < GridLayout.x; j++) {
                if (Math.random() < probability && excessTile > 0) {
                    Game[i][j] = new Tile(true);
                    excessTile--;

                }else{
                    Game[i][j] = new Tile(false);
                }

            }

        }

    }**/

    public void mapCreation(int col, int row) {
        map = new Tile[col][row];
        length = row;
    }
    //asking user input and
    public void scanGrid(Tile[][]map){
        Scanner input = new Scanner(System.in);
        System.out.println("What row do you want it on:");
        int choosenX = input.nextInt();
        System.out.println("What column do you want it on:");
        int choosenY = input.nextInt();


        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {
                //Display X on the grid layout base on user input
                if (map[i][j].compare(choosenX,choosenY)) {
                    map[i][j].display = " x ";
                    map[i][j].showLocation();
                    showMap();
                    scanGrid(map);
                }
                /**if (j == null) {

                }
                if (j == null) {
                    
                }**/
             }
        }

        //Showing bomb on the map
    }

    public Tile[][] getMap() {
        return map;
    }
// creating map in the console
    public void createMap(){
        for (int top = 0; top < length; top++) {

            System.out.print(top + " |");
        }
        System.out.println("");
        for (int i = 0; i < map.length; i++) {
            int index = i ;
            System.out.print(index + " |");
            for (int j = 0; j < map[i].length; j++) {
                Tile currentTile = new Tile(false);
                currentTile.setLocation(j,i);
                map[i][j] = currentTile;
                System.out.print(map[i][j].getDisplay());
            }
            System.out.println("");
        }
    }


    public void showMap(){
        System.out.print("   ");
        for (int top = 0; top < length; top++) {

            System.out.print(top + " |");
        }
        System.out.println("");
        for (int i = 0; i < map.length; i++) {
            int index = i;
            System.out.print(index + " |");
            for (int j = 0; j < map[i].length; j++) {

                System.out.print(map[i][j].getDisplay());
            }
            System.out.println("");
        }
    }
    //Displaying bomb on the map

    //Creating a method to calculate nearby  bomb on each tile
   /** private void bombCalculator(){
        for (int k = 0; k < GridLayout.y; k++) {
            for (int l = 0; l < GridLayout.x; l++) {
                if (!Game[k][l].hasBomb()) {
                    int count = 0;

                    //Checking up
                    if (k > 0 && Game[k-1][l].hasBomb())
                        count++;
                    //Checking down
                    if ( k < GridLayout.y-1 && Game[k+1][l].hasBomb())
                        count++;
                    //Checking left
                    if (l > 0 && Game[k][l-1].hasBomb())
                        count++;
                    //Checking right
                    if (l < GridLayout.x-1 && Game[k][l+1].hasBomb())
                        count++;
                    //Checking top-left
                    if (l > 0 && k > 0 && Game[k-1][l-1].hasBomb())
                        count++;
                    //checking top-right
                    if (l < GridLayout.x-1 && k > 0 && Game[k-1][l+1].hasBomb())
                        count++;
                    //Checking down-left
                    if (l > 0 && k < GridLayout.y-1 && Game[k+1][l-1].hasBomb())
                        count++;
                    //Checking down-right
                    if (k < GridLayout.x-1 && k < GridLayout.y-1  && Game[k+1][l+1].hasBomb())
                        count++;

                    Game[k][l].setBombNearby(count);
                }

            }
        }
    }
    public Tile[][]  getInstance() {
        return Game ;
    }**/

}
