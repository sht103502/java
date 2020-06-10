package JDBC0610;

public class JdbcMain {

	public static void main(String[] args) {
//		DBConnection conn= new DBConnection ();
//		conn.DBConnect();
	
		DBCon conn = new DBCon();
				conn.connect();
			
	}

}
