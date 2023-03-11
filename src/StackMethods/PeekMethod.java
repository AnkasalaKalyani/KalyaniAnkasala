package StackMethods;

import java.util.*;

public class PeekMethod {

	public static void main(String[] args) 
	{
		Stack<String> stk= new Stack<>();  
		
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.println("Stack: " + stk);  
		
		String fruits = stk.peek();  
		
		System.out.println(fruits);  
		

	}

}
