/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_02;

public class Employee2 {
	//필드생성
		String name;	//이름
		String dept;	//부서
		int salary;		//급여
		
		
		//기본생성자
		public Employee2() {
			
		}
		//매개변수
		public Employee2(String name, String dept, int salary) {
			super();
			this.name = name;
			this.dept = dept;
			this.salary = salary;
		}



		//직원 정보 메소드
		String getEmployeeInfo() {
			return "이름 : " + name + ", 부서 : "+ dept + ", 급여 : " + salary;
		}




		
}
