class Test {	
		String bike_name;
		static String color="black";
		Test(String x)
		{
			bike_name=x;
		}
		void display()
		{
			System.out.println("Bike Name : "+bike_name+" and Its Color Is : "+color);
		}
}

public class Staticdemo 
{
	public static void main(String[] args)
	{
		Test t1=new Test("KTM");
		Test t2=new Test("BMW");
		
		t1.display();
		t2.display();
	}
}

