package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Player;

public class Run3 {

	public static void main(String[] args) {

		Player kim = new Player();
		
		kim.setName("김연아");
		kim.setGame("피켜스케이팅");
		kim.setGold(3);
		kim.setSilver(1);
		kim.setCopper(0);
		
		Player lee = new Player();
		lee.setName("이상화");
		lee.setGame("스피드스케이팅");
		lee.setGold(2);
		lee.setSilver(3);
		lee.setCopper(3);
		
		Player yun = new Player();
		yun.setName("윤성빈");
		yun.setGame("스케레톤");
		yun.setGold(1);
		yun.setSilver(0);
		yun.setCopper(1);
		
		System.out.println("=======basic========");
		System.out.print(kim.getName());
		System.out.print(kim.getGame());
		System.out.print(kim.getGold());
		System.out.print(kim.getSilver());
		System.out.println(kim.getCopper());
		
		
		System.out.println("=======info========");
		System.out.println(kim.info());
		System.out.println(lee.info());
		System.out.println(yun.info());
		
		
		System.out.println("=======information========");
		kim.information();
		lee.information();
		yun.information();
		
		
	}

}
