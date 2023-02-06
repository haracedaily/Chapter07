package com.yedam.poly;

public class Casting {
	public static void main(String[] args) {
		//강제 타입변환(Casting)
		//부모타입으로 만들어진 다형성(부모가 가진 내용만 사용)
		//자식이 가진 내용도 쓰고 싶어서 하는 방식
		
		//자동타입변환(다형성)
		Parent parent = new Child();
		parent.field="부모필드";
		parent.method1();
		parent.method2();
		
		Child child=(Child) parent;
		child.field2="자식필드";//강제타입변환 전엔 사용이 불가하다
		child.method3();
		child.field="강제타입 부모필드";
		
		if(parent instanceof Child) {
			Child child02=(Child) parent;
		}
		//instanceof문 인스턴스 타입이 같은지 아닌지 비교구문
		//같은 인스턴스인지 확인할때 쓰는 문법
		//== : 객체가 같은 주소를 가지는지 확인
		//instanceof : 같은 타입의 객체인지 확인
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		
		if(p1==p2) {
			System.out.println("주소가 같습니다.");
		}else {
			System.out.println("주소가 다릅니다.");
		}
		
		Parent parent1 = new Child();
		Child child1=(Child) parent1;
		if(p1 instanceof Parent) {
			System.out.println("Parent타입의 객체입니다.");
		}
		if(p1 instanceof Child){
			System.out.println("Child타입의 객체입니다.");
		}
		if(parent1 instanceof Child) {
			System.out.println("Child타입의 객체입니다.");
		}
		if(parent1 instanceof Parent){
			System.out.println("Parent타입의 객체입니다.");
		}
		
		if(child1 instanceof Child) {
			System.out.println("Child타입의 객체입니다.");
		}
		if(child1 instanceof Parent){
			System.out.println("Parent타입의 객체입니다.");
		}
		
		//다형화 시킨 객체는 형 자체는 부모타입이기에 부모요소도 맞지만
		//그 내용물은 자식요소로 구성되어서 자식타입이기도 하다.
		
	}
}
