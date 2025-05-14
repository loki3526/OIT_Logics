//Print the multiplication table of a number using the * operator.

import java.util.Scanner;
public class Q13 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number you want");
        int n=sc.nextInt();
        int i=1;
        int mul=0;
        while(i<=10)
        {
            mul=n*i;
            System.out.println(mul);
            i++;
        }
    }
}
