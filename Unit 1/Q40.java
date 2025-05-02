//Rajesh’s basic salary is input through the keyboard. His D.A. is 40% of basic salary, and H.R.A. is 
//20% of basic salary. Write a program to calculate his gross sal? 

import java.util.Scanner;
public class Q40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        Double s = sc.nextDouble();

        Double da = (40.0 / 100) * s;
        Double hra = (20.0 / 100) * s;

        Double gs = s + da + hra;
        System.out.println("Salary is: " + s);
        System.out.println("DA is: " + da);
        System.out.println("HRA is: " + hra);
        System.out.println("Gross Salary is: " + gs);
    }
}