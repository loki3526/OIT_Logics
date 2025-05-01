/*Given the coordinates of two points (x1,y1) and (x2,y2). Write a program to find the distance
between these two points?*/

import java.util.*;

public class Q39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x1 :");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1 :");
        double y1 = sc.nextDouble();

        System.out.println("Enter x2 :");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2 :");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance is: " + distance);
    }
}