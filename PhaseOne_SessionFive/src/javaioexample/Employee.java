package javaioexample;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private String department;
	private transient Address address;
	
	public Employee() {
		super();
		this.employeeId = 101;
		this.employeeName = "Annonymous";
		this.department = "Sales";
	}

	public Employee(int employeeId, String employeeName, String department, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.address = address;
	}



	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", address=" + address + "]";
	}
	
}
