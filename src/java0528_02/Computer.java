/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_02;

public abstract class Computer {
	//추상메소드
	//display(), typing()
	
	//메소드
	//turnOn(), turnOff(0
	
	//public,void
	
	
	
	//추상메소드
	
	abstract void display();
	
	abstract void typing();

	//메소드 
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}

}
