package com.aa.ex;

import com.aa.ex.entity.Member;
import com.aa.ex.entity.MemberBuilder;

public class CheckOutSolution {

	int totalPrice = 50000;
	private String memberType;
	
	public CheckOutSolution(String memberType) {
		this.memberType = memberType;
	}

	public static void main(String[] args) {
		CheckOutSolution checkOut = new CheckOutSolution("VIP");
		checkOut.calcDiscount();
	}

	private void calcDiscount() {
		System.out.println("할인 적용전 금액 : "+ this.totalPrice);
		System.out.println("-----------------------");
		
		System.out.println("멤버타입 : " + this.memberType);
		
		Member member = MemberBuilder.typeName(this.memberType).build();
		System.out.println("할인율 : " + member.getDiscountRate() * 100 + "%");
		
		System.out.println("-----------------------");
		System.out.println("할인 적용후 금액 : " + member.calcDiscount(this.totalPrice));
	}
	
}
