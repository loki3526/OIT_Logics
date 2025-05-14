// Calculate the factorial of a given number n

import java.util.Scanner;
public class Q15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=n;
        int fact=1;

        while(i>0)
        {
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of num is "+fact);
    }
}
