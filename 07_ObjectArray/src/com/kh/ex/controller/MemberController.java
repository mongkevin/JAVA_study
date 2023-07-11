package com.kh.ex.controller;

import java.util.Scanner;

import com.kh.ex.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {
		//member 객체 배열에 인덱스가 비어있지 않다면? 사람이 등록되어 있다고 볼수 있다.
		//각 인덱스가 null이 아니라면 사람의 정보가 있다고 보니 count를 올려서 
		//해당 등록정보의 개수를 세어보자
		int count=0; //등록된 정보개수 넣어놓는 개수
		//객체배열 인덱스에 순차적으로 접근하여 비어있지 않는지 확인 작업
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null) { //i번째 인덱스가 비어있지 않다면?
				count++;
			}
		}
		return count; //등록된 회원명수 반환
	}

	//아이디 중복확인 하는 메소드
	public boolean checkId(String intputId) {
	//객체 배열에 있는 회원의 정보 중 아이디가 지금 넘겨받은 사용자 입력 아이디랑 일치하는지
	//판별하새어 일치하면 중복, 일치하지 않으면 사용가능
	//반복문을 활용하여 위의 작업해주기
	//객체배열의 length만큼 반복한다면 등록되지 않는 인덱스에도 접근하기 때문에
	//nullPointerException이 발생한다. 때문에 등록된 회원수 까지만 반복
		for (int i = 0; i < existMemberNum(); i++) {
			//만약 같은 아이디가 이미 존배한다면.
			if (m[i].getId().equals(intputId)) {
				return true;
			} 
		}
		return false;
	}

	//Member객체를 객체 배열에 저장하는 메소드
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		//객체 배열m에다가 넘겨받은 정보들을 담고있는 Member객체를 넣자. 
		//m[0]
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {//인덱스 i번째가 비어 있으면
				//넘겨받은 데이터로 객체를 생성하여 넣어라
				m[i] = new Member(id, name, password, email, gender, age);
				break; //넣었으니 break로 남은 반복 벗어나기
			}
		}
		
		//이걸 기본생성자에 넣어서 편하게 확인작업을 하자
//		m[0] = new Member("aaaa", "박신우", "aa", "aa@aaa.aaa", 'F', 33);
//		m[1] = new Member("bbbb", "강고결", "bb", "bb@bbb.bbb", 'M', 34);
//		m[2] = new Member("cccc", "남나눔", "cc", "cc@ccc.ccc", 'M', 28);
//		m[3] = new Member("dddd", "도대담", "dd", "dd@ddd.ddd", 'M', 35);
//		m[4] = new Member("eeee", "류라라", "ee", "ee@eee.eee", 'F', 17);
//		m[5] = new Member("ffff", "문미미", "ff", "ee@eee.eee", 'F', 20);
//		m[6] = new Member("gggg", "박보배", "ee", "ee@eee.eee", 'M', 26);
//		m[7] = new Member("hhhh", "송성실", "ee", "ee@eee.eee", 'M', 41);
//		m[8] = new Member("iiii", "윤예의", "ee", "ee@eee.eee", 'F', 28);
//		m[9] = new Member("jjjj", "정재주", "ee", "ee@eee.eee", 'M', 23);
	}

	//id로 회원 조회하는 메소드
	public String searchId(String id) {
		//객체 배열에 담긴 객체 중 전달받은 아이디와 동일한 아이디가 있는지 확인
		//만약 중간에 데이터가 지워져있는 상황일수도 있다면
		for(int i=0; i<m.length; i++) {
			//&&논리 연산의 경우 앞에 경우가 false면 뒤에는 확인하지 않는다 때문에
			//앞에 null과 비교하면 작업을 먼저 해줘야함.(아닐시 nullPointerException)
			if(m[i] != null && m[i].getId().equals(id)){
				//대항하는 아이디를 가진 회원의 정보를 반환
				return m[i].toString();
			}
		}
		//조회된 정보 없으면 null반환
		return null;
	}

	//이름으로 회원을 좋화하는 메소드, 동명이인을 고려하여 배열로 배출 
	public Member[] searchName(String name) {
		//임시저장소(같은 이름을 가진 멤버들 담아놓을 멤버객체배열)
		Member[] sameName = new Member[existMemberNum()];
		int count=0;
		
		System.out.println("검색하실 이름을 입력하세요.");
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getName().equals(name)) {
				//임시저장소의 첫번째 위치부터 넣어주기 위한 count
				sameName[count++]= m[i];
			}
		}
		return sameName;  //임시저장소객체배열 반환
	}

	//이메일로 회원을 조화하는 메소드
	public Member[] searchEmail(String email) {
		Member[] sameEmail = new Member[existMemberNum()];
		int count=0;
		
		System.out.println("검색하실 이름을 입력하세요.");
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getEmail().equals(email)) {
				//임시저장소의 첫번째 위치부터 넣어주기 위한 count
				sameEmail[count++]= m[i];
			}
		}
		return sameEmail;
	}

	//비밀번호 변경 메소드
	public boolean updatePassword(String id, String password) {
		//기존 등록된 회원의 아이디를 비교해서 일치하는게 있으면 비밀번호 변경
		for(int i=0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력 아이디가 일치하면
				m[i].setPassword(password);//setter메소드로 정보 갱신 
				return true;
			}
		}
		return false; //일치하는게 없으면 false로 반환
	}

	//이름 변경 메소드
	public boolean updateName(String id, String name) {
		for(int i=0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력 아이디가 일치하면
				m[i].setName(name);//setter메소드로 정보 갱신 
				return true;
			}
		}
		return false;
	}

	//이메일 변경 메소드
	public boolean updateEmail(String id, String email) {
		for(int i=0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)){ //기존 등록 아이디와 입력 아이디가 일치하면
				m[i].setEmail(email);//setter메소드로 정보 갱신 
				return true;
			}
		}
		return false;
	}

	//한 회원 삭제 메소드
	public boolean delete(String id) {
		//0 1 2 3 회원들이 있는데
		//1번 인덱스에 있는 회원정보를 삭제한다면?
		//0 null 2 3 null....
		//중간에 null값이 있으면 null값 비교를 계속 해줘야한다.
		//효율적이지 않는 null값 비교를 하지 않기 위해
		//만약 중간 인덱스가 비워진다면 뒤에 있는 객체들을 옮겨서 빈공간이 없게 작업해준다.
		//등록되어 있는 사람의 수를 existMemberNum()으로 구했다.
		//만약 등록되어있는 사람의 수가 4명이면 - 이때 배열에는? 0번 인덱스부터 1.2.3.해서 총 4명이 들어간 것
		//이때 마지막 수는? existMemberNum() - 1
		
		for(int i=0; i<existMemberNum(); i++) {
			//i번째 인덱스에 있는 Member 객체의 id와 입력받아온 id가 일치한다면? 지워야된다. 
			if(m[i].getId().equals(id)) { //일치
				//i값이 끝자리라면 null로 비워주기
				if(i == existMemberNum()-1) { //끝자리라면 null로 비워주기 왜? 땡길게 없음(지워야함)
					m[i] = null; //비워주기 - 마지막에 있는 경우 
				}else {//끝자리 아니면? 현재 위치 뒤에있는 객체들을 한칸씩 앞으로 땡겨주면 된다. 덮어쓰기
					//0 1 2 3 4 null null
					//j: 1 j<5
					for(int j=0; j<existMemberNum()-1;j++) {
						//내 뒷자리에 있는 객체를 내 자리에 넣기
						m[j] = m[j+1];
					}
					//마지막에 있는 대상을 null대입
					//끝자리까지 도달하면 끝자리를 null로 초기화
					m[existMemberNum()-1]=null;
				}
				return true; //처리 완료되었을때 true 반환
 			}
		}
		return false;
	}

	//전체 회원 삭제 메소드
	public void delete() {
//		for(int i=0; i<m.length; i++) {
//			m[i] = null;
//		}
		
		int count = existMemberNum(); //한번만 호출하고 해당 수만큼 반복시키기
		for(int i = 0; i<count;i++) {
			m[i]=null; //각 인덱스에 참조하지 않겠다는 null값 넣기
		}
	}

	//Member[] 반환 메소드 
	public Member[] printAll() {
		return m;
	}

}
