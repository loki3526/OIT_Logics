// Check whether a character is an alphabet or not. 
import java.util.Scanner;
public class Q34 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
        {
            System.out.println("Input is Alphabet");
        }
        else
        {
            System.out.println("Input in not alphabet");
        }

    }
}
