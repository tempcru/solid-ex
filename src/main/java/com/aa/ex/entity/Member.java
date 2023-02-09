package com.aa.ex.entity;

public class Member {

	String typeName;
	double rate;
	
	public Member(String typeName) {
		super();
		this.typeName = typeName;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

	public double  getDiscountRate() {
		return this.rate;
	}
	public int calcDiscount(int totalPrice) {
		return (int) (totalPrice * (1 - this.rate));
	}
}
