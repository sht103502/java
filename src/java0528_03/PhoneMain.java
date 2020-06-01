/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_03;

public class PhoneMain {

	public static void main(String[] args) {
	Galaxy gal =new Galaxy();
	IPhone apple = new IPhone();
	System.out.println("첫번째");
	
	System.out.println("이름  :"+gal.getName());
	System.out.println("제조사  :"+gal.getBrand());
	System.out.println("가격  :"+gal.getPrice());
	

	System.out.println();
	System.out.println("두번째");
	SmartPhone smtp= null;//추상클래스 이기때문에 바로 불러올수 가 없어 null로 선언 한것이고 다른 방법으로는 SmartPhone pon= new Galaxy(); 이렇게 저장해주면 된다.
	smtp=new Galaxy();
	System.out.println("이름  :"+apple.getName());
	System.out.println("제조사  :"+apple.getBrand());
	System.out.println("가격  :"+apple.getPrice());
	
	//3번 다형성(유틸클래스)
	
	System.out.println("세번째");
	PhoneInfo ponInfo = new PhoneInfo();
	System.out.println();
	ponInfo.PonInfo(gal);
	ponInfo.PonInfo(apple);
	
	}

}
