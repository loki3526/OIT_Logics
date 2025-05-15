//Accept two points (x, y) and determine which quadrant they belong to.

//

import java.util.Scanner;
public class Q23 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the point X");
         double x=sc.nextDouble();
         System.out.println("Enter the point y");
         double y=sc.nextDouble();

         if(x>0 && y>0)
         {
            System.out.println("points("+x+" , " +y+") present in first quadrant");
         }
         else if(x<0 && y>0)
         {
            System.out.println("points("+x+" , "+y+") present in Second quadrant");
         }
         else if(x<0 && y<0)
         {
            System.out.println("points("+x+" , " +y+") present in Third quadrant");
         }
         else if(x>0 && y<0)
         {
            System.out.println("points("+x+" , " +y+") present in fourth quadrant");
         }
         else
         {
            System.out.println("Something is wrong");
         }
    }
}
