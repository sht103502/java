/*
  Date : 2020.05.11
  Author :신희태
  Description : 입력 (Scanner)
  Version : 1.0
*/
package java0511;

import java.util.Scanner;
//Scanner 클래스는 java.utill 패키지에 있는 입력 클래스 
public class ex08_Scanner {

	public static void main(String[] args) {
		// 스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner sc = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();// 우리가 입력하는 값
		// 세번째
		// 변수에 입력한 값을 담는다.
		//ln : 줄바꿈
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine().trim();
		//trim() : 앞뒤 공백을 제거한다.
		
			
		System.out.println("주소를 입력하세요.");
		
		address = sc.nextLine(); // nextLine  자체가 다음줄로 넘어가버리니깐 위에 trim으로 앞뒤 공백 제거
		
		
		System.out.println("println"); // 뛰어쓰기함
		System.out.print("print"); // 뛰어쓰기 안함
		System.out.println("두개 차이점 확인하기");
		
		
		System.out.println(" ========출력냉용========");
		System.out.println("입력한 이름" + name);
		System.out.println("입력한 나이" + age);
		System.out.println("입력한 주소" + address);
		
		
	}

}
