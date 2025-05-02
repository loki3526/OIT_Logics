// write a program to find the area and perimeter of the ring

import java.util.Scanner;
public class Q47 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the outer circle ");
        Double or = sc.nextDouble();
        System.out.println("Enter the radius of the inner circle ");
        Double ir = sc.nextDouble();

        Double area = 3.14 * (or * or - ir * ir);
       
        Double peri = 2 *3.14 * (or + ir);

        System.out.println("Area is "+area);
        System.out.println("Perimete is "+peri);

}
}