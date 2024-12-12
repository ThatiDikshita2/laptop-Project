package oops;

public class Employee{
	//Instance Variables
		int employeeId;
		String employeeName;
		double employeeSalary;
		
		// Static prop
		static String employeeOrganization = "Edubridge";
		
		// Constructor
		// to Perform initialization of newly Created objects
		public Employee(int employeeId, String employeeName, double employeeSalary) {
			System.out.println("constructor");
			this.employeeId = employeeId;	
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}
		
		//Instance Methods
		public void displayDetails() {
			System.out.println("Employee ID: "+employeeId);
			System.out.println("EmployeeName: "+employeeName);
			System.out.println("EmployeeSalary: "+employeeSalary);	
		}
		
	   //@overriding
		public String toString() {
			return employeeId+"\t"+employeeName+"\t"+employeeSalary;
		}
}
