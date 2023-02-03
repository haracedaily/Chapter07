package com.yedam.inheri;

public class Application01 {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰","검정색",10);
		
		
		//부모 클래스에서 받아온 필드 출력
		System.out.println("모델 : "+dmb.model);
		System.out.println("색상 : "+dmb.color);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		//자식 클래스(본인)의 필드 출력
		System.out.println("채널 : "+dmb.channel);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		//부모 클래스의 메소드 출력
		dmb.powerOn();
		dmb.bell();
		dmb.hangUp();
		dmb.powerOff();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
		//자식 클래스(본인)의 메소드 출력
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		
		Student std=new Student("김또치","230203-435621",230203);
		System.out.println("이름 : "+std.name);
		System.out.println("주민등록번호 : "+std.ssn);
		System.out.println("학번 : "+std.stdNo);
		
		
	}

}
