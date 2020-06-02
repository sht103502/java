package service;

import ui.MemberUI;
import vo.Member;

public class MemberDeleteService {

	public boolean deleteMember(int id) {

		boolean ds = false;
		int index = -1;
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == id) {
				index = i;
			}
		}
		
		if(index != -1) {
			Member[] tempArr = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length-1];
			
			for(int i=0; i<tempArr.length; i++) {
				if(i<index) {
					MemberUI.memberArray[i] = tempArr[i];
				} else if (i>index) {
					MemberUI.memberArray[i-1] = tempArr[i];					
				}
			}
			ds = true;
		}
		return ds;
	}

}
