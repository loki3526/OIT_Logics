// Check whether a character is a digit or not. 

import java.util.Scanner;

public class Q36 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        char ch=sc.next().charAt(0);


        if(Character.isDigit(ch))
        {
            System.out.println("Input is Digit");
        }
        else
        {
            System.out.println("Input is not Digit");
        }

    }
}
