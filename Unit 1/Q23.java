// write a program to accept length breathe and height of room and accept length and height of doors and 
//window to calculate total area to be printed (including roof also) 2(lw+lh+wh)
import java.util.*;
public class Q23 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("---The values of room---");
        System.out.println("Enter the length");
        int l=sc.nextInt();

        System.out.println("Enter the breathe");
        int b=sc.nextInt();

        System.out.println("Enter the height");
        int h=sc.nextInt();
        int r=2*(l*b+l*h+b*h);

        System.out.println("---The values of door---");
        System.out.println("Enter the length");
        int l1=sc.nextInt();

        System.out.println("Enter the breathe");
        int b1=sc.nextInt();
        int d=l1*b1;

        System.out.println("---The values of door---");
        System.out.println("Enter the length");
        int l2=sc.nextInt();
        int w=l2*l2;

        System.out.println("total area of room " + (r-d-w));

    }
}
