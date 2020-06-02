package action;

import java.util.Scanner;

import service.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action{

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		Member newMember = console.getNewMember(sc);
		
		MemberRegistService mRS = new MemberRegistService();
		boolean registSuccess = mRS.registMember(newMember); //회원중복확인
		
		if(registSuccess) {
			console.printRegistSuccessMessage(newMember.getId());
		} else {
			console.printRegistFailMessage(newMember.getId());
		}
		
	}

}
