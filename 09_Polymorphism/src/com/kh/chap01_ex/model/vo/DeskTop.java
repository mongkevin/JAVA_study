package com.kh.chap01_ex.model.vo;

public class DeskTop extends Product{
	//상수필드에 대해서는 getter/setter메소드가 필요없다. 
	public static final String CPU = "intel";
	private String graphic;
	
	public DeskTop() {
		super();
	}
	public DeskTop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	@Override
	public String toString() {
		return "DeskTop ["+super.toString()+"graphic=" + graphic + "]";
	}

	public String booting() {
		
		return"컴퓨터 부팅 띵";
	}
	
}
