// Find the minimum of three numbers. 

//Find the maximum of three numbers using nested if-else. 

import java.util.Scanner;
public class Q25 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter A");
         double a=sc.nextInt();
         System.out.println("Enter B");
         double b=sc.nextInt();
         System.out.println("Enter C");
         double c=sc.nextInt();

         if(a<b)
         {
            if(a<c)
            {
                System.out.println("A is min");
            }
            else
            {
                System.out.println("B is min");
            }
         }
         if(b<a)
         {
            if(b<c)
            {
                System.out.println("B is min");
            }
            else
            {
                System.out.println("C is min");
            }
         }
    }
}
