//Accept age, weight, and haemoglobin level and check blood donation eligibility. 

import java.util.Scanner;
public class Q38 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter your age");
         int age=sc.nextInt();
         System.out.println("Enter your weight");
         double we=sc.nextDouble();
         System.out.println("Enter your haemoglobin level");
         double hl=sc.nextDouble();

         if(age>=17 && we>=50 && hl>=12.0)
         {
            System.out.println("Your are ready to donate blood");
         }
         else
         {
            System.out.println("Sorry your are sick");
         }


    }
}
