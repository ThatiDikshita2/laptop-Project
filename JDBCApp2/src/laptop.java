
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class laptop {
	private int id; // unique
	private String brand;
	private String model;
	private int ram;

	public void laptop(int id, String brand, String model, int ram) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.ram = ram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "laptop  [id=" + id + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
	}

	public static void main(String[] args) throws SQLException {

		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12980";
		user = "root";
		password = "root";

		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("*Laptop Management System");
		while (true) {
			System.out.println("*Menu");
			System.out.println("1. Add laptop details ");
			System.out.println("2. Display all laptop details ");
			System.out.println("3. Update laptop details ");
			System.out.println("4. Delete laptop ");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				String sql = "insert into laptop value(?,?,?,?)";
				Connection con = DriverManager.getConnection(url, user, password);

				PreparedStatement ps = con.prepareStatement(sql);
				System.out.println("Enter laptop id :");
				ps.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter laptop brand :");
				ps.setString(2, sc.nextLine());
				System.out.println("Enter laptop  model :");
				ps.setString(3, sc.nextLine());
				System.out.println("Enter laptop  ram :");
				ps.setInt(4, sc.nextInt());

				int status = ps.executeUpdate();// for DML operation
				if (status >= 1) {
					System.out.println("Successfully new laptop is added");
				} else {
					System.out.println("failed");
				}

				break;
			case 2:
				String sql1 = "select * from laptop";
				Connection con1 = DriverManager.getConnection(url, user, password);

				// 3.Create Statement Object.
				Statement st = con1.createStatement();

				// 4.Process/Execute select sql query

				ResultSet rs = st.executeQuery(sql1);
                 List<laptop>laptop = new ArrayList<laptop>();
				
					if (laptop.size() != 0) {
						while (rs.next()) {
							System.out.println("Id:" + rs.getInt("id"));
							System.out.println("Brand :" + rs.getString("brand"));
							System.out.println("Model :" + rs.getString("model"));
							System.out.println("Ram :" + rs.getInt("ram"));
							System.out.println("----------------------------------");
					} 
					}else {
						System.out.println("No laptops available!");
					}				
				break;
			case 3:
				String sql2 = "update laptop set brand =? , ram=? where id =?";

				// 2. Establish Connection
				Connection con2 = DriverManager.getConnection(url, user, password);

				// 3.Create Statement Object.
				PreparedStatement ps1 = con2.prepareStatement(sql2);
				System.out.println("Enter Id number :");
				ps1.setInt(3, sc.nextInt());
				System.out.println("Enter Brand name :");
				ps1.setString(1, sc.next());
				System.out.println("Enter Ram laptop:");
				ps1.setInt(2, sc.nextInt());

				// 4. Execute Insert sql query
				int status1 = ps1.executeUpdate();// for DML operation
				if (status1 >= 1) {
					System.out.println("successfully laptop details updated");
				} else {
					System.out.println("failed");
				}
				break;
			case 4:
				String sql3 = "delete from laptop where id =?";

				// 2. Establish Connection
				Connection con3 = DriverManager.getConnection(url, user, password);

				// 3.Create Statement Object.
				PreparedStatement ps2 = con3.prepareStatement(sql3);

				System.out.println("Enter your id of laptop :");
				ps2.setInt(1, sc.nextInt());

				// 4. Execute Insert sql query
				int status2 = ps2.executeUpdate();// for DML operation
				if (status2 >= 1) {
					System.out.println("successfully laptop deleted");
				} else {
					System.out.println("failed");
				}break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}

	}
}