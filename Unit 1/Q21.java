//Write a program to find the simple interest and compound interest?
import java.util.*;
public class Q21 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Principle");
        Double p=sc.nextDouble();

        System.out.println("Enter the value of Rate");
        Double r=sc.nextDouble();

        System.out.println("Enter the value of Time");
        Double t=sc.nextDouble();

        Double s_int=(p*r*t)/100;
        System.out.println("Simple intrest is "+s_int);
        //Double c_int=((1+r/100)***t)-1;
        //System.out.println("Compund intest is "+c_int);
    }
}
