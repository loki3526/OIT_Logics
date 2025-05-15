//Check whether a character is a vowel.

import java.util.Scanner;
public class Q33 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Character in vowel");
        }
        else
        {
            System.out.println("Character in not vowel");
        }
    }
}
