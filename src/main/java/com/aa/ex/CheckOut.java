package com.aa.ex;

public class CheckOut {

	int totalPrice = 50000;
	private String memberType;
	
	public CheckOut(String memberType) {
		this.memberType = memberType;
	}

	public static void main(String[] args) {
		CheckOut checkOut = new CheckOut("VIP");
		checkOut.calcDiscount();
	}

	private void calcDiscount() {
		System.out.println("���� ������ �ݾ� : "+ this.totalPrice);
		System.out.println("-----------------------");
		
		System.out.println("���Ÿ�� : " + this.memberType);
		
		// ������ �֟���?
		System.out.println("���� ������ �ݾ� : "+this.totalPrice/100 * (100 - getDiscaountRate()));
	}

	private int getDiscaountRate() {
		if(this.memberType.equals("VIP")) return 20; 
		return 0;
	}

}
