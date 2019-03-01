package com.shir.bank;

public class palatinum extends Regular {

	public palatinum( String name) {
		super( name);
		// TODO Auto-generated constructor stub
	}


	private final int minAmount = -1000000;
protected  int negCounter=0;
	private final int wanningAmount = -500000;

	
	public void updateStatuse() {
		if (this.balance < this.wanningAmount) {
			this.stat = Status.WARNED;
		}
		if ((this.balance < this.minAmount)||(this.negCounter==5)) {
			this.stat = Status.BLOCKED;
		} else
			this.stat = Status.ALLOWED;
	}
}
