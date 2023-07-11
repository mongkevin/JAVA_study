package com.kh.ex.model.vo;

public class Phone {

	private String name;
	private String tele;
	private int price;
	private int month;
	
	public Phone() {
		
	}
	public Phone(String name, String tele,int price, int month) {
		this.name = name;
		setTele(tele);
		setPrice(price);
		setMonth(month);
		
	}
	//통신사는 sk, kt, lg 알폰중 하나만 설정할 수 있다.
	public void setTele(String tele) {
		//문자열을 모두 소문자로 또는 모두 대문자로 바꿔주는 String 클래스의 메소드
		//모두 소문자: (문자열).toLowerCase,모두 대문자: (문자열).toUpperCase
		switch(tele.toLowerCase()) { //넘어온 문자열tele를 모두 소문자로 바꿔서 비교 
		case "sk":
		case "kt":
		case "lg":
		case "알뜰폰":
			
			this.tele=tele.toUpperCase(); //초기화할때는 모두 대문자로 변환하여 초기화하기
		
		}
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getTele() {
		return tele;
	}
	//가격 음수 설정 안되게
	public void setPrice(int price) {
		if(price>=0) {
			this.price = price;
		}
	}
	public int getPrice() {
		return price;
	}
	
	public void setMonth(int month) {
		if(month%6==0 && month != 0) { //month가 6개월 단위면 초기화
			this.month = month;
		}
	}
	public int getMonth() {
		return month;
	}
	public void print() {
		System.out.println("핸드폰 정보");
		System.out.println(getName());
		System.out.println(getTele());
		System.out.println(getPrice());
		System.out.println(getMonth());
	}
}




