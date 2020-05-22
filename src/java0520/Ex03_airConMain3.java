package java0520;

public class Ex03_airConMain3 {
public static void main(String[] args) {
//	Ex00_AirCon airCon= new Ex00_AirCon();
//	//기본생성자 
//	Ex00_AirCon ac= new Ex00_AirCon(17);
//	// 매개변수 (int s) 
	//int s =17;
	//System.out.println(ac.size);
//	
//	airCon.showInfo();
//	ac.showInfo();
//	
	//
//	Ex03_AirCon AirCon = new Ex03_AirCon();
//	Ex03_AirCon AB = new Ex03_AirCon();
	
	Ex03_AirCon acc = new  Ex03_AirCon("puple", "SAMSUNG", 21, 20, 19);
	acc.showInfo();
	
	Ex03_AirCon all =new Ex03_AirCon("제조사", "puple", 5000, 150, 36);
	
	all.showInfo();
	
}
 }
