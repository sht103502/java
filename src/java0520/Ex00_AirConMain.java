package java0520;

import java.util.Scanner;

import java0519_1.Ex01_AirCon1;



public class Ex00_AirConMain {
	//클래스는 한파일에 두개 이상도 선언이 가능
			//파일당 하나의 클래스만 선언
	public static void main(String[] args) {
//		int num ;
//		num=10;
//		
//		Ex01_AirCon airCon;			// 핃드선언
//		airCon = new Ex01_AirCon();//객체 생성
//		
		
		//클래스명 갤체명 = new클래스명()
		
//		//int num=10;
		
		//Ex00_AirCon airCon = new Ex00_AirCon();
//		Ex00_AirCon airCon = new Ex00_AirCon("제조사");
//		Ex00_AirCon airCon = new Ex00_AirCon(15);
		Ex00_AirCon airCon = new Ex00_AirCon("색상");
		
		//Ex00_AirCon airCon = new Ex00_AirCon(String c);
				
//		Scanner sc=new Scanner(System.in);
//		Ex01_AirCon1 airCon1 = new Ex01_AirCon1();
		//변수 초기화 
		//갹체의 멤버(필드)에 접근방법 : .(도트연산자) 사용
		
//		airCon.color ="white";
//		airCon.temp = 20;
//		airCon.price =160;
		System.out.println("color:"+ airCon.color);
		System.out.println("size: "+ airCon.size);
		System.out.println("company: " + airCon.company);
		//System.out.println("airCon.color :" + airCon.color);
		System.out.println("airCon.temp :" + airCon.temp);
		System.out.println("airCon.price :" + airCon.price);
		System.out.println();
		
		//메소드 호출
		//객체의 멤버(마스크)에 접근방법: /(도트연산자 ) 사용
		airCon.onPower();	
		airCon.offPower();
		System.out.println("========================");

		airCon.downtemp();
		System.out.println("현재온도(down) : "+ airCon.temp);

		airCon.uptemp();
		System.out.println("현재온도(up) : "+airCon.temp);
	}

	
}