package com.yedam.insa;

import java.util.Calendar;

public class CalendarEx {
	
	static int year;
	static int month;
	
	
	static void set(int year,int month){
		CalendarEx.year=year;
		CalendarEx.month=month-1;
	}
	
	static void cal() {
		//년도, 월 : 정해짐
		// 말일, 첫날의 위치
		Calendar cal= Calendar.getInstance();
		cal.set(CalendarEx.year, CalendarEx.month,1);
		
		int firstDate= cal.get(Calendar.DAY_OF_WEEK) -1;
		int lastDate= cal.getActualMaximum(Calendar.DATE);
		
		String title= "==="+ year+"년"+(month+1)+ "월 달력 =======";
		System.out.println(title);
		String days= "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===============");
		for (int i=0; i<firstDate;i++) {
			System.out.printf("%3s ","");
		}
		
		for (int j=1; j<=lastDate;j++) {
			System.out.printf("%3s ",j);
			if((firstDate +j)%7==0) {
				System.out.println();
			}
		}
	}
}
