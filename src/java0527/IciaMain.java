/*
  
  Date : 2020.05.27
  Author : 신희태
  Description : 
  Version : 1.0
*/
package java0527;

public class IciaMain {//다형성

	public static void main(String[] args) {
		IciaInfo info = new IciaInfo();
		IciaPerson icia = new IciaPerson();
		IciaStudent student =new IciaStudent();
		IciaTeacher teacher =new IciaTeacher();
		IciaWorker worker =new IciaWorker();
		
		//finishType 라는 객체로 여러가지를 참조할 수있는지 확인.
		info.finishType(icia);
		info.finishType(student);
		info.finishType(teacher);
		info.finishType(worker);
		
		/*//만약 IciaInfo클래스가 없다면 I 
		icia.finish();
		student.finish();
		teacher.finish();
		worker.finish();
		이렇게 하면 되는데, 다형성을 보여주기에는 조금 부족하다.
		이때문에 위의 코드처럼 통일을 시켜서 하나의 객체에 여러개의 객체를 참조하는 것을
		보여줄 수 있다.
		
		*/
		}
	}


