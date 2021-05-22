//LoadingBar;

import java.awt.Graphics;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoadingBar extends JFrame
{
    public static int WIDTH=600, HEIGHT=400;
    PintAqui pAqui = new PintAqui();
    
    public LoadingBar()
    {
        add(pAqui);
        setVisible(true);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        new LoadingBar();
    }
}