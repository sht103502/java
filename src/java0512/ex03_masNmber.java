/*
  Date : 2020.05.12
  Author :신희태
  Description : 최댓값구하기(maxNumberEX)
  Version : 1.2
*/
package java0512;

import java.util.Scanner;

public class ex03_masNmber {

	public static void main(String[] args) {
		// 두수를 입력받아 큰수를 출력하기
		
		int num1, num2, max;
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번쨰 숫자 >>");
		num1 =sc.nextInt();
		System.out.println("두번쨰 숫자 >>");
		num2 = sc.nextInt();
		
		if(num1>num2) {
				max = num1;
			}else {
				max =num2;
			}
		System.out.println("최댓값: " + max);
		
		
		//숫자 3개를 입력 받아 큰수 출력하기
//		int num1, num2, num3, max;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번쨰 숫자>>");
//		num1=sc.nextInt();
//		System.out.println("두번쨰 숫자>>");
//		num2=sc.nextInt();
//		System.out.println("세번쨰 숫자>>");
//		num3=sc.nextInt();
//		//예1번)
//		if (num1>num2) {
//			if(num1>num3) {
//			 max=num1; 
//			}else {
//				max = num3;
//			}
//		}else if (num2>num3) {
//			max=num2;
//		}else {
//			max=num3;
//		
//		}
//		
//			
//			
//			
//			
//			
//			
//			
//			
//		//예2)
//		/*if(num1> num2 && num1> num3) {
//			max =num1;
//		}else if(num2>num3) {
//			max =num2;
//		}else {
//			max= num3;
//		}*/
//	     
   System.out.println("최고값 Max는 " + max);
	}

}
