//Write a program to read the marks of 5 subjects and display the total, per, class 
import java.util.*;
public class Q20 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the marks of 1st sub (out of 100)");
        Double a=sc.nextDouble();

        System.out.println("Enter the marks of 2nd sub (out of 100)");
        Double b=sc.nextDouble();

        System.out.println("Enter the marks of 3rd sub (out of 100)");
        Double c=sc.nextDouble();

        System.out.println("Enter the marks of 4th sub (out of 100)");
        Double d=sc.nextDouble();

        System.out.println("Enter the marks of 5th sub (out of 100)");
        Double e=sc.nextDouble();

        Double total=a+b+c+d+e;
        Double per=(total/500)*100;

        System.out.println("Total of 5 subjest is "+total);
        System.out.println("Persentage is "+per);
    }
}