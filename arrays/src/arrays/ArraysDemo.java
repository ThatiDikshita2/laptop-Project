package arrays;

// Array represent a group fixed size of similar data elements
public class ArraysDemo {
	public static void main(String[] args) {
		// 1.Array Declaration
		int[] arr1; // recommended
		int[] arr2;
		int arr3[];
		// int[10] arr4; // CE
		// 2.Array Creation
		arr1 = new int[10];
		// arr2 = new int[];//CE
		// arr3 = new int[-10]; //RE
		arr2 = new int[0];
		// 3.Array initialization
		arr1[0] = 44;
		arr1[1] = 55;
		arr1[2] = 66;
		// 4.Access Array Elements
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[9]);
		// System.out.println(arr1[10]); // RE

		// Array Declaration, Creation and Initialization at a time
		int[] arr4 = new int[] { 44, 55, 66, 77, 88, 99 };

		int[] arr5 = { 44, 55, 66, 77, 88, 99 };

		// find size of array
		System.out.println(arr4.length);

		// Array Traversal
		double[] salaries = { 55000.0, 45000.0, 35000.0, 25000.0 };
		System.out.println("Using for loop");

		int size = salaries.length;

		for (int index = 0; index < size; index++) {
			System.out.println(salaries[index]);
		}
		System.out.println("Using for each loop from v1.5");
		for (double salary : salaries) {
			System.out.println(salary);
		}
//Store the following employee names  Wills, Smith, Jones, Alex, Anna	
//Display each employee using for loop and for each loop	

		String[] employees = { "Wills", "Smith", "Jones", "Alex", "Anna" };
		for (String employee : employees) {
			System.out.println(employee);
		}

		int[] subjectMarks = { 55, 44, 66, 77, 88, 99 };
		// Total Subjectmarks
		// Average SubjectMarks

		int total = 0;
		for (int marks : subjectMarks) {
			total += marks;
		}
		System.out.println("Total subject marks = " + total);
		System.out.println("Average subject marks = " + (total / subjectMarks.length));

		// minimun element in an array
		int min = subjectMarks[0];
		for (int marks : subjectMarks) {
			if (min > marks) {
				min = marks;
			}
		}
		System.out.println("minimun marks : " + min);
		// maximun element in an array
		int max = subjectMarks[0];
		for (int marks : subjectMarks) {
			if (max < marks) {
				max = marks;
			}
		}
		System.out.println("maximun marks : " + max);

		// Searching an Element
		int search = 55;
		for (int i = 0; i < subjectMarks.length; i++) {
			if (subjectMarks[i] == search) {
				System.out.println("Element found at " +i);
				System.exit(0);
			}
			System.out.println("Element not found");
		}

		Object[] objArray = { 10, "jones", 45000.0, true };
		int element1 = (int) objArray[0];
		String element2 = (String) objArray[1];
		double element3 = (double) objArray[2];
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);
	}
}
