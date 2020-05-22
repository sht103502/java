/*
  Date : 2020.05.21
  Author :신희태
  Description : 
  Version : 1.0
*/
package java0521;

public class StaticMethodMain {

	public static void main(String[] args) {
		// StaticMethod.memMethod1();
		StaticMethod st =new StaticMethod();
		st.memVar=0;
		st.memMethod1();
		
		st.staticVar = 0;
		st.staticMethod1();
		
		//staticMethod2();
		//같은 클래스에서는 바로 호출 가능 
		
		
		StaticMethod.staticMethod2();
//		staticMethod2();
//		int local =staticVar;
		
	}

}
