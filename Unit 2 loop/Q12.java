// Accept two numbers n and m from the user and print the sum of numbers between n and m.

import java.util.Scanner;
public class Q12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start");
        int n=sc.nextInt();
        System.out.println("Enter end");
        int m=sc.nextInt();
        int sum=0;

        while(n<=m)
        {
            sum=sum+n;
            n++;
            System.out.println(n);
        }
        System.out.println("Sum is "+sum);
    }
}
