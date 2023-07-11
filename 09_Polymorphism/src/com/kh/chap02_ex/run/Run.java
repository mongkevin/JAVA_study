package com.kh.chap02_ex.run;

import com.kh.chap02_ex.model.vo.Galaxy;
import com.kh.chap02_ex.model.vo.Iphone;
import com.kh.chap02_ex.model.vo.Phone;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * 핸드폰 추상 클래스를 만들고
		 * 핸드폰이라면 있어야하는 규칙같은 기능 3가지 추상 메소드로 만들고
		 * 핸드폰 클래스 2개(다른 종류) 작성하여 핸드폰 추상클래스 상속받아
		 * 오버라이딩하고 출력까지 해보세요.
		 */
		Phone iPhone = new Iphone();
		Phone galaxy = new Galaxy();
		
		System.out.println(iPhone);
		System.out.println(galaxy);
		
		iPhone.call();
		iPhone.camera();
		iPhone.sns();
		galaxy.call();
		galaxy.camera();
		galaxy.sns();
		
		
}
}
