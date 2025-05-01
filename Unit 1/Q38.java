//The temperature of the city is input through the keyboard in Fahrenheit. Write a program to convert into Celsius? 

import java.util.Scanner;
public class Q38 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        Double f=sc.nextDouble();

        Double cel=(f-32)*5/9;

        System.out.println("The temperature in celsius is "+cel+" Celsius");
    }
}
