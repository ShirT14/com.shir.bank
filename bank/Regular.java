package com.shir.bank;

import java.util.LinkedList;
import java.util.List;

//import com.sun.tools.javac.util.List;

public class Regular {
	private final  int maxWithraw = 5000;
	protected List<Account> myAccounts;
	protected Status stat;
	protected double balance;
	protected final int minAmount = -7000;
	protected String name;
	

	public Regular( String name) {
		super();
		this.stat = Status.ALLOWED;
		this.name = name;
		this.myAccounts=new LinkedList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAccount(Account account) {
		myAccounts.add(account);

	}

	public void removeAccount(Account account) {
		myAccounts.remove(account);

	}

	public Status getStatus() {
		return stat;
	}

	public double getBalnce() {
		return balance;
	}

	public void totalAccounts() {
		System.out.println("you have "+myAccounts.size()+ " accounts");

	}

	public void upDateBalance() {
		double counter = 0;
		for (Account account : myAccounts) {
			counter += account.getCurrentAmount();

		}
		this.balance = counter;

	}

	public void totalMoney() {

		System.out.println("the total money is " + this.balance);

	}

	public int getMinAmount() {
		return minAmount;
	}

	public int getMaxWithraw() {
		return maxWithraw;
	}

	
	public void updateStatuse()
	{
		if(this.balance<this.minAmount)
		{
			this.stat=Status.BLOCKED;
		}
		else 
			this.stat=Status.ALLOWED;
	}



/*	public List<Account> getMyAccounts() {
		// TODO Auto-generated method stub
		return myAccounts;
*/
}
