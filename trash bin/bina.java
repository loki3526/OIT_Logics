import java.util.Scanner;
public class bina
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n=sc.nextInt();

        String bin="";

            while(n>0)
            {
                int digit=n%2;
                bin=digit+bin;
                n=n/2;
            }
            System.out.println("binary : "+bin);
    }
}