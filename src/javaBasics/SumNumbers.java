package javaBasics;

public class SumNumbers 
{
	int a;
	int b;
	
	int sum()
	{
		return(a+b);
	}
	
 
	public static void main(String[] args) 
	{
		SumNumbers num = new SumNumbers();
		num.a=100;
		num.b=200;
		int result=num.sum();
		System.out.println(result);
				

	}

}
