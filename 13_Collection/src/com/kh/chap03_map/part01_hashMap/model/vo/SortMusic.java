package com.kh.chap03_map.part01_hashMap.model.vo;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class SortMusic implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compare(Music o1, Music o2) {
		
		//제목 정렬 만약 제목이 같다면?
//		if(o1.getTitle().equals(o2.getTitle()))
//			return o1.getSinger().compareTo(o2.getSinger());
//		return o1.getTitle.compareTo(o2.getTitle());
//	}

}
