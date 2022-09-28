/**
 * Created by Qursan on 05/09/22.
 */
public class HW_3 {
    public static void main(String[] args) {
        String n=new String("Mississippi");
        n=n.replace("i","!");
        System.out.println("actual result: "+n);
        System.out.println("exepected: M!ss!ss!pp!");

        n=n.replace("s","$");
        System.out.println("actual result: "+n);
        System.out.println("exepected: M!$$!$$!pp!");

    }
}
