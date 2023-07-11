package com.kh.chap03_fied.run;

import com.kh.chap03_fied.model.vo.FieldTest1;
import com.kh.chap03_fied.model.vo.FieldTest2;
import com.kh.chap03_fied.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		//FieldTest1
		FieldTest1 f1 = new FieldTest1();
		// 객체 생성시 - global (전역변수)가 메모리에 할당됨  
		
		f1.test1(10); //test 호출시 num과 local 지역변수 할당
		//test1메소드 종료시 num과 local 지역변수가 소멸
		
		f1 = null; //global 멤버변수(전역변수) 소멸
		//참조변수에 null을 넣는 행위: 더 이상 아무것도 참조하지 않겠다.
		//참조하고있던 객체는 참조되지 않기때문에 garbagecollector가 소멸시킨다. (필요없음 판단)
	
		//=====FieldTest2======
		//다른 패키지 접근해보기 
		FieldTest2 f2 = new FieldTest2();
		
		//public 어디서든 접근가능
		System.out.println(f2.pub);
		//portected 같은 패키지 내, 다른 패키지 일시 상속관계 시
//		System.out.println(f2.pro);
		//defualt 같은 패키지 내 
//		System.out.println(f2.def);
		//private 해당 클래스 내부에서만 접근가능. 
//		System.out.println(f2.priv);
		
		//======FieldTest3======
		
		//객체를 생성하지 않아도 static메모리 영역에 할당된 클래스 변수는 사용가능하다.
		//단 클래스 이름은 작성을 해주어야 어느 클래스에 있는 변수인지 알수 있다. 
		 System.out.println(FieldTest3.sta);
		 FieldTest3.test1(); //메소드도 마찬가지로 사용할 수 있다
		 
		 //static은 공유의 성격이 강하다.
		 //프로그램 동작과 동시에 메모리 영역에 할당시키고 그 데이터를 공유해서 사용하는 개념
		 //상수필드 출력해보고 값 변경할수 있는지 확인해보기
		System.out.println(FieldTest3.STR);
		System.out.println(FieldTest3.NUM);
		
//		FieldTest3.STR = "안녕";
//		FieldTest3.NUM = "변할수있음";
		
		//Math클래스도 random() 메소드라던지 PI라던지 다 static 예약어가 되어있어 
		//객체 생성없이 사용 가능했던 것. 
		
		System.out.println(Math.PI);
		
	}

}
