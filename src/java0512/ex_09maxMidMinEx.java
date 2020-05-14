/* 

	Date : 2020.05.12

	Author : 신희태

	Description : 최댓값, 중간값, 최솟값 구하기(maxMidMinEx)

	Version : 1.8

 */
package java0512;

 

import java.util.Scanner;

 

public class ex_09maxMidMinEx{

 

	public static void main(String[] args) {

		// 응용2. 최댓값, 중간값, 최솟값 구하기

		// 3개의 수를 입력 받아서

 

		Scanner sc = new Scanner(System.in);

 

		int num1, num2, num3;

		int max = 0, mid = 0, min = 0;

 

		System.out.print("첫번째 숫자 : ");

		num1 = sc.nextInt();

 

		System.out.print("두번째 숫자 : ");

		num2 = sc.nextInt();

 

		System.out.print("세번째 숫자 : ");

		num3 = sc.nextInt();

 

//		if (num1 > num2) {

//			if (num1 > num3) {

//				max = num1;

//				if (num2 > num3) {

//					mid = num2;

//					min = num3;

//				} else {

//					mid = num3;

//					min = num2;

//				}

//			} else {

//				max = num3;

//				mid = num1;

//				min = num2;

//			}

//		} else {

//			if (num2 > num3) {

//				max = num2;

//				if (num1 > num3) {

//					mid = num1;

//					min = num3;

//				}

//			} else {

//				max = num3;

//				mid = num2;

//				min = num1;

//			}

//

//		}

 

		if (num1 > num2 && num1 > num3) {

			max = num1;

			if (num2 > num3) {

				mid = num2;

				min = num3;

			} else {

				mid = num3;

				min = num2;

			}

		} else if (num2 > num1 && num2 > num3) {

			max = num2;

			if (num1 > num3) {

				mid = num1;

				min = num3;

			} else {

				mid = num3;

				min = num1;

			}

		} else {

			max = num3;

			if (num1 > num2) {

				mid = num1;

				min = num2;

			} else {

				mid = num2;

				min = num1;

			}

		}

 

		System.out.println("최댓값 : " + max);

		System.out.println("중간값 : " + mid);

		System.out.println("최소값 : " + min);

 

	}

 

}