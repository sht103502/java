package java0521;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		//숫자를 입력 받아서
		//getFactorial 함수 호출
		//getPower 함수 호출
		Factorial ft = new Factorial();
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자입력>>");
		int number=0;
		number =sc.nextInt();
		
		int factorial = ft.getFactorial(number);
		
		
		
		System.out.println("factorial: " + factorial);
		
		int power = ft.getFactorial(number);
		System.out.println("power:" + power);
	
	
	}
	

}
