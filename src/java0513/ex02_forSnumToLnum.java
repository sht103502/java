/*
  Date : 2020.05.13
  Author :신희태
  Description :  S부터 N까지 합 구하기(forSnumToLnum )
  Version : 1.1
*/
package java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		//for 문을 사용해서 두개의 정수(시작값, 끝나는값)를 입력받아서
		//총합을 구하는 프로그램 만들어 보시오.
		Scanner sc =new Scanner(System.in);
		int Snum;
		int Lnum;
		int i;
		int sum = 0;
		System.out.println("시작값을 입력하시오");
		 Snum=sc.nextInt();
		System.out.println("끝나는 값을 입력하시오");
		 Lnum=sc.nextInt(); 
		 
		for(i = Snum ; i<=Lnum ; i++) {
			sum = sum + i;
			
			/*
			System.out.println(i);
			if (i<Lnum) {
			   System.out.print("+");
			}else{
			   System.out.println("="+ sum);
			}
			이렇게도 만들수 있음 밑에랑 같은거!
			*/
			
			if(i==Lnum) {
				System.out.println( i + "=" + sum);
			}else{
				System.out.print(i + "+");
			}
		} 
		
		System.out.println( Snum + "부터 " + Lnum + "까지의 합은:"  + sum);
	}

}
