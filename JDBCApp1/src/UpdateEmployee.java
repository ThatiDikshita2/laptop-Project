import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver , url ,user ,password;
			driver = "com.mysql.cj.jdbc.Driver";
			url ="jdbc:mysql://localhost:3306/edb12980";
			user = "root";
			password="root";
			String sql = "Update employee set name=?, email=?, where id=?";
		
			//ps.setInt(1, 101);
			//1. Loading driver
			Class.forName(driver);
			
			//2. Establish Connection
			Connection con = DriverManager.getConnection(url,user, password);
			
			//3.Create PreparedStatement object.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "Willson");
			ps.setString(2, "Willson@gmail.com");
		    ps.setInt(3, 101);
			
			//4. Execute Insert sql query
			int status = ps.executeUpdate();
			if(status >=1) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");				
			}
	     ps.close();
	    con.close();	
	}
}
