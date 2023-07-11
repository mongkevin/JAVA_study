package com.kh.chap01_beforeVSafter.before.run;

import java.awt.Desktop;

import com.kh.chap01_beforeVSafter.before.model.vo.DeskTop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		//DestTop 객체 생성
		//brand, pCode, pName, price, allInOne
		DeskTop d = new DeskTop("삼성","dt-01","가성비짱짱",990000,true);
		
		//Tv 객체(+inch)
		Tv t = new Tv("LG","tv-01","짱얇은 티비",1350000,50);
		
		//SmartPhone 객체(+ma)
		SmartPhone s = new SmartPhone("애플","ip-22","iphone",1450000,"skt");
		
		//세 객체의 정보 출력
		System.out.println(d.toString());
		System.out.println(t.toString());
		System.out.println(s.toString());
	}

}
