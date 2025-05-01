//The total mechanical energy of a particle is given by e = mgh+(1/2) mv^2?
import java.util.*;
public class Q22 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the mass");
        Double m=sc.nextDouble();

        System.out.println("Enter the velocity");
        Double v=sc.nextDouble();

        System.out.println("Enter the height");
        Double h=sc.nextDouble();

        Double g=9.8;

        Double pe=m*g*h;
        Double ke=0.5*m*v*v;

        System.out.println("Total mechanical enery is " +pe+ke);
    }
}
