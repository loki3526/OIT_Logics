//Print "Welcome" message n times.
import java.util.Scanner;
public class Q08 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int i=0;

        while(i<=n)
        {
            System.out.println("Welcome");
            i++;
        }
    }
}
