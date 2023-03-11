package Inheritance;

import Inheritance.GGrandFather.Grandfather;

public class Sonclass 
{
	 int propertyvalue =1000;
		

	 static class Grandfather extends GGrandFather
			{
				int GFproperty=2000;
		
			
	}
	static class father extends Grandfather
			{
				int fproperty=3000;
				public int valueofSon()
				{
					int total=propertyvalue+GFproperty+fproperty;
				
					return total;
				
			}
	public static void main(String[] args) 
	{
		father f = new father();
		System.out.println("before taking property of son is:-  "+f.fproperty);
		System.out.println("after taking property of son is:-  "+f.valueofSon());
		
		
		
		
	}
		



	}
}


