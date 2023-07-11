package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Drink;

public class Run4 {

	public static void main(String[] args) {
		
		Drink ame = new Drink();
		ame.setName("아메리카노");
		ame.setKind("음료");
		ame.setPrice(1800);
		ame.setEvent(true);
		
		Drink pu = new Drink();
		pu.setName("아메리카노");
		pu.setKind("음료");
		pu.setPrice(1800);
		pu.setEvent(false);
		
		Drink cro = new Drink();
		pu.setName("아메리카노");
		pu.setKind("음료");
		pu.setPrice(1800);
		pu.setEvent(true);

		System.out.println("문자열 활용");
		System.out.println(ame.info());
		System.out.println(pu.info());
		System.out.println(cro.info());
		
		ame.print();
		pu.print();
	}

}
