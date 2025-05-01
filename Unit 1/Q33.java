//. write a program to perform conversion of seconds to H:M:S 

import java.util.Scanner;
public class Q33 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the time in Seconds");
        int t=sc.nextInt();

        int th=t/3600;
        int tm=(t/3600)%60;
        int ts=t%60;

        System.out.println("H:M:S == "+th+" : "+tm+" : "+ts);
    }
}
