package com.kh.chap05_method.run;

import com.kh.chap05_method.controller.Book;

public class PracticeRun {

	public static void main(String[] args) {
		
		Book a = new Book("노인과 바다","소나무", "헤밍웨이", 15000,0.5);
		Book b = new Book("해리포터","펭귄", "로링케이");
		a.inform();
		b.inform();
		
	}

}
