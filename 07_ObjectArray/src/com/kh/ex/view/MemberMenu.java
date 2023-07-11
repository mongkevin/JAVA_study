package com.kh.ex.view;

import java.util.Scanner;

import com.kh.ex.controller.MemberController;
import com.kh.ex.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		
		while(true) { //메뉴반복
			
			//자주 사용하는 메소드 반환값 변수처리
			int count = mc.existMemberNum();
			System.out.println("현재 등록 가능한 회원 수는 "+MemberController.SIZE+"명입니다.");
			System.out.println("현재 등록된 회원 수는 "+count+"명입니다.");
			
			if(count == 10) { //10명일때
				System.out.println(("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다."));
			}else { //10명이 아닐때
				System.out.println("1.새 회원 등록:");
			}
			System.out.println("2.회원검색:");
			System.out.println("3.회원 정보 수정:");
			System.out.println("4.회원 삭제:");
			System.out.println("5.모두 출력:");			
			System.out.println("9.끝내기:");
			System.out.println("메뉴 번호: ");
			
			int select = sc.nextInt();
			sc.nextLine(); //버퍼에 남아 있는 엔터 제거
			
			//만약 사용자가 등록수가 가득 찼음에도 불구하고
			//1번메뉴를 입력했을때 처리되지 않게 작업
			if(count==10&&select==1) {
				System.out.println("등록 수가 가득 찼기 때문에 더 이상 등록할 수 없습니다");
				continue;
			}
			
			switch(select) {
			case(1): insertMember();
				break;
			case(2): searchMember();
				break;
			case(3): updateMember();
				break;
			case(4): deleteMember();
				break;
			case(5): printAll();
				break;
			case(9): 
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default: System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertMember() {
		System.out.println("아이디: ");
		String id = sc.nextLine();
		//mc.checkid(id)값이 true면 (중복) 반복문 진입
		while(mc.checkId(id)) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			id = sc.nextLine();
		}
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("비밀번호: ");
		String password = sc.nextLine();
		System.out.println("이메일: ");
		String email = sc.nextLine();
		System.out.println("성별(M/F: ");
		char gender = sc.nextLine().charAt(0);
		//m.M.f,F가 아닌겨우 다시 입력받기
		while(!(gender=='m'||gender=='M'||gender=='f'||gender=='F')) { //gender에 들어온 값이 잘못됐을 경우 다시 입력하게 끔
			System.out.println("성별을 다시 입력하세요.");
			gender = sc.nextLine().charAt(0);
		}
		System.out.println("나이: ");
		int age = sc.nextInt();
		sc.nextLine(); //나이 입력 후 남아있는 엔터 지우기
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	public void searchMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호: ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select){
		case(1): searchId();
			break;
		case(2): searchName();
			break;
		case(3):searchEmail();
			break;
		case(9): System.out.println("메인으로 돌아갑니다."); 
			return;
		default: System.out.println("잘못입력하셨습니다.");
			return;
		}
	}
	public void searchId() {
		System.out.println("아이디 검색: ");
		String id = sc.nextLine();
		String result = mc.searchId(id); //회원정보 또는 null
		
		if(result == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
		
	}
	public void searchName() {
		System.out.println("이름 검색: ");
		String name = sc.nextLine();
		Member[] result = mc.searchName(name); //회원정보 또는 null
		
		if(result[0] == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			
			for(int i=0; i<result.length; i++) {
				if(result[i]!=null) {
					System.out.println(result[i].toString());
				}
			}
		}
	}
	public void searchEmail() {
		System.out.println("이메일 검색: ");
		String email = sc.nextLine();
		Member[] sameEmail = mc.searchName(email); //회원정보 또는 null
		
		if(sameEmail[0] == null) { //반환결과가 없다(조회된 회원이 없음)
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			
			for(int i=0; i<sameEmail.length; i++) {
				if(sameEmail[i]!=null) {
					System.out.println(sameEmail[i].toString());
				}
			}
		}
	}
	public void updateMember() {
		
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.println("메뉴 번호: ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select){
		case(1):updatePassword();
			break;
		case(2): updateName();
			break;
		case(3):updateEmail();
			break;
		case(9): System.out.println("메인으로 돌아갑니다."); 
			return;
		default: System.out.println("잘못입력하셨습니다.");
			return;
		}
	}
	public void updatePassword() {
		System.out.println("비밀번호 변경하실 아이디를 입력하시오: ");
		String updateId = sc.nextLine();
		System.out.println("수정하실 비밀번호를 입력하세요: ");
		String updatePassword = sc.nextLine();
		
		boolean isTrue = mc.updatePassword(updateId, updatePassword);
		
		if(isTrue) { //비밀번호 변경 성공시
			System.out.println("성공적으로 수정이 되었습니다.");
		}else { //비밀번호 변경 실패시 (조회된거 없을때)
			System.out.println(updateId + "는 존재하지 않는 아이디입니다.");
		}
	}
	public void updateName() {
		System.out.println("이름 변경하실 아이디를 입력하시오: ");
		String updateId = sc.nextLine();
		System.out.println("수정하실 이름을 입력하세요: ");
		String updateName = sc.nextLine();
		
		boolean isTrue = mc.updatePassword(updateId, updateName);
		
		if(isTrue) { //이름 변경 성공시
			System.out.println("성공적으로 수정이 되었습니다.");
		}else { //이름 변경 실패시 (조회된거 없을때)
			System.out.println(updateId + "는 존재하지 않는 아이디입니다.");
		}
	}
	public void updateEmail() {
		System.out.println("비밀번호 변경하실 아이디를 입력하시오: ");
		String updateId = sc.nextLine();
		System.out.println("수정하실 이메일을 입력하세요: ");
		String updateEmail = sc.nextLine();
		
		boolean isTrue = mc.updatePassword(updateId, updateEmail);
		
		if(isTrue) { //이메일 변경 성공시
			System.out.println("성공적으로 수정이 되었습니다.");
		}else { //이메일 변경 실패시 (조회된거 없을때)
			System.out.println(updateId + "는 존재하지 않는 아이디입니다.");
		}
	}
	public void deleteMember() {
		System.out.println("1.특정회원 삭제하기");
		System.out.println("2.모든회원 삭제하기");
		System.out.println("9.메인으로 돌아가기");
		int result = sc.nextInt();
		sc.nextLine();
		
		switch(result){
		case(1):
			deleteOne();
			break;
		case(2):
			deleteAll();
			break;
		case(9):
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못입력하셨습니다.");
			return;
		}
	}
	public void deleteOne() {
		System.out.println("삭제하실 아이디를 입력하세요: ");
		String deleteId = sc.nextLine();
		System.out.println("절말로"+ deleteId + "회원을 삭제하시겠습니다? (y/n");
		char confirm = sc.nextLine().charAt(0);
		
		if(confirm =='y'||confirm=='Y') {
			boolean isTrue = mc.delete(deleteId);
			
			if(isTrue) {
				System.out.println(deleteId + "회원을 성공적으로 삭제하였습니다.");
			}else {
				System.out.println("입력하신 "+ deleteId + "은(는) 존재하지 않는 아이디입니다.");
			}
		}else {
			System.out.println("동의하지 않으셨기 때문에 작업을 중단합니다.");
		}
		
		
	}
	public void deleteAll() {
		System.out.println("정말로 전체 삭제를 하시겠습니까? (y/n)");
		char confirm = sc.nextLine().charAt(0);
		if(confirm=='y' || confirm=='Y') {
			mc.delete();
			System.out.println("성공적으로 삭제를 하였습니다.");
		}else {
			System.out.println("동의하지 않으셨기 때문에 작업을 중단합니다.");
		}
	}
	public void printAll() {
		Member[] m = mc.printAll();
		if(mc.existMemberNum()==0) { //회원 수가 0명이면 오류가 난다.
			System.out.println("저장된 회원이 없습니다.");
		}else {
			for(int i=0; i<mc.existMemberNum();i++) {
				System.out.println(m[i].toString());
			}
		}
	}

}
