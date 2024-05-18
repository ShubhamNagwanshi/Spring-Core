package com.rays.autowire.practice;

public class ShubhamService {

	private Shubham shubh;

	public Shubham getShubh() {
		return shubh;
	}

	public void setShubh(Shubham shubh) {
		this.shubh = shubh;
	}

	/*
	 * public ShubhamService(Shubham shubh) { super(); this.shubh = shubh; }
	 */
	public void testAdd() {
		shubh.add();
	}
}
