/*
  
  Date : 2020.05.11
  Author :신희태
  Description : 증감연산자(increaseDecreaseOperation)
  Version : 1.0
*/
package java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {
		// 당항연산자
		// 증가 감소 연산자( ++, --)
		
		// ++num : num이 가지고 있는 값에 1을 증가한 뒤에 연산에 적용
		// num++ : num이 가지고 있는값을 연산에 적용한 뒤 1을 증가
		
		
		int num = 5;
		System.out.println("num값 : " + num);	// 5
		
		++num;
		System.out.println("++num 값 : " + num);	// 6
		
		num++;
		System.out.println("num++ 값 : " + num);// 7
		
		int num1 = 5;
		int result1;
		
		result1 = ++num1;
		System.out.println("++num1 result1 : " + result1); //6
		// result1 = ++num1;
		// num1 = num1 + 1;
		// result = num1;
		
		result1 = num1++;
		System.out.println("num1++ result1 : " + result1); //6
		// result1 = num1++;
		// resul1 = num1;
		// num1 = num1 + 1;
		
		int num2 = 10;
		--num2;
		System.out.println(num2); //9
		
		int result2; 
		result2 = --num2;
		System.out.println(result2); //8
		// result2 = --num2;
		// num2 = num2 - 1;
		// num2 = 9-1;
		// result2 = num2;
		// result2 = 8;
		
		result2 = num2--;
		System.out.println(result2); //8
		//result2 = num2--;
		//result2 = num2;
		//result2 = 8;
		//num2 = num2 - 1;
		//num2 = 8 - 1;
		
		//ex문제
		int result3;
		System.out.println("num1: " + num1 + ", num2: " + num2); //7, 7
		result3 = ++num1 + ++num2;
		System.out.println("num1"); //8
		System.out.println("num2"); //8
		System.out.println("result3"); //16
		
		result3 = num1++ + num2++; 
		//result3 = num1++ + num2++;
		//result3 =  8 + 8 = 16;
		
		//num1 = num1+1; 
		//num1 = 8 + 1;
		//num1 = 9;
		//num2 = num2 +1;
		//num2 = 8 + 1;
		//num2 = 9;
		System.out.println(result3);//8+8=16
		
		result3 = num1++ + ++num2;
		//result3 = num1++ + ++num2;
		//result3 = 9 + 1+num2;
		//result3 = 9 + 1+9;
		//result3 = 9 + 1+9;
		//result3 = 9 + 10;
		
		//num1 = num1 + 1;
		//num1 = 9 + 1;
		//num1 = 10;
		//num2 = 10;
		System.out.println(result3); //9+10=19
		
		result3 = ++num1 + num2++; 
		//result3 = ++num1 + num2++;
		//result3 = 1+10 + 10;
		//result3 = 11+ 10;
	
		//num2 = num2 + 1;
		//num2 = 10 + 1;
		//num1=11;
		//num2=11;
		System.out.println(result3);//11+10=21
		
		
		//ex 문제
	    
		int num3 = 5;
		int num4 = 11;
		int result4;
		
		result4 = ++num3 + --num4;
		System.out.println(result4);//6+10= 16;
		result4 = num4++ - num3--;
		System.out.println(result4);//10-6=4;
		result4 = num3++ - ++num4;
		System.out.println(result4);//5-12=-7;
		
	}

}
