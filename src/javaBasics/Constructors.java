package javaBasics;

public class Constructors								//1) No.of parameters
														//2) Order of Parameters
														//3) Data type of Parameters
{
	int a;
	int b;
	String c;
	
	Constructors()										//unparameterized constructor
	{
		a=10;
		b=20;
		
	}
											
	
	 Constructors(int a , int b)						//parameterized constructor
	{
		
		this.a=a;
		this.b=b;
	}
	
	Constructors(int x ,double y )
	{
		a=x;
		
	}
	Constructors(String c,int b)
	{
		this.c=c;
		this.b=b;
	}
	
	
	Constructors(int x, int y, double z)
	{
		a=x;
		b=y;
		
	}
	

	
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{
		//Constructors co = new Constructors();
		//co.display();
		Constructors co1 = new Constructors(100,20.0);
		co1.display();
		
		
		
				
		
		
		
		
	}

}
