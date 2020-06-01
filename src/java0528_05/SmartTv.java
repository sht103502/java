package java0528_05;

public class SmartTv implements RemoteControl, InternetSearch{
	
	//필드 선언
	int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 tv를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 SmartTv볼륨은 : "+this.volume);
		
	}
		
	}


