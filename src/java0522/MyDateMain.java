package java0522;

import java.util.Scanner;

public class MyDateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyDate TT =new MyDate(); 
		
		System.out.println("년도을 입력하세요");
		int year = sc.nextInt();
		TT.setYear(year);
		System.out.println("월을 입력하세요");
		int month =sc.nextInt();
		TT.setMonth(month);
		System.out.println("일를 입력하세요");
		int day = sc.nextInt(); 
		TT.setDay(day);
		System.out.println("확인중"+ TT.toString());
		System.out.println(TT.getYear()+" 년"+ TT.getMonth()+"월"+ TT.getDay()+"일");
		System.out.println(TT.isValid());
	}
	

}
