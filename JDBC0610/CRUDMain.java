package JDBC0610;

public class CRUDMain {

	public static void main(String[] args) {
		DBCon conn = new DBCon();
		conn.connect();
		
		CRUDTest crud = new CRUDTest();
		crud.insert();
		crud.select();
		crud.update();
		crud.select();
		crud.delete();
		
		crud.select();

	}

}
