package com.kh.ex.run;

import com.kh.ex.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b = new Book("뇌","어느출판사","베르나르베르베르",150000,5.5); 
		
		b.inform();
	}

}
