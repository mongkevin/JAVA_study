package com.kh.chap01.model.vo;

public class Movie {
	//제목,개봉일,2d, 3d 여부, 가격
	private String title;
	private String openDate;
	private String dimension;
	private int price;
	
	public Movie() {
		
	}
	public Movie(String title, String openDate, String dimension, int price) {
		this.title=title;
		this.openDate=openDate;
		this.dimension=dimension;
		this.price=price;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setOpenDate(String openDate) {
		this.openDate=openDate;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setDimension(String dimension) {
		this.dimension=dimension;
	}
	public String getDimension() {
		return dimension;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	//필드값을 문자열로 더해서 반환하는 메소드
	public String info() {
		return title + openDate + dimension + price;
	}
	
	
	
	
}
