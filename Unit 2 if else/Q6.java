//Find the maximum of two numbers.

import java.util.Scanner;
public class Q6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the first number");
        int b=sc.nextInt();

        if(a>b)
        {
            System.out.println("First number is max");
        }
        else
        {
            System.out.println("Second number is max");
        }
    }
}
