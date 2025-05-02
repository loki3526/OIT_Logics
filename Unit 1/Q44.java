//write a program to find arithmetic mean and harmonic mean

import java.util.Scanner;
public class Q44 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        Double num1 = sc.nextDouble();

        System.out.println("enter the second number: ");
        Double num2 = sc.nextDouble();
       
        Double am = (num1 + num2) / 2;
        Double hm = 2 / ((1 / num1) + (1 / num2));

        System.out.println("Arithmetic Mean: " + am);
        System.out.println("Harmonic Mean: " + hm);

    }
}
m