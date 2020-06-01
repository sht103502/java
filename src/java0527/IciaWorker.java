/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527;

public class IciaWorker extends IciaPerson {//자식, Person부모의 상속을 받음
	String department;
	
	@Override
	public void finish() {//재정의한 이유가상속의 부모의 값을 받지않고 재정의한값이 나온다. 
		System.out.println("직원들은 6시에 퇴근한다.");
	}
}
