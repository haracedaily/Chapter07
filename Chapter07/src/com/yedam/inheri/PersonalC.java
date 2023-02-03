package com.yedam.inheri;

public class PersonalC extends PersonalP{
	private String lastName;
	private String bloody;
	private int age;
	private String hobby;
	private String glade;
	
	public PersonalC() {
		
	}
	public PersonalC(String firstName,String lastName, String bloody, int age, String hobby,String glade) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.bloody=bloody;
		this.age=age;
		this.hobby=hobby;
		this.glade=glade;
	}
	
	@Override
	void getInfo() {
		super.getInfo();
		System.out.println("내 이름 : "+firstName+lastName);
		System.out.println("내 혈액형 : "+bloody);
		System.out.println("내 나이 : "+age);
		System.out.println("내 취미 : "+hobby);
		System.out.println("내 학년 : "+glade);
	}
	//child getInfo()->우리 성씨는 000입니다.
	//				내 이름 : 000
	//				내 혈액형 : 00
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBloody() {
		return bloody;
	}
	public void setBloody(String bloody) {
		this.bloody = bloody;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
