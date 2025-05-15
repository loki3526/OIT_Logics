//Accept month number and print the number of days in that month. 

import java.util.Scanner;
public class Q43 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("1.jan");
        System.out.println("2.feb");
        System.out.println("3.mar");
        System.out.println("4.apr");
        System.out.println("5.may");
        System.out.println("6.jun");
        System.out.println("7.jul");
        System.out.println("8.aug");
        System.out.println("9.sep");
        System.out.println("10.oct");
        System.out.println("11.nov");
        System.out.println("12.dec");
        System.out.println("Enter the month No.");
        int m=sc.nextInt();

        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        {
            System.out.println("This month have total 31 days");
        }
        else if (m==2) 
        {
            System.out.println("Is this leap year? 1/0");
            int l=sc.nextInt();
            if(l==1)
            {
                System.out.println("This month have total 29 days");
            }
            else
            {
                System.out.println("This month have total 28 days");
            }
        }
        else
        {
            System.out.println("This month have total 30 days");
        }

    }
}
