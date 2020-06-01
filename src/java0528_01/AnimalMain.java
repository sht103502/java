/*
  
  Date : 2020.05.28
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0528_01;

public class AnimalMain {

	public static void main(String[] args) {
		//추상메소드는 객체를 생성할 수 없다!
		//Animal animal = new animal();
		
		
		
		System.out.println("첫번째 : 객체 생성");
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.breath();
		dog.sound();
		cat.breath();
		cat.sound();
		System.out.println();
		System.out.println("두번째 : 자동타입 변환");
		Animal animal = null;
		animal =new Dog();
		animal.sound();
		animal =new Cat();
		animal.sound();
		
		
		System.out.println("세번째 : 다형성");
		
		AnimalInfo aninfo = new AnimalInfo();
		aninfo.animalSound(dog);
		aninfo.animalSound(cat);
		//객체 생성 이휴 사용 가능
		//ex) DOg dog = new Dog(0
	
	}

}
