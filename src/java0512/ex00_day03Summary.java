/*
  Date : 2020.05.13
  Author : 신희태
  Description : 복습(day03Summary)
  Version : 1.0
*/
package java0512;

public class ex00_day03Summary {

	public static void main(String[] args) {
		//  1. 랜덤메소드 : 0보다 크거나 같고, 1보다 작은 수를 무작위로 발생시킨다.
		//0.00000~0.999999~
		
		//int rNum = (int)(Math.random() * 10) + 1;
		// 1부터10까지의 숫자중 랜덤으로 발생
		//int rNum = (int)(Math.random() * N) + S
		//시작값 : S , 끝나는값 : N
		int dice = (int)(Math.random() * 6)+1;
		
		double dNum = Math.random();
		System.out.println("dNum:" + dNum);
		//0.418835=>>4.188~=>>4=>>5
		//0.550356=>>5.503~=>>5=>>6
		//0.836874=>>8.368~=>>8=>>9
		
		//조건문 switch-case
		/*
		 switch(조건변수) {
		 	case 변수값1:
		 		해당조건이 참일때 실행
		 		break;
		 	case 변수값2:
		 		해당조건이 참일때 실행
		 		break;
		 	case 변수값3:	
		 } 		해당조건이 참일때 실행
		 		break;
		 ~~~~~
		 default:
		 	case 에서 어떤 조건도 맞지 않을때 실행
		 	break;
		 
		 }
		 */
			// 만약 break 없다면 ? 다음 case문까지 계속 실행됨
		
		//3.반복문 For
		/*
		 	for(초기화식; 조건식; 증감식;) {
		 		반복할 수행문 
		 	}
		 	
		  
		  
		  
		  
		 */
		
		
		

	

 }
}
