/*
  
  Date : 2020.05.08
  Author :신희태
  Description : Java 기본설정
  Version : 1.0
  
 
 
  
*/
package java0508;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수: 프로그램 실행에 필요한 데이터를 저장하기 위해 메모리공간을 할당하고, 이름을 부여한것
		// var num = 0 ;
		// [변수타입] [변수명]=[변수값];

		int age = 35;

		int age1; // 변수 선언
		age1 = 35; // 변수 초기화
		
		
		int age2=11,age3=12,age4=13;
		
		//1+1 =2;
		age1= 10;
		//10을 age1에 대입 한다.
		
	
	}
	//0으로 표시되는것을 bit
	//8bit가 모여 1byte
	//1bite 2byte 4byte 8byte
	
	// 변수타입
	// 1.정수형 (byte, short, int, long)
	// 2.실수형 (float, double)
	// 3.문자형 (char)
	// 4.논리형 (boolean)
	
	//byte
	//1byte = 8bit
	//1byte = -2^7 ~ (2^7)-1
	byte bNum1 = -128;
	byte bNum2 = 127;
	
	//2byte =
	//4byte = 32bit
	//4byte = -2^31 ~ (2^31)-1
	//int : ~21억 ~21억
	int bNym3 = -129;
	int bNym4 = 128;
	//long : 매우크다
	//8byte = 64bit
	
	//int iNum1 = -2147483648;
	//int iNum1 = -2147483648;
	
	long iNum3 = -1322147483648L;
	long iNum4 = 21322147483648L;
	
	//System.out.println (iNum3);
	//System.out.println (iNum4);
	
	//실수형
	//flat(4byte), doubel(8byte)
	//double > float
	
	float pill = 3.14F;
	double p12 = 3.14;
	
	//long은 l추가
	//float 는 F추가
	
	
}
