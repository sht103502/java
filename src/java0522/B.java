package java0522;

public class B {

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
