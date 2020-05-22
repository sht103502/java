/*
  Date : 2020.05.21
  Author :신희태
  Description : 
  Version : 1.0
*/
package java0521;

public class StaticMethod {
	//인스턴스 멤버 변수
	int memVar;				
	//static 멤버 변수
	static int staticVar;	
							
							
	//인스턴스 메소드
	void memMethod1() {
		int local =memVar;	//멤버변수
		local =staticVar;	//static변수
		staticMethod1();	//static메소드
		memMethod2();		//메소드
		System.out.println("memMethod1");
	}
	//void메소드
	void memMethod2() {
		System.out.println("memMethod2");
	}
	//static 메소드
	static void staticMethod1() {
		StaticMethod st = new StaticMethod();
		//멤버변수와 메소드를 사용하기 위한 객체생성
		
		int local1 = staticVar;		//멤버변수
		staticMethod2();			//static메소드
		
		int local =st.memVar;		//static변수
		st.memMethod2();			//static메소드
		staticMethod2();			//메소드
		System.out.println("staticMethod1");
	}
	static void staticMethod2() {
		System.out.println("staticMehod2");
	}
}
