package com.edubbridge.hibapp1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//To auto generation of id
//To specify the column properties
/*  Domain class
 * Model class
 * Entity class
 * DTO= Data Transfer Object
 */
@Entity
@Table(name = "EMPLOYEE_DETAILS") //otherwise table will create as classname
public class Employee {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "employee_id")
       private Integer employeeId;
	   @Column(name = "employee_name")
       private String employeeName;
	   @Column(name = "Employee_salary")
       private Double employeeSalary;
	   @Column(name = "employee_email")
       private String employeeEmail;
	   @Column(name = "employee_mobile")
       private Long employeeMobile;
     //Getter and Setters 
    public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Long getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(Long employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeEmail=" + employeeEmail + ", employeeMobile=" + employeeMobile + "]";
	}
	
       
}
