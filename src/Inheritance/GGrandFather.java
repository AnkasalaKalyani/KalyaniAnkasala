package Inheritance;

public class GGrandFather
{
	
	 int propertyvalue =1000;
	

 static class Grandfather extends GGrandFather
		{
			int GFproperty=2000;
	
		public int valueofGF()
		{
			int total=propertyvalue+GFproperty;
		
			return total;
}
public static void main(String[] args) 
{
	Grandfather g = new Grandfather();
	System.out.println("before taking property value:- "+g.GFproperty);
	
	System.out.println("after taking property value:-"+g.valueofGF());
	
	
	
}
	



}
}

