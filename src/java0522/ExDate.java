package java0522;

import java.util.Calendar;

public class ExDate {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		//날짜구하기
		int year =cal.get(Calendar.YEAR);
		int month =cal.get((Calendar.MONTH)+1);
		int month1 =cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		
		
	System.out.println(year+"년"+month1+"월"+day+"일");
	System.out.println(year+"년"+month+"월"+day+"일");

	
	//시간구하기
	int hour=cal.get(Calendar.HOUR);
	int minute=cal.get(Calendar.MINUTE); 
	int second=cal.get(Calendar.SECOND);
	
	System.out.println(hour+"시"+minute+"분"+second+"초");
	
	//요일구하기
	String[] DAY= {"월","화","수","목","금","토","일"};
	String today =DAY[cal.get(Calendar.DAY_OF_WEEK)-1];
	
	System.out.println("오늘은 "+today+"요일 입니다.");
	
	//특정날짜 선정하기
	System.out.println("특정날짜 설정하기");
	Calendar cal2 =Calendar.getInstance();
	cal2.set(2020, 10, 21, 12, 50, 30);
	System.out.println(cal2.getTime());
	
	//날짜변경하기1
	System.out.println("====7일후====");
	cal2.add(Calendar.DATE, 7);
	System.out.println(cal2.getTime());
	//날짜변경하기 2
	System.out.println("====6달전====");
	cal2.add(Calendar.MONTH,-6);
	System.out.println(cal2.getTime());
	
	//본일생일 출력
	System.out.println("나의 생일은? ");
	Calendar HT = Calendar.getInstance();
	HT.set(1995, 11, 28);;
	
	System.out.println("내생일은"+HT.getTime()+"입니다.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
