package java0522;

public class PrChMain {//새로운 클래스를 만들고 자식 변수만 불렀는데  (부모 변수까지 상속되어있기 때문에 )부모 에 써있는 변수를 호출할 수 있다.

	public static void main(String[] args) {
		Child child =new Child(); 				//우리는 클래스 명 정하고 불른거 밖에 없는데 이전 Child에서 Parent를 상속해서  
		System.out.println(child.parentVar);	//여기서 우리는  parenvar,childvar 메소드 값을 호출할 수 있다.
		System.out.println(child.childVar);
		
		child.parentMethod();
		child.childMethod();

	}

}
