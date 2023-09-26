package com.vtalent.ioc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vtalent.ioc.Employee;
import com.vtalent.ioc.EmployeeOne;

public class TestClass {
	public static void main(String[] args) {

		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * BeanFactory beanFactory = new XmlBeanFactory(resource); Employee employee =
		 * (Employee) beanFactory.getBean("employeeRef");
		 */

		
		  @SuppressWarnings("resource") 
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
			/*
			 * EmployeeOne employeeOne = (EmployeeOne) context.getBean("employeeOneRef");
			 * System.out.println(employeeOne);
			 */
			 
			  Employee employee = (Employee) context.getBean("employeeRef");
			  System.out.println("Id = " + employee.getEmployeeId() + "--" + "Name =" +
			  employee.getEmployeeName() + "--" + "salary =" +
			  employee.getEmployeeSalary()); ; System.out.println("Package = " +
			  employee.getHr().getPackageSalary()); System.out.println("Leave count= " +
			  employee.getHr().getLeaveCount()); System.out.println("SkillSet " +
			  employee.getSkillSet()); System.out.println(employee.getAddress());
			  System.out.println(employee.getPayroll());
			 
		 

	}
}
