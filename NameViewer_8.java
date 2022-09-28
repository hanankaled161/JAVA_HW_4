import org.omg.CosNaming.NameComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Qursan on 10/09/22.
 */
public class NameViewer_8 {
    public static void main(String[] args) {
        JFrame f= new JFrame("My Frame");
        f.setSize(900,900);
        f.setVisible(true);
        NameComponent_8 n=new NameComponent_8();
        f.add(n);



    }

}
