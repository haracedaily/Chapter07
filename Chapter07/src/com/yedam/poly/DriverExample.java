package com.yedam.poly;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
//		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자동변환 설명을 위해<<
		//상속하는 자식들은 부모타입으로 자동으로 형변환이 이뤄짐<-다형화
		driver.drive(taxi);
		driver.drive(new Bus());
		
		//Vehicle.run<---에서 변환이 일어나는게 아니라 출력문에 입력한 taxi와 bus 앞의 형이
		//부모요소로 변환
		//부모요소로 작성된 메소드 하나에 자식클래스들을 기입하여 사용...?근데 어차피 자식클래스 만들어야하는데
		//자동타입변환-> 부모 클래스에서 정리한 내용만 쓸수 있음;오버라이딩 제외
		//강제타입변환-> 자식 클래스에서 추가한 내용도 사용 가능
		//강제타입변환은 조건 자동타입변환 되어진 부모타입만 가능
	}

}
