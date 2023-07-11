package com.kh.chap01.run;

import java.util.Scanner;

import com.kh.chap01.model.vo.Movie;

public class ObjectArrayRun {

	public static void main(String[] args) {

		//객체배열을 이용하여 객체를 묶어서 다뤄보자
		
		//객체배열의 선언 및 할당
		//[표현법]
		//클래스이름[] 배열이름= new 클래스이름[크기]
		Movie[] movies = new Movie[3];
		//Movies[0], Movies[1], Movies[2] == m1 m2 m3
		
		//3개 반복문으로 입력받고 출력해보기.
	
		Scanner sc = new Scanner(System.in);
		
		//배열의 길이만큼 반복
		for(int i = 0; i < movies.length; i++) {
			System.out.println("영화제목을 입력하세요.");
			String title = sc.nextLine();
			System.out.println("영화 개봉");
			String openDate = sc.nextLine();
			System.out.println("영화 3D 2D여부를 입력하세요: ");
			String dimension = sc.nextLine();
			System.out.println("영화 가격을 입력하세요: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			//반복이 진행됨에 따라 i번 인덱스가 변경되니 새로운 영역에 객체를 생성해 넣는것과 같다.
			movies[i] = new Movie(title,openDate,dimension,price);
		}

		//배열에 있는 객체 값 출력용 반복문
		for(int i = 0; i <3; i++) {
			System.out.println(movies[i].info());
		}
		
		System.out.println("가격을 알고 싶은 영화 제목을 입력해주세요: ");
		String input = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<movies.length; i++) {
			if(input.equals(movies[i].getTitle())){ //입력한거랑 해당인덱스에 객체에 담긴 제목이 일치하면
				System.out.println(movies[i].getPrice());
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(input + "해당하는 영화가 없습니다.");
		}
		
		sc.close();
	}

}








