package com.kh.ex.run;

import com.kh.ex.model.vo.House;

public class HouseRun {

	public static void main(String[] args) {

		House a = new House(25,2,1,false,300000000);
		House b = new House(18,0,0,true,-500000000);
		
		a.print();
		b.print();
				
	}

}
