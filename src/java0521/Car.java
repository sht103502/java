package java0521;

public class Car {
	//필드 
	//색상(color), 최고속도(speed), 연료타입(type) , 모델명 (model)
	String color;
	int speed;
	String type;
	String model;
	String company = "벨로스터N";

	//생성자(오버로딩)
	
		
	
	//기본생성자 
	Car(){
		
	}

	
	
	
	
	//매개변수 :color, speed
Car(String color,int speed){
		this.color = color;
		this.speed = speed;
	}
//매개변수 :color, company
Car(String color, String company){
	this.color =color;
	this.company = company;
	}
//매개변수 : speed, company
Car(int speed, String company){
	this.speed = speed;
	this.company = company;
	
}


	
//매개변수 :color, speed, type, model, company
Car(String color, int speed, String type, String model, String company){
	this.color = color;
	this.speed = speed;
	this.type = type;
	this.model = model;
	this.company = company;
}

 






//메소드
//오버라이드 : 상속에서 사용
//부모기능 재정의

//필드 추가
int gas;

//메소드 추가
void setGas(int gas) {
	this.gas = gas;
}

boolean isLeftGas() {
	if(gas ==0) {
		System.out.println("gas가 없습니다.");
		return false;
	}else {
		System.out.println("gas가 있습니다.");
		return true;
		
	}
	
	
}
void run() {
	while(true) {
		if(gas >0) {
		System.out.println("달립니다.(gas 잔량 : "+ gas  + " )"); 
		gas--;
		}else{
			System.out.println("멈춥니다.(gas 잔량 : " +gas + ")");
			return;
		}
}
}
@Override
public String toString() {
	return "Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company=" + company
			+ "]";
}
	
	
}
