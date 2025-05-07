// Find the maximum of two numbers using the ternary operator.

import java.util.Scanner;
public class Q27 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter first number");
         int a=sc.nextInt();
         System.out.println("Enter second number");
         int b=sc.nextInt();

         String ans =(a>b)? "First num is max" : "Second number is max";

         System.out.println(ans);

    }
}
