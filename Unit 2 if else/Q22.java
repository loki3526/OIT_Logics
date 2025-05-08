// Read three sides (a, b, c) of a triangle and print its type.


import java.util.Scanner;

public class Q22{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = sc.nextDouble();

        System.out.print("Enter b : ");
        double b = sc.nextDouble();

        System.out.print("Enter c : ");
        double c = sc.nextDouble();

        if(a>0 && b>0 && c>0)
        {
            if(a==b && b==c)
            {
                System.out.println("Equilateral triangle");
            }
            else if(a==b || b==c || a==c)
            {
                System.out.println("Isosceles triangle");
            }
            else if(
                a*a + b*b == c*c ||
                b*b + c*c == a*a ||
                c*c + a*a == b*b
            )
            {
                System.out.println("Right angled triangle");
            }
            else if(a!=b && b!=c && c!=a)
            {
                System.out.println("Scalene triangle");
            }
        }
        else
        {
            System.out.println("Not a triangle");
        }
    }
}