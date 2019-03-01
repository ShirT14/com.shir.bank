package com.shir.bank;

import java.util.LinkedList;
import java.util.List;

public class Bank {

	private List<Regular> clients;

	public List<Regular> getClients() {
		return clients;
	}

	public Bank() {
		super();
		this.clients = new LinkedList<>();
	}

	public void addClient(Regular client) {
		clients.add(client);

	}

	public void removeClient(Regular client) {
		clients.remove(client);

	}

	public void totalAccount() {
		int counter = 0;
		for (Regular clients : clients) {

			counter += clients.myAccounts.size();

		}

	}

	public void totalMoney() {
		int moneyCounter = 0;
		for (Regular clients : clients) {
			moneyCounter += clients.getBalnce();

		}
		System.out.println("the total money is " + moneyCounter);
	}
}
