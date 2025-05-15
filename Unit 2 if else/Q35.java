//Check whether a character is uppercase, lowercase, or something else. 

import java.util.Scanner;

public class Q35 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch))
        {
            System.out.println("Input is Uppercase");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println("Input is Lowercase");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("Input is Digit");
        }
        else
        {
            System.out.println("Input is symbol");
        }

    }
}
