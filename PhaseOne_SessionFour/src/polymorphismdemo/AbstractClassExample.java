package polymorphismdemo;

abstract class BankAccount {
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balance();
}

class SavingAccount extends BankAccount {

	public void calculateTax() {
		System.out.println("Calculating Tax Here..");
	}
	
	@Override
	public void deposit() {
		System.out.println("Deposit in Saving Account..");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawal from Saving Account..");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account..");		
	}
	
}

class CurrentAccount extends BankAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Current Account..");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawal from Current Account..");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Current Account..");
	}

}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		SavingAccount obj1 = new SavingAccount();
		obj1.deposit();
		obj1.withdraw();
		obj1.balance();
		
		CurrentAccount obj2 = new CurrentAccount();
		obj2.deposit();
		obj2.withdraw();
		obj2.balance();
		
	}
	
}
