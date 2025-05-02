// write a program to perform conversion of metres to kilometres

import java.util.Scanner;
public class Q32 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in Meters");
        Double m=sc.nextDouble();

        Double total=m/1000;

        System.out.println("The value is : "+total+" Kilometers");

    }
}