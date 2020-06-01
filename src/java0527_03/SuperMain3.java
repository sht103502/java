/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527_03;

public class SuperMain3 {
	public static void main(String[] args) {
		Salesman3 sales3= new Salesman3();
		
		System.out.println("local.name : "+ sales3.getNameLocal());
		System.out.println("this.name : "+ sales3.getNameThis());
		System.out.println("super.name : "+ sales3.getNameSuper());
	}
}
