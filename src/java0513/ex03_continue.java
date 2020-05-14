/*
  Date : 2020.05.13
  Author :신희태
  Description :  continue문
  Version : 1.2
*/
package java0513;

public class ex03_continue {

	public static void main(String[] args) {
		// continue문은 반복문과 함께 사용 
		//반복문 안에서 continue문을 만나면 이후 문장은 수행하지 않고
		//for문의 증감식을 수행한다.
		/*
		 
		 for(초기화식; 조건식; 증감식) {
		 		틍적 조건
		 		continue;
		 		
		 		 반복문 수행;
		 	}
		 
		 */
		
		/*for(int i=1; i<=10; i++) {
			
			if(i%2 ==0) {
				continue;
			}//2 4 6 8 10
			System.out.print(i + " ");
		}//1 3 5 7 9
		//1부터 100까지 숫자중에 짝수의 합을 구하는 문제!
		*/
		int sum=0;
		for(int i=1; i<=100; i++) {
			
			if(i%2 == 1) {
				continue;
				//홀수값은  실행되지 않는다.
			}
			sum=sum+i;
		}
		System.out.print( "총합은:"+ sum);
	}
}

