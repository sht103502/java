package java0520;

public class Ex01_FieldIntitValueMain {

	public static void main(String[] args) {
		
		Ex01_FieldIntitValue HT = new Ex01_FieldIntitValue();
		//객체만들기! 
		//정수형 초기값 확인
		System.out.println("byteField :"+HT.byteField);
		System.out.println("shortField :"+HT.shortField);
		System.out.println("intField :"+HT.intField);
		System.out.println("longField :"+HT.longField);
		
		//실수형 초기값 확인
		System.out.println("sfloatField :"+HT.floatField);
		System.out.println("doubleFrield :"+HT.doubleFrield);
		
		//문자형 초기값 확인
		System.out.println("charField :"+HT.charField);
		
		//논리형 초기값 확인
		System.out.println("booleanField :"+HT.booleanField);
		
		//배열 초기값 확인
		System.out.println("arrField :"+HT.arrField);
		
		//참조형 초기값 확인
		System.out.println("referenceField :"+ HT.referenceField);
		
System.out.println(HT);



	}

}
