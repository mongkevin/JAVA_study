package com.kh.chap04_constructor.model.vo;

public class CafeMenu {
	
	private String menu;
	private String kind;
	private int price;
	private boolean event;
	
	//생성자부
	public CafeMenu() {
		
	}//기본생성자 
	
	//매개변수 생성자 - 이름만 초기화하는 매개변수 생성자
	public CafeMenu(String menu) {
		this.menu = menu;
	}
	//이름과 중류를 초기화하는 매개변수 생성자
	public CafeMenu(String menu, String kind) {
		this.menu = menu;
		this.kind = kind;
	}
	//이름과 종류와 가격을 초기화하는 매개변수 생성자
	public CafeMenu(String menu, String kind, int price) {
		this.menu = menu;
		this.kind = kind;
		this.price = price;
	}
	//전부 다 초기화하는 매개변수 생성자
	public CafeMenu(String menu, String kind, int price, boolean event) {
		this.menu = menu;
		this.kind = kind;
		this.price = price;
		this.event = event;
				
	}
	
	public void setName(String menu) {
		this.menu = menu;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setEvent(boolean event) {
		this.event = event;
	}
	
	//getter
	public String getName() {
		return menu;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getprice() {
		return price;
	}
	
	public boolean getevent() {
		return event;
	}
	
	//출력문메소드
	public void print() {
		int count = 0;
		if(count == 0) {
			System.out.println("이름\t종류\t가격\t행사여부");
			count++;
		}
		System.out.println(menu + "\t" + kind + "\t" + price + "\t" + event);
	}
	
	public String info() {
		char ox = ' ';
		if(event) {
			ox ='o';
		}else {
			ox ='x';
		}
		return menu + "\t" + kind + "\t" + price + "\t" + ox;
	}
}
