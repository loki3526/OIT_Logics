// Write a program to find the area of a sphere? 
import java.util.Scanner;
public class Q15
{
    public static void main(String[] args)
    {

        System.out.println("\n---Volume of Sphere---");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the radius of sphere : ");

        Double radius = sc.nextDouble();
        Double vol = 1.33 * 3.14 * radius * radius * radius ;
        System.out.println("Volume of sphere is :"+vol);

    
    }
}

