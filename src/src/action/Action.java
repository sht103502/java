package action;

import java.util.Scanner;

public interface Action {
	void excute(Scanner sc) throws Exception;
	//메소드명() throws Exception;
	//throws : 던지다, Exception : 예외
	//지금 여기가 아니라, 메소드를 호출한 곳에서 예외처리를 실행한다.
	
	
	
}
