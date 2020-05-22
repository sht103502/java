/*
  Date : 2020.05.15
  Author :신희태
  Description : 동전 교환예제
  Version : 1.0
*/
package java0515;

import java.util.Scanner;

public class Ex01_CoinChange {

	public static void main(String[] args) {
		// 동전 갯수를 구하는 예제
		// 어떤 금액을 입력하게 되면 각 동전이 몇개씩 필요한지 출력하는 문제 
		
		//ex) 2680원
		//500원 5개
		//100원 1개
		//50원 :1개
		//10원 :3개
		
		//배열을 이용해서 해결 /for문
	Scanner sc =new Scanner (System.in);
		int[] coin ={500, 100, 50, 10};
		int i;
	    
		System.out.println("금액 입력>>");
		int a= sc.nextInt();
		//1000원입력 한다면 500원2개 
		for (i=0; i<coin.length; i++ ) {//0,1,2,3 coin[0]= 500
			int money = a/coin[i];
			//System.out.println(coin[0]);
			System.out.println(coin[i]+ "원은" + money+"개");
			a -= coin[i]*money; // 2100=500*4=2000 100원이 남지 a=a-i =100=2100-2000
			
		}

		
	System.out.println();
	}
		

}
