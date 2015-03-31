/*
Travis Stratton
Section 7

This is the completed BankAccount class
*/
import java.text.DecimalFormat;

public class BankAccountFinished {

	//   Instance variables 
	String firstName, lastName;
	double balance;
	DecimalFormat moneyForm;
	//
	public BankAccountFinished(String fn, String ln, double money){
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
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}

	//  End of Getters & Setters
	
	public void withdraw(double amount){
		if ( getBalance() - amount < 0){
			System.out.println("Invalid transaction for : "+getLastName()+", "+getFirstName()+
									"!\n\tCannot withdraw if resulting in\n\tnegative balance.");
		}
		else{
		   double newBalance = getBalance()-amount;
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
		String toReturn  = ""; // make a new string to return
		
		toReturn += "Bank Account for: "+getLastName() + ", "+getFirstName() + "\n";
		int length = toReturn.length();
		for ( int i = 0; i < length; i++)
			toReturn+="-";
		toReturn += "\n";
		toReturn += "\tBalance for Account is: $"+moneyForm.format(getBalance());
	
		return toReturn;	
	}
	
	/*
	   equals() method.
		returns True if and only if ALL instance variables of the other Account are
		equal to the variables in this account.
		Otherwise, return false
	*/
	
	public boolean equals(BankAccountFinished other){
		if (this.balance != other.getBalance() )
			return false;
		if (!this.firstName.equals(other.getFirstName()))
			return false;
		if (!this.lastName.equals(other.getLastName()))
			return false;
		return true;
	}
}