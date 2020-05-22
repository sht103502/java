package java0522;

import java.util.Scanner;

public class MyDate {//윤년일때는 29일까지 있다.
/*
 * 	1.MyDate, MyDateMain 클래스 생성
 * 	2.day, month, year변수는 private으로선언
 *  3.각 변수의 get, set 메소드를 public으로 생성
 *  4.MyDate(int day, int month, int year)생산자 선언
 *  5.public boolean isValid() 메소드로 날짜가 유효한지 확인
 *  6.MyDateMain 클래스에서 생성한 MyDate 날짜가 유효한지 확인
 */
	
//	switch case달별로 몇일이 있는지
//	윤년 2월 달은 얼마나 있는지 
//	
	//필드
	private int day;
	private int month;
	private int year;
	boolean isValid =true;
	//생성자
	
	//3. get.set메소드
	public int getDay() {
		System.out.println("getDay : "+ day);
		System.out.println("getDay isValid :"+ isValid);
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: //31일 까지 있는 달
		case 7: case 8: case 10: case 12://31일 까지 있는 달
			if(day>0 && day<=31) {
				this.day = day;
			}else {
				isValid=false;
			}
		case 4: case 6: case 9: case 11:
			if(day>0&& day<=30) {
				this.day = day;
			}else {
				isValid=false;
			}
			break;
		
		
		case 2:
			if((year%4==0 && year%100 != 0) || year% 400 == 0) {//윤달일때2016229   3031
				if(day>0&& day<=29) {//day가 0보다 크거나 day가 29보다 이하일때 실행
					this.day = day; // day 를 day 대입한다.1~29
				
				}else {//day가 그 이외일 때 실행
					isValid= false;
					//30,31일 들얼갈때
						
						
					}
				
			}else{//윤달이 아닐때 
				if(day>0&& day<=28) {//day 가 0보다 크거나 day 28일때 이하일때 실행  
					this.day = day;//day 가 day대입한다. 1~28
				}else {//그이외 일때 실행
					isValid=false;  //true였던 사실이 false 로 변함
			}
			}	
				break;
				
				default :
					System.out.println("값을 잘못 입력했습니다.");
					break;
			}
			this.day=day;
		}
	
	public int getMonth() {
		System.out.println("getMonth :"+ month);
		System.out.println("getMonth isValid :"+ isValid);
		return month;
	}
	public void setMonth(int month) {
		if(month>0&& month<=12) {//달이 0보다 크고 12보다 이하여야 실행
			this.month = month;
		}else {
			isValid =false;
		}
	}
	public int getYear() {
		System.out.println("getYear : "+ year);
		System.out.println("getYearisValid : "+ isValid);
		return year;
	}
	public void setYear(int year) {
	if(year>0) {	//0보다 작을때 값을 그대로
		this.year = year;
	}else {	// 아닐시 거짓
		isValid =false;
	}
	}
	
	//5.public String isValid()
		public String isValid() {
			if(isValid) {
			return "유효한 날짜입니다.";
			}else {
				return "유효하지 않은 날짜입니다.";
			}
		}
	
		//기본 생성자 
		public MyDate() {		
	}
	//4. 생성자 
	public MyDate(int day, int month, int year, boolean isValid) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + ", isValid=" + isValid + "]";
	}
	

}	