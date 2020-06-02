package vo;

public class Member {
	private int id;
	private String name;
	private String phone;
	private int age;
	private String addr;
	private String email;
	private String hobby;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "회원정보 [회원번호 : " + id + ", 이름 : " + name + ", 전화번호 : " + phone + ", 나이 : " + age + ", 주소 : " + addr
				+ ", 이메일 : " + email + ", 취미 : " + hobby + "]";
	}
	

}
