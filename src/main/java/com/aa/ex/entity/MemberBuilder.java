package com.aa.ex.entity;

public class MemberBuilder {

	private Member member;
	
	public MemberBuilder() {
		this.member = new Member("");
	}
	
	public Member getMember() {
		return member;
	}



	public void setMember(Member member) {
		this.member = member;
	}


	public static MemberBuilder typeName(String typeName) {
		MemberBuilder builder = new MemberBuilder();
		builder.getMember().setTypeName(typeName);
		return builder;
	}
	
	public Member build() {
		if(this.member.getTypeName().equals("VIP")) {
			return new VipMember(this.member.typeName);
		} else if(this.member.getTypeName().equals("FAMILY")) {
			return new FamilyMember(this.member.getTypeName());
		}  else {
			return this.member;
		}
	}
}
