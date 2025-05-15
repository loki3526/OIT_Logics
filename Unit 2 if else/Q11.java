//Check whether the third number is between the first and second. 

import java.util.*;
public class Q11
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

        if(a < c && c < b)
        {
            System.out.println(a+ " is betweeen "+b+" & "+c);
        }
        else
        {
            System.out.println(a+ " is not betweeen "+b+" & "+c);
        }

    }
}