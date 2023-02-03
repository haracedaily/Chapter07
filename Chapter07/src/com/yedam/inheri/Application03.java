package com.yedam.inheri;

public class Application03 {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		//sa는 flymode NORMAL초기화된 객체로 생성됨
		//이륙 -> 부모클래스에 있는 메소드 호출
		sa.takeOff();
		//비행모드 확인 -> 자식 클래스
		sa.fly();
		//비행모드 변경 -> default로 준 NORMAL에서 고속으로 변경
		sa.flyMode=SuperSonicAirPlane.SUPERSONIC;
		//비행모드 확인 -> 자식 클래스
		sa.fly();
		//비행모드 변경 -> 다시 NORMAL로 대입
		sa.flyMode=SuperSonicAirPlane.NORMAL;
		//비행모드 확인 -> 자식 클래스
		sa.fly();
		//착륙 -> 부모 클래스
		sa.land();
	}

}
