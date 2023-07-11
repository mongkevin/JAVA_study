package com.kh.chap03_map.part01_hashMap.model.vo;

//정렬 기준을 잡아줄 메소드를 사용할 수 있도록 정렬 구현하기 Comparable<정렬하고자하는 vo>
public class Dog implements Comparable<Dog>{

	//필드 두개 작성하여 MapRun2에서 HashMap 선언 후 String, Dog 제네릭으로 데이터 3개 넣고
	//출력해보기.
	//순차적으로 접근하여 키와 벨류의 형태로 출력해보세요.(2가지 방법 다해보기)
	private String name;
	private String kine;
	public Dog() {
		super();
	}
	public Dog(String name, String kine) {
		super();
		this.name = name;
		this.kine = kine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKine() {
		return kine;
	}
	public void setKine(String kine) {
		this.kine = kine;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", kine=" + kine + "]";
	}
	@Override
	public int compareTo(Dog o) {
		// 기본 정렬 기준 잡기
		// 현재 객체 제목과 다른 객체 제목을 비교하기
		return this.name.compareTo(o.name);
	}
	
}
