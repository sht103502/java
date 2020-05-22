package java0519;

public class Ex01_AirCon {
//변수정의
	//필드 (특성, 상태, 속성)
	
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//메소드 (기능, 동작, 행동) 
	/*
	 	리던타입 메소드명() {
	 		실행내용
	 	}
	  */
	
	//int 타입의 데이터를 반환 → int 메소드명() {  }
	//1
	void onPower() { 
		System.out.println("power on!");
	}
	//2
	void offPower() {
		System.out.println("power off!");
	}
	//3
	void uptemp() {
		temp++;		
	}
	//4
	void downtemp() {
		temp--;	
	}
	
	// 데이터 타입이 void 인 경우
	// 리턴받을 데이터가 없을 경우
}
