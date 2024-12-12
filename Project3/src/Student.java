public class Student {
	//Instance Variables
	int studentId;
	String studentName;
	double studentGPA;
	
	static String batchCode = "2024-12980";
	
	//constructor
	public Student(int studentId, String studentName, double studentGPA) {
		System.out.println("constructor");
		this.studentId = studentId;	
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}
	
	//Instance Methods
	public void displayStudentDetails() {
		System.out.println("ID:"+studentId);
		System.out.println("Name: "+studentName);
		System.out.println("GPA: "+studentGPA);
		System.out.println("BatchCode: "+batchCode);
	}
}