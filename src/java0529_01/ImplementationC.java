/*
  Date : 2020.05.29
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0529_01;

//interface를 구현하는 클래스
public class ImplementationC implements InterfaceC{//클래스랑 인터페이스 상속은 implements를 쓴다.

	@Override
	public void methodA() {
		System.out.println("ImplementationC_methodA() 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC_methodB() 실행");
		
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC_methodC() 실행");
		
	}

	

}
