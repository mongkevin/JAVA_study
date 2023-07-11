package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	/*
	 * 단독 if
	 * 
	 *[표현법]
	 *if(조건식){
	 *		수행하고자 하는 구문
	 *}
	 *-조건식의 결과값이 true일 경우: 중괄호 안에 있는 코드를 실행
	 *-조건식의 결과값이 false일 경우: 중괄호 안에 있는 코드를 건너 뜀
	 *
	 */
	
	public void method1() {
		if(5 > 3) { //true
			System.out.println("5는 3보다 큰게 맞죠.");
		}
		
		//조건이 항상 false이기 때문에 그 내용은 Dead code가 된다 (실행될 수 없다)
//		if(5 < 3) { //false
//			System.out.println("죽은 코드....");
//		}
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 숫자 입력받기
		System.out.println("숫자를 하나 입력해주세요.");
		int num = sc.nextInt();
		
		if(num > 0) { //사용자에게 입력받은 num이라는 숫자가 0보다 큰가요?
			//사용자에게 입력받은 num이라는 숫자가 0보다 큰 경우에 아래 구문을 실행.
			System.out.println("양수네요.");
		}
		
		if(num < 0) { //입력받은 숫자가 0보다 작은가요?
			System.out.println("음수네요.");
		}
		
		if(num == 0) { //입력받은 숫자가 0인가요?
			System.out.println("0이네요.");
		}
		
		sc.close();
	}
	
	public void method2() {
		//홀수 짝수 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다.");
		}
		
		if(num % 2 == 0 && num != 0) {
			System.out.println("짝수네요.");
		}
		
		if(num % 2 != 0) {
			System.out.println("홀수네요.");
		}
		
		//위에 조건을 중첩 if문을 사용하여 조건처리과정을 줄여주기.
		if(num!=0){  //num이 0이 아닌 경우에
			if(num%2==0) {
				System.out.println("짝수다.");
			}
			if(num%2==1) {
				System.out.println("홀수다.");
			}
		}
		
		sc.close();
	}
	
	public void method3() {
		//주민번호 입력받아 남자인지 여자인지 체크하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요.");
		String num = sc.next();
		
//		if(num.charAt(7) == '1' || num.charAt(7) == '3' ) {
//			System.out.print("남자");
//			if(num.charAt(7) == '2' || num.charAt(7) == '4') {
//				System.out.print("여자");
//			}
//		}else{
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
//		틀린 나의 답
		
		//입력받은 주민번호에서 성별을 판별할 수 있는 부분을 추출 (8번째 자리)
		char gender = num.charAt(7); //인덱스는 0번부터 시작이기 때문에 인덱스 7로 8번째자리 추출
		
		//성별에 해당하는 문자가 1또는 3이면 남자/ 2또는 4면 여자
		if(gender == '1' || gender =='3' ) {
			System.out.print("남자");
		}
		
		if(gender == '2' || gender =='4' ) {
			System.out.print("남자");
		}
		
		if(gender != '1' && gender != '3' && gender != '2' && gender != '4') {
			System.out.println("잘못된 주민번호를 입력하셨습니다.");
		}
		
		//주민번호를 잘 입력한 경우가 아닌경우
		if(!(gender == '1' || gender == '3' || gender == '2' || gender == '4')) {
			System.out.print("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
}








