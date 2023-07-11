package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		// 컬렉션 정렬 방법에 대해 알아보자
		// Collections.sort() 메소드를 활용해보자
		ArrayList<Integer> iList = new ArrayList<>();
		ArrayList<String> sList = new ArrayList<>();

		iList.add(15);
		iList.add(1);
		iList.add(66);
		iList.add(123);
		iList.add(432);

		sList.add("안녕하세요");
		sList.add("빠이용");
		sList.add("잘가라");
		sList.add("피곤해");
		sList.add("수업중");

		System.out.println(iList);
		System.out.println(sList);

		Collections.sort(iList);
		Collections.sort(sList);

		System.out.println(iList);
		System.out.println(sList);

		// 내림차순 정렬
		// Collections.sort(List,Collections.reverseOrder())
		Collections.sort(iList, Collections.reverseOrder());
		System.out.println(iList);

		// Collections.shuffle(): 램덤으로 섞어주지
		Collections.shuffle(sList);
		System.out.println(sList);

		// 객체같은 경우에는 어떠한 기준으로 정렬으르 해야하는지 알 수 없기 때문에 오류가 발생한다.
		// Collections.sort() 메소드의 경우 내부적으로 compareTo()메소드가 샐행이되어
		// 정렬기준을 설정한다.

		// 해당 클래스에 implements Comparable<>를 추가해준다.
		// 아래 메소드를 추가하여 this. .compareTo(o. )

		// compareTo 메소드를 오버라이딩하면 기본 정렬기준이 정해지는 것
		// 만약 그때그때 정렬 기준을 다르게 하고 싶다면?
		// Comparator를 구현하여 compare()메소드에 기준을 잡아준다.
		// Collections.sort(ml,new Comparator<String>()){
		// @Override
		// public int compare(String s1, String s2)
		// return s1.compareTo(s2); //반대면 내림차순
		// }

		// Collections.sort(ml,new SortMusic());

		// 제목 정렬 만약 제목이 같다면?
//		if (o1.getTitle().equals(o2.getTitle()))
//			return o1.getSinger().compareTo(o2.getSinger());
//		return o1.getTitle.compareTo(o2.getTitle());
		
		//익명객체(익명클래스) 생성과 동시에 정의하여 사용
		//바로 밑에 오버라이딩된 메소드를 써준다.
	}
}
