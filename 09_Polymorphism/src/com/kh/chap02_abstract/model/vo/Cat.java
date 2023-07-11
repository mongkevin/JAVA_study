package com.kh.chap02_abstract.model.vo;

public class Cat extends Animal{

	@Override
	public void crying() {
		System.out.println("냐아아ㅏ옹");
	}
	
	@Override
	public void drinking() {
		System.out.println("쩝쩝");
	}

	@Override
	public void eat() {
		System.out.println("우걱우걱");
	}
}
