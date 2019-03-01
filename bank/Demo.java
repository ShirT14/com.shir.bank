package com.shir.bank;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Demo {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		Regular client1 = new Regular("Shir");
		Account account1 = new Account(10000, client1);
		Account account2 = new Account(500, client1);
		Account account3 = new Account(2000, client1);
		client1.addAccount(account1);
		client1.addAccount(account2);
		client1.addAccount(account3);
		myBank.addClient(client1);
		client1.myAccounts.get(0).Deposit(500);
		client1.myAccounts.get(1).withdraw(70);
		client1.upDateBalance();
		System.out.println("your total monet is " + client1.getBalnce());
		client1.totalAccounts();
		client1.myAccounts.get(2).withdraw(5002);

		Gold goldClient = new Gold("chris");
		Account account4 = new Account(0, goldClient);
		Account account5 = new Account(0, goldClient);
		goldClient.addAccount(account4);
		goldClient.addAccount(account5);
		for (int i = 0; i < 10; i++) {
			goldClient.myAccounts.get(0).Deposit(10000);

		}
		goldClient.upDateBalance();
		System.out.println("your Balance is " + goldClient.getBalnce());
		System.out.println(client1.getBalnce());
		myBank.addClient(goldClient);
		palatinum pClient = new palatinum("Tamar");
		Account account6 = new Account(100, pClient);
		Account account7 = new Account(40000, pClient);
		pClient.addAccount(account6);
		pClient.addAccount(account7);
		pClient.myAccounts.get(0).Deposit(100001);
		pClient.myAccounts.get(1).Deposit(60000);
		
		pClient.upDateBalance();
		System.out.println("your balance is " + pClient.getBalnce());
		myBank.addClient(pClient);
		myBank.totalAccount();
		myBank.totalMoney();
		Regular client2=new Regular("ido");
		Account a=new Account(0, client2);
		client2.addAccount(a);
		client2.myAccounts.get(0).withdraw(4000);
		client2.myAccounts.get(0).withdraw(4000);
		client2.upDateBalance();
		client2.updateStatuse();
		System.out.println("your status is "+client2.getStatus());
		palatinum pClient2=new palatinum("richi");
		Account a2=new Account(0,pClient2);
		pClient2.addAccount(a2);
		pClient2.myAccounts.get(0).withdraw(30000);
		for(int i=0;i<5;i++)
		{
			pClient2.myAccounts.get(0).Deposit(10);
		}
		pClient2.upDateBalance();
		pClient2.updateStatuse();
	System.out.println(	pClient2.getStatus());
		
	}

}
