/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527;

public class OverridingMain {

	public static void main(String[] args) {
		OverridingChild oc= new OverridingChild();
		System.out.println("size는 17이 출력될까?(Parent)");
		System.out.println("size는 20이 출력될까?(Child)");
		System.out.println("결과는 >>"+oc.size);
		
		oc.size="30평";
		System.out.println("결과는 >>"+ oc.size);
		System.out.println();
		
		System.out.println("오버라이딩 메소드 확인 ");
		System.out.println(oc.parentMethod());
		oc.pM();
	}

}
