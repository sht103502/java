package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import action.MemberUpdateAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {

	public static Member[] memberArray = new Member[0]; //오류! 다른패키지의 Member.java를 import 해야한다.
	
	public static void main(String[] args) {
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		Action action = null; //인터페이스라서 객체생성안됨
		MemberController controller = new MemberController();
		
		int menu = 0;
		
		do {
			System.out.println(" ---------------------------------------------------------------------------------- ");
			System.out.println("       1. 회원가입          |     2. 회원목록 보기     |     3. 회원정보 수정");
			System.out.println(" ---------------------------------------------------------------------------------- ");
			System.out.println("       4. 회원정보 삭제   |     5. 회원정보 검색     |     6. 프로그램 종료");
			System.out.println(" ---------------------------------------------------------------------------------- ");
			System.out.print("선택 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: //회원가입
				action = new MemberRegistAction();
				break;
				
			case 2: //회원목록 보기
				action = new MemberListAction();
				break;
				
			case 3: //회원정보 수정
				action = new MemberUpdateAction();
				break;
				
			case 4: //회원정보 삭제
				action = new MemberDeleteAction();
				break;
				
			case 5: //회원정보 검색
				action = new MemberSearchAction();
				break;
				
			case 6: //프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				
				continue;
				
			default :
				continue;
			}
			if(action != null) {
				controller.processRequest(sc, action);
			}
		} while (run);
	
	}

}
