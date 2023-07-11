package com.kh.chap03_map.part02_properties.model.vo;

public class Snack {
	private String flavor; //맛
	private int calory; //열량
	public Snack() {
		super();
	}
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
}
