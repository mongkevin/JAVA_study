package com.kh.chap01.run;

import java.util.Scanner;

import com.kh.chap01.model.vo.Movie;

public class ObjectRun {

	public static void main(String[] args) {

//		Movie lalaland = new Movie("라라랜드", "2016.12.07","2D",9000);
//		Movie slamDunk = new Movie("Slam Dunk", "2023.01.04","2D",15000);
//		Movie avatar = new Movie("아바타", "2022.12.14","3D", 22000);
//		
//		System.out.println(lalaland.info());
//		System.out.println(slamDunk.info());
//		System.out.println(avatar.info());
		
		//영화정보를 사용자에게 입력받아 초기화하고 
		//해당 영화정보를 출력해보세요
		//3개 영화를 각각따로 입력받아 3개의 결과값을 얻어내시오.
		//사용자에게 스캐너로 입력받을 것
		//반복문을 사용하여 입력받으세요.
		//힌트: 객체 선언을 먼저 해놓고 기본값을 초기화하고
		//반복문을 사용하여 조건에 따라 객체를 생성하여 할당해서 해보세요 
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("영화 제목을 입력하세요: ");
//		String title = sc.nextLine();
//		System.out.println("영화 개봉일을 입력하세요: ");
//		String openDate = sc.nextLine();
//		System.out.println("영화 3d 2d여부를 입력하세요: ");
//		String dimension = sc.nextLine();
//		System.out.println("영화 가격을 입력하세요: ");
//		int price = sc.nextInt();
//		
//		Movie m1 = new Movie(title,openDate,dimension,price);
		
//		Movie m1 = null;
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("영화 제목을 입력하세요: ");
//			String title = sc.nextLine();
//			System.out.println("영화 개봉일을 입력하세요: ");
//			String openDate = sc.nextLine();
//			System.out.println("영화 3d 2d여부를 입력하세요: ");
//			String dimension = sc.nextLine();
//			System.out.println("영화 가격을 입력하세요: ");
//			int price = sc.nextInt();
//			sc.nextLine();
//			
//			m1 = new Movie(title,openDate,dimension,price);
//			System.out.println(m1.info());
//		}
//		
//		System.out.println(m1.info());
		
		Movie a = null;
		Movie b = null;
		Movie c = null;
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("영화 제목을 입력하세요: ");
			String title = sc.nextLine();
			System.out.println("영화 개봉일을 입력하세요: ");
			String openDate = sc.nextLine();
			System.out.println("영화 3d 2d여부를 입력하세요: ");
			String dimension = sc.nextLine();
			System.out.println("영화 가격을 입력하세요: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			if(i==0) {
				a = new Movie(title,openDate,dimension,price);
			}else if(i==1) {
				b = new Movie(title,openDate,dimension,price);
			}else{
				c = new Movie(title,openDate,dimension,price);
			}
		}
		
		System.out.println(a.info());
		System.out.println(b.info());
		System.out.println(c.info());
		
		//만약 해당 객체에 사용자가 입력한 제목에 대한 가격을 묻는다면?
		
		System.out.println("가격을 알고 싶은 영화 제목을 입력하세요: ");
		String input = sc.nextLine();
		
		//if(등록된영화의 제목과 사용자가 입력한 제목이 일치한다면?){
//				가격을 보여주세요
//	       }
		
		if(a.getTitle().equals(input)) {
			System.out.println(a.getPrice());
		}else if(b.getTitle().equals(input)) {
			System.out.println(b.getPrice());
		}else if(c.getTitle().equals(input)){
			System.out.println(b.getPrice());
		}else {
			System.out.println(input+" 영화는 없습니다.");
		}
		
		sc.close();
	}

}
