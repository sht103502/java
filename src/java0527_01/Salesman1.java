/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/

package java0527_01;

public class Salesman1 extends Employee1{//Saleman1이 Employee1한테 상속받는다.
	int commission;		//수당
		
	
	//직원정보 메소드
	String getEmployeeInfo() {//super의 뜻은 
		return super.getEmployeeInfo()+", 수당 : " + commission;  
		
	}
	String getSalesmanInfo() {
		return "이름 : " + name + ", 부서 : "+ dept + ", 급여 : " + salary+", 수당 : " + commission;
	}
	
	
}
