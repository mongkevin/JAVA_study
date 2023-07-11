package com.kh.chap01.abstraction.model.vo;

public class Player {

	//필드부
	private String name; //이름 필드
	private String game; //종목 필드 
	private int gold; //금메달 필드
	private int silver; //은메달 필드
	private int copper; //동메달 필드
	
	//생성자부
	
	
	//메소드부
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGame(String game) {
		this.game = game;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void setSilver(int silver) {
		this.silver = silver;
	}
	
	public void setCopper(int copper) {
		this.copper = copper;
	}
	
	//Getter
	
	public String getName() {
		return name;
	}
	
	public String getGame() {
		return game;
	}
	
	public int getGold() {
		return gold;
	}
	
	public int getSilver() {
		return silver;
	}
	
	public int getCopper() {
		return copper;
	}
	
	public void information() {
		System.out.print(getName());
		System.out.print(getGame());
		System.out.print(getGold());
		System.out.print(getSilver());
		System.out.print(getCopper());
	}
	
	public String info() {
		return name + game + gold + silver + copper;
	}
}
