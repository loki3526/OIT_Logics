//The distance between two cities in Km. is input through the keyboard. Write a program 
//to convert and print the result in meters and centimetres?

import java.util.Scanner;
public class Q41 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance of between cities");
        Double c=sc.nextDouble();


        System.out.println("1st city distance in meter is "+c*1000+" m");
        System.out.println("1st city distance in centimeter is "+c*100000+" cm");
    }
}