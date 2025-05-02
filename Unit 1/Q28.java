// write a program to perform conversion of litres to millilitres

import java.util.Scanner;
public class Q28 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of liquid in Liters");
        int l=sc.nextInt();

        int total=l*1000;

        System.out.println("The value is : "+total+".mililiters");

    }
}
