package com.week1;


import java.util.Calendar;

public class CalendarMake {//캘린더 클래스를 임포트하고 가져옴
private Calendar cal = Calendar.getInstance();


	public void PrintMethod() {//오늘의 연, 월, 일을 구하고 프린트하는 메소드
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DATE);
		System.out.println("오늘은" +year+ "년 "+ month + "월 " +day+"일 입니다."  );
	}
	public static void main(String[] args) {
		CalendarMake cm = new CalendarMake();
		cm.PrintMethod();
	}
}
