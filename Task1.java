
import java.lang.Math;
import java.text.DecimalFormat;

public class Task1 {
    public static double radToDeg(double n){
        return n*(180/Math.PI);
    }
    public static double degToRed(double n){
        return n*(Math.PI/180);
    }

    public static void main(String args[])
    {
        DecimalFormat df = new DecimalFormat("#.####");
        double n=5.0;
        System.out.println(df.format(radToDeg(n)));
        System.out.println(df.format(degToRed(n)));

    }
}
