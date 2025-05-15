// Accept marks in three subjects, if marks in each subject ≥ 40, then display class, else print fail/ATKT

import java.util.Scanner;
public class Q32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter python : ");
        int p = sc.nextInt();

        System.out.println("Enter java : ");
        int j = sc.nextInt();
        
        System.out.println("Enter cpp : ");
        int c = sc.nextInt();

        if( p >=40 && j>=40 && c>=40)
        {
            int total = p+j+c;
            double per = total/3.0;

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
        else
        {
            System.out.println("ATKT");
        }
    }
}