// Accept product category and apply a discount based on category: 
//o Electronics → 10% discount 
//o Clothing → 15% discount, 20% if amount > ₹5000 
//o Food → No discount, but 5% if amount > ₹1000
import java.util.Scanner;
public class Q42 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.electronic deives");
        System.out.println("2.clothing");
        System.out.println("3.food");
        System.out.println("Enter the category No");
        int ch=sc.nextInt();
        System.out.println("Enter amount you spended");
        double amt=sc.nextDouble();

        if(ch==1)
        {
            System.out.println("you will get 10% discount");
            double dis=amt*0.10;
            System.out.println("discount is "+dis);
            System.out.println("Discounted price is "+(amt-dis)+" Rs");
        }
        else if(ch==2)
        {
            if(amt>5000)
            {
            System.out.println("you will get 20% discount");
            double dis=amt*0.20;
            System.out.println("discount is "+dis);
            System.out.println("Discounted price is "+(amt-dis)+" Rs");
            }
            else
            {
            System.out.println("you will get 15% discount");
            double dis=amt*0.15;
            System.out.println("discount is "+dis);
            System.out.println("Discounted price is "+(amt-dis)+" Rs");
            }
        }
        else if(ch==3)
        {
            if(amt>1000)
            {
            System.out.println("you will get 5% discount");
            double dis=amt*0.05;
            System.out.println("discount is "+dis);
            System.out.println("Discounted price is "+(amt-dis)+" Rs");
            }
        }
        else
        {
            System.out.println("No discount for you bud");
        }

    }
}
