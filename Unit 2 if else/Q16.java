// Accept loan amount and calculate interest and EMI.

import java.util.Scanner;
public class Q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount : ");
        double loan = sc.nextDouble();

        System.out.print("Enter duration (6 or 12 months) : ");
        int month = sc.nextInt();

        double rate = 0;

        if( month == 6)
        {
            rate = 0.02;
        }
        else
        {
            rate = 0.03;
        }

        double interest = loan * rate;
        double emi = (loan + interest) / month;

        System.out.println("Total interest : "+interest);
        System.out.println("Monthly EMI : "+emi);
        

        
    }
}