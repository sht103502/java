/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527;

public class OverridingChild extends OverridingParent{
	//필드
	String size ="20평";
	//메소드
	String parentMethod() {//상속받는거에 따라서 타입을 바꿔야함.
		return "오버라이딩으로 자식메소드 재정의";
	}
	void pM() {
		System.out.println("pM()상속 후 호출");
	}
}
