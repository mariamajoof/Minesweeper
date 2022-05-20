package minesweeper;

public class Tile {
//Attributes
    int locationX, locationY;
    String display = " _ ";
    boolean bomb;
    boolean flag;
    boolean clearSpace;
    int bombNearby;
    int number;


    //Constructor
    public Tile(boolean bomb) {
        this.bomb = bomb;
        this.flag = false;
        this.clearSpace = false;
        this.bombNearby = 0;
        this.number = 0;
    }

    //Method

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void ClearSpace() {

        this.clearSpace = true;
    }
    public boolean hasBomb() {
        return this.bomb;
    }

    public void setBomb() {
        this.bomb = true;
    }

    public boolean isClearSpace() {
        return clearSpace;
    }

    public boolean isFlag() {

        return flag;
    }

    public void setBombNearby(int bombNearby) {
        this.bombNearby = bombNearby;
    }

    public int getBombNearby() {
        return bombNearby;
    }

    public void setNumber(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }
    public  String getDisplay(){
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    public void setLocation(int x, int y){
        locationX = x;
        locationY = y;
    }

    public boolean compare(int x, int y){
        boolean correct = false;
        if (locationX == x && locationY == y) {
            correct = true;

        }
        return correct;
    }
    public void showLocation(){
        System.out.println(locationX +"/" + locationY);
    }
}


