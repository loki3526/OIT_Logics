//Find the maximum of three numbers using nested if-else. 

import java.util.Scanner;
public class Q24 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter A");
         double a=sc.nextInt();
         System.out.println("Enter B");
         double b=sc.nextInt();
         System.out.println("Enter C");
         double c=sc.nextInt();

         if(a>b)
         {
            if(a>c)
            {
                System.out.println("A is max");
            }
            else
            {
                System.out.println("B is max");
            }
         }
         if(a<b)
         {
            if(b>c)
            {
                System.out.println("B is max");
            }
            else
            {
                System.out.println("C is max");
            }
         }
    }
}
