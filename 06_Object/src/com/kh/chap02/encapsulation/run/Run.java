package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Dog;

public class Run {
	/*
	 * 캡슐화 과정을 통해 클래스 형태를 갖추자.
	 * 
	 * 캡슐화를 하지 않는다면 외부로부터 직접접근이 가능하기 때문에
	 * 값의 변질 또는 조회를 막지 못하는 상황이 생긴다.
	 * 
	 * -캡슐화 잡업: 데이터의 접근 제한을 원직으로 하여 외부로부터 직접 접근을 막는다.
	 * 			단, 간접적으로 접근하여 데이터의 조회 및 대입을 할 수 있도록 작업한다. (메소드 이용)
	 * 
	 * -캡슐화 작업 2단계: 1단계 값 숨기기, 2단계 간접적으로 값에 접근할 수 있는 메소드 만들기.
	 * 1.값 숨기기 - 접근제한자를 private으로 작성한다
	 * 2.값 처리 메소드 만들기 - setter / getter 메소드를 만든다.
	 * setter - 필드에 값을 대입해주는 메소드.
	 * getter - 필드에 담긴 값을 꺼내오는 메소드.
	 * -주의할 점: 메소드부에 작성하여 모든 필드에 대해 작성하고 작명시엔 낙타봉표기법을 지켜준다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		//d.name = "쁜이";
		//d.age = 3;
		//d.gender = '여';
		//d.weight = 15.5; //접근제한자가 public 이라 접근 가능 
		//위와 같이 직접 접근을 하게 되면 보안이슈가 생길 수 있다.
		//때문에 private으로 작성하여 접근을 막았는데.
		//이때 해당 필드의 값을 초기화 하려면..??
		//간접접근을 이용한다 - 메소드 (getter/setter)
		
		//d.name = "쁜이"; 직접접근 대입 대신에
		//setter메소드를 사용할 것;
		
//		d.setName(여기에 전달할 값을 넣기);
		d.setName("쁜이");
		d.setAge(2);
		d.setGender('남');
		d.setWeight(20.0);
		
		Dog yebbi = new Dog();
		yebbi.setName("안뇽");
		yebbi.setAge(3);
		yebbi.setGender('여');
		yebbi.setWeight(25.0);
		
		int age = yebbi.getAge(); // age는 2임 int age에 getter메소드로 가지고온 숫자 넣기
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getGender());
		System.out.println(d.getWeight());
		
		System.out.println(yebbi.getName());
		System.out.println(yebbi.getAge());
		System.out.println(yebbi.getGender());
		System.out.println(yebbi.getWeight());
		
		System.out.println("========information 메소드 활용=========== ");
		d.information();
		yebbi.information();
		
		System.out.println("========info 활용=========== ");
		System.out.println(d.info());
		System.out.println(yebbi.info());
	}
}









