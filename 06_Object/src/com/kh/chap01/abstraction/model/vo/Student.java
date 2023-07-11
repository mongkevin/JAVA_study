package com.kh.chap01.abstraction.model.vo;

/* 
 * 클래스의 구조
 * 
 * public class 클래스명{
 * -필드부
 * 
 * -생성자부
 * 
 * -메소드부
 * 
 * }
 */


//학생들을 추상화하여 만든 클래스
public class Student {
	
	//[필드부]
	//접근제한자 자료형 필드명;
	
	//-접근제한자: 이 필드에 접근할 수 있는 범위를 제한할 수 있다.
	//public > protected > default(같은 패키지만 접근가능) > private
	//모든곳  > 상속과 같은 패키지> 같은 패키지> 내 클래스만 
	//클래스 내에서 필드를 선언할때 반드시 접근 제한자를 작성해야한다.
	//접근제한자를 작성하지 않으면 default가 들어가는데 default 접
//	/*default*/String name; //이름을 담아놓을 변수(필드)
	public String name;
	public int age; //나이를 담아 놓을 변수(필드)
	public char gender; //성별을 담아 놓을 변수(빌드)
	
	//[생성자부]
	
	
	//[메소드부]
}







