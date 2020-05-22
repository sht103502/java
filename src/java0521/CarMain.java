package java0521;

public class CarMain {

	public static void main(String[] args) {
		Car ht_car =new Car();
		Car oh_car =new Car("하늘색", 250);
		Car yj_car =new Car("흰색","기아");
		Car sj_car =new Car("회색",300,"전기차","SJ8","테슬라");
		Car yr_car =new Car("휘발유",400);
//		Car ic_car =null; 이런식으로 만들수 있다.
//		ic_car =new car();
		
		//희태car 색상 검정!
		//제조사 : BMW
		//최고속도 : 200
		ht_car.color ="black";
		ht_car.company ="BMW";
		ht_car.speed =200;

		System.out.println("희태's");
		System.out.println(ht_car.toString());
		
		
		//은희 car
		//색상 하늘색(매개변수로 받아오기)
		//최고속력 250(매개변수)
		//타입 수소
		//모델 R8 
		//제조사 아우디
		//oh_car.color="하늘색";
		oh_car.type="수소";
		oh_car.model="R8";
		oh_car.company="아우디";
		System.out.println("은희's");
		System.out.println(oh_car.toString());
		
		//유진 car
		
		//색상 흰색(매개변수) 
		//속도 210
		//타입가솔린
		//모델 k5
		//제조사 : 기아 (매개변수)
	
		yj_car.speed=210;
		yj_car.type="가솔린";
		yj_car.model="k5";
		System.out.println("유진's");
		System.out.println(yj_car.toString());
		
		//성진 car
		
		//색상 회색(매개변수) 
		//속도 300
		//타입 전기차
		//모델 SJ8
		//제조사 :  (매개변수)
	
		System.out.println(sj_car.toString());
	
		//유리 car
		
		//색상 검은색
		//속도매개
		//타입매개
		//모델
		//제조사
		
		yr_car.color="검은색";
		yr_car.company="벤츠";
		yr_car.model="Amg";
		System.out.println("유리's");
		System.out.println(yr_car.toString());
		
		System.out.println("희태's car");
		System.out.println("gas : "+ht_car.gas);
		ht_car.setGas(50);
		System.out.println("gas 충전 :" + ht_car.gas);
	
	
		boolean gasState =ht_car.isLeftGas();
		if(gasState) {
			System.out.println("==========");
			System.out.println("출발");
			ht_car.run();
		}
	
	
	
	
	}

}
