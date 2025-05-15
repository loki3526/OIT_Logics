//Find whether a number is even or odd. 

import java.util.Scanner;
public class Q01 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("The number is even boi");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
