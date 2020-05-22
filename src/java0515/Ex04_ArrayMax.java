/*
  Date : 2020.05.15
  Author :신희태
  Description : 배열 최댓값 찾기(ArrayMax)
  Version : 1.3
*/
package java0515;

import java.util.Scanner;

public class Ex04_ArrayMax {

	public static void main(String[] args) {

		// 5열 짜리 1차원 배열을 선언
		// 스캐너를 이용하여 값5개를 이볅
		// 입력한 값중 가장 큰값을 구하는 문제
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; //   arr = 리스트 갯수 5개다.

		int max = 0;
		int num;
		System.out.print("정수 " + arr.length + "개를 입력해주세요: ");

		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
			//arr[1] = 2
			System.out.println("입력받은 정수 arr["+i+"]=" + arr[i]);
		
//			if(arr[i] > max) {
//				max = arr[i];
//			}
			max = (arr[i]>max)? arr[i]: max;
			//변수 = (조건식)? 참일때 실행 : 거짓일때 실행 
			//arr[i] 크면  max = arr[i]; 조건식 참!
			 //max가 크면  amx = max;     조건식 거짓!
		}
		System.out.println("가장 큰 수는" + max + "입니다.");
	}
}
