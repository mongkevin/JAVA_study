package com.kh.chap03_interface.model.vo;

public class MovieActor implements Actor, Person{

	@Override
	public void cry() {
		System.out.println("분노눈물 흘리기");
	}
	
	@Override
	public void action() {
		System.out.println("아프게 때리기");
	}
	
	@Override
	public void love() {
		System.out.println("눈노에 빠진 눈빛 연기하기");
	}

	@Override
	public void justice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
