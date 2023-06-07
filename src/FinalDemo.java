import java.util.Scanner;

public class FinalDemo
{
    public static void main(String[] args) {
        test t1=new test();
        t1.display();
    }
}

class test
{
    Scanner sc=new Scanner(System.in);
    final int a=3;
    static int b;
    
    test()
    {        
        System.out.println("Enter Number : ");
        b=sc.nextInt();
    }
    void display()
    {
        int c = a*b;
        System.out.println("Multiply with  3 : "+c);
    }
}