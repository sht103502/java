package java0521;

public class Field {

	/*
	  	1. 멤버변수(필드)
	  		:객체가 생성 될때 각 객체별로 초기화
	  		:선언시 초기화 하지 않으면 초기값 설정
	  	
	  	2.statid변수
	  		:객체를 생성하지 않아도 참조 가능
	  	
	  	3.로컬변수
	  		:클래스영역이 아닌 부분에서 선언되는 변수
	  		:매소드나 초기화 블록에 선언되는 변수
	  	
	  
	 */

  	//멤버변수
	int size =18;
	
	int iNum =1000;
	short sNum =-100;
	byte bNum =10;
	long lNum = 20;
	//static 변수
	static int price =200; 
  	 
	//기본생성자
	Field() {
		
	}
	
	//먀개변수 :size){
//	Field(int size){
//		this.size = size;
//	}
	//매게변수 : bNum;
	Field(byte bNum){
		this.bNum =bNum;
	}
	//매게변수 : sNum;
	Field(short sNum){
		this.sNum =sNum;
	}
	//매게변수 : iNum;
	Field(int iNum){
		this.iNum =iNum;
	}
	Field(long lNum){
		this.lNum =lNum;
	}
	void shoInfo() {
		System.out.println();
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
	}
}

