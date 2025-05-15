import java.util.Scanner;
class octal2
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the octal number");
    int n=sc.nextInt();

    int power=0;
    int oct=0;

    while(n>0)
    {
        int digit=n%10;
        oct += (digit *Math.pow(8,power));
        power++;
        n=n/10;
    }
    System.out.println("Decimal: "+oct);
}
}