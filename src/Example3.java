package java0526;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		int num [] = {10,4,1,8,3,2,5,9,7,6};
		int value;
		int index=0;
		System.out.println("1~10 숫자를 입력하시오. array num에서의 위치를 찾아 줄것입니다.");
		value= sc.nextInt(); //입력 값 저장
		
		for(int i=0; i<num.length; i++) {
			if(value==num[i]) {//입력값 = num[1] 랑 같다면 출력 ! 
				index= i+1;
				
			}
			
		}
		System.out.println();
		System.out.println("입력값"+value +"는 " + index +"에 위치합니다.");
	}

}
