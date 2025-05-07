//. Write a program that calculates the movie ticket price based on age (children under 12 get 
//a discount, seniors over 65 also get a discount).

import java.util.Scanner;
public class Q39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if (age<=12 || age>=65) {
            System.out.println("Congrats!!! you will get 15% discount on ticket");
        }
        else
        {
            System.out.println("No discount for you buddy!");
        }
    }
}