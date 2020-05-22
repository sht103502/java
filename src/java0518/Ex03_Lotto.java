/*
  Date : 2020.05.14
  Author :신희태
  Description : Array
  Version : 1.2
*/
package java0518;

import java.util.Random;

public class Ex03_Lotto {

	public static void main(String[] args) {
		//  로또 번호 출력
	 
		
		int lotto [] = new int [7]; //7개 의 방을 만들어주고 
		System.out.println("이번주 당첨번호는 ");
	 for(int i=0; i< lotto.length; i++) { 
		 
		 
		 lotto[i] = (int)(Math.random()*+45) + +1; // 랜덤으로 1부터 45까지 출력하기 
		// System.out.println(" 번호 : "+lotto[i] );
		 for (int j=0; j<i; j++) {		// 중복을 없애는 방법
			 if(lotto[i] == lotto[j]) {// 출력숫자 같다면 그 같은 값을 i--해서 다시 for문으로 반복해라!
				 i--;
				 break;
			 }
		 }
	 }
	 for (int k=0; k<lotto.length; k++) { // 보너스 숫자 출력하기 
		 if(k<lotto.length-1) {
			 System.out.print(lotto[k] + " ");
		 }else {
			 System.out.println("보너스 번호 " + lotto[k]);
		 }
		 
	 }
		//int ol= (int)(Math.random()*46) + 1;
		//System.out.println("로또번호는" + ol + "번 입니다.");

	}

}
