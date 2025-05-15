// Accept weekday/weekend & age, then calculate movie ticket pricing: 
//o Children (<13 years) → ₹100 (Weekdays), ₹120 (Weekends) 
//o Adults (13-64 years) → ₹150 (Weekdays), ₹180 (Weekends) 
//o Seniors (≥65 years) → ₹130 (Weekdays), ₹150 (Weekends)

import java.util.Scanner;
public class Q41
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter day : ");
        String day = sc.next();

        if(day.equals("sunday") || day.equals("saturday") )
        {
            System.out.println("Weekend");
            if(age <= 13)
            {
                System.out.println("Ticket price : 120Rs.");
            }
            else if(age > 13 && age <= 64)
            {
                System.out.println("Ticket price : 180Rs.");
            }
            else
            {
                System.out.println("Ticket price : 150Rs.");
            }
        }
        else
        {
            System.out.println("Weekdays");
            if(age <= 13)
            {
                System.out.println("Ticket price : 100Rs.");
            }
            else if(age > 13 && age <= 64)
            {
                System.out.println("Ticket price : 150Rs.");
            }
            else
            {
                System.out.println("Ticket price : 130Rs.");
            }
        }
    }
}