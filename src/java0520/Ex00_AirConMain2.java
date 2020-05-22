package java0520;

public class Ex00_AirConMain2 {

	public static void main(String[] args) {
		Ex00_AirCon airCon1 = new Ex00_AirCon();
		Ex00_AirCon airCon2 = new Ex00_AirCon();
		// airCon1 필드값 초기화 + 메소드호출
		// airCon2 필드값 초기화 + 메소드호출
		
		//airCon1
		//필드값 초기화(5개) company, color, size, price, temp
		airCon1.company = "Apple";
		airCon1.price = 20000;
		airCon1.temp = 20;
		airCon1.color = "Black";
		airCon1.size = 220;
		//메소드 호출(4개) on, off, up, down
		airCon1.onPower();
		airCon1.offPower();
		// airCon1.uptemp();//temp =21;
		airCon1.downtemp(); // temp =19;
		
		//airCon2
		// 필드값 초기화 (5개) company, color, size, price, temp
		airCon2.company = "SAMSUNG";
		airCon2.color = "white";
		airCon2.size = 150;
		airCon2.price = 5000;
		airCon2.temp = 20;
		// 메소드호출(4개) on, off, up, down
		airCon2.uptemp();//temp =21;
		// airCon2.downtemp();  //temp =19;
		airCon2.onPower();
		airCon2.offPower();
		
		
		System.out.println("======출력 =======");
		System.out.println("aircon1.color: " + airCon1.color);
		System.out.println("airCon1.company: " + airCon1.company);
		System.out.println("airCon1.price: " + airCon1.price);

		System.out.println("1현재온도(down): " + airCon1.temp);

		// System.out.println("1현재온도(down): "+ airCon1.temp);

		System.out.println("airCon1.size: " + airCon1.size);

		System.out.println("aircon1.color: " + airCon2.color);

		System.out.println("airCon1.company: " + airCon2.company);

		System.out.println("airCon2.price: " + airCon2.price);

		// System.out.println("2현재온도(down): "+ airCon2.temp);

		System.out.println("2현재온도(up): " + airCon2.temp);

		System.out.println("airCon2.size: " + airCon2.size);

	}

}
