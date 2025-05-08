//30. Accept three subject marks from the user and display total, percentage, and class.

import java.util.Scanner;
public class Q30 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("enter marks of first subject(out of 100)");
         double a=sc.nextDouble();
         System.out.println("enter marks of second subject(out of 100)");
         double b=sc.nextDouble();
         System.out.println("enter marks of third subject(out of 100)");
         double c=sc.nextDouble();
         double total=a+b+c;

        double per=(total/300)*100;
        System.out.println("total is "+total);
        System.out.println("Total persentage "+per+"%");
        if(per >=90)
            {
                System.out.println("Distinction");
            }
            else if(per >=70 && per <90)
            {
                System.out.println("First class");
            }
            else if(per >=50 && per <70)
            {
                System.out.println("Second class");
            }
            else if(per >=40 && per <50)
            {
                System.out.println("Third class");
            }
            else
            {
                System.out.println("Fail");
            }
    }
}
