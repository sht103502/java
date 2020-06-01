/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_02;

public class SuperMain2 {

	public static void main(String[] args) {
		Salesman2 sales2 = new Salesman2("신희태","애플개발팀",50,500);
		
		System.out.println("getEmployeeInfo()");
		System.out.println(sales2.getEmployeeInfo());
		
		System.out.println("getSalesmanInfo()");
		System.out.println(sales2.getSalesmanInfo());
	}

}
