package com.kh.chap01_ex2.run;

import com.kh.chap01_ex2.controller.AnimalController;
import com.kh.chap01_ex2.model.vo.Animal;
import com.kh.chap01_ex2.model.vo.Cat;
import com.kh.chap01_ex2.model.vo.Dog;
import com.kh.chap01_ex2.model.vo.Monkey;
import com.kh.chap01_ex2.model.vo.Tiger;

public class AnimalRun {
	public static void main(String[] args) {
	
		AnimalController zookeeper = new AnimalController();
		
		//고양이 울음 전용 메소드
		zookeeper.doCry(new Cat());
		//강아지 울음 전용 메소드
		zookeeper.doCry(new Dog());
		//호랑이 울음 전용 메소드
		zookeeper.doCry(new Tiger());
		
		//다형성을 적용시켜서 울려보자
		zookeeper.doCry(new Monkey());
		
		
		
		
	}
}
