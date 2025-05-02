// Write a program to find the volume of a cylinder? 
import java.util.Scanner;

public class Q16
{
    public static void main(String[] args) 
    {
         System.out.println("\n---Volume of Cylinder---");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the radius of cylinder : ");
        Double r = sc.nextDouble();
        System.out.print("\nEnter the height of cylinder : ");
        Double h = sc.nextDouble();
        Double vol = 3.14 * r * h ;
        System.out.println("Volume of Cylinder is :"+vol);

    }
}
