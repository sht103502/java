/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_02;

public class Salesman2 extends Employee2{
	int commission;		//수당
	//int salary = 300;	//급여
	
	//직원정보 메소드
	String getEmployeeInfo() {//super의 뜻은 
		return super.getEmployeeInfo()+", 수당 : " + commission;  
		
	}
	String getSalesmanInfo() {
		return "이름 : " + name + ", 부서 : "+ dept + ", 급여 : " + salary+", 수당 : " + commission;
	}
//	//기본생성자
//	public Salesman2() {
//		super();
//	}
	//매개변수 생성자
	public Salesman2(String name,String dept, int commission, int salary) {
		//( name,  dept,  salary) {
		//(name, dept,salary) {
		super(name, dept,salary);
		this.commission = commission;
		//this.salary = salary;
	}
	
	
	
}
