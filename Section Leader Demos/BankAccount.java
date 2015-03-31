/*
Travis Stratton
Section 7

This skeleton has most methods for an individuals BankAccount.
Required by students:
	- Create instance Variables
	- Make Get and Set method for Balance
	- toString() method
	- equals(BankAccount other) method
*/
import java.text.DecimalFormat;

public class BankAccount {

	// ..?..?..?..  Instance variables  ..?..?..?..
	
	//
	public BankAccount(String fn, String ln, double money){
		firstName = fn;
		lastName = ln;
		balance = money;
		moneyForm = new DecimalFormat("#.00");
		
		//System.out.println(moneyForm.format(balance));
	}
	
	// ------------------------------------------------------//
	//				...Your code goes below this line...			//
	//-------------------------------------------------------//
	
	// Getter & Setters 
	
	// Getter/Setter for first and last names
	public void setFirstName(String newName){
		firstName = newName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String newName){
		lastName = newName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	//  Write code for get and set for balance.
	


	//  End of Getters & Setters
	
	public void withdraw(double amount){
		if ( getBalance() - amount < 0){
			System.out.println("Invalid transaction for : "+getLastName()+", "+getFirstName()+
									"!\n\tCannot withdraw if resulting in\n\tnegative balance.");
		}
		else{
		   double newBalance = getBalance-amount;
			setBalance(newBalance);
			System.out.println("Successful transaction for : "+getLastName()+", "+getFirstName());

		}
	}
	
	public void deposit(double amount){
		double newBalance = getBalance() + amount;
		setBalance(newBalance);
	}
	// ....
	
	
	// toString Method
	/*  toString() will return a string that reads:
	*	Bank Account for: <lastName>, <firstName>
	*  -----------------------------------------		
	*		Balance for Account is : $<balance>
	*
	
	*	The balance uses decimalFormat for currency form, and the
	*  number of hyphons is = the length of the fist part of the string
	*/
	public String toString(){
	
		
	}
	
	/*
	   equals() method.
		returns True if and only if ALL instance variables of the other Account are
		equal to the variables in this account.
		Otherwise, return false
	*/
	
	public boolean equals(BankAccount other){
	
		
	}
}
