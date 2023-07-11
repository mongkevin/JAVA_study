package com.kh.ex.model.vo;

public class Book {
	//필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//기본생성자
	public Book() {
		
	}
	//매개변수 3개짜리 생성자
	public Book(String title, String publisher, String author) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	//매개변수 5개짜리 생성자
	public Book(String title, String publisher, String author,int price,double discountRate) {
		this(title,publisher,author); //매개변수 3개짜리 생성자
		this.price=price;
		this.discountRate=discountRate;
	}
	
	//메소드
	public void inform() {
		System.out.printf("제목: %s\r 출판사: %s\r 저자: %s\r 가격: %d\r 할인률: %.1f%%\r",
				title,publisher,author,price,discountRate);
	}
}
