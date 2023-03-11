package javaBasics;

public class Employee 
{
	String ename;
	int eno;
	int depno;
	int salary;
	void details(String ename, int eno,int depno, int salary)
	{
		this.ename=ename;
		this.eno=eno;
		this.depno=depno;
		this.salary=salary;
	
	}
	void display()
	{
		System.out.println(ename);
		System.out.println(eno);
		System.out.println(depno);
		System.out.println(salary);
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		Employee emp= new Employee();
		emp.details("kalyani", 10, 20, 40000);
		emp.display();
		
	
		
	}
	

}
