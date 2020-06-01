/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_02;

public class MyNoteBook extends NoteBook {

	@Override
	void typing() {//자동적으로 NoteBook 클래스에서 display 는 안나오고 재정의 안한 클래스인 typing 만 나온다.
		System.out.println("MynoteBook typing");
		
	}

}
