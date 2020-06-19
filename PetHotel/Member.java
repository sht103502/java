package Pet;

public class Member {
	String id;
	String pw;
	String name;
	String phone;
	int point;
	int m_num;
	
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, String name, String phone, int point, int m_num) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.point = point;
		this.m_num = m_num;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", point=" + point
				+ ", m_num=" + m_num + "]";
	}
	

}
