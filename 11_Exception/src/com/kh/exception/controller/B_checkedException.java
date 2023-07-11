package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_checkedException {

	/*
	 * CheckedException
	 * 문법적으로 반드시 예외처리를 해야하는 예외들.
	 * (예측불가한 곳에서 발생하는 예외이기 때문에 처리해야한다)
	 * -주로 외부와의 입출력에서 발생
	 * 
	 */
	
	//다른 곳으로 또 위임하기.
	public void method1() throws Exception { //throws 예외클래스 - 다형성 적용가능
		method2(); //처리해야하는 예외가 달려있음
	}
	
	//접근 제한자 반환형 메소드명 () throws 예외 클래스명
	public void method2() throws IOException {
		System.out.println("문자열을 입력해주세요: ");
		//Scanner와 비슷한 입력을 받아주는 클래스 BufferdReader를 이용해볼 것(문자열만 입력가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//readLine() 메소드를 호출시 IOException이 발생할 수 있음을 컴파일 에러로 미리 알려준다.(처리해야함)
		//방법1. try-catch로 잡기
//		try {
//			String str = br.readLine();
//			
//			System.out.println("문자열 걸이: "+ str.length());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//방법2. 떠넘기기 throws: 지금 이 메소드말고 이 메소드를 호출한 위치에서 처리해야하게끔 떠넘기는 구문
		
		String str = br.readLine();
		
		System.out.println(str.length());
		//메인에서도 jvm에게 예외를 전가(위임)시킬수 있지만 책임지진 않는다.처리해야함.
		//한번에 예외를 처리하기 위해 위임시키는 것
	}
}






