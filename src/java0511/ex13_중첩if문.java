/*
  Date : 2020.05.11
  Author :신희태
  Description : 중첩if문 (if)
  Version : 1.0
*/
package java0511;

import java.util.Scanner;

public class ex13_중첩if문 {

	public static void main(String[] args) {
		// 중첩if문: if문 안에 if문
		
		// 학점 출력프로그램 
		//1. 100을 초과하면 "입력 볌위를 초과했습니다."출력
		//2. 학점 처리 
		//		A+:95~100
		//		A: 90~94
		//		B+:85~89
		//		B: 80~84
		//		C+:75~79
		//		C: 70~74
		//		D+:65~69
		//		D: 60~64
		//		F: 60미만
		//3.print문은 1번만 사용
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String grade;
		
		System.out.println("점수를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num<=100) {
			if(num >= 90) { //90~ 100
				
				if(num>=95) { 		//90~95
					grade = "A+";
				}else {		//90~94
					grade= "A";
				}
			}
			else if(num >= 80){	//80~89
				if(num<=85) {	//85~89
					grade ="B+";
				}else { 	//80~84
					grade ="B";
				}
				
			}else if(num >= 70){	//70~79
				if (num >= 75) {	//75~79
					grade="C+";
				}else {		//70~74
					grade ="C";
				}
				
			}else if(num >= 60) {	//60~69
				if (num>=65) {		//65~69
					grade="D+";
				}else {		//60~64
					grade="D";
				}
			
		
			} else {//60미만
				grade = "F";
				
			}
			System.out.println("당신의 점수"+ grade);
		
		} else {
				System.out.println("입력범위를 초과했습니다.");
			
		}
	}
}
