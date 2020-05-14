/*
  
  Date : 2020.05.08
  Author :신희태
  Description : Java 기본설정
  Version : 1.0
  
 
 
  
*/
package java0508;

public class ex02_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리형
		// boolean ( Y / N )=>> true / false

		int num1, num2;
		num1 = 1;
		num2 = 2;

		boolean bool1 = true;

		System.out.println(bool1);

		boolean bool2 = false;
		System.out.println(bool2);

		boolean bool3;
		if (num1 > num2) { // num1값이 num2값 보다 크다.
			bool3 = false; // num1값이 num2값보다 작기 때문에 false
		} else {
			bool3 = true;
		}
		System.out.println(bool3);

	}

}
