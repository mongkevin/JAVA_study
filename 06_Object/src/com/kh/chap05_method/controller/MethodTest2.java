package com.kh.chap05_method.controller;

public class MethodTest2 {

	/*
	 * 메소드 오버로딩
	 * -한 클래스 안에 같은 이름의 메소드들을 만든느 (정의하는) 방법
	 * -매개변수의 자료형 또는 개수를 다르게 작성하여 구분짓는다.
	 * -단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 자지 않는다.
	 * 
	 */
	
	public void test() {
		//메소드 오버로딩이 잘되어 있는 예)
		System.out.println("안녕하세요.");
		System.out.println(10);
		System.out.println(true);
	}
	
	public void test(int num) {
		
	}
	
	public void test(String name) {
		
	}
	public void test(String name, int age) { //아래꺼랑 
		
	}
	public void test(int age, String name) { //위치가 달라도 가능
		
	}
//	public void test(String str, int price) { //같은 자료형과 다른명이라도 해도 안됀다. 
//													자료형 추가 혹은 자료형을 수정
//	}
//	public String test(String str) { //반환형은 영향을 끼치지 않는다 - 오버로딩에.
//		
//	}
//	protected int test(int a) { //접근 제한자도 오버로딩에 영향을 끼치지 않는다
//		return 0;
//	}
}








