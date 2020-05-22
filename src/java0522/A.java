package java0522;

public class A {
	/*
	  접근 제한자 (Access Modifier)
	 1.public (모두) 
	 -적용대상 : 클래스, 필드, 생성자, 메소드
	 -모든클래스에서 접근 가능
	 
	 2. protected (패키지)
	 -적용대상 : 필드, 생성자, 메소드
	 -자식클래스가 아닌 다른 패키지에 소속되어 있으면 접근
	 
	 3. default (상속 클래스)
	 -적용대상 : 클래스, 필드, 생성자, 메소드
	 -다른 패키지에 소속된 클래스는 접근 불가능
	 
	 4. private (본인 클래스)
	 -적용대상 : 필드, 생성자, 메소드
	 -자신이 아닌 다른클래스에서는 접근 불가능
	 */
	//필드
	public int public1;
	protected int proteced1;
	int default1;
	private int private1;

	//메소드
	public void public2() {
		
	}
	
	protected void protected2() {
	
		
	}
	
	void default2() {
		
	}
	private void private2() {
		
	}
	
public static void main(String[] args) {
		
		
		A a=new A();
		
		a.public1=10;//모두 가능
		a.proteced1=10;//같은 패키지에서만 가능
		a.default1=10;//클래스를 상속받았을때 가능
		a.private1= 10;//패키지도 아니고 같은 클래스도 아니고 그래서 퍼블릭만 셀수 있다.
		
		a.public2();
		a.protected2();
		a.default2();
		a.private2(); //프리베잇은 자기클래스에서만 된다. 
	
	
}
}