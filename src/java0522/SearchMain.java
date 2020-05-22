package java0522;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		Search ht =new Search();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("검색할 회원 이름>> ");
			String name =sc.next();
			
			boolean searchResult = ht.searchMember(name);
			if(searchResult) {
				break;
			}
			System.out.println("검색한 회원이 없습니다!");
		}while(true);

	}

}
