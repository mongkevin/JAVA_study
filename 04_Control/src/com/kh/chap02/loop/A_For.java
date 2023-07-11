package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * for문
	 * 괄호 안의 반복을 지정하고 부분이 있고, 초기식, 조건식, 증감식 세가지로 이루어진다.
	 * 각각 세미콜론으로 구분되며 증감식에는 세미콜론을 붙이지 않는다
	 * [표현법]
	 * for(최기식; 조건식; 증감식){
	 * 		반복시키고자 하는 내용
	 * }
	 * 
	 * -초기식: 반복문이 시작될때 "최기에 단 한번만 실행" 될 구문
	 * 		즉, 반복문에서 사용할 변수를 선언하고 초기화하는 구문이다. ex) int i = 0;
	 * -조건식: "반복문이 실행될 조건"을 작성하는 구문
	 * 		조건식이 true일 경우 반복문 실행 false일 경우 반복문을 멈추고 빠져나온다
	 * 		보통 초기식에서 선언된 변수를 가지고 조건식을 작성한다. ex) i<10;
	 * -증감식: 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 		보통 초기식에서 선언된 변수를 가지고 증감식을 작성한다.
	 * 		이때 증감연산자가 주로 사용된다. ex) i++
	 * 
	 * for문을 만나는 순간
	 * 초기식 ->조건식(조건검사) ->true일 경우 실행 ->증감식
	 * 		->조건식 (조건검사) ->true일 경우 실행 ->증감식
	 * 		->......
	 * 		->조건식(조건검사 ->false일 경우 코드를 실행하지 않고 반복문을 벗어난다.
	 * 조건식이 true일 경우에만 코드를 실행한다.
	 * 
	 */
	
	public void method1() {
		//"안녕하세요" 메세지를 출력하고 싶은데 5번하고 싶다.
		//적은 횟수일 경우에는 단순한 복사 붙여넣기로 작업할 수 있지만
		//횟수가 늘어나면 늘어날 수록 해당 처리가 힘들어진다.
		
//		for(최기식; 조건식; 증감식) {}
//		for(int i = 0; i < 5; i++) {
//			
//			System.out.println("안녕하세요." + i);
//			
//		}
		
		//증감식에서 감소하는 예
//		for(int i = 10; i > 0; i--) {
//			System.out.println("백숙먹었어요." + i);
//		}
		
		//증가식에서 +2씩 증가하는 예
		//1~10까지 범위를 잡고 +2씩 증가하게 작성
		for(int i = 0; i < 10; i += 2) {
			System.out.println("반가워요." + i);
		}
	
		//초기식, 조건식, 증감식이 없어도 문법오류가 나지 않는다.
		//다만 이 경우에는 true로 인식이 되어 무한반복에 빠진다.
		//식을 적지 않아도 ;을 이용하여 구분은 해야한다.(형식맞추기)
		//for(;;){
		
	}
	
	public void method2(){
		//가장 기본적인 형태 0을 기준으로 10전까지 +1씩 증가하는 반복문
//		for(int i = 0; i < 10 ; i++) {
//			System.out.println("i값은: " + i);
//		}
		
		String str = "안녕하세요";
		//반복문을 이용하여 문자열 자리 수 하나하나 추출해보기
//		for(int i = 0; i < 5; i++) {
//			System.out.println((i + 1) + "번 인덱스 문자: " + str.charAt(i));
//		}
		
		//반복횟수를 정하는데 문자열의 길이만큼 정해주기(length() 메소드를 이용하여)
		for(int i = 0; i < str.length(); i++) {
			System.out.println((i + 1) + "번 인덱스 문자: " + str.charAt(i));
		}
		System.out.println("str의 길이는: " + str.length());
		
	}
	
	public void method3() {
		//1에서부터 10까지 수의 합을 구해보자.(누적 합)
		//수를 입력받아서 1부터 입력받은 수까지의 합을 구해서 출력해보세요.
		//더한 결과값을 담아 놓을 변수를 하나 준비하시고 해당 변수에 매 반복시에 수를 더해넣고 마지막에 출력해보기.
		
		//기준점 1에서부터 10씩 증가하는 반복문 (반복횟수 10번)
//		int sum = 0; //누적합을 넣어놓을 변수 
//		
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("누적합은: " + sum);
		
		//-----------------------------
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 수를 입력하시오.");
		int l = sc.nextInt();
		int sum2 = 0;
		
		for(int i = 1; i <= l; i++) {
			sum2 += i;
		}
		
		System.out.println(sum2);
		
		sc.close();
		
	}
	
	public void method4() {
		//정수를 입력받아 입력받은 수 중에서 짝수만 더하여 누적합을 구하시오
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 수를 입력하시오.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
		
		//	int u  = u + 1; //u가 정의가 되지 않은 상황에서 +1을 할수 없기 때문에 +=로 정의할 수 없다.
	}
		
	//for 문을 단지 반복횟수를 정하는 용도로만 사용
	public void method5() {
		//구구단을 만들어보자
		//사용자에게 원하는 구구단 단수를 입력받고 해당 단을 출력해보자
		//ex) 원하는 단수를 입력해주세요: 2
		//출력예시: 2 * 1 = 2 ..... 2 * 9
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단 단수를 입력하시오.");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (i * num));
		}
		
		sc.close();
	}
	//중첩반복문
	public void method6() {
		//하루의 두끼씩 총 10일간 다이어트를 진행한다.
		
		//10일 동안 총 10번 반복하는 반복문.
		for(int j = 0; j < 10; j++) {
			System.out.println("오늘은 다이어트 " + ( j + 1 ));
			//하루 두끼먹는 반복문
			for(int i = 0; i < 2; i++) {
				System.out.println("밥" + (i + 1) + "번 먹는 중.");
			}
		}
		
		
	}
	
	public void method7() {
		//두끼 먹는 다이어트에 실패하고 헬스장에 가서 OT를 받는다.
		//맨몸 스쿼트 2개씩 5세트를 신행하려한다.
		//세트를 시작할 때 현재 세트를 외치고 시작한다.
		
		//세트 반복문
		for(int i = 0; i < 5; i++) { //5번 반복하는 반복문
			System.out.println((i+1) + "번째 세트 진행!");
			for(int j = 0; j < 2; j++) { //스쿼트 2개 반복할 반복문 작성
				System.out.println((j+1) + "개 스쿼트!");
			}
			if(i == 4) { //전체를 감싸는 반복문이 마지막일때
				System.out.println((i + 1) + "세트 끝!");
			}
		}
		System.out.println("5세트 끝!");
	}
		
	public void method8() {
		//입력 받은 단수의 구구단부터 9단까지 출력하기
		//단수표현 ==========n==========
		//n * 1 = n
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i = num; i < 10; i++) {
			System.out.println("=========="+ i +"==========");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			
		sc.close();
		}
	}
	
	public void method9() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 꺼꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 0; i--) {
				System.out.print(i + "\t");
			}
		}else {
			System.out.println("1보다 큰 숫자를 입력하세요.");
		}
		
		sc.close();
	}
		
}







