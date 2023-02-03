package com.yedam.poly;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			//car.front:eftTire => Tire frontLeftTire
			//Tire frontLeftTire=>new HankookTire()
			//기본타이어 <<---한국타이어 타입으로 다형성부여
			//Tire frontLeftTire = new KumhoTire()
			//필드의 다형성 부여를 위해선 public 제한자 클래스인스턴스
			//대입하여 생성
			car.frontLeftTire = new HankookTire("앞왼쪽",15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRightTire=new KumhoTire("앞오른쪽",13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			car.backLeftTire=new HankookTire("뒤왼쪽",14);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			car.backRigthTire=new KumhoTire("뒤오른쪽",17);
					break;
			}
		System.out.println("-----------------------------");
	}
	}
}
