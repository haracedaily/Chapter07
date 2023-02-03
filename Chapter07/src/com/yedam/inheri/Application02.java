package com.yedam.inheri;

public class Application02 {

	public static void main(String[] args) {
		
		Compute compute=new Compute();
		System.out.println(compute.areaCircle(5.0));

		Exam exam = new Exam();
		exam.method01();
		exam.method02();
	}

}
