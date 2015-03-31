/*
	THIS FILE IS USED FOR THE SOLUTION TO MY VERSION OF BANKACCOUNT.JAVA
*/

public class BankCheckerSolution {
	
	public static void main(String[]args){
		
		BankAccountFinished ba1 = new BankAccountFinished("Travis", "Stratton", 0.23);
		BankAccountFinished ba2 = new BankAccountFinished("Monkey D.", "Luffy", 402.23);
		BankAccountFinished ba3 = new BankAccountFinished("Bill", "Gates", (double)2000000000);
		
		System.out.println(ba1.toString());
		System.out.println();
		System.out.println(ba2.toString());
		System.out.println();
		System.out.println(ba3.toString());
		System.out.println();
		System.out.println("Travis' account equal Luffy's?: "+ ba1.equals(ba2));
		
		System.out.println("\nTry to withdraw from Travis' account when it puts him in negative\n");
		ba1.withdraw(200);
		System.out.println("\nDeposit 402.23 dollars into travis' account\n");
		ba1.deposit(ba2.getBalance());
		System.out.println(ba1.toString());
		
		System.out.println("\nSet Bill Gates values to equal Travis' accounts values");
		ba3.setFirstName("Travis");
		ba3.setLastName("Stratton");
		ba3.setBalance(ba1.getBalance());
		System.out.println("Account 1 and 3 are equal?: "+ba3.equals(ba1));
	
	}

}