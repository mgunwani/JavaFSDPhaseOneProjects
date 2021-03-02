package com.coreconcepts;

interface IManageBankAccount {
	void openAccount();
	void closeAccount();
}

interface IBankAccount {
	static void showMessage() {
		System.out.println("Welcome to ABC Account.");
	}
	default void display() {
		System.out.println("Lets do some transactions..");
		display1();
	}
	private void display1() {
		System.out.println("Lets do some transactions 2..");
	}
	
	void depoist();
	void withdraw();
	void balance();
}

class SavingAccount implements IBankAccount, IManageBankAccount {

	@Override
	public void depoist() {
		System.out.println("Deposit in Saving Account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Saving Account");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance from Saving Account");
		
	}

	@Override
	public void openAccount() {
		System.out.println("Opening Saving Account");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Saving Account");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		IBankAccount.showMessage();
		
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.display();
		savingAccount.openAccount();
		savingAccount.depoist();
		savingAccount.withdraw();
		savingAccount.balance();
		savingAccount.closeAccount();
		
		
	}
}
