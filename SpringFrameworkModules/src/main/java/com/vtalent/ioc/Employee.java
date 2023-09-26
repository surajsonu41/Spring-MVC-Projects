package com.vtalent.ioc;

import java.util.List;
import java.util.Map;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private HR hr;
	private List<String> skillSet;
	private long mobilenumber;
	private Map<Integer,Address>Address;
	private Map<Integer,Payroll>payroll;
	
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Map<Integer, Address> getAddress() {
		return Address;
	}
	public void setAddress(Map<Integer, Address> address) {
		Address = address;
	}
	public Map<Integer, Payroll> getPayroll() {
		return payroll;
	}
	public void setPayroll(Map<Integer, Payroll> payroll) {
		this.payroll = payroll;
	}
	
	/**
	 * @return the skillSet
	 */
	public List<String> getSkillSet() {
		return skillSet;
	}
	/**
	 * @param skillSet the skillSet to set
	 */
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	/**
	 * @return the hr
	 */
	public HR getHr() {
		return hr;
	}
	/**
	 * @param hr the hr to set
	 */
	public void setHr(HR hr) {
		this.hr = hr;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeSalary
	 */
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
