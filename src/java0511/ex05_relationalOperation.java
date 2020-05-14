/*
  
  Date : 2020.05.11
  Author :신희태
  Description : 관계연산자 (relationalOperation)
  Version : 1.0
*/
package java0511;

public class ex05_relationalOperation {

	public static void main(String[] args) {
		// 정수령 변수 2개 선언
		int num1 = 7;
		int num2 = 2;
		
		// >, <, >=, <=, ==, != 연산 수행
		boolean result;
		
		result = num1 > num2;
		System.out.println(">결과 : " + result);
		
		result = num1 < num2;
		System.out.println("<결과 : " + result);
		
		result = num1 >= num2;
		System.out.println(">=결과 : " + result);

		result = num1 <= num2;
		System.out.println("<=결과 : " + result);
		
		result = num1 == num2;
		System.out.println("==결과 : " + result);

		result = num1 != num2;
		System.out.println("!=결과 : " + result);
	
		
	}

}
