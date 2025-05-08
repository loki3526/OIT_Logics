//Find the maximum of four numbers.

import java.util.Scanner;
public class Q26_29 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter A");
         double a=sc.nextInt();
         System.out.println("Enter B");
         double b=sc.nextInt();
         System.out.println("Enter C");
         double c=sc.nextInt();
         System.out.println("Enter D");
         double d=sc.nextInt();

         if(a>b)
         {
           if(a>c)
           {
                if(a>d)
                {
                System.out.println("A is max");
                }
                else
                {
                System.out.println("D is max");
                }
           }
           else
           {
               System.out.println("C is max");
           }
         }
         else if(b>a)
         {
           if(b>c)
           {
                if(b>d)
                {
                System.out.println("B is max");
                }
                else
                {
                System.out.println("D is max");
                }
           }
           else
           {
               System.out.println("C is max");
           }
         }
         
    }
}
