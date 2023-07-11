package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.Dog;

public class ConstructorRun {

	public static void main(String[] args) {

		Dog d = new Dog();
		
		Dog bo = new Dog("김뽀비",3,'여',4.3);
		bo.information();
		
		
	}
	

}
