//Check whether a number is positive or negative.

import java.util.Scanner;
public class Q08 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();


        if(a>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}