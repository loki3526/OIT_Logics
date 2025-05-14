//Accept a number n from the user and display the sum of numbers up to n. 
import java.util.Scanner;
public class Q09 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the end");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of n is : "+sum);
    }
}
