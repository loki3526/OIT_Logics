//write a program to perform conversion of kilometres to metres

import java.util.Scanner;
public class Q29 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometer");
        int m=sc.nextInt();

        int total=m*1000;

        System.out.println("The value is : "+total+".meters");

    }
}