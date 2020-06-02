package util;

import java.util.Scanner;

import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		Member newMember = new Member();
		
		System.out.println(" ------------ 회원 정보 등록 ------------ ");
		
		System.out.print("회원 아이디 >> ");
		int id = sc.nextInt();
		
		System.out.print("회원 이름 >> ");
		String name = sc.next();
		
		System.out.print("회원 전화번호 >> ");
		String phone = sc.next();
		
		System.out.print("회원 나이 >> ");
		int age  = sc.nextInt();
		
		sc.nextLine();
		System.out.print("회원 주소 >> ");
		String addr = sc.nextLine();
		
		System.out.print("회원 이메일 >> ");
		String email = sc.next();
		
		System.out.print("회원 취미 >> ");
		String hobby = sc.next();
		
		newMember.setId(id);
		newMember.setName(name);
		newMember.setPhone(phone);
		newMember.setAge(age);
		newMember.setAddr(addr);
		newMember.setEmail(email);
		newMember.setHobby(hobby);
		
		//System.out.println(newMember.toString());
			
		return newMember;
	}
	
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "번 회원 등록 성공");
	}
	
	public void printRegistFailMessage(int id) {
		System.out.println(id + "번 회원 등록 실패");
	}

	public void printMemberList(Member[] memberArr) {
		if(memberArr.length == 0) {
			System.out.println("추가된 회원정보가 없습니다.");
		} else {
			for(int i=0; i<memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}
	}

	public int getId(String msgKind, Scanner sc) {
		System.out.print(msgKind + "아이디 : ");
		return sc.nextInt();
		//사용자가 입력한 아이디를 바로 return 해준다.
	}

	public Member getNewMember(Member oldMember, Scanner sc) {
		Member member = new Member();
		System.out.println(" ------------ 회원 정보 수정 ------------ ");
		
		System.out.println("회원 아이디 : " + oldMember.getId());
		
		System.out.println("이전 이름 : " + oldMember.getName());
		System.out.print("회원 이름 >> ");
		String name = sc.next();
		
		System.out.println("이전 전화번호 : " + oldMember.getPhone());
		System.out.print("회원 전화번호 >> ");
		String phone = sc.next();
		
		System.out.println("이전 나이 : " + oldMember.getAge());
		System.out.print("회원 나이 >> ");
		int age  = sc.nextInt();
		
		System.out.println("이전 주소 : " + oldMember.getAddr());
		sc.nextLine();
		System.out.print("회원 주소 >> ");
		String addr = sc.nextLine();
		
		System.out.println("이전 이메일 : " + oldMember.getEmail());
		System.out.print("회원 이메일 >> ");
		String email = sc.next();
		
		System.out.println("이전 취미 : " + oldMember.getHobby());
		System.out.print("회원 취미 >> ");
		String hobby = sc.next();
		
		member.setId(oldMember.getId());
		member.setName(name);
		member.setPhone(phone);
		member.setAge(age);
		member.setAddr(addr);
		member.setEmail(email);
		member.setHobby(hobby);
			
		return member;
	}

	public void printUpdateSuccessMessage(int id) {
		//회원 수정 성공
		System.out.println(id + "번 회원정보 수정 성공");
	}

	public void printUpdateFailMessage(int id) {
		//회원 수정 실패
		System.out.println(id + "번 회원정보 수정 실패");
	}

	public void printDeleteSuccessMessage(int id) {
		System.out.println(id + "번 회원정보 삭제 성공");
	}

	public void printDeleteFailMessage(int id) {
		System.out.println(id + "번 회원정보 삭제 실패");		
	}

	public SearchData getSearchData(Scanner sc) {
		System.out.println("검색조건을 선택하세요. (아이디/이름)");
		System.out.print("검색조건 >> ");
		String searchCondition = sc.next();
		String searchValue = null;
		
		if(searchCondition.equals("아이디")) {
			System.out.print("검색할 아이디 >> ");
			searchValue = sc.next();
		} else if (searchCondition.equals("이름")) {
			System.out.print("검색할 이름 >> ");
			searchValue = sc.next();
		} 
		
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		
		return searchData;
	}

	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("검색한 결과가 없습니다.");
		} else {
			System.out.println(member.getId() + "로 검색한 결과!");
			System.out.println(member);
		}
	}

	public void printSearchMember(Member[] memberArr) {
		if(memberArr == null) {
			System.out.println("이름으로 검색한 결과가 없습니다.");
		
		}else{//3을 입력해도 이것이 실행된다.
			System.out.println("이름으로 검색한 결과");
			for(int j=0; j<memberArr.length; j++) {
				System.out.println(memberArr[j]);
			}
		}
	}
	
}
