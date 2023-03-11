package javaBasics;

public class SumofNumbers 
{
	int a;
	int b;
	
	void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		SumofNumbers num= new SumofNumbers();
		num.a=100;
		num.b=200;
		num.sum();
				
	}

}
