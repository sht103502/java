/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_02;

public abstract class NoteBook extends Computer{
	//Computer
	//display() 만 재정의
	

	@Override
	public void display() {
		System.out.println("NoteBook display");
		
	}// 원래 typing도 써있어야하는데 없으면 오류가 난다. 근데 또하나의 방법이 display이것또한 추상클래스로 바꿔 주면 해결된다.

	

	
}
