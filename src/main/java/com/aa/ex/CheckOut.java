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
		System.out.println("할인 적용전 금액 : "+ this.totalPrice);
		System.out.println("-----------------------");
		
		System.out.println("멤버타입 : " + this.memberType);
		
		// 의존성 주읩은?
		System.out.println("할인 적용후 금액 : "+this.totalPrice/100 * (100 - getDiscaountRate()));
	}

	private int getDiscaountRate() {
		if(this.memberType.equals("VIP")) return 20; 
		return 0;
	}

}
