package com.shir.bank;

public class Gold extends Regular {
	
	public Gold( String name) {
		super( name);
		// TODO Auto-generated constructor stub
	}



	private final  int minAmount = -100000;
	private final int worningAmount = -50000;
	private final int maxWithraw = 50000;
	static int bonusCounter=0;

	
	
	@Override
	public void updateStatuse() {
		if (this.balance < this.worningAmount) {
			this.stat = Status.WARNED;
		}
		if (this.balance < this.minAmount) {
			this.stat = Status.BLOCKED;
		} else
			this.stat = Status.ALLOWED;
	}

}