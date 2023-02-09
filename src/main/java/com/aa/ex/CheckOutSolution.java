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
		System.out.println("���� ������ �ݾ� : "+ this.totalPrice);
		System.out.println("-----------------------");
		
		System.out.println("���Ÿ�� : " + this.memberType);
		
		Member member = MemberBuilder.typeName(this.memberType).build();
		System.out.println("������ : " + member.getDiscountRate() * 100 + "%");
		
		System.out.println("-----------------------");
		System.out.println("���� ������ �ݾ� : " + member.calcDiscount(this.totalPrice));
	}
	
}
