//write a program to convert the temperature from Celsius to Kelvin unit

import java.util.Scanner;
public class Q49 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperture in celsius");
        Double c=sc.nextDouble();

        Double k=c+273.15;

        System.out.println("Temperature in Kelvin is "+k+" K");
    }
}
