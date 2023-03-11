package javaBasics;

public class Student 
{
	int stuid;
	String sname;
	int sclass;
	int fee;
	
   Student(int id, String name,int cls,int hfee)
	{
	stuid=id;
	sname= name;
	sclass= cls;
	fee=hfee;
	}
	void display()
	{
		System.out.println(stuid);
		System.out.println(sname);
		System.out.println(sclass);
		System.out.println(fee);
	}
	
	public static void main(String[] args) 
	{
	  Student emp = new Student(101,"aadhya",10,50000);
			  emp.display();
    
	 
			 
		

	}

}
