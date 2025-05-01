//write a program to find the surface area of cylinder(2πr (r + h))

import java.util.Scanner;
public class Q45 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of radius");
        Double r=sc.nextDouble();

        System.out.println("enter the value of height");
        Double h=sc.nextDouble();

        Double area=2*3.14*r*(r+h);

        System.out.println("Area : "+area);
    }
}
