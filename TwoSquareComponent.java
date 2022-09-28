import javax.swing.*;
import java.awt.*;

/**
 * Created by Qursan on 10/09/22.
 */
public class TwoSquareComponent extends JComponent{
    public void paintComponent (Graphics g)
    {
        Rectangle r= new Rectangle(200,200,100,100);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fill(r);
        Rectangle face= new Rectangle(100,100,100,100);
        g2.setColor(Color.PINK);
        g2.fill(face);
    }
}
