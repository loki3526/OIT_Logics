// write a program to perform conversion between H:M:S to seconds
import java.util.Scanner;
public class Q30 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the hours");
        int h=sc.nextInt();

        System.out.println("Enter the mins");
        int m=sc.nextInt();

        System.out.println("Enter the seconds");
        int s=sc.nextInt();

        int total=(h*3600)+(m*60)+s;

        System.out.println("H:M:S in seconds: "+total+".sec");

        

    }
}
