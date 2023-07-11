package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.Singer;

public class SingerRun {

	public static void main(String[] args) {

		Singer epicHigh = new Singer("에픽하이","catcher", "2019-04-22");
		Singer ryhe = new Singer("ryhe", "The Fall", "2009-1-3");
		
		epicHigh.print();
		ryhe.print();
	}

}
