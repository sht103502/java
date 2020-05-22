package java0521;

public class Factorial {
/*
  메소드
  1.int getFactorial(int num)
  매개변수로 전송된 숫자의 팩토리얼 값을 구해서 리턴함
  int num = 5 인경우 5*4*3*2*1
  
  

 */

	int fact =1;
	
		
	int getFactorial(int num) {
		for(int i=num; i>0;  i--) {
			fact*=i; //fact=fact*i;
			System.out.println("fact : " + fact);
			System.out.println("i : " + i);
			System.out.println("num : " +num);
			
		}
		return fact;
	}
//		  2.int getPower(int num)
//		  매개변수로 전송된 값까지의 제곱의 합을 구해 리턴
//		  int num = 3인경우 1*1+ 2*2 + 3*3
		int power = 0;
		int getPower(int num) {
			
			for (int i=1; i<=num; i++) {
				power += i*i;
				System.out.println("i:" + i);
				System.out.println("i*i:" + i*i);
				System.out.println("power:"+power);
		}
			return power;
		}
		
	}

