package com.yedam.inheri;

public class PersonalP {
	protected String firstName;
	protected String lastName;
	protected String bloody;
	protected String age;
	protected String hobby;
	
	public PersonalP() {
		
	}
	public PersonalP(String firstName,String lastName, String bloody, String age, String hobby) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.bloody=bloody;
		this.age=age;
		this.hobby=hobby;
	}
	void getInfo() {
		System.out.println("우리 성씨는 "+firstName+"씨 입니다.");
	}
}
