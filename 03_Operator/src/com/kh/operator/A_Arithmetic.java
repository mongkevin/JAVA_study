package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	//산술 연산자: 이항연산자로서 연산방법, 우순위가 일반 수학산과 동일하다.
	//덧셈: +, 뺄셈: -, 곱셈: *, 나눗셈: /, 나머지(Modular): % (나눗셈에서 나머지를 구한다.)
	
	public void method01() {
		
		int num1 = 10;
		int num2 = 5;
		
		//더셈 연산 
		System.out.println("num1 + num2 : "+ num1 + num2); //문자열과 숫자가 더해지면 문자열이 되기 때문
		System.out.println("num1 + num2 : "+ (num1 + num2)); //괄호로 계산을 우선순위부여해야한다
		
		//뺄셈 연산
//		System.out.println("num1 - num2: " + num1 - num2);
		//뺄셈의 경우는 괄호를 묶지 않으면 문자열과 숫자를 빼려고 계산이 되기때문에 오류가 발생한다.
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		//곱셈, 나누셈, 모듈러연산은 덧셈보다 우선순위가 높아 괄호를 해주지 않아도 되지만,
		//가독성을 위하여 괄호처리(우선처리)를 해주자 
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2)); //변수에 담긴 수 확
		
//		System.out.println(10/0);
//		System.out.println(10%0);
//		수학과 마찬가지로 0으로 나눌 수 없다. 오류발생
		
		double d1 = 15;
		double d2 = 4;
		
		System.out.println(d1 + "+" + d2 + " : " + (d1 + d2));
		System.out.println("d1 - d2 : " + (d1 - d2));
		System.out.printf("%.1f * %.1f : %.1f\n", d1, d2, (d1 * d2));
		System.out.println("d1 / d2 : " + (d1 / d2));
		System.out.println("d1 % d2 : " + (d1 % d2));
		
		
	}
	
	//사탕을 나누어주는 프로그램
	public void candy() {
		//사용자에게 인원과 사탕 계수를 입력받아 1인당 가질수 있는 사탕의 개수를 출력하고 남은 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명이 있습니까? ");
		int people = sc.nextInt();
		System.out.print("사탕이 몇개가 있습니까? ");
		int candy = sc.nextInt();
		
		System.out.println("1인 당 가질 수 있는 사탕의 개수는 " + (candy / people) + "개이고 "
		+ (candy % people) + "개의 사탕이 남았습니다.");
		
		sc.close();
	}
	
	
	
	
	
	
}
