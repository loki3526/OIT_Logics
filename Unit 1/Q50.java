// Write a programme to accept a Number from user and display its ascii value

import java.util.Scanner;
public class Q50 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        char ans=(char)num;
        System.out.println("The ascii value is "+ans);

    }
}
