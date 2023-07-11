package com.kh.chap01.abstraction.model.vo;

public class Drink {

	private String name;
	private String kind;
	private int price;
	private boolean event;
	
	
	//setter
	public void setName(String name) {
		this.name = name;
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
		return name;
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
		System.out.println(name + "\t" + kind + "\t" + price + "\t" + event);
	}
	
	public String info() {
		char ox = ' ';
		if(event) {
			ox ='o';
		}else {
			ox ='x';
		}
		return name + "\t" + kind + "\t" + price + "\t" + ox;
	}
}








