package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	//mvc 패턴의 c: controller - 사용자의 요청을 받아 처리하는 클래스
	
	//곡들을 담아 놓을 저장소 만들기
	ArrayList<Music> list = new ArrayList<>();
	
	//최기화 블록
	{
		list.add(new Music("Catch","에픽하이"));
		list.add(new Music("Unholy","SamSmith"));
	}
	
	//새로운 곡 추가 메소드
	public int insertMusic(String title, String artist) {
	
		boolean isTrue = list.add(new Music(title, artist));
		int count = 0;
		if(isTrue) {//데이터가 잘들어갔으면
			count++;
		}
		return count;
	}
	
	//노래 목록 전체 조회
	public ArrayList<Music> selectAll(){
		return list; //필드에 선언되어있는 리스트 주소값 들고 가지
	}
	
	//노래 검색 조회 메소드
	public ArrayList<Music> searchMusic(String title) {
		//검색 결과를 담을 리스트 생성 후 반환
		ArrayList<Music> searched = new ArrayList<>();
		
		//념겨받은 title로 노래목록 list에서 포함된 제목이 있는지 확인 후 있다면 searched에 담기
		for(int i=0; i<list.size(); i++) {
			//만약 노래목록에서 키워드가 포함된 제목이 있다면?
			if(list.get(i).getTitle().contains(title)) {
				//포함이 되어있으면, 즉 검색이 되었다면?
				searched.add(list.get(i));
			}
		}
		return searched;
	}
	
	//특정 노래 삭제 메소드 
	public int removeMusic(String title) {
		int count = 0;
		int size = list.size();
		for(int i=0; i<list.size(); i++) {
			//만약 리스트의 i번째 제목이 넘겨받은 제목과 일치한다면?
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				count++; //몇개나 삭제되었는지
				i--;//삭제되면 i값 감소시키기
			}
		}
		return count;
	}
	
	public int updateMusic(String title,String newTitle,String newArtist) {
		
		int count = 0;
		//넘겨받은 제목과 일치하는 인덱스 찾기
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { //일치하는 객체
				list.set(i, new Music(newTitle, newArtist));
				count++;
				break;
			}
		}
		return count;
	}
}






