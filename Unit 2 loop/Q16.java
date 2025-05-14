//Compute the power of a number m^n

import java.util.Scanner;
public class Q16 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M");
        int m=sc.nextInt();
        System.out.println("Enter the N");
        int n=sc.nextInt();
        int i=1;
        int mul=1;

        while(i<=n)
        {
            mul=mul*m;
            i++;
        }
        System.out.println(mul);
    }
}
