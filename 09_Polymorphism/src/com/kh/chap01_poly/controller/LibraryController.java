package com.kh.chap01_poly.controller;

import com.kh.chap01_poly.model.vo.AniBook;
import com.kh.chap01_poly.model.vo.Book;
import com.kh.chap01_poly.model.vo.CookBook;
import com.kh.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	//최기화 블록 
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] bbList = new Book[bList.length];
		int count = 0;//인덱스용
		
		for(int i=0; i<bList.length; i++) {
			//문자열.contains(비교문자열): 
			//비교문자열이 문자열에 포함되어 있는지 알려주는 메소드(true or false)
			if(bList[i].getTitle().contains(keyword)) {
				bbList[count++] = bList[i];
			}
		}
		return bbList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		//index에 해당하는 책이 만화책이고 나아가 만화책 제한나이보다 적을 경우 result = 1로 초기화
		//if(bLiest[index] instanceof AniBook 
		//           && ((AniBook)bList[index]).getAccessAge()>mem.getAge()){
		//   result = 1;
		//}else if(bList[index] instanceof CookBook && ((CookBook)bList[index]).isCoupon()){
		//   mem.setCouponCount(mem.getCouponCount()+1); 현재 쿠폰개수 +1을 해야한다.
		//   result = 2;
		//}
		
		
		if(index>5 || index<1) {
			System.out.println("없는 책입니다.");
		}else {
			if(bList[index-1] instanceof AniBook) {
				if( mem.getAge() < ((AniBook) bList[index-1]).getAccessAge()) {
					result = 1;
				}
			}else {
				if( ((CookBook)bList[index-1]).getCoupon()) {
					int count = mem.getCouponCount();
					count++;
					mem.setCouponCount(count);
					result = 2;
				}
			}
		}
		
		return result;
	}
	
	
}
