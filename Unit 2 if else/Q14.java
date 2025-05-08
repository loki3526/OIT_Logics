//Accept basic salary and calculate tax based on given tax brackets.

import java.util.Scanner;
public class Q14 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("tax is %10 on 250001 - 500000 rs");
        System.out.println("tax is %20 on 500001 - 1000000 rs");
        System.out.println("tax is %30 on above 1000000 rs");
        System.out.println("Enter the amount");
        Double am=sc.nextDouble();

        if(am>250000 && am<500000)
        {
            Double dis=10.0/100;
            System.out.println("TAX is "+am*dis);
            Double fin=am-(am*dis);
            System.out.println("Amount after TAX is : "+fin+"rs");
        }
        else if(am>500000 && am<1000000)
        {
            Double dis=20.0/100;
            Double fin=am-(am*dis);
            System.out.println("TAX is  is : "+am*dis);
            System.out.println("Amount after TAX is : "+fin+"rs");
        }
        else if(am<250000)
        {
            System.out.println("You are poor no tax for you :)");
        }
        else
        {
            Double dis=30.0/100;
            Double fin=am-(am*dis);
            System.out.println("TAX is  is : "+am*dis);
            System.out.println("Amount after TAX is : "+fin+"rs");
        }
    }
}
