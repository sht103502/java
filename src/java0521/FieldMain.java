package java0521;

public class FieldMain {

	public static void main(String[] args) {
		//로컬변수
		int temp=0;
		Field fd =new Field();
		System.out.println("fd.size ="+ fd.size);
		System.out.println("fd.price =" + fd.size);
		
		System.out.println("Field.price =" + Field.price);
		
		Field fd2 = new Field(99);// int size = 99인 객체
		System.out.println("1)new Field() :"+ fd.size);
		System.out.println("2)new Field(99) :"+ fd2.size);
		System.out.println("3)fd2.size =" + fd2.size);
		
		//로컬변수 temp출력
		System.out.println("temp : "+ temp);
		
		
		Field numbers = new Field((short)15);//byte bNum
		
		numbers.shoInfo();
	}

}
