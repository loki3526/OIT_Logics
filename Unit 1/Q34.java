// write a program to find remainder and quotient by accepting divisor and dividend

import java.util.Scanner;
public class Q34 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the value of Dividend");
        Double dividend=sc.nextDouble();

        System.out.println("Enter the value of Divisor");
        Double divisor=sc.nextDouble();

        Double reminder=dividend%divisor;
        Double quotient=dividend/divisor;

        System.out.println("The quotient : "+quotient);
        System.out.println("The reminder : "+reminder);
    }
}
