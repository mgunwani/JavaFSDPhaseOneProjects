package com.coreconcepts;

interface IBank {
	float rate = 12.0F;
	int no_of_years = 3;
	void show();
}

class Customer {
	String cust_name;
	int cust_id;
	Customer(String name, int id) {
		this.cust_id = id;
		this.cust_name = name;
	}
	void display() {
		System.out.println("Customer Id : " + this.cust_id);
		System.out.println("Customer Name : " + this.cust_name);
	}
}

class Account extends Customer implements IBank {
	
	int account_no;
	float account_balance;
	Account(String name, int id, int accno, float accbalance) {
		super(name, id);
		this.account_no = accno;
		this.account_balance = accbalance;
	}
	@Override
	public void show() {
		super.display();
		System.out.println("Account No : " + this.account_no);
		System.out.println("Account Balance : " + this.account_balance);
	}
	public void interest() {
		show();
		float interest = (rate * account_balance * no_of_years)/100;
		System.out.println("Interest Calculated: " + interest);
	}
	
}


public class InterfaceExampleTwo {
	
	public static void main(String[] args) {
	
		Account account = new Account("King", 101, 123456, 10500.50F);
		account.interest();
		
	}

}
