//Print numbers from 1 to user-specified number n. 

import java.util.Scanner;

class Q02
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the end : ");
        int n= sc.nextInt();
        int i=1;

        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}