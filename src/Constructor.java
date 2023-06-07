import java.util.Scanner;

public class Constructor{
	Constructor()
	{
		int x=15;
		System.out.println("The Value Of x In Constructor Is :"+x);
	}
	Constructor(int x, int y)
	{
		int z=x*y;
		System.out.println("The Multiplication Of Two Number Is ="+z);
	}
	public static void main(String args[])
		{
			Constructor c1=new Constructor();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter 1st No: ");
			int a=sc.nextInt();
			
			System.out.print("Enter 2nd No: ");
			int b=sc.nextInt();
			Constructor c2=new Constructor(a,b);
		}
}