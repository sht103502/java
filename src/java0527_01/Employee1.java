/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_01;

public class Employee1 {
	//필드생성
	String name;	//이름
	String dept;	//부서
	int salary;		//급여
	
	//직원 정보 메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", 부서 : "+ dept + ", 급여 : " + salary;
	}
}
