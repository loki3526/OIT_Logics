import java.util.Scanner;
class decimal
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Binary number");
    int n=sc.nextInt();

    int power=0;
    int dec=0;

    while(n>0)
    {
        int digit=n%10;
        dec += (digit *Math.pow(2,power));
        power++;
        n=n/10;
    }
    System.out.println("Decimal: "+dec);
}
}