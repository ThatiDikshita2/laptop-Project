import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddEmployee {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver , url ,user ,password;
			driver = "com.mysql.cj.jdbc.Driver";
			url ="jdbc:mysql://localhost:3306/edb12980";
			user = "root";
			password="root";
			String sql = "insert into employee values(?,?,?,?,?)";
		
			//1. Loading driver
			Class.forName(driver);
			
			//2. Establish Connection
			Connection con = DriverManager.getConnection(url,user, password);
			
			//3.Create PreparedStatement object.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 105);
			ps.setString(2, "Krish");
			ps.setString(3, "Krish@gmail.com");
			ps.setLong(4, 9988776655L);
			ps.setString(5, "M");
			
			//4. Execute Insert sql query
			int status = ps.executeUpdate();
			if(status >=1) {
				System.out.println("New employee is added");
			}else {
				System.out.println("Failed");			
			}
			
	     ps.close();
	    con.close();	
	}
}
