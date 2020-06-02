package action;

import java.util.Scanner;

import service.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberSearchAction implements Action {

	@Override
	public void excute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		SearchData search = console.getSearchData(sc);
		MemberSearchService mSS = new MemberSearchService();
		
		if(search.getSearchCondition().equals("아이디")) {
			Member member = mSS.searchMemberById(search.getSearchValue());
			console.printSearchMember(member);
		} else if (search.getSearchCondition().equals("이름")) {
			Member[] memberArr = mSS.searchMemberByName(search.getSearchValue());
			console.printSearchMember(memberArr);
			
		}
		
		
	}

}
