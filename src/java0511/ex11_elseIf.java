/*
  Date : 2020.05.11
  Author :신희태
  Description : 조건문 (elseIf)
  Version : 1.0
*/
package java0511;

public class ex11_elseIf {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		
//		if(num1 >num2) {
//			System.out.println("num1 크다.");
//		}else {
//			System.out.println("num2가 크다.");
//		}
		if(num1> num2) {
			System.out.println("num1이 크다.");
		}else if(num1< num2){
			System.out.println("num2가 크다.");
		}else {
			System.out.println("num1과 num2가 같다.");
			
		}
		/*
		 if(조건식1){
		 	조건식1이 참일때 실행
		  }else if(조건식2) {
		  	조건식2가 참일때 실행
		  }else {
		  	조건식1과 2가 모두 거짓일때 실행
		  }
		 */
	}

}
