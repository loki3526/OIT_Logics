// write a program to perform conversion of Millilitres to litres

import java.util.Scanner;
public class Q31 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in miliLiters");
        Double m=sc.nextDouble();

        Double total=m/1000;

        System.out.println("The value is : "+total+" meters");

    }
}