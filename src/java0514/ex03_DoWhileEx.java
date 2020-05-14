/*
  Date : 2020.05.14
  Author :신희태
  Description : DoWhileEx
  Version : 1.2
*/
package java0514;

import java.util.Scanner;

public class ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!
		int answer =(int)(Math.random() *45)+1;//Math.random()로 1부터 45의 값을 만들어준다. 
		int input =0; //입렵값
		int count =0;//입력한 횟수
		
		boolean run=true; //while문을 실행하기위한 boolean타입
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Up & Down Game 시작!");
		do {//do-while 문시작!
			System.out.println("1부터 45까지 숫자를 말하세요!");
			input =sc.nextInt();// 입력값을 input 에 저장!
			count++; //입력을 한번할 때마다 숫자 ++
			
			if (answer > input) {// 입력값이 답보다 적을때!실행 
				System.out.println("UP! 더 큰 수를 말하세요!\n");
			}else if(answer < input) {// 입력값이 답보다 클때 실행
				System.out.println("Down! 더 작은 수를 말하세요! \n");
			}else {// 입력값이 답이랑 같을때 실행
				System.out.println("정답 :" + answer + "입니다.");
				System.out.println("시도한 횟수: " + count + "번 입니다. ");
				run = false; //while 문을 빠져나와야하니깐!false로 값을 저장시켜준다.
				break; 
			}
			switch(count) {
			case 1: case 2: 
				System.out.println("기회가 남았습니다.");
				break;
			case 3:
				System.out.println("게임은 졌지만 계속 진행하세요~");
				break;
			default:
				System.out.println("3번이 지났으니 벌칙!");
			//boolean(count<=3 && count ){
				//	System.out.println("");
			//	}
			}
			
		}while(run);// do-while문의 조건식이다! do-while문은 출력하고 조건식을 받는다.
		//while문 끝!
	}

}


