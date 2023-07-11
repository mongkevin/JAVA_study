package com.kh.chap02_set.model.vo;

import java.util.Objects;

public class Student {

	private String name;
	private String phone;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	//equals와 hashCode 메소드는 Object클래스의 메소드
	//오버라이딩해서 사용할 것 
	//각 필드들이 전부 일치하는지 확인하는 작업을 통해 해당 객체들이 같은 객체인지 확인하기
	//문자열.equals("비교문자열");
//	@Override
//	public boolean equals(Object obj) {
//		//모든 내용물 비교
//		//현재 객체 this와 넘겨받은 객체 obj를 비교해보자
//		if(this == obj) { //주소값 비교해서 같다면?
//			return true;
//		}
//		if(obj == null) { //만약 넘겨받은 obj가 null이라면?
//			return false; //지금 이 객체와 null을 비교할 필요가 없다.
//		}
//		if(getClass()!=obj.getClass()) { //클래스 타입을 비교하여 확인하기
//			return false; //클래스 타입이 다르다면 당연히 객체가 다르니깐 false
//		}
//		
//		//위에서 당연히 맞는 경우와 당연히 아닌경우를 제하고 내려왔을때
//		//각 내용물들을 비교해서 같은지 아닌지 판별하기.
//		Student other = (Student)obj; //넘겨받은 Object형 형변환해서 비교하기
//		
//		//null인경우 비교하기
//		if(name==null) { //현재 객체의 name 필드가 null일 경우
//			if(other.name != null) {//other의 name필드가 null이 아니라면?
//				return false; //null과 nulldl 아닌것을 비교하니 당연히 false(같지 않음)
//			}
//		}else if(!this.name.equals(other.name)) { //이 객체의 name필드와 other 객체의 name필드가 같지 않으면
//			return false; //같지 않음
//		}
//		//서로의 name필드가 null이 아니고 같을때 또는 서로의 name가 null로 같을때
//		//name필드에 대해서는 같다라는 판단을 하고 내려옴
//		
//		//null인경우 비교하기
//		if(phone==null) { //현재 객체의 phone 필드가 null일 경우
//			if(other.phone != null) {//other의 nhone필드가 null이 아니라면?
//				return false; //null과 nulldl 아닌것을 비교하니 당연히 false(같지 않음)
//			}
//		}else if(!this.phone.equals(other.phone)) { //이 객체의 phone필드와 other 객체의 phone필드가 같지 않으면
//			return false; //같지 않음
//		}
//		//name도 같고 phone같을때 
//		//age비교
//		if(this.age!=other.age) {
//			return false;
//		}
//		return true; //위에 있는 아닌 상황을 모두 지나 내려오면 같다라는 판다.
//	}
//	
//	//해쉬코드
//	
//	@Override
//	public int hashCode() {
//		//모든 필드값을 하나의 문자열로 만들어서 그것을 해시코드화 한 뒤 반환하기
//		return (name + phone + age).hashCode();
//	}
	
	
}





