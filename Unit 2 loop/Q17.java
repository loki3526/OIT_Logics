//Accept a character and a range n, then display the next n characters. 

import java.util.Scanner;
public class Q17 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        System.out.println("factor of "+n+" are :");
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
