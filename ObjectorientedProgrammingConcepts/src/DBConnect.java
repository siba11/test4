import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Create the connection
		String dburl="jdbc:postgresql://localhost:5432/postgres";
		String Userid="postgres";
		String password="postgres";
		//load the driver
		Class.forName("org.postgresql.Driver");
		//Create the connection
		Connection cn=DriverManager.getConnection(dburl,Userid,password);
		Statement stm=cn.createStatement();
		 ResultSet rs=stm.executeQuery("select * from dept");
				 //execute("select * from dept");
		 while (rs.next())
			 {
			 System.out.println(rs.getString(1));		 
					
			 }
	
		 
		cn.close();
		

	}

}
