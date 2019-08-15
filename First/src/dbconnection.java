import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnection {
	public static void main(String[] args) throws SQLException{
		//Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "postgres", "postgres")
	String dburl="jdbc:postgresql://localhost:5432/postgres";
	 String user="postgres";
	 String password="postgres";
	// create connection
	Connection con= DriverManager.getConnection(dburl,user,password);
	//load jdbc driver
	try {
		Class.forName("com.postgres.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//create statemnet object
	Statement stm= con.createStatement();
	//query
	String qr="Select * from emp;";
	//execute the query
	ResultSet rt=stm.executeQuery(qr);
	while(rt.next()){
		String mname=rt.getString(1);
		System.out.println(mname);
	}
	con.close();
		
	}

}
