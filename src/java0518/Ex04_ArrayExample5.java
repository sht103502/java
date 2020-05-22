/*
  Date : 2020.05.18
  Author :신희태
  Description : ArrayExample5
  Version : 1.4
*/
package java0518;

import java.util.Scanner;

public class Ex04_ArrayExample5 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 고등학교 3학년간의 학기별 점수를 입력하고 총점을 출력하세요!
		// 고등학교 성적의 평균을 출력하세요
		Scanner sc= new Scanner(System.in); //스캐너 사용
		double scores[][] = new double [3][2]; // {{1,2}{3,4}{5,6}} 방크기2가 3개 있다.
			
		double sum=0; //합을 구하는 sum 변수 선언
		double avg=0; //평균을 구하는 avg 변수 선언
				for (int i=0; i<scores.length; i++){ //학년을 나타내는 반복문for 반복문으로  scores.length인
					//scores.length =>> 학년
					for(int j=0; j<scores.length-1; j++) {//학기를 나타내는 반복문
						//scores[i].length =>> 학기
					System.out.println(((i+1)+"학년"+ (j+1)+"학기"));
					System.out.println("학기별 점수 입력>>" );
					
					
					scores[i][j] =sc.nextDouble(); 
					sum += scores[i][j
					                 
					                 
					                 ];	
					}
				
				}
				avg =  sum /(scores.length*scores[0].length);
					System.out.println(" 총점은 " + sum + "평균은" + avg);
					

	}

}
