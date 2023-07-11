package com.kh.ex.model.vo;

public class House {
	
	private int size;
	private int room;
	private int toilet;
	private boolean isExtend;
	private int price;
	
	public House() {
		
	}
	//생성자에는 조건이 걸려있지 않기 때문에 생성자로 객체를 생성하면 아무런 조건처리가 되지 않는다.
	//조건을 작성해둔 setter메소드를 이용하여 조건처리를 해보자.
	public House(int size, int room, int toilet, boolean isExtend, int price) {
		setSize(size); //size setter 내부메소드사용 
		setRoom(room);
		this.setToilet(toilet);
		this.isExtend = isExtend;
		this.setPrice(price);
	}
	//아파트 평형은 25/28/31/34/45 평만 가능하게 조건 걸어주기
	public void setSize(int size) {//제대로된 데이터가 들어올때만 필드에 초기화하기.
		switch(size) { //넘겨받은 데이터로 판별작업
		case(25):
		case(28):
		case(31):
		case(34):
		case(45):
			this.size=size;
//		break; //없어도 됨 
		}
		
	}
	public int getSize() {
		return size;
	}
	public void setRoom(int room) {
		if(room>0) { //방개수가 최소 1개이상 들어올때만 초기화
			this.room=room;
		}
	}
	public int getRoom(){
		return room;
	}
	public void setToilet(int toilet) {
		if(toilet>0) { //화장실개수 1개 이상이면 초기화 아니면 기본값.
			this.toilet=toilet;
		}
	}
	public int getToilet(){
		return toilet;
	}
	public void setIsExtend(boolean isExtend) {
		this.isExtend=isExtend;
	}
	//기본setter getter의 유형을 변질시킬만한 구문은 새로운 메소드로 작성해서 사용하자.
	public boolean getIsExtend(){
		return isExtend;
	}
	//발코니 확장여부를 문자 또는 문자열로 돌려받는 메소드
	public String getExtendStr() {
//		String str = "";
//		if(isExtend) { //isExtend(발코니 확장여부가) true이면 확장 0
//			str = "O";
//		}else { //false이면 (발코니 확장X)
//			str = "X";
//		}
//		return str;
//		조건식?참일때 : 거짓일때
//		return"O";
//		return"X";
		return isExtend?"O":"X"; //3항 연산자 이용 
	}
	
	
	//가격은 0원 이상이여야하고 100만원 밑으로 버린다. 
	public void setPrice(int price) {
		if(price>=0) {
			this.price=price/1000000*1000000; //나누기 100만원으로 100만원까지 제거 후 다시 자릿수 채우기
		}
	}
	//발코니 확장여부를 통해서 5프로 할인된 가격 또는 정상가를 반환해보자
	public int getPrice(){
		if(isExtend) {
			return price; //발코지확장하면 정상가
		}else { //확장하지 않았으니 5프로 할인가격(단100만원 단위는 버린다.)
			return (int)((price * 0.95)/1000000*1000000);
		}
	}
	
	//정보출력용 메소드
	public void print() {
		System.out.println("집정보");
		System.out.println(size);
		System.out.println(room);
		System.out.println(toilet);
		System.out.println(getExtendStr());
		System.out.println(getPrice());
	}
}




