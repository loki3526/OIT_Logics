//Check whether a character is a special character.

import java.util.Scanner;

public class Q37 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch) || Character.isLowerCase(ch) ||Character.isDigit(ch))
        {
            System.out.println("Input is not symbol");
        }
        else
        {
            System.out.println("Input is symbol");
        }

    }
}
