//Write a program which accepts the amount in dollars and convert into rupees? 

import java.util.Scanner;
public class Q42 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount in dollars");
        Double d=sc.nextDouble();

        Double r=d*87;
        System.out.println("The amount in rupees is "+r+"Rs");
    }
}
