//Accept 10th, 12th, and graduation marks, then check eligibility for an interview. 

import java.util.Scanner;
public class Q31 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("enter 10th marks");
         double a=sc.nextDouble();
         System.out.println("enter marks 12th");
         double b=sc.nextDouble();
         System.out.println("enter marks of graduation");
         double c=sc.nextDouble();
         double total=a+b+c;

         if(a>=60 && b>=60 && c>=60)
         {
            System.out.println("you are eligible for interview");
         }
         else{
            System.out.println("sorry your not eligible");
         }
    }
}
