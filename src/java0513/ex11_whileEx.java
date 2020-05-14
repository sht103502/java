/*
  Date : 2020.05.13
  Author :신희태
  Description : while 문 예제
  Version : 2.0
*/
package java0513;

public class ex11_whileEx {

	public static void main(String[] args) {
		//while 문을 이용해서 주사위를 던졌을때 
		//5가나오면 종료하는 프로그램을 만드시오.
		/*
		boolean run = true;
		//while(false) 일때 반복문 종료.
		int dice;
		dice= (int)(Math.random()*6) + 1;
		
		if (dice!=5 ) {
			System.out.println("주사위 값이 " + dice + "게임 을 진행합니다.");
		}else {
		    System.out.println("주사위 값이 " + dice + "가 나왔습니다." );
		    System.out.println("게임을 종료합니다.");
		    if (dice==5) {
		    	 run = false;
		    
		    }
		    */
		boolean run =true;
		int cnt =0; //count카운트 
		while(run) {
			int dice=(int)(Math.random()*6)+1;
			cnt++;
			System.out.println("주사위값:" + dice);
			
			if(dice==5) {
				run=false;
			}
		
		}
		System.out.println("\n주사위 던진 횟수: "+cnt);
	}
		

}
