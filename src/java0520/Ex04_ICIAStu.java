package java0520;

public class Ex04_ICIAStu {
	// ICIA교육원에 다니는 JS반 훈련생에 대한 클래스 만들고
	//메인클래스에서 각자 같은 조원들에대한
	//객체를 각각 선언해서 출력!
	
	//이름,나이 ,취미. 주소, 생년월일
	
	//그사람 정보를 모두 출력하는 메소드 생성
	//호출시 나이를 한살 줄도록 하는 메소드 생성

	String name;
	int age;
	String hobby;
	String address;
	int birth;

	

Ex04_ICIAStu(){
	
}

Ex04_ICIAStu(String name, int age,String hobby, String address, int birth){
	this.name = name;
	this.age = age;
	this.hobby = hobby;
	this.address = address;
	this.birth = birth;
	
}
void showInfo() {
	System.out.println("\nname: "+ name+"\nage: "+ age+ "\nhobby : "+ hobby+ "\naddress: "+ address + "\nbirth: " + birth);
	
 }
int downage() {
	int result = age--;
	return result;
}	

}
