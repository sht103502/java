/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_03;

public class Salesman3 extends Employee3{
	String name ="이유진";//this.name출력
	
	String getNameLocal() {
		String name ="김성진";
		return name;
		
	}
	
	String getNameThis() {
		String name= "이영은";
		return this.name;
	}
	String getNameSuper() {
		String name="이은솔";
		return super.name;
	}
	
	
	
	
	
	
	
	
}
