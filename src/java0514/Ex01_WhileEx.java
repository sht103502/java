/*
  Date : 2020.05.14
  Author :신희태
  Description : WhileEx
  Version : 1.0
*/
package java0514;

import java.util.Scanner;

public class Ex01_WhileEx {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int account=0; //통장만들기 0원
		 int balance; //지갑 
		int menu; //메뉴  while 문으로 만들기 
		boolean run= true; //while문 사용하기 위해run 을 boolean타입 true로 선언
	while(run) {
		System.out.println("while문시작! ");
		System.out.println("-------------------------------");
		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
		
		System.out.println("-------------------------------");
		System.out.println("입력>>");
		menu=sc.nextInt(); // menu선언 ,입력
		
		switch(menu) {
		case 1:
			System.out.println("예금액>> ");
			//방법1)int a = sc.nextInt();
			//account += a;
			//방법2) 지갑안에 입력한 값을 더한다.=account 
			account += sc.nextInt();
			break; //switch 문 탈출 
		case 2:
			System.out.println("출금액>>");
			account -= sc.nextInt();
			break;//switch 문 탈출 
		case 3: 
			System.out.println("잔고: "+ account);
			break;//switch 문 탈출 
		case 4://종료 방법은 2가지/ run false; / break; 
		
			System.out.println();
			run=false;
			break;//switch 문 탈출 
		default:
				System.out.println("번호를 잘못 입력했습니다. \n다시입력해주세요.");
				break;
				
		
		}// switch 문 종료 
		System.out.println("스위치문 종료\n");
		
	}// while문 종료
	System.out.println("프로그램을 종료합니다!");
	}		
}	
		