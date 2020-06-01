/*
  Date : 2020.05.29
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0529_01;

public interface InterfaceA {
	/*
	 * 인터페이스 구성요소
	 * 1. 상수필드
	 * 	: 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙는다.
	 * 
	 * 2. 추상메소드
	 * 	:구현클래스에서 반드시 재정의
	 * 
	 * 3. 디폴트메소드 
	 * 	: 기본으로 실행내용을 가지고 있음
	 * 	:기존 인터페이스를 확장해서 새로운 기능을 추가하기 위함
	 * 
	 * 4. 정정(static)메소드 
	 * 	:인터페이스를 객체화 하지 않아도 호출 가능
	 * 	:
	 * 
	 * 
	 *
	 * */
	public void methodA();
}
