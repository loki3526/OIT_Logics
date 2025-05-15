// Accept age and check whether a person is eligible for voting. 

import java.util.Scanner;
public class Q17 {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible for vote");
        }
        else
        {
            System.out.println("Your are not eligible for vote");
        }
    }
}
