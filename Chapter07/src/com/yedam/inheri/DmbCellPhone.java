package com.yedam.inheri;

public class DmbCellPhone extends CellPhone {
	//자식 클래스
	//필드
	int channel;
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		//부모 클래스에 있는 필드(model, color)를 사용하겠다는 구문
//		this.model=model;
//		this.color=color;
		this.channel=channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
