/*
  Date : 2020.05.12
  Author :신희태
  Description : 조건문if문 (if)
  Version : 1.0
*/
package java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		//스캐너를 사용해서 국어, 영어, 수학점수를 입력받아서 총점,평균을 구하시오.
		//평균점수를 이용하여 A+, A, B+, C, D+, D, F
		//프로그램을 만들어보시오!
		//총점과 평균은 실수형으로!
		
		int kor;
		int eng;
		int mat;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오");
		kor= sc.nextInt();
		System.out.println("영어 점수를 입력하시오");
		eng= sc.nextInt();
		System.out.println("수학 점수를 입력하시오");
		mat= sc.nextInt();
		
		double sum;
		double avg;
		String grade;
		
		sum = kor + eng + mat;
		avg = sum / 3;
		
		if(avg<=100) {
			if(avg >= 90) { //90~ 100
				
				if(avg>=95) { 		//90~95
					grade = "A+";
				}else {		//90~94
					grade= "A";
				}
			}
			else if(avg >= 80){	//80~89
				if(avg >=85) {	//85~89
					grade ="B+";
				}else { 	//80~84
					grade ="B";
				}
				
			}else if(avg >= 70){	//70~79
				if (avg >= 75) {	//75~79
					grade="C+";
				}else {		//70~74
					grade ="C";
				}
				
			}else if(avg >= 60) {	//60~69
				if (avg>=65) {		//65~69
					grade="D+";
				}else {		//60~64
					grade="D";
				}
			
		
			} else {//60미만
				grade = "F";
				
			}
			
	System.out.println("===========");
	System.out.println("이번 기말고사 성적표");
	System.out.println("당신의 학점은: " + grade + "총점: " + sum + "평균: "+ avg);
		}

 }
}
	
