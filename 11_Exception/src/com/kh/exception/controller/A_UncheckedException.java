package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	Scanner sc = new Scanner(System.in);
	/*
	 * RuntimeException
	 * 프로그램 실행중 발생되는 예외
	 * 
	 * -ArrayIndexOutOfBoundsException: 배열의 부적절한 인덱스로 접근할때 발생하는 예외.
	 * -NegativeArraySizeException: 배열의 크기를 음수로 지정하면 발생하는 예외.
	 * -ClassCastException: 클래스 형변환을 잘못했을때 발생하는 예외
	 * ...
	 */
	
	public void method1() {
		//사용자에게 두개의 정수값을 입력받아 나눗셈의 결과값을 출력하자.
		
		
		System.out.println("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수: ");
		int num2 = sc.nextInt();
		
		//ArithmeticException: 0으로 나누면 발생하는 예외
		//예외상황을 조건문을 이용하여 막아둘 수 있다.
		if(num2!=0) {
			System.out.println("나눗셈 결과: "+(num1/num2));
		}else {
			System.out.println("0하지마.");
		}
		
		sc.close();
		
	}
	
	public void method2() {
		//배열의 크기를 잘못 설정하거나 또는 배열의 크기를 벗어난 곳에 가르키는 발생하는 예외상황
		
		System.out.println("배열의 크기를 입력해주세요: ");
		//NegativeArraySizeException: 배열의 크기를 음수로 작성하면 발생하는 예외
		int size = sc.nextInt();
		if(size>1) {
					
			int[] arr = new int[sc.nextInt()];
			//inputMismachException: 잘못된 타입을 입력하면 발생하는 예외
			for(int i=0; i<arr.length; i++) {
				System.out.println("배열에 들어갈 숫자를 넣어주세요: ");
				arr[i] = sc.nextInt();
			}
			
			System.out.println("찾고싶은 배열의 인덱스 번호를 입력해주세요: ");
			int num = sc.nextInt();
			if(num<arr.length) {
				System.out.println(arr[num]);
			}else {
				System.out.println("범위를 벗어나셨는데요?");
			}
		}
		
	}
	
	//예상치 못한 상황 또는 조건으로 해결되지 않는 예외상황 처리하기 try catch
	public void method3() {
		/*
		 * try ~ catch 문
		 * [표현법]
		 * try{
		 * 예외가 발생할만한 구문
		 * }catch(예외클래스명 변수명){
		 * 예외가 발생했을때 처리할 구문.
		 * }catch(다른예외클래스명 변수명){
		 * 다른예외가 발생했을때 처리할 구문
		 * }
		 */
		
		try {
			System.out.println("배열의 크기를 입력해주세요: ");
			int[] arr = new int[sc.nextInt()];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("배열에 들어갈 숫자를 넣어주세요: ");
				arr[i] = sc.nextInt();
			}			
				
			
				
			System.out.println("찾고싶은 배열의 인덱스 번호를 입력해주세요: ");
			int num = sc.nextInt();
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수가 될수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("법위는 배열만큼만 접근할 수 있습니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
	//다중 catch문 한번에 잡아 버리기
	public void method4() {
		try {
			System.out.println("배열의 크기를 입력해주세요: ");
			int[] arr = new int[sc.nextInt()];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("배열에 들어갈 숫자를 넣어주세요: ");
				arr[i] = sc.nextInt();
			}			
				
			System.out.println("찾고싶은 배열의 인덱스 번호를 입력해주세요: ");
			int num = sc.nextInt();
		
		}catch(Exception e) {
			System.out.println("예외상황 발생.");
			System.out.println("다시 생각해보고 입력하세요.");
		}
		
		System.out.println("프로그램 종료");
	}
	
	//따로 처리해야되는 예외는 처리하고 나머지는 한번에 처리하기
	public void method5() {
		try {
			System.out.println("배열의 크기를 입력해주세요: ");
			int[] arr = new int[sc.nextInt()];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("배열에 들어갈 숫자를 넣어주세요: ");
				arr[i] = sc.nextInt();
			}			
				
			System.out.println("찾고싶은 배열의 인덱스 번호를 입력해주세요: ");
			int num = sc.nextInt();
		
		}catch(InputMismatchException e){
			System.out.println("숫자만 입력해주시면 감사하겠습니다.");
		}catch(Exception e){
			System.out.println("잘못입력하셨습니다.");
			//테스트과정에서 개발자가 어떤 예외가 발생했는지 파악하기 위한 구문
			e.printStackTrace(); //오류를 알아보기(개발자를 위한)
		}//자식타입예외보다 부모타입예외가 더 먼저오면 안됀다. 위에서 다 잡아버리기 때문에.
		//다중 catch문을 사용할땐 순서를 잘지켜줘야한다.
		
		System.out.println("프로그램 종료.");
	}
}









