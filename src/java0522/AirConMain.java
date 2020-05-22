package java0522;

public class AirConMain {

	public static void main(String[] args) {
		AirCon ac = new AirCon();
		
		ac.company="제조사";
		ac.setCompany("제조사");
		
		System.out.println(ac.company);
		System.out.println(ac.getCompany());
		
	}

}
