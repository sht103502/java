package java0526;

import java.util.Scanner;

public class ExampleCoin {
	public static void main(String[] args) {
//동전 교환  예제
		// 돈을 입력하면  입력값의 500원 몇개 100원 몇개 50원,10원등
		Scanner sc = new Scanner (System.in);
		System.out.println("값을 입력하세요 !");
		int num =sc.nextInt();
		int [] coin= {500,100,50,10};
		for (int i=0; i<=coin.length; i++) {
			int result = num/coin[i]; //결과값= 2570 원 500원 = 5
			System.out.println("동전" + coin[i]+"이 "+result + "개" );
			num -= coin[i]*result; //num = 500*result = 500*5=2500 
		}
	}
	}