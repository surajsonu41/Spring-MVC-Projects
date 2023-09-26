package com.vtalent.ioc;

public class Payroll {
	private double annumpackage;
	private double monthlysalary;
	private int employeeId;
	/**
	 * @return the annumpackage
	 */
	public double getAnnumpackage() {
		return annumpackage;
	}
	/**
	 * @param annumpackage the annumpackage to set
	 */
	public void setAnnumpackage(double annumpackage) {
		this.annumpackage = annumpackage;
	}
	/**
	 * @return the monthlysalary
	 */
	public double getMonthlysalary() {
		return monthlysalary;
	}
	/**
	 * @param monthlysalary the monthlysalary to set
	 */
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
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
	@Override
	public String toString() {
		return "Payroll [annumpackage=" + annumpackage + ", monthlysalary=" + monthlysalary + ", employeeId="
				+ employeeId + "]";
	}
	

}
