package com.kh.chap03.branch;

import java.util.Random;

public class B_Continue {
	/*
	 * 반복문 안에서 쓰이는 구문
	 * continue; 구문을 만나면 뒤에 있는 코드를 실행하지 않고 다시 반복문을 실해하게 된다.
	 * 이때 for문의 경우는 증감식으로 이동
	 * while문의 경우는 조건식으로 흐름이 이동된다.
	 * 
	 */
	
	public void method1() {
		//1부터 10까지의 홀수만을 출력해보자
		//1 3 5 7 9
		
		//방법1. i+=2를 증감식에 넣어준다 매번 2씩 증가하게.
		//for(int i = 1; j <= 10; i+=2){System.our.println(i);}
		
		//방법2. 반복문을 1씩 증가하며 돌리고 홀수인 경우만 출력되도록 조건처리
		//if(i % 2 == 1){}
		
		//방법3. 반복문을 1씩 증가하며 돌리고 짝수인 경우엔 continue 구문을 이용하여 증감식으로 흐름 이동시키기
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				System.out.println("짝수라서 출력 안하고 갈거에요.");
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void method2() {
		//1~10 사이의 랜덤 값을 10번 뽑고 만약 그 수가 짝수라면 출력하지 않고
		//홀수일 경우에만 출력해보세요 continue를 이용해보세요
		
//		for(int i = 0; i <10; i++) {
//			
//			if(i % 2 == 1) {
//				System.out.println(i + "홀수입니당.");
//				continue;
//			}
//		}
		Random r = new Random();
		
		for(int i = 1; i <= 10; i = i+1) {
			int random = r.nextInt(10) + 1;//1부터 10개까지 
			
			//홀수인 경우니깐 작수인 경우를 제외시키면 된다.
			if(random % 2 == 0) { //random 값을 나누기 2한 나머지 값이 0이라면 짝수라고 볼 수 있다.
				continue;
			}
			System.out.println(random + "홀수가 나왔넹.");
		}
		
	}
}





