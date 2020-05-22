package java0522;

public class C extends A{//c가 자식이고 A가 부모이다 우리는 A라는 부모한테 상속을 받을거다.

	public static void main(String[] args) {
		
		
		A a=new A();
		
		a.public1=10;
		a.proteced1=10;
		a.default1=10;
		//a.private1= 10;
		
		a.public2();
		a.protected2();
		a.default2();
		//a.private2();
		
	
	}

}
