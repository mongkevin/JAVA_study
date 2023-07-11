package com.kh.chap02_abstract.model.vo;

public class Dog extends Animal{

	@Override
	public void crying() {
		System.out.println("멍멍");
	}
	
	@Override
	public void drinking() {
		System.out.println("쩌업쩌업");
	}

	@Override
	public void eat() {
		System.out.println("헉헉헉");
	}
}
