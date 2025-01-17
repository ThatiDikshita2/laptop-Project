import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KettleApp {
	private static String driver, url, user, password, sql;
	private static Connection con;
    
  	static {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12980";
		user = password = "root";
		try {
			getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}

	public static void closeConnection() throws SQLException {
		con.close();
	}
	
	public static boolean insertKettle(Kettle kettle) throws SQLException, ClassNotFoundException {
		sql = "insert into kettle values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, kettle.getKettleId());
		ps.setString(2, kettle.getBrand());
		ps.setFloat(3, kettle.getCapacity());
		ps.setString(4, kettle.getMaterial());
		ps.setString(5, kettle.getStorage());
		ps.setDouble(6, kettle.getPrice());

		int status = ps.executeUpdate();
		ps.close();
		if (status >= 1) {
			return true;
		}
		return false;
	}

	public static Kettle selectKettle(int id) throws ClassNotFoundException, SQLException {
		sql = "select * from kettle where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		Kettle kettle = null;
		if (rs.next()) {
			kettle = new Kettle();
			kettle.setKettleId(rs.getInt(1));
			kettle.setBrand(rs.getString(2));
			kettle.setCapacity(rs.getFloat(3));
			kettle.setMaterial(rs.getString(4));
			kettle.setStorage(rs.getString(5));
			kettle.setPrice(rs.getDouble(6));
		}
		rs.close();
		ps.close();
		return kettle;
	}

	public static List<Kettle> selectKettle() throws ClassNotFoundException, SQLException {
		sql = "select * from kettle";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Kettle> kettles = new ArrayList<Kettle>();

		while (rs.next()) {
			Kettle kettle = new Kettle();
			kettle.setKettleId(rs.getInt(1));
			kettle.setBrand(rs.getString(2));
			kettle.setCapacity(rs.getFloat(3));
			kettle.setMaterial(rs.getString(4));
			kettle.setStorage(rs.getString(5));
			kettle.setPrice(rs.getDouble(6));

			kettles.add(kettle);
		}
		rs.close();
		ps.close();
		return kettles;
	}

	public static boolean updateKettle(int id, float capacity, String material, String storage, double price)
			throws ClassNotFoundException, SQLException {
		Kettle kettle = selectKettle(id);
		if (kettle != null) {
			sql = "update kettle set capacity=?, material=?, storage=?, price=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setFloat(1, capacity);
			ps.setString(2, material);
			ps.setString(3, storage);
			ps.setDouble(4, price);
			ps.setInt(5, id);

			int status = ps.executeUpdate();
			ps.close();
			if (status >= 1) {
				return true;
			}
			return false;
		}
		return false;
	}

	public static boolean deleteKettle(int id) throws ClassNotFoundException, SQLException {
		Kettle kettle = selectKettle(id);
		if (kettle != null) {
			sql = "delete from kettle where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			int status = ps.executeUpdate();
			ps.close();
			if (status >= 1) {
				return true;
			}
			return false;
		}
		return false;
	}

	public static boolean deletKettle() throws ClassNotFoundException, SQLException {
		sql = "delete from kettle";
		PreparedStatement ps = con.prepareStatement(sql);
		int status = ps.executeUpdate();
		ps.close();
		if (status >= 1) {
			return true;
		}
		return false;
	}
}