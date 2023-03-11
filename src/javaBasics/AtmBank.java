package javaBasics;

public class AtmBank {                                       //--> Class line

	        int CurrentBalance = 100000;                                                //--> Variable line
	        int deposit;
	        int withdraw;
	        
	        
	public static void ConfirmCustomer()                                     //-->Methods no's      1
	{
		System.out.println("Hello Mr.Rasool welcome to the ATM Bank");
	}
	
	public void oldbalance(int CurrentBalance)                            //oldbalance2
	{
		System.out.println("My oldbalance is:" + CurrentBalance);
	}
	
	public void deposited(int deposit)                              //deposit3
	{
		CurrentBalance=CurrentBalance + deposit;
		System.out.println("Amount is deposited successfully:");
	}
	
	public void withdrawamount(int withdraw)                    //withdraw4
	{
		CurrentBalance=CurrentBalance - withdraw;
		System.out.println("Amount is withdrawl successfully:");
		
	}
	
	public int FinalCurrentBalance()                                   //Finalbalance5
	{
		return CurrentBalance;
	}

	
	public static void main(String[] args)               //-->Main method
	{
		AtmBank bank = new AtmBank();
		ConfirmCustomer();                               
	 System.out.println("Old Balance is:"+bank.FinalCurrentBalance());   
	            bank.deposited(5000);
	 System.out.println("Total after deposting:" + bank.FinalCurrentBalance());
	           bank.withdrawamount(3000);
	 System.out.println("Total after withdrawl:" + bank.FinalCurrentBalance());
	
	System.out.println("Final balance after transactions"+bank.FinalCurrentBalance());
	}
}
	
	

