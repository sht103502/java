package Jdbct;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		NaverSQL sql =new NaverSQL();
		Naver_Member n_member =new Naver_Member();
		
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		int menu =0;
		
		//sql.connect();
		while(run) {
			System.out.println("\n==========================");
			System.out.println("1.DB접속			2.DB접속해지");
			System.out.println("3.회원가입		4.회원정보");
			System.out.println("5.회원정보수정		6.회원탈퇴");
			System.out.println("7.종료");
			System.out.println("==========================");
			System.out.print("메뉴선택 >>");
			menu = sc.nextInt();
		
		
		
		
		switch(menu) {
		
		case 1:
			sql.connect();
			break;
			
		case 2:
			sql.conClose();
			break;
			
		case 3:
			System.out.println("회원정보를 입력해주세요");
			System.out.println("아이디>>");
			String N_ID = sc.next();
			n_member.setN_ID(N_ID);
			
			System.out.println("비밀번호>>");
			String N_PW = sc.next();
			n_member.setN_PASSWORD(N_PW);
			
			System.out.println("이름>>");
			String N_NAME= sc.next();
			n_member.setN_NAME(N_NAME);
			
			System.out.println("나이>>");
			int N_AGE = sc.nextInt();
			n_member.setN_AGE(N_AGE);
			
			System.out.println("성별>>");
			String N_GENDER = sc.next();
			n_member.setN_GENDER(N_GENDER);
			
			System.out.println("이메일>>");
			String N_EMAIL = sc.next();
			n_member.setN_EMAIL(N_EMAIL);
			
			System.out.println("전화번호>>");
			String N_PHONE = sc.next();
			n_member.setN_PHONE(N_PHONE);
			
			sql.memberJoin(n_member);
			break;
			
		case 4:
			sql.select();
			break;
			
		case 5:
			System.out.println("아이디 조회!");
			
			System.out.println("아이디 >>");
			String id = sc.next();
			
			System.out.println("비밀번호>>");
			String password =sc.next();
			
			boolean check = sql.idCheck(id, password);
			if(check) {
				System.out.println("아이디와 비밀번호가 일치합니다.");
				System.out.println("변경할 이름 입력 >>");
				String name =sc.next();
				sql.modify(id,name);
			}else {
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			}
			
			break;
			
		case 6:
			System.out.println("아이디 >>");
			String id1 = sc.next();
			sql.delete(id1);
			
			break;
			
		case 7:
			run = false;
			break;
			
		default:
			System.out.println("다시입력해주세요!");
			break;
		
		}
		
	
		}
	}
}


