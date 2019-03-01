package com.shir.bank;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Account {

	private double currentAmount;
	private Status stat;
	Regular client;

	public Account(int amount) {
		super();
		this.currentAmount = amount;
		this.stat = Status.ALLOWED;
		this.client = null;
	}

	public Account(double currentAmount, Regular client) {
		super();
		this.currentAmount = currentAmount;
		this.client = client;
		this.stat = Status.ALLOWED;
	}

	public void setClient(Regular client) {
		this.client = client;
	}

	public void Deposit(double money) {
		if (client instanceof Gold) {
			
				if (money >= 10000) {
					Gold.bonusCounter++;

				}
				if (Gold.bonusCounter == 10) {
					this.currentAmount = this.currentAmount + (money + 500);
					Gold.bonusCounter = 0;
					
				}
				else {
					this.currentAmount += money;
				}
			}
			
			else {
			if (client instanceof palatinum) {
				client.upDateBalance();
				if(client.getBalnce()<0)
				{
					((palatinum) client).negCounter++;
				}
				if (money > 100000) {
					this.currentAmount += ((money * (0.1) )+ money);
				}
				
			

				else {
					this.currentAmount += money;
				}
			}

		}
		
			
		this.currentAmount = this.currentAmount + money;

	
		}

	public void withdraw(double money) {
		if (client instanceof palatinum) {
		
			this.currentAmount = this.currentAmount - money;
		}
		
		
		else {
			if (money > this.client.getMaxWithraw()) {
				System.out.println("you cant withdraw more than " + this.client.getMaxWithraw());
			}
		}

		if ((this.currentAmount - money) < client.getMinAmount()) {
			System.out.println("your balance will be lower than "+client.getMinAmount()+ "and your acount will be bloked");
			this.currentAmount = this.currentAmount - money;
		}
		this.currentAmount = this.currentAmount - money;

	}

	public Status getStatus() {
		return stat;
	}

	public void setStatus(Status stat) {

		this.stat = stat;

	}

	public double getCurrentAmount() {
		return currentAmount;
	}

}
