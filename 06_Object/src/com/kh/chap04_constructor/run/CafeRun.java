package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.CafeMenu;

public class CafeRun {

	public static void main(String[] args) {
		//매개변수 생성자를 이용하여 카페 메뉴 4가지를 초기화 및 출력해보세요.
		CafeMenu ame = new CafeMenu("아메리카노","음료",18000,true);
		CafeMenu cro = new CafeMenu("크로크무슈","식사", 3300);
		cro.setEvent(true); //중간에 데이터가 바뀌게 된다면? 
		ame.print();
		cro.print();
	}

}
