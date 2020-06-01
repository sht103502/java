package java0528_05;

public class RemoteMain {

	public static void main(String[] args) {
		Television tv= new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true);
		tv.turnOff();
		
		//인터페이스 변수 선언
		RemoteControl rc= null;
		//audio객체를 인터페이스 타입에 대입
		rc= new Audio();
		rc.turnOn();
		rc.setVolume(-6);
		rc.setMute(true);
		rc.turnOff();
		//Tv,Audio
		//다형성,유틸클래스
		System.out.println();
		System.out.println("세번째: 다형성(유틸클래스");
		RemoteInfo tving=new RemoteInfo();
		tving.RemoteInfo(tv, 5, false);
		tving.RemoteInfo(rc, 10, true);
//		SmartTv sm= null;
//		sm= new SmartTv();
//		sm.turnOn();
//		sm.setVolume(5);
//		sm.setMute(true);
//		sm.turnOff();
		System.out.println();
		System.out.println("세번째 다형성");
		//Tv,Audio
		//3번째 방법 : 다형성,유틸클래스
		RemoteInfo ri= new RemoteInfo();
		ri.RemoteInfo(tv, 6, false);
		ri.RemoteInfo(new Audio(), -1, true);
		//SmartTv
		//3번째 방법 : 다형성
		System.out.println("스마트Tv 정보");
		SmartTv smartTv =new SmartTv();
		ri.RemoteInfo(smartTv, smartTv, "Naver", false, 8);
		
	}
	
	

}
