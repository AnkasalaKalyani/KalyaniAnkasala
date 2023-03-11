package Inheritance;

public class Sonclass2 
{
	int sonproperty=3000;
	
	static class daughter extends Sonclass2
	{
		int dproperty=5000;
		public int valueofdau()
		{
			int total = dproperty+sonproperty;
			
			return total;
			
		}
		
	}
	static class son extends Sonclass2
	{
		int sproperty=10000;
		public int valueofson()
		{
			int total= sonproperty+sproperty;
			return total;
		}
	}
	
	public static void main(String[] args) 
	{
//	
//		daughter d= new daughter();
//		System.out.println("before taking property of daughter is:-  "+d.dproperty);
//		System.out.println("after taking property of daughter is:-  "+d.valueofdau());
		
		son s = new son();
		System.out.println("before taking property of son is:-  "+s.sproperty);
		System.out.println("after taking property of son is:-  "+s.valueofson());

	}

}
