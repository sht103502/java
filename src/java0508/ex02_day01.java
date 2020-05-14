/*
  
  Date : 2020.05.08
  Author :신희태
  Description : 결합 연산자
  Version : 1.0
*/
package java0508;

public class ex02_day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		name = "신희태";
		int birth;
		birth = 951128;
		int age;
		age = 26;
		String adr;
		adr = "인천 서구 가정동";
		String phone;
		phone = "01026983756";
		String email;
		email = "shin103502@naver.com";
		String hobby;
		hobby = "Play Soccer";
		String speciality;
		speciality = "None";
		// char blood='';
		String member1;
		member1 = "이유진";
		String member2;
		member2 = "이영은";
		String member3;
		member3 = "김성진";

		System.out.println("제 이름은" + name + "입니다.");
		System.out.println("제 생일은" + birth + "입니다.");
		System.out.println("제 나이은" + age + "입니다.");
		System.out.println("저의 집주소는" + adr + "입니다.");
		System.out.println("제 번호는" + phone + "입니다.");

		System.out.println("제 이메일은" + email + "입니다.");
		System.out.println("제 취미는" + hobby + "입니다.");
		System.out.println("제 특기는" + speciality + "입니다.");
		// System.out.println((int) blood);
		System.out.println("제 첫번째 동료는" + member1 + "입니다.");
		System.out.println("제 두번째 동료는" + member2 + "입니다.");
		System.out.println("제 세번째 동료는" + member3 + "입니다.");

	}

}
