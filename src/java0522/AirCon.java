package java0522;

public class AirCon {
/*//오늘 한것 필드만 설정해주면 메소드와 생성자를 자동으로 만들어줌 ㅋ
 * 	1.get, set 설정
 * 	2.기본생성자
 * 	3.매개변수 생성자
 * 	4.toString()
 */
	
	
	//필요한 필드값만 선언하고 나머지 필요한건 자바가 불러오도록 할것이다
	String company;
	int size;
	String color;
	int pirce;
	int temp;
	
	//1.get, set 설정
	//   오른마우스source-> gettet and setter -> 다 체크 하고 클릭 메소드 생성시켜버림ㅋㅋ 
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	//2.기본생성자 만들기
	public AirCon() {//만약에 아무것도 없는 생성자를 만들고 싶다면 using Field클릭-> Delete all 클릭 
		super();
	}
	//3.매개변수생성자 만들기
	//오른마우스 ->source->generate ~using Field클릭 하면 생성자를 만들어버림
	public AirCon(String company, int size, String color, int pirce, int temp) {
		super();
		this.company = company;
		this.size = size;
		this.color = color;
		this.pirce = pirce;
		this.temp = temp;
	}
	//4.메소드 -toString
	@Override
	public String toString() {//source->generate~ToString클릭-> 클릭 
		return "AirCon [company=" + company + ", size=" + size + ", color=" + color + ", pirce=" + pirce + ", temp="
				+ temp + "]";
	}
	
	//이런식으로도 만들어 줄수 있다.
	//	public void toString() {//source->generate~ToString클릭-> 클릭 
//		System.out.println( "AirCon [company=" + company + ", size=" + size + ", color=" + color + ", pirce=" + pirce + ", temp="
//				+ temp + "]");
//	}
	
}
