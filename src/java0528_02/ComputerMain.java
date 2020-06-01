/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_02;

import java0528_01.AnimalInfo;

public class ComputerMain {
	/*1.추상클래스는 객체(인스턴스)를 생성하지 못한다.
	 * 2.추상클래스는 단순히 상속만을 하기 위해 만든클래스다.
	 * 3.하위클래스가 어떤 클래스냐에 따라 구현코드를 다르게 한다.
	 */
	public static void main(String[] args) {
	//Computer com = new Computer();
		//추상클래스라 안됌
	//Coumpuer com =n ew Computer();
	DeskTop destop =new DeskTop();
	//NoteBook note = new NoteBook();
		//추상클래스라 안됌
	MyNoteBook mnote= new MyNoteBook();
	
	//3가지 방법으로 display() , typing() 호출
	System.out.println("첫번째");
		destop.display();
		destop.typing();
		mnote.display();
		mnote.typing();
	System.out.println();
	System.out.println("두번째");
	Computer com =null;
	com=new DeskTop();	
	com.display();
		com.typing();
		com=new MyNoteBook();
		com.display();
		com.typing();
	System.out.println();
	System.out.println("세번째");
	ComputerInfo comInfo =new ComputerInfo();
	
	comInfo.ComInfo(destop);
	comInfo.ComInfo(mnote);
	

	//	ComputerInfo  computerInfo = new ComputerInfo(); 
//	computerInfo.computerInfo(destop);
//	computerInfo.computerInfo(mnote);
	}
	


}
