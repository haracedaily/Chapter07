package com.yedam.inheri;

public class SuperSonicAirPlane extends AirPlane{
	//자식 클래스
	//필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
		System.out.println("초음속 비행 모드");
		}
		else {
		//super. 다른 부모메소드로 오버라이딩 시키기 
		super.fly();
		}
	}
	
	
}
