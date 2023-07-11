package com.kh.ex.run;

import com.kh.ex.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {

		Phone a = new Phone("아이폰","Sk",4000,12);
		
		a.print();
		
		Phone b = new Phone("내폰","skej",-600,5);
		
		b.print();
	}

}
