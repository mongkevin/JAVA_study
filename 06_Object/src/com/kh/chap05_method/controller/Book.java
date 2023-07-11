package com.kh.chap05_method.controller;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	public Book(String title, String publisher, String author) {
		this(title, publisher, author, 0, 0.0);
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void setTile(String title) {
		this.title= title; 
	}
	public String getTitle() {
		return title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void getDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void inform() {
		System.out.println(title + publisher + author);
		System.out.println(title + publisher + author + price + discountRate);
	}
}





