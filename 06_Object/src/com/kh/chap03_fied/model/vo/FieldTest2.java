package com.kh.chap03_fied.model.vo;

//접근제한자 4가지
public class FieldTest2 {
	/*
	 * (+)public -> 어디서든(같은 패키지, 다른 패키지 다 접근가능)
	 * (#)protected -> 같은 패키지 접근가능, 만약 다른 패키지라면 상속관계에서 접근가능.
	 * (~)default -> 같은 패키지 내에서는 접근가능(기본값이기 때문에 생략되어 있음)
	 * (-)private -> 해당 클래스에서만 접근 가능 
	 * 
	 * 위에서부터 아래로 내려올수록 접근 범위가 좁아진다.
	 * 
	 * 
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String priv = "private";
	
	
	
}
