//LoadingBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PintAqui extends JPanel implements Runnable
{
    int delay = 18;
	int x = 0;
    int percent = 0;
    
    public PintAqui()
    {
        Thread t = new Thread(this);
		t.start();
    }
    
    @Override
    public void paint(Graphics g)
    {
		super.paint(g);
        //Graphics2D g2d = (Graphics2D) g;
        g.setFont(new Font("Arial", 1, 21));
        g.drawString(""+percent+" %", (LoadingBar.WIDTH/2)-20, (LoadingBar.HEIGHT/2)-105);
        g.setColor(Color.MAGENTA);
        g.drawRect((LoadingBar.WIDTH/2)-210, (LoadingBar.HEIGHT/2)-90, 400, 50);
        g.fillRect((LoadingBar.WIDTH/2)-210, (LoadingBar.HEIGHT/2)-90, x, 50);
		
        //g.dispose();
    }
	
	public void atualizar()
    {
        if (x == 400)
			x = 0;
        if (x != 400) {
            x++;
            percent = (100*x)/400;
        }
    }
	
	@Override
    public void run()
    {
        while (true)
        {
            atualizar(); //atualiza
            repaint(); //pinta
            try {
				Thread.sleep(20);
			} catch (InterruptedException ex) {
				//Logger.getLogger(Java2DTeste.class.getName()).log(Level.SEVERE, null, ex);
				ex.printStackTrace();
			}
        }
    }
}
