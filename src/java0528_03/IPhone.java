/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_03;

public class IPhone extends SmartPhone {

	@Override
	String getPrice() {
		String Price="가격은 65만원";
		return Price;
	}

	@Override
	String getBrand() {
		String Brand="브랜드는 Apple";
		return Brand;
	}

	@Override
	String getName() {
		String Name="아이폰 애플";
		return Name;
	}

}
