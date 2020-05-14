/*
  
  Date : 2020.05.08
  Author :booltaeliya
  Description : Java 기본설정
  Version : 1.0
  
 
 
  
*/
package java0508;

public class ex02_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자형 변수타입 char(2byte)
		char ch1;
		ch1 = 'A';
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int) ch1);
		char ch2 = 'B';
		System.out.println((int) ch2);
		char ch3 = 'a';
		char ch4 = 'b';
		System.out.println((int) ch3);
		System.out.println((int) ch4);

		int num1 = 65;
		System.out.println(num1);
		int num2 = 66;
		System.out.println(num2);

		int num = 65;
		System.out.println((char) num);
		// 숫자를 문자형으로 바꿀때 변수명 앞에 (char)
		// 한자,일어 도 가능
		// 문제 !
		// 본인이름을 숫자로 표시해보세요.
		char ch5 = '신';
		char ch6 = '희';
		char ch7 = '태';
		System.out.println((int) ch5);
		System.out.println((int) ch6);
		System.out.println((int) ch7);
		int num5 = 49888;
		int num6 = 55148;
		int num7 = 53468;
		System.out.println((char) num5);
		System.out.println((char) num6);
		System.out.println((char) num7);
	}

}
