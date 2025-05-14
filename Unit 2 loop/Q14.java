//Print the multiplication table of a number without using the * operator. 

import java.util.Scanner;
public class Q14 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        int t=0;

        while(i<=10)
        {
            t=t+n;
            i++;
            System.out.println(t);
        }
    }
}
