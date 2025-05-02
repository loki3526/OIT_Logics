// Write a program to print the area of triangle if three sides are given? 
import java.util.*;

class Q19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of A :");
        Double a=sc.nextDouble();
        
        System.out.print("Enter value of B :");
        Double b=sc.nextDouble();

        System.out.print("Enter value of C :");
        Double c=sc.nextDouble();

        Double s= (a+b+c)/2;
        System.out.println("Semi-perimeter is "+s);

        Double num= s*(s-a)*(s-b)*(s-c);

        System.out.println("Area of triangle :"+Math.sqrt(num)+" sq.cm");
    }
}