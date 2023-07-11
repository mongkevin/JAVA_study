package com.kh.chap05_method.controller;

public class MethodTest1 {
	/*
	 * 메소드: 입력을 가지고 어떤한 일을 수행한 다음에 결과물을 만들는것.
	 * 일반 메소드와 메인 메소드로 구분한다.
	 * 
	 * [표현법]
	 * 접근제한자 예약어 반환형 메소드이름(매개변수자료형 매개변수명){
	 * 			수행할 코드
	 * 	만약 반환형이 있다면 return 반환값;
	 * }
	 * -생략 가능한 것: 예약어, 매개변수, return
	 * -반환형: 반환할 값의 자료형
	 * -호출할때의 전달값: 매개변수 자료형과 개수 및 자료형이 일치해야한다. 
	 * 
	 * 
	 */
	
	//1. 매개변수와 반환형 둘다 없는 메소드 유형
	public void method1() {
		
		System.out.println("매개변수와 반환형이 없는 메소드입니다.");
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum+=(i+1);
		}
		
		System.out.println(sum);
	}
	
	//2. 매개변수가 있고 반환형은 없는 메소드 유형
	//setter 메소드 
//	public void setName(String name) {
//		this.name = name;
//	}
	public void method2(int num,int num2) {
		System.out.println(num + "+" + num2 + "=" + (num+num2));
		System.out.println(num + "x" + num2 + "=" + (num*num2));
		
	}
	
	//3.매개변수는 없고 반환형은 있는 메소드 유형
	//getter메소드 유형
//	public String getName() {
//		return name;
//	}
	
	public String method3() {
		return "메소드는 돌아오는거야";
	}
	
	//4.매개변수도 있고 반환형도 있는 메소드 유형
	public String method4(int num,String str) {
		for(int i = 0; i<num; i++) {
			str+=str;
		}
		return str;
	}
}







