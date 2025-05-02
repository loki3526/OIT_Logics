//write a program to accept basic salary from user and calculate HRA, TA and DA and calculate gross salary
import java.util.*;
public class Q24 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        Double s=sc.nextDouble();

        Double hrap=20.0;
        Double tap=10.0;
        Double dap=15.0;

        Double hra=(hrap/100)*s;
        Double ta=(tap/100)*s;
        Double da=(dap/100)*s;

        Double gs=hra+ta+da;

        System.out.println("The gross salary is "+gs);

    }
}
