package com.java.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args){
		 
			Date today = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String todayStr = format.format(today);
			
			System.out.println(todayStr);
			
			
			todayStr = "2022-09-26 11:03:22";
			
			try {
				Date theDay = format.parse(todayStr);
				
				System.out.println(theDay);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
}





