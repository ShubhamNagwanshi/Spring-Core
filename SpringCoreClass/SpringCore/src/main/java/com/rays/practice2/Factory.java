package com.rays.practice2;

public class Factory {

	private Bottle bottle;


	/*
	 * public void setBottle(Bottle bottle) { this.bottle = bottle; }
	 */
	
	public void testAdd() {
		bottle.add();
	}


	public Factory(Bottle bottle) {
		super();
		this.bottle = bottle;
	}
}
