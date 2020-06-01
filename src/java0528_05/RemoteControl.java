package java0528_05;

public interface RemoteControl {
/*
 * 
 * 인터페이스(interface)
 * 
 * public interface 인터페이스명{
 * 		public static final 타입 상수명;
 * 		public abstract 리턴타입 메소드명;
 * 
 * }
 * 1.인터페이스는 누가 접근 가능하도록 public으로 설정
 * 2.객체의 다형성 구현하는데 용이하다.
 * 3.인터페이스의 구성요소
 * 	1) 상수필드: 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음.
 * 	2) 수상메소드
 * 	3) 디폴드메소드
 * 		:기본으로 실행내용까지 가지고 있는 메소드
 * 		:기존 인터페이스를 확대해서 새로운 기능을 추가하기 위함.
 * 	4) 정적(static)메소드
 * 		:인터페이스를 객체화 하지 않고도 직접 호출 가능.
 * 4.부모클래스 변수 =new 자실클래스();
 * 	  인터페이스 변수 =new 구현클래스 ();
 * 	 
 * 
 */
	//상수필드
	int MAX_VOLUME= 10;
	int MIN_VOLUME= 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 합니다.");
		}else {
			System.out.println("음소거 해제합니다.");
		}
	}
	
	//정적(static)메소드
	static void changeBattery() {
		System.out.println("건전지를 교체해주세요");
	}
	
	
}	
