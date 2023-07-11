package com.kh.chap01_poly.view;

import java.util.Scanner;

import com.kh.chap01_poly.controller.LibraryController;
import com.kh.chap01_poly.model.vo.Book;
import com.kh.chap01_poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요: ");
		char gender = sc.nextLine().charAt(0);
		
		//입력받은 데이터 Member 객체로 가공하기
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 대여하기");
			System.out.println("9.프로그램 종료하기");
			System.out.println("메뉴 번호: ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case(1): 
				System.out.println(lc.myInfo());
//				lc.myInfo();
				break;
			case(2):
				selectAll();
				break;
			case(3):
				searchBook();
				break;
			case(4):
				rentBook();
				break;
			case(9):
				System.out.println("메뉴를 종료합니다.");
				return;
			default:
				System.out.println("잘못누르셨습니다.");
			}
		}
	}
	
	public void selectAll() {
		
		Book [] bList = lc.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			System.out.println((i+1)+ "번 도서: " + bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i< searchList.length; i++) {
			if(searchList[i]!=null) {
				System.out.println(searchList[i]);
			}else {
				break;
			}
		}
		
	}
	
	public void rentBook() {
		
		selectAll();
		
		System.out.println("대여할 도서 번호 선택: ");
		int index = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(index);
		
		switch(result){
		case(0):System.out.println("성공적으로 대여되었습니다.");
			break;
		case(1):System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case(2):System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
		
	
	}
}
