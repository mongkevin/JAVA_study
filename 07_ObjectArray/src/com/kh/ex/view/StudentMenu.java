package com.kh.ex.view;

import com.kh.ex.controller.StudentController;
import com.kh.ex.model.vo.Student;

public class StudentMenu {
	private StudentController sc = new StudentController();
	
	public StudentMenu() {
		
		Student[] sArr = sc.printStudent();
		System.out.println("=====학생 정보 출력=====");
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		//double[]의 주소값을 전달 받아 접근 가능해졌다. (StudentController로 부터)
		double[] avgScore = sc.avgScore();
			
		System.out.println("=====학생 성적 출력=====");
		System.out.println("학생 점수 합계: " + avgScore[0]);
		System.out.println("학생 점수 평균: " + avgScore[1]);
		
		System.out.println("=====성적 결과 출력=====");
		//각 학생의 점수가 cut_line을 넘겼는지 확인하여 
		//이상이면 통과
		//미만이면 재시험 대상이라는 출력 메소드를 작성하시오
		//
		for(int i=0; i<sArr.length; i++) {
			if(sArr[i].getScore()<StudentController.CUT_LINE) {
				//해당 학생의 점수가 커트라인 미만인경우
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다.");
			}else {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}
		}
	}
	
	
	
}













