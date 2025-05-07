// Accept ATM balance and withdrawal amount, then check sufficient balance and display the remaining balance. 

import java.util.Scanner;
public class Q20 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        double b = 6572.0;
        System.out.print("Enter withdrawal amount : ");
        double w = sc.nextDouble();

        if(w <= b)
        {
            b -= w;
            System.out.println("Amound withdrawed successfully!");
            System.out.println("Remaining balance is : "+b);
        }
        else
        {
            System.out.println("Insufficient fund!!!");
            System.out.println("Current balance is : "+b);
        }
    }
}
