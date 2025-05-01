// write a program to find kinetic energy and potential energy

import java.util.Scanner;
public class Q43 {
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

        System.out.println("Potential energy : "+pe);
        System.out.println("Kinetic energy : "+ke);
    }
}
