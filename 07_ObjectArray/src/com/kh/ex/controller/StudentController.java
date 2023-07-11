package com.kh.ex.controller;

import com.kh.ex.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	//기본 생성자 
	public StudentController() {
		//외부에서 해당 객체를 기본생성자로 생성하면 아래에 있는 객체들이
		//객체배열에 할당된다.
		sArr[0] = new Student("이유나","자바",100);
		sArr[1] = new Student("정종록","자바",50);
		sArr[2] = new Student("이길동","자바",85);
		sArr[3] = new Student("정길동","자바",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	
	//반환타입이 객체 배열 타입이기 때문에 return값도 반환타입에 맞춰 객체배열의 주소값을 반환한다.
	public Student[] printStudent() {
		return sArr; //객체배열의 주소값을 반환한다.
	}
	
	public int sumScore() {
		int sum = 0; //합계 담을 변수
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore(); //위에 작성한 메소드 사용
		avg[1] = (double)sumScore()/sArr.length;
		return avg; //double 배열의 주소값 반환
	}
	
}






