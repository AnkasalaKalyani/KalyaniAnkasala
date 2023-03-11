package javaBasics;

public class ReturnsValue {
	int a;
	int b;
	int  sum()
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) 
	{
	ReturnsValue r = new ReturnsValue();
	r.a=100;
	r.b=200;
	
	System.out.println(r.sum());
	}

}
