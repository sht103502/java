/*
  Date : 2020.05.11
  Author :신희태
  Description : 계산기 (calculator)
  Version : 1.0
*/
package java0511;

import java.util.Scanner;

public class ex09_calculator {

	public static void main(String[] args) {
		//두개의 정수를 입력받아서 결과를 출력해보자!
		int num1;
		int num2;
		int result;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력: ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력: ");
		num2 = sc.nextInt();
		
		// +, -, /, *, %
		result = num1 + num2;
		System.out.println("덧셈결과: " + result);
		result = num1 - num2;
		System.out.println("뺄셈결과: " + result);
		result = num1 / num2; 
		System.out.println("나눗셈결과: " + result);
		result = num1 * num2;
		System.out.println("곱셈결과: " + result);
		result = num1 % num2;
		System.out.println("나머지결과: " + result);
		

	}

}
