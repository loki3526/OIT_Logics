// A milk vendor buys milk at the rate of 3.25/- the then adds a litre of water for every four litres of 
//milk and sells the water milk at the rate of 4.15/1t. calculate the gain for milk vendor? 

import java.util.Scanner;
public class Q37 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the milk purchase in Liters");
        int pmilk=sc.nextInt();
        int water=pmilk/4;
        int tmilk=pmilk+water;

        Double pcost=pmilk*3.14;
        System.out.println("Total purcase cost: "+pcost);
        Double scost=tmilk*4.15;
        System.out.println("Total selling cost: "+scost);

        Double profit=scost-pcost;
        System.out.println("Total gain: "+profit);

    }
}
