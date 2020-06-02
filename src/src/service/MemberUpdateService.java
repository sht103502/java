package service;

import ui.MemberUI;
import vo.Member;

public class MemberUpdateService {

	public Member getOldMember(int id) {
		Member oldMember = null;
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == id) {
				oldMember = MemberUI.memberArray[i];
				break;
			}
		}
		return oldMember;
	}

	public boolean updateMember(Member newMember) {
		boolean us = false;
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == newMember.getId()) {
				MemberUI.memberArray[i] = newMember;
				us = true;
				break;
			}
		}		
		return us;
	}

}
