package service;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {

	public Member searchMemberById(String searchValue) {//아이디로 검색할때
		Member member = null;
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == Integer.parseInt(searchValue)){
				member = MemberUI.memberArray[i];
				break;
			}
		}		
		return member;
	}

	public Member[] searchMemberByName(String searchValue) {//이름으로 검색할때 
		Member[] sMArr = null;
		int count = 0;
		Member[] tempArr = new Member[MemberUI.memberArray.length];
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) {
				tempArr[count++] = MemberUI.memberArray[i];
				sMArr = new Member[count];
			}
		}
	
		for(int i=0; i<count; i++) {
			sMArr[i] = tempArr[i];
		}
		return sMArr;
	}

}
