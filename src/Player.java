import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Player extends Sprite implements Commons{

    private final int START_Y = 20; 
    private final int START_X = 500;

    private final String player = "rocket.png";
    private int width;
    private int heigth;
    public Player() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

        width = ii.getImage().getWidth(null); 

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        y += dy;
        if (y <= 2) 
            y = 2;
        if (y >= BOARD_HEIGTH - 2*heigth) 
            y = BOARD_HEIGTH - 2*heigth;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP)
        {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN)
        {
            dy = 2;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP)
        {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN)
        {
            dy = 0;
        }
    }
}