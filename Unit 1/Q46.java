// write a program to find velocity and distance by using Newton's law

import java.util.Scanner;

public class Q46 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter initial velocity");
        Double iv = sc.nextDouble();

        System.out.println("enter acceleration");
        Double acc = sc.nextDouble();

        System.out.println("enter time");
        Double time = sc.nextDouble();

        Double fv = iv + (acc * time);
        Double distance = (iv * time) + (0.5 * acc * time * time);

        System.out.println("Final velocity "+ fv);
        System.out.println("Distance "+ distance);
    }
}
