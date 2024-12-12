package oops3;

public class EmployeeService {
      private Employee[] employees = new Employee[10];
     
       public void addEmployee(int index, Employee emp) {
    	   employees[index] = emp;
       }
       public Employee[] getAllEmployees() {
    	   return employees;
       }
	    public Employee getEmployee(int index) {
	    	 return employees[index];
	    }
      
}
