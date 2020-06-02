package action;

import java.util.Scanner;

import service.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		MemberListService mLS = new MemberListService();
		
		Member[] memberArr = mLS.getMemberArray(); 
		console.printMemberList(memberArr);
	}

}
