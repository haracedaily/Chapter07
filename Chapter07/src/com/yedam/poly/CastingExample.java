package com.yedam.poly;

public class CastingExample {
	//매개변수의 다형성을 활용
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("Casting 성공");
		}else {
			System.out.println("Casting 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child =(Child) parent;
		System.out.println("Casting 성공2222");
	}
	
	public static void main(String[] args) {
		//Child 클래스로 만들어진 객체
		Parent p1 = new Child();
		
		//Child02 클래스로 만들어진 객체
		Parent p2 = new Child02();
		
		method2(p1);
		method1(p1);
		
		method1(p2);
		
		
	}
}
