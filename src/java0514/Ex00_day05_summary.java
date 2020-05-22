/*
  Date : 2020.05.15
  Author :신희태
  Description : day05_summary
  Version : 1.0
*/
package java0514;

import java.util.Scanner;

public class Ex00_day05_summary {

	public static void main(String[] args) {
		// while문
		/*
		 * (1) 초기화식 while(조건식){ 반복할 내용 증감식 } (2) boolean 조건변수 =true while(조건변수){ 반복할 내용
		 * 
		 * 특정조건 만족시 조건변수 = false }
		 */

		// do-while문
		/*
		 * 
		 * 
		 * do{ 반복할 내용 }while(조건식);
		 */

		// while 조건식 다음 반복문
		// do-while 반복문 다음 조건식
		// do-while 무조건 1번은 실행한다.

		// 배열: ☆같은 타입☆ 데이터를 모아놓은 곳

		// 배열선언
		// 타입[] 배열명
		// 타입 배열명[]

		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);

		// num , sc 객체가 어떤값이 들어갈지는 모르지만
		// 앞으로

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		// num[0]
		// num[1]
		// num[2]
		int num1 = 0;

		String[] str = { "스트링", "타입으로", "입력" };
		char[] ch = { '문', '자', '형', '으', '로' };
		int[] number = { 1, 2, 3, 4, 5 };

	}

}
