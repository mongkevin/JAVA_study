package com.kh.variable;

public class D_Printf {
	public void printfTest() {
		/*
		 * System.out.printf("출력하고자 하는 형식", 출력하고자하는 값);
		 * 여기서 f는 format(형식)을 의미한다.
		 * 단, 문자열안에 원하는 값이 들어갈 공간을 형식화 하여야한다.
		 * 
		 * 형식
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자
		 * 
		 */
	
		//정수테스트
		int num1 = 10;
		int num2 = 20;
		//num1 : xx, num2 : xx 형식으로 출력해보기
		//기존println,print 메소드 경우
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		//printf로 출력
//		System.out.printf("num1 : 10, num2 : 20", null)
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		//printf로 출력 - 줄바꿈 기능이 없기 때문에 개행문자 \ n으로 줄 바꿈 해준다.
		
		//10 + 20 = 30이 나오도록 printf를 이용하여 출력해보자.
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		
		//%숫자 만큼 오른쪽 정렬 음수입력시 왼쪽 정렬 
		System.out.printf("%5d \n", num1);
		System.out.printf("%-5d \n", num1);
		
		//실수
		double dNum = 1.23456789;
		System.out.printf("dNum : %f \n", dNum);
		//소수점 표현이 7번째 줄에서 반올림처리 되어 6번째 자리까지 표현된다.
		//만약 더 적은 소수점 표현을 원한다면 %.nf 로 작성하면 된다.
		System.out.printf("dNum : %.1f \n", dNum);
		
		//문자와 문자열
		char ch = 'a';
		String str = "hello";
		
		System.out.printf("ch : %c 대문자 ch : %C \n", ch, ch);
		System.out.printf(("str : %s 대문자 str : %S \n"), str, str);
		
	}
	
}





