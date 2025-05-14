// Accept a number n from the user and display the sum of even numbers up to n.
import java.util.Scanner;
public class Q10 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the end");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        
        while(i<=n)
        {
            if(i%2==0)
            {
                sum=sum+i;
                System.out.println("even nos are "+i);
            }
            i++;
        }
        System.out.println("Sum of even number is "+sum);
    }
}
