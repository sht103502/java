/*
  Date : 2020.05.11
  Author :신희태
  Description : 조건문연습문제1 (ifExample1)
  Version : 1.0
*/
package java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		/* 
		문제. 성적출력 예제
		점수를 입력받아서 90이상이면 "A학점 입니다" 출력
		A: 90~100
		B: 80~89
		C: 70~79
		D: 60~69
		F: 60미만
		 
		*/
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");		
		num = sc.nextInt();
		
		
		
		if (90 <= num) {
		System.out.println("A학점입니다.");
		}else if(80 <= num){
			System.out.println("B학점입니다.");
		}else if(70 <= num){
			System.out.println("C학점입니다.");
		}else if(60 <= num){
			System.out.println("D학점입니다.");
		}else{
			System.out.println("F학점입니다.");
		}
	}

}
