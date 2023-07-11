package com.kh.ex.model.vo;

public class Member {

	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	//생성자 자동 완성 우클릭 소스 -> setter getter, constructor (control+ shift+ s)
	public Member() {
		
	}
	public Member(String id, String name, String password, String email, 
			char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	//setter getter 
	public void setId(String id) {
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	//inform 메소드
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
}







