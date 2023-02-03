package com.yedam.inheri;

public class ChildExample {

	public static void main(String[] args) {
		//클래스간의 자동타입 변환
		//Parent p1 = new Child();
		/*Child의 생성자로 객체를 생성을 하고
		* 이 객체를 Parent로 모습이 변한다.
		*/
		
		//다형성
		/*-부모 클래스에 있는 내용을 사용하되,
		 * 만약 자식 클래스에 부모 메소드가 재정의(오버라이딩)가 되어 있다면
		 * 부모 클래스에 메소드를 사용하지않고 자식클래스의 메소드를 사용한다.
		 * -위의 성질 활용해서 하나의 타입(부모)으로 다양한 모습을 만든다.
		 * -여러 자식들로부터 다양한 형태(즉 메소드)를 만들 수 있다.
		 */
	}

}
