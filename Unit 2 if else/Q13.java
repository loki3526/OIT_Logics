//Accept amount and apply discount based on the amount range.

import java.util.Scanner;
public class Q13 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Discount %5 on 500rs and 10% on 1000rs");
        System.out.println("Enter the amount");
        Double am=sc.nextDouble();

        if(am>=500 && am<1000)
        {
            System.out.println("Order above 500rs get 5% discout");
            Double dis=5.0/100;
            System.out.println("discount is : "+am*dis);
            Double fin=am-(am*dis);
            System.out.println("price after discount is : "+fin+"rs");
        }
        else if(am>=1000)
        {
            System.out.println("Order above 1000rs get 10% discout");
            Double dis=10.0/100;
            Double fin=am-(am*dis);
            System.out.println("discount is : "+am*dis);
            System.out.println("price after discount is : "+fin+"rs");
        }
        else
        {
            System.out.println("no discount on "+am);
        }
    }
}
