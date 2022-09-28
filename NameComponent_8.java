import javax.swing.*;
import java.awt.*;

/**
 * Created by Qursan on 10/09/22.
 */
public class NameComponent_8 extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.yellow);

        Rectangle r=new Rectangle(200,190,100,100);
        g2.fill(r);
        g2.setColor(Color.black);
        g2.drawString("hanan",235,250);


    }
}
