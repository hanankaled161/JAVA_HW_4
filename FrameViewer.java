import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Created by Qursan on 08/09/22.
 */
public class FrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JLabel label = new JLabel("Hello, Hanan!");
        label.setOpaque(true);
        label.setBackground(Color.GREEN );
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }}
