// Accept ATM pin number (1234) and check whether it is valid or not.

import java.util.Scanner;
public class Q18 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the password please!");
         int pass=sc.nextInt();
         if(pass ==1234)
         {
            System.out.println("Password is correct!!!");
         }
         else
         {
            System.out.println("Someting is wrong!");
            System.out.println("Try again!");
         }
    }
}
