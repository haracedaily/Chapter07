package com.yedam.inheri;

public class Application05 {

	public static void main(String[] args) {
		//parent class
		//child class
		//상속 -> firstName, getInfo()
		//    ->getInfo()=> 우리 성씨는 000입니다.
		//child 클래스가 개인적으로 가지는 정보
		//lastName, 혈액형, 나이, 취미
		//데이터 필드 초기화는 원하는 방식으로
		//child getInfo()->우리 성씨는 000입니다.
		//				내 이름 : 000
		//				내 혈액형 : 00
		PersonalC per = new PersonalC("김","또치","A형",30,"독서","1학년");
		PersonalP per1= new PersonalC("김","또또","B형",30,"독서","1학년");
		per.getInfo();
		per1.getInfo();
		
		VipPerson vip = new VipPerson();
		vip.memberInfo();
		
	}

}
