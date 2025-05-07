//Check whether a number is divisible by 5 and 7. 

import java.util.Scanner;
public class Q4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int num=sc.nextInt();

        if(num%5==0 && num%7==0)
        {
            System.out.println("number is divisible by 5 and 7");
        }
        else
        {
            System.out.println("number is not divisible by 5 and 7");
        }
    }
}