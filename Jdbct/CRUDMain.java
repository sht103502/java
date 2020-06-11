package Jdbct;

import java.util.Scanner;

public class CRUDMain {

	public static void main(String[] args) {
		
		CRUD crud = new CRUD();
		
		boolean run = true;
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n==========================");
			System.out.println("1.DB접속			2.DB접속해지");
			System.out.println("3.데이터입력		4.데이터출력");
			System.out.println("5.데이터수정		6.데이터삭제");
			System.out.println("7.종료");
			System.out.println("==========================");
			System.out.print("메뉴선택 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				crud.connect();
				break;
				
			case 2:
				crud.conClose();
				break;
				
			case 3:
				crud.insert();
				
				break;
				
			case 4:
				crud.select();
				break;
				
			case 5:
				crud.update();
				break;
				
			case 6:
				crud.delete();
				break;
				
			case 7:
				run = false;
				break;
				
			default:
				System.out.println("다시입력해주세요!");
				break;
			
			}
			
			
			
			
		} // while문
		
		
	}

}
