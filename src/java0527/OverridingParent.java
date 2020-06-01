/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527;

public class OverridingParent {
	//필드
	String company;
	String color;
	int size =17;
	int temp;
	
	//메소드
	String parentMethod() {
		return "부모메소드 호출!";
	}
	void pM() {
		System.out.println("pM호출");
	}
}
