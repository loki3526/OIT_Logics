import java.util.Scanner;
public class octal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n=sc.nextInt();

        String oct="";

            while(n>0)
            {
                int digit=n%2;
                oct=digit+oct;
                n=n/8;
            }
            System.out.println("Octal n : "+oct);
    }
}