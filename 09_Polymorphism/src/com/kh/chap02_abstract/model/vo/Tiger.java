package com.kh.chap02_abstract.model.vo;

public class Tiger extends Animal{

	@Override
	public void crying() {
		System.out.println("어헝어헝");
		
	}
	
	@Override
	public void drinking() {
		System.out.println("후루룩챱");
	}

	@Override
	public void eat() {
		System.out.println("냠냠냠");		
	}

}
