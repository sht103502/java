package java0528_05;

public class RemoteInfo {
	void RemoteInfo(RemoteControl remote, int volume, boolean mute) {
		remote.turnOn();
		remote.setVolume(volume);
		remote.setMute(mute);
		remote.turnOff();
	}
	//SmartTv 에 대한 다형성  메소드
	void RemoteInfo(RemoteControl remote, InternetSearch is, String url, boolean mute, int volume) {
		remote.turnOn();
		is.search(url);//매개변수 추가해주는 순서가 중요하1번
		remote.setMute(mute);//2번
		remote.setVolume(volume);//3번 순으로 매개변수 추가 
		remote.turnOff();
		//매개변수만 변경해서 같은 이름의 메소드를 여러개 생성하는것//오버로딩의 정의!
	}

}
