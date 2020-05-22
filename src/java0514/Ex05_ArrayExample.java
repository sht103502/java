/*
  Date : 2020.05.14
  Author :신희태
  Description : ArrayExample
  Version : 1.4
*/
package java0514;

import java.util.Scanner;

public class Ex05_ArrayExample {

	public static void main(String[] args) {
		// 3열 1차원 배열을 선언하고 3개의 값을 입력받아서
		// 입력받은 값의 총합, 평균을 구하시오.
		
		// 1) 몇개의 정
		Scanner sc = new Scanner(System.in);
		int arr[] =new int[3];
		
		System.out.println("정수" + arr.length + "개를 입력하시오>>");
		
		int sum=0;
		//arr.length = 3;
		
	
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 + "번째 입력하세요.");
			arr[i] =sc.nextInt();
			//arr[0] <==입력 1
			//arr[1] <==입력 2
			//arr[2] <==입력 3
			
			sum += arr[i]; //sum= sum+arr[i];
			//arr[0]일떄 sum =입력 1
			//arr[1] sum=입력1 + 입력 2
			//arr[2] sum=입력1 + 입력2 + 입력 3
			 
			 
		}//여기서 문제가 있다. 
		double avg = (double)sum/ arr.length;
		//sum /arr.length; 이 정수형으로 받아져있기 떄문에 나누기를 해도 소수점이 안나온다. 그러니 sum앞에 (double)형으로 받겠다는 의미.
		System.out.println("입력한 정수의 총합: "+ sum);
		System.out.println("입력한 정수의 평균: "+ avg);
		
	}
	

}

		
		
		
		
		
//		내가 해본거! 하지만 실패..
		
//		
//		arr[0] = sc.nextInt(); //arr 에 입력 정수를 받을 공간 만듬.
//		
//		int sum=0;
//		
//		for (int i=0; i<=arr.length; i++){
//			System.out.println("arr[" + i +"] :" + arr[i]);
//			sum+= i;
//			
//		}
//		double avg = sum /arr.length;
//	System.out.println(" ")
