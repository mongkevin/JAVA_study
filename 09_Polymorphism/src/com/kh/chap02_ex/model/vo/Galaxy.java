package com.kh.chap02_ex.model.vo;

public class Galaxy extends Phone{

	@Override
	public void camera() {
		System.out.println("철컥철컥");
	}

	@Override
	public void sns() {
		System.out.println("팔로우 취소 당함");		
	}

	@Override
	public void call() {
		System.out.println("전화 받아라~");
	}

}
