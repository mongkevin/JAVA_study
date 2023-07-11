package com.kh.chap02.encapsulation.model.vo;

public class Game {

	private String name;
	private String job;
	private int lev;
	private int money;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob(){
		return job;
	}
	
	//레벨을 초기화하는 메소드인 setLev 메소드에 조건을 걸어 
	//잘못된 레벨이 들어오면 변경하지 않게 작성하기
	public void setLev(int lev) {
		if(lev > 0) { //만약 넘어온 데이터가 0보다 크다면? 
			this.lev = lev; //필드에 대입해라
		}else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
	}
	
	public int getLev() {
		return lev;
	}
	
	public void setMoney(int money) {
		if(money>0) {
			this.money = money;
		}else {
			System.out.println("소지금은 0보다 큰 수를 입력해주세요.");
		}
		
	}
	
	public int getMoney() {
		return money;
	}
	
	public void print() {
		System.out.printf("%s,%s,%d,%d\n",name,job,lev,money);
	}
	
	public String info() {
		return name + "," + job + "," + lev + "," + money;
	}
}






