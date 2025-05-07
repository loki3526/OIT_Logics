//Check whether a number is divisible by 17.

import java.util.Scanner;
public class Q2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num%17==0)
        {
            System.out.println("The number is divisible by 17");
        }
        else
        {
            System.out.println("The number is not divisible by 17");
        }
    }
}
