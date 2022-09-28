import java.awt.*;

/**
 * Created by Qursan on 05/09/22.
 */
public class HW_4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);

        System.out.println("actual Width result: "+box.getWidth());
        System.out.println("exepected Width: 25 ");
        System.out.println("actual Height result: "+box.getHeight());
        System.out.println("exepected Height: 40");

    }
}
