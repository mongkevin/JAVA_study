package com.kh.chap01_beforeVSafter.after.model.vo;

//상속 표현법
//접근제한자 class 클래스명 extends 부모클래스명;
public class DeskTop extends Product{

	private boolean allInOne;

	public DeskTop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String inform() {
		return super.inform() + ", 올인원 여부: " + allInOne;
	}
}
