// Check whether a number is 1-digit, 2-digit, 3-digit, 4-digit, or above. 

import java.util.*;
public class Q21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");;
        int n = sc.nextInt();

        if(n<0)
        {
            n = -n;
        }

        if(n >= 0 && n <= 9)
        {
            System.out.println("Given number is 1-digit");
        }
        else if(n >= 10 && n <= 99)
        {
            System.out.println("Given number is 2-digit");
        }
        else if(n >= 100 && n <= 999)
        {
            System.out.println("Given number is 3-digit");
        }
        else if(n >= 1000 && n <= 9999)
        {
            System.out.println("Given number is 4-digit");
        }
        else {
            System.out.println("Given number is above 4-digit");
        }
    }
}