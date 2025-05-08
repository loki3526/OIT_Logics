//Accept number of vaccines taken, if 2 vaccines then print eligible for interview.

import java.util.Scanner;
public class Q19 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter how many vaccines you taken");
         int v=sc.nextInt();

         if(v>=2)
         {
            System.out.println("You are eligible for interview");
         }
         else
         {
            System.out.println("Take vaccine first");
         }
    }
}
