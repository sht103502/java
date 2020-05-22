package java0522;

public class SupSubMain {
	public static void main(String[] args) {
	SubSub ss= new SubSub();
	
	System.out.println("ss.x=" + ss.x);//Sup
	System.out.println("ss.y=" + ss.y);//Sub
	System.out.println("ss.z=" + ss.z);//SubSub
		
	ss.supMethod();//Sup속 메소드
	ss.subMethod();//Sub속 메소드
	ss.SubSubMethod();//SubSub속 메소드
	
	}
}
