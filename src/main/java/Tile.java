public class Tile {
//Attributes
    boolean bomb;
    boolean flagged;
    boolean clearSpace;
    int bombNearby;

    //Constructor
    public Tile(boolean bomb) {
        this.bomb = bomb;
        this.flagged = false;
        this.clearSpace = false;
        this.bombNearby = 0;
    }

    //Method

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public void ClearSpace() {
        this.clearSpace = true;
    }
    public boolean hasBomb() {
        return bomb;
    }

    public boolean isClearSpace() {
        return clearSpace;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setBombNearby(int bombNearby) {
        this.bombNearby = bombNearby;
    }

    public int getBombNearby() {
        return bombNearby;
    }
}


