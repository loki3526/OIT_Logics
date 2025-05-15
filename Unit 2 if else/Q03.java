//Find whether a year is a leap year. 

import java.util.Scanner;

public class Q03 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int num=sc.nextInt();

        if(num%4==0)
        {
            System.out.println("The year is leap year");
        }
        else
        {
            System.out.println("The year is not leap year");
        }
    }
}
