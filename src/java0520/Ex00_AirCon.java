//19일꺼 이후 버전1.1 
package java0520;

public class Ex00_AirCon {
//변수정의
	//필드 (특성, 상태, 속성)
	
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//생성자
	/*
	  클래스명(매개변수){
	  
	  }
	  
	  
	  */
	//리턴타입을 쓰지 않는다.
	//기본생성자 : Java 컴파일러가 기본적으로 
	//생성자 메소드가 없으면 하나를 자동으로 만들어준다.
	//매개변수를 써도 되고 안써도 된다(기본생성자)
	//기본 생성자!
	Ex00_AirCon(){
		
	}
//	Ex00_AirCon(String c){
//		 company = c;
//	}
	//매개변수!
	Ex00_AirCon(int size){//size는 밑의 size랑 같다.
		this.size=size;// this.size는 위의 size를 가르킨다.
	}
	// 매게변수 (String company, String color)
	Ex00_AirCon(String company, String color) {
		this.company = company;
		this.color =color;
	}
	
	
	
	
	
	
	
	Ex00_AirCon(String c){
		color = c; // color를 두번 불렀는데 마지막 부른거를 저장해서 Main에서 색상 부를때 "색상"으로 나온다. 
	}
	//메소드
	void showInfo() {
		System.out.println("\ncompany : " + company + "\ncolor : " + color + "\nsize : " + size + "\nprice : "+price + "\ntemp : " + temp);
	}
	
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
	//5
	void addUser() { //앞에 보이드가 아니면 밑에 모조건 return값을 받는다.
		System.out.println("유저추가");
		//return 0;
	}
	
	
	// 데이터 타입이 void 인 경우
	// 리턴받을 데이터가 없을 경우
}
