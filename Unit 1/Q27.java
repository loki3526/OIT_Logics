//. write a program to perform swapping of two number with by using bitwise operator
public class Q27 {
    public static void main(String args[])
    {
        int a=6;
        int b=9;
        System.out.println("Before swapping a : "+a+" b : "+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping a : "+a+" b : "+b);


    }
}
