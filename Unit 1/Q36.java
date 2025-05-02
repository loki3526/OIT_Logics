// write a program to find the square root given number by using sqrt() function
import java.util.Scanner;

class Q36
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        Double num=sc.nextDouble();

        System.out.println("The squrate is "+Math.sqrt(num));
    }
}