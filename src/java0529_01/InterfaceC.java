/*
  Date : 2020.05.29
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0529_01;

public interface InterfaceC extends InterfaceA,InterfaceB {//A랑 B를 상속 받자. 한가지밖에 상속을 못받았는데 
	//인터페이스끼리는 상속할때 extends 쓰고 , 를 쓴다.(인터페이스에서 extends를 쓰면 하나가 아닌 여러개를 상속해준다.)
	
	public void methodC();
}
