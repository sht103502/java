package java0521;

public class Ex00_Question {
	//필드
	String company;
	
	//생성자
	Ex00_Question(){
		
	}
	
	//메소드
	void showInfo() {
		System.out.println("정보출력");
		return; //void 에도 return 존재
				//삭제해도 상관 x
		
	}
	int add(int x, int y) {
		return x+y;
	}
	
	
	//메인
	public static void main(String[] args) {
		Ex00_Question as = new Ex00_Question();//객체
		
		//초기화
		as.company ="ICIA";
		System.out.println(as.company);
		//호출
		as.showInfo();
		//return 값 확인
		as.add(10,5);
		System.out.println(as.add(10,5));
		
	}
	
}
