package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Game;

public class Run2 {

	public static void main(String[] args) {
		
		Game bbo = new Game();
		bbo.setName("뽀로로");
		bbo.setJob("전사");
		bbo.setLev(-1);
		bbo.setMoney(70000);
		
		Game ma = new Game();
		ma.setName("마리오");
		ma.setJob("마법사");
		ma.setLev(45);
		ma.setMoney(65000);
		
		Game ru = new Game();
		ru.setName("루이지");
		ru.setJob("전사");
		ru.setLev(33);
		ru.setMoney(70000);
		
		System.out.println("======================");
		bbo.print();
		ma.print();
		ru.print();
		
		System.out.println("======================");
		System.out.println(bbo.info());
		System.out.println(ma.info());
		System.out.println(ru.info());
	}

}
