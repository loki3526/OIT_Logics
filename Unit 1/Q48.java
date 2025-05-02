// write a program to find the volume and surface area of cuboid

import java.util.Scanner;

public class Q48 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Height");
        Double h=sc.nextDouble();
        System.out.println("Enter the width");
        Double w=sc.nextDouble();
        System.out.println("Enter the length");
        Double l=sc.nextDouble(); 

        Double vol=h*w*l;
        Double area=2*(h*w+w*l+h*l);

        System.out.println("Area : "+area);
        System.out.println("Volume : "+vol);
    }
}
