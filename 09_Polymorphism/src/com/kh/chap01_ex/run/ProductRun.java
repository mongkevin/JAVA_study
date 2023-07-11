package com.kh.chap01_ex.run;



import com.kh.chap01_ex.controller.ProductController1;
import com.kh.chap01_ex.model.vo.NoteBook;
import com.kh.chap01_ex.model.vo.Tablet;
import com.kh.chap01_ex.model.vo.DeskTop;

public class ProductRun {

	public static void main(String[] args) {

		//다형성을 적용하기 전
		//각 객체를 생성하여 추가하고 조회해보자.
		
		ProductController1 pc = new ProductController1();
		DeskTop d = new DeskTop("노브랜드","가성비최고 컴퓨터",990000,"amd4070");
		pc.insert(d);
		
		pc.insert(new NoteBook("삼성","갤럭시북",1350000,3));
		pc.insert(new Tablet("애플","아이패드 프로5",1800000,true));
		
		//출력해보기
		System.out.println(d);
		System.out.println(pc.selectNoteBook());
		System.out.println(pc.selectTablet());
		System.out.println("주소: "+ new Tablet());
		
		
	}

}
