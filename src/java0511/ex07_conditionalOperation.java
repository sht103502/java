/*
  Date : 2020.05.11
  Author :신희태
  Description : 조건연산자 (conditionalOperation)
  Version : 1.0
*/
package java0511;

public class ex07_conditionalOperation {

	public static void main(String[] args) {
		// 삼항연산자
		
		// (조건식) ? 참일때 값 : 거짓일때 값 ;
		int shinAge = 26;
		int LeeAge = 24;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		// (조건식) ? 참일때 값 : 거짓일때 값 ;
		resultChar = (shinAge > LeeAge) ? 'O' :'X';
		
		resultInt = (shinAge > LeeAge) ? 0 : 1;
		
		resultStr = (shinAge > LeeAge) ? "참일경우 ":"거짓일경우";
		
		System.out.println("resultChar: " + resultChar);
		System.out.println("resultInt: " + resultInt);
		System.out.println("resultStr: " + resultStr);
	
		
		//문제
		//조건연산자를 사용하여 10이 짝수인 경우에는 true,홀수인 경우에는 false 출력하는 조건연산자를 작성하시오.
		int num = 10;
		
		boolean resultEven;
		//======조건연산자 작성 =========
		
		
	    
		
		resultEven = (num % 2 == 0) ? true : false;
		
		
		System.out.println(resultEven);
		
	
	}

}
