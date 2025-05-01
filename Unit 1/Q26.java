//write a program to perform swapping of two number without using third variable 
public class Q26 {
    public static void main(String args[])
    {
        int a=6;
        int b=9;
        System.out.println("Befor swaping a : "+a+" and b : "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping a : "+a+" and b : "+b);
    }
}
