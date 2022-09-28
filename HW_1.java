/**
 * Created by Qursan on 05/09/22.
 */
import java.awt.*;
public class HW_1 {
    public static void main(String[] args) {
        Rectangle h= new Rectangle(1,2,3,4);
        System.out.println("actual Width= "+h.getWidth());
        System.out.println("actual Height= "+h.getHeight());
        System.out.println("actual X= "+h.getX());
        System.out.println("actual Y= "+h.getY());

        System.out.println("//////////////////////");

        System.out.println("exepected Width="+"3");
        System.out.println("exepected Height="+"4");
        System.out.println("exepected X="+"1");
        System.out.println("exepected Y="+"2");


    }
}
