package com.yedam.poly;

public class Driver {
	//drive 메소드에 매개변수->Vehicle
	//vehicle 또는 Vehicle을 상속하는 자식클래스도 매개변수로 사용 가능
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	//유용성 오버라이딩 된 메소드를 부모요소로 작성된 메소드
}
