package com.kh.chap02_tcp.server.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRun {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("[HH:MM:ss]");
		
		String date = sdf.format(d);
		System.out.println(date);
		
		
	}

}
