// Accept cost price and selling price, then find profit/loss in percentage/amount.

import java.util.Scanner;

class Q12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        Double cp = sc.nextDouble();

        System.out.println("Enter Selling price");
        Double sp = sc.nextDouble();

        Double pl = sp - cp;

        if(pl > 0)
        {
            Double pp = (pl/cp)*100;
            System.out.println("Profit is : "+pl+" rs.");
            System.out.println("Profit percentage : "+pp+" %");
        }
        else
        {
            Double lp = (-pl/cp)*100;
            System.out.println("Loss is : "+(-pl)+" rs.");
            System.out.println("Loss percentage : "+lp+" %");
        }
    }
}