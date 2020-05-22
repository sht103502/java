package java0522;



public class Search {
	Member[] members = new Member[4];
	
	 public Search() {
		  members[0] =new Member("신희태",26 , 174,  "인천시 서구" );
		  members[1] =new Member("이유진",30 , 180,  "인천시 미추홀구" );
		  members[2] =new Member("김성진",26 , 177,  "인천시 동인천" );
		  members[3] =new Member("이영은",24 , 158,  "인천시 학익동" );
	 }
	 boolean searchMember(String name) {
		 boolean boolResult =false;
		 for(int i=0; i<members.length; i++) {
			 if(members[i].getName().equals(name)) {
				 printInfo(members[i]);
				 boolResult = true;
			 }
		 }
		 
		 
		 
		 
		 return boolResult;
	 }
	private void printInfo(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getName()+ "으로 찾은 결과!");
		System.out.println("이름 :"+member.getName() );
		System.out.println("나이 :"+ member.getAge());
		System.out.println("키 :"+ member.getHeight());
		System.out.println("주소 :"+ member.getAddr());
		
	}
	
}
