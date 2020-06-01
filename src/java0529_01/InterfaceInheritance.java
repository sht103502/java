/*
  Date : 2020.05.29
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0529_01;

public class InterfaceInheritance {//인터페이스를 상속받는 메인 
	public static void main(String[] args ) {
		ImplementationC imp = new ImplementationC(); //객체화 시켜줌 
//		ImplementationC imp =null;
//		imp = new ImplementationC();
		
		InterfaceA iA = imp;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = imp;
		iB.methodB();
		System.out.println();
		
		InterfaceC iC = imp;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
		}
}
