/*
  Date : 2020.05.21
  Author :신희태
  Description : 계산기
  Version : 1.0
*/
package java0521;

public class Calculator {
	//메소드
	int add(int x, int y) {
		//x+y
		int result = x+y;
		return result;
	
	}
	
	double avg(int x, int y) {
		double sum= add(x,y);
		double result = sum/2;
		return result;
	}
	void excute(int x, int y) {
		double result = avg(x,y);
		System.out.println("실행결과 :" + result);
	}
}
