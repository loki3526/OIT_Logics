//Write a program to find your age in days? 
import java.util.Scanner;

public class Q17
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");
        int agey = sc.nextInt();

        int aged = agey * 365;

        System.out.println("Your age in days :" + aged);
    }  
}
