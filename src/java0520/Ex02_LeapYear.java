package java0520;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		//int year = Integer.parseInt(args[0]);
		//args[0]은 String
		//args[0] 대신에 String차립 데이터 입력
		int year = Integer.parseInt("2020");// 스트링으로 입력했는데 int로 불러온다.
		
		System.out.println("Interger.parseInt: "+ year);
		boolean leapYear =false;
		leapYear = (year%4==0 && year % 100 != 0 || year % 400 ==0);
		if(leapYear) {
			System.out.println(year+ "년은 윤년입니다.");
		}else {
			System.out.println(year+ "년은 윤년이 아닙니다.");
		}
	}

}
