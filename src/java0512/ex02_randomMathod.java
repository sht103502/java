/*
  Date : 2020.05.12
  Author :신희태
  Description : 랜덤숫자 (randomMethod)
  Version : 1.1
*/
package java0512;

public class ex02_randomMathod {

	public static void main(String[] args) {
		//랜덤 매소드 : 특정 범위내에서 숫자 하나를 출력해주는 메소드 
		//Math.random() =>> 0 보다 크거나 같고, 1보다 작은 숫자를 묵작위로 발생한다.
		
		//double ranNum = Math.random();
		//System.out.println("ranNum : " + ranNum);
		/*
		//1~10 사이의 숫자 출력
		ranNum = (int)(Math.random()*10) +1;
		System.out.println("ranNum : " + ranNum);
		//(int)(Math.random()*N)+s;
		//S=시작 ,N=끝
		*/
		
		//주사위 예제
//		int dice = (int)(Math.random() * 6) + 1;
//		System.out.println("주사위 값이 " + dice + "이(가) 나왔습니다.");
//		
//		int js =(int)(Math.random()*28)+1;
//		System.out.println(js);
		
		//로또 번호 만들기
		
		int lotto = (int)(Math.random()*46) + 1;
		System.out.println("로또번호는" + lotto + "번 입니다.");
		
	
	
	
	
	}

}
