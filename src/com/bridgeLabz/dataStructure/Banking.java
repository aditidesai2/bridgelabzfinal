package com.bridgeLabz.dataStructure;

public class Banking {
	private String AccNumber;
	private double balance = 0.0;
	private Queue1<Double> transaction;

	
	 // Ask the user to give the input account number of String type
	 
	 
	public Banking(String accountNumber) {
		this.AccNumber = accountNumber;
		this.transaction = new Queue1<Double>();
	}

	
	 // getter method to get account number.
	 
	public String getAccountNumber() {
		return AccNumber;
	}

	
	 // Ask the user to input the amount he want to deposit in bank the amount should
	 // be positive non zero value.
	 
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Can not deposit negative amount... current balance : " + this.balance);
		} else if (amount == 0) {
			System.out.println(" Can not add Zero amount to the account... current balance : " + this.balance);
		} else {
			transaction.enQueue(amount);
			this.balance += amount;
			System.out.println(amount + " Amount deposited Successfully... Current balance : " + this.balance);
			System.out.println("All transactions are :\n");
			transaction.print();
		}
	}

	
	// Ask the user to input the amount which he want to withdraw
	 
	public void withdrawAmount(double amount) {
		if (amount > balance) {
			System.out.println("withdrawl not possible.. current balance :" + this.balance);
		} else {
			double withdrawalAmt = -amount;
			if (withdrawalAmt < 0) {
				transaction.enQueue(withdrawalAmt);
				this.balance += withdrawalAmt;
				System.out.println(amount + " Amount Withdrawn Successfully... Current balance : " + this.balance);
				System.out.println("All transactions are :\n");
				transaction.print();
			} else {
				System.out.println("Can not Withdraw negative amount... Current balance : " + this.balance);
			}
		}
	}

}