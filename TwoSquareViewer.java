import javax.swing.*;

/**
 * Created by Qursan on 10/09/22.
 */
public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame frame =new JFrame("first frame");
        frame.setVisible(true);
        frame.setSize(900,900);
        TwoSquareComponent h=new TwoSquareComponent();
        frame.add(h);
    }
}
