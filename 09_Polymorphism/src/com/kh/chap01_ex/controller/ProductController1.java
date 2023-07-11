package com.kh.chap01_ex.controller;



import com.kh.chap01_ex.model.vo.NoteBook;
import com.kh.chap01_ex.model.vo.Tablet;
import com.kh.chap01_ex.model.vo.DeskTop;

//다향성을 적용하기 전
public class ProductController1 {

	//필드부
	private DeskTop desk;
	private	NoteBook note;
	private Tablet tab;
	
	//메소드
	//추가메소드
	
	public void insert(DeskTop desk) {
		this.desk = desk;
	}
	public void insert(NoteBook note) {
		this.note = note;
	}
	public void insert(Tablet tab) {
		this.tab = tab;
	}
	
	//getter메소드 역할
	public DeskTop selectDeskTop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	

	
}
