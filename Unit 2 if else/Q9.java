//Check whether the first number is between the second and third.
import java.util.*;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num :");
        int a = sc.nextInt();

        System.out.println("Enter second num :");
        int b = sc.nextInt();

        System.out.println("Enter third num :");
        int c = sc.nextInt();

        if(b < a && a < c)
        {
            System.out.println(a+ " is betweeen "+b+" & "+c);
        }
        else
        {
            System.out.println(a+ " is not betweeen "+b+" & "+c);
        }

    }
}