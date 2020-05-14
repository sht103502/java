/*
  Date : 2020.05.13
  Author :신희태
  Description :  multiTable
  Version : 1.4
*/
package java0513;

public class ex05_multiTable {

	public static void main(String[] args) {
		// 중첩for문을 사용하여 구구단을 작성해라
		//2단 부터 9단까지!
	    /*방법1.  
		for(int i= 2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				// result=i*j;
				System.out.print(i + " x " );
				System.out.println(j  + " = " + i*j);
			}
			System.out.println("===========");
		}
		*/
		
		//방법2.
		
		/*for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=9; j++) {
				System.out.print(j +"X"+ i+ "="+ j*i );
				System.out.print("\t");
				
			} 
			System.out.println();
		}
		*/
		//응용문제 
		//홀수 단만 출력 하기!
		
		for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=9; j++) {
				if(j%2==1) {//j가 짝수다!
					continue;
				}
				System.out.print(i +"X"+ j+ "="+ i*j );
				System.out.print("\t");
				
			} 
			System.out.println();	
		
		}
	}
}	
	

