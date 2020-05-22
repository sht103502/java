/*
  Date : 2020.05.15
  Author :신희태
  Description : 배열찾기
  Version : 1.1
*/
package java0515;

import java.util.Scanner;

public class Ex02_ArraySearch {

	public static void main(String[] args) {
		// 
		int num[] = {8, 2, 6, 1, 9, 3, 4, 10, 7, 5};// int num[]ㅇ
		
		int value;//value 변수 저장
		int index= 0;//index 변수저장
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1~10사이 숫자 입력>> "); //1~10까지 숫자입력하면 리스트안의 위치를 찾을예정
		value = sc.nextInt();// value값을 입력하면 저장할수 있는 바구니 만듬.
		
		for(int i=0; i<num.length; i++) {// 
			if(value==num[i]) {// value값이 num 리스트의 i번째 같다면  실행  
				index = i+1; //index의 값은 i+1 이다. 이유는 컴퓨터는 0부터 수를 세기때문. 
			}
		}

		System.out.println();
System.out.println(value + "는"+index + "번째 있다.");
	}

}
