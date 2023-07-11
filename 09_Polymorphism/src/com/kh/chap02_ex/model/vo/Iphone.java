package com.kh.chap02_ex.model.vo;

public class Iphone extends Phone{

	@Override
	public void camera() {
		System.out.println("찰칵찰칵");
	}

	@Override
	public void sns() {
		System.out.println("팔라우하라우");
	}

	@Override
	public void call() {
		System.out.println("전화왔습니다~");
	}

}
