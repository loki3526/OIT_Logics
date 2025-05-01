//Write a program to find the square root of a given number (use sqrt () function)? Math.sqrt(a)
import java.util.Scanner;
public class Q12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        Double a=sc.nextDouble();

        System.out.println("The squrate is "+Math.sqrt(a));
    }
}
