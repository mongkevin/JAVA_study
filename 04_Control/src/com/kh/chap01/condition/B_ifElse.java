package com.kh.chap01.condition;

import java.util.Scanner;

public class B_ifElse {

	/*
	 * if-else 문 
	 * [표현법]
	 * if(조건식){
	 * 		조건식이 만족할때(true) 실행하고자 하는 구문 - 1번 
	 * }else{
	 * 		조건식이 만족하지 않을때 (false) 실행하고자하는 구문 - 2번 
	 * }
	 * 
	 * -조건식의 결과가 true일 경우엔 1번 코드만 실행
	 * -조건식의 결과가 false일 경우엔 2번 코드만 실행
	 */
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력하세요.");
		int num = sc.nextInt();
		
		if(num != 0) { //numdl 0이 아닌경우 - 조건식 결과가 true일 경우 else를 건너 뛴다.
			//0이 아니기 때문에 홀수 짝수 판별을 진해하면 된다.
			if(num%2 == 0) {
				System.out.println("짝수입니다.");
			}else { //0도 아니고 짝수도 아닌 경우 - 즉, 홀수인 경우
				System.out.println("홀수입니다.");
			}
		}else { //num == 0인 경우
			System.out.println("0입니다.");
			//else 구문은 조건식이 만족하지 않는 경우이기 때문에 별도의 조건이 필요없다.
		}
	}
	
	public void method2() {
		//주민번호 입력 후 남자 여자 판별, 잘못입력한 것을 else로 처리./ 남자인지 여자인지 한번에 조건으로 확인하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요."); //사용자에게 원하는 정보 유도
		String num = sc.nextLine(); //사용자에게 입력받은 주민번호 담아 놓을 변수 세팅 (주민번호는 문자열이다)
		char gender = num.charAt(7); //8번째 자리에 있는 값이 성별을 판별할 수 있는 값이다. 인덱스는 0번부터라서 8번째면 7이된다.
		
		//주민번호 체크(성별 판별)
//		if(num2 > 0 || num2 < 5) {
		if(gender == '1' || gender == '2' || gender =='3' || gender == '4') {
			//주민번호 체크 (성별 판별)
			if(gender == '1' || gender == '3') { //1 또는 3인 경우 - 남자 
				System.out.println("남자입니다.");
			}else{
				System.out.println("여자입니다.");
			}
		}else { //제대로된 주민번호를 입력하지 않은 경우
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
	}
	/*
	 * if-else if 문
	 * [표현법]
	 * if(조건식){
	 * 
	 * }else if(조건식){
	 * 
	 * }else if(조건식){
	 * 
	 * }
	 * .
	 * .
	 * .
	 * else{
	 * 		앞에서 기술한 모든 조건이 만족하지 않았을 경우 실행할 코드 작성.
	 * }
	 * 
	 * 
	 */
	
	
	public void method3() {
		//정수 입력받고 0인지 양수인지 음수인지 판별하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		if(num > 0) { //입력받은 수가 0보다 크다면
			System.out.println("양수다.");
		}else if(num < 0) { //입력받은 수가 0보다 작다면
			System.out.println("음수다.");
		}else { //0보다 크지도 작지도 않은 경우
			System.out.println("0이다.");
		}
		
		sc.close();
	}
	
	public void method4() {
		//나이를 입력받아 어린이 청소년 성인 판단하기
		//0~13 어린이 14~19 청소년 20~ 성인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		
//		if(age>=0 && age<=13) {
//			System.out.println("어린이입니다.");
//		}else if(age>13 && age<=19) {
//			System.out.println("청소년입니다.");
//		}else if(age >19) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		//--------------------------
		if(age>-1) {//유효한 나이인지
			if (age<14) {//14 미안인 경우 - 어린이 
				System.out.println("어린이입니다.");
			}else if(age<20){//20 미안인 경우 - 청소년
				System.out.println("청소년입니다.");
			}else {
				System.out.println("성인입니다.");
			}
		}else {//유효한 나이가 아닌 경우
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
	}
	
	
}







