package action;

import java.util.Scanner;

import service.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

public class MemberUpdateAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		int id = console.getId("수정할 ", sc);
		MemberUpdateService mUS = new MemberUpdateService();
		Member oldMember = mUS.getOldMember(id);
		Member newMember = console.getNewMember(oldMember, sc);
		
		boolean us = mUS.updateMember(newMember);
		
		if(us) {
			console.printUpdateSuccessMessage(newMember.getId());
		} else {
			console.printUpdateFailMessage(newMember.getId());
		}
	}

}
