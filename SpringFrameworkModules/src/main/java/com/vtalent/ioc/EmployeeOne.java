package com.vtalent.ioc;

public class EmployeeOne {
private int employeeId;
private String employeeName;
/**
 * @param employeeId
 * @param employeeName
 */
public EmployeeOne(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "EmployeeOne [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}


	
}
