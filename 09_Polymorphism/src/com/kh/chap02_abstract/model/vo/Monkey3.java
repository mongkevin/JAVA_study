package com.kh.chap02_abstract.model.vo;

public class Monkey3 extends Monkey2{

	@Override
	public void mk2Test() {
		System.out.println("몽키2의 메소드 구현했다");
	}

	@Override
	public void test() {
		System.out.println("몽키의 메소드 구현");
	}

	//Monkey2에있는 추상메소드만 나오는게 아니라
	//Monkey2가 상속받고 이쓴 추상 클래스의 메소드까지 구현해야한다. 
}
