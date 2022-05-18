import javax.swing.*;

public class GameLayout {
    private Board layout;

    //setting dimension of our tile
    public static int width = 40;
    public static int height= 40;
    public static  int x = 50;
    public static int y = 26;
    protected JFrame jFrameWindow;

    //Game layout Attributes
    public static int bombCount = 30;
    private int scoreBoardWidth = 100;
    private boolean  end = false;
    private boolean win = false;
    private int flags;

    public GameLayout(){
        jFrameWindow = new JFrame();
        layout = new Board();
        flags = bombCount;

        jFrameWindow.setTitle("Minesweeper");
        jFrameWindow.setSize(x * width, y* height);
        jFrameWindow.setDefaultCloseOperation(jFrameWindow.EXIT_ON_CLOSE);
        jFrameWindow.setVisible(true);
    }


}
