/*
  
  Date : 2020.05.08
  Author :신희태
  Description : Java 기본설정
  Version : 1.0
  
 
 
  
*/
package java0508;

public class ex02_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 공부는 ";
		String str2 = "재미있다";
		String str3 = "너무 어려워";

		String result; // 변수 선언

		result = str1 + str2; // 변수 초기화
		System.out.println(result);
		//자바 공부는 재미있다
		result = str1 + str3; // 변수초기화
		System.out.println(result);
		//자바 공부는 너무어려워
		result = str1 + 8.0;
		System.out.println(result);
		//자바 8.0

		System.out.println(str1 + str2);
		//자바 공부는 재미있다.
		System.out.println(str1 + "너무너무" + str2);
		//자바 공부는 너무너무 재미있다.

	}

}
