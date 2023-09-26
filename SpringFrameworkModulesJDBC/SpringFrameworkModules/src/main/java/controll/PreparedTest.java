package controll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.EmployeeBean;
import dao.EmployeePreparedDao;

public class PreparedTest {

	public static void main(String[] args) {
		  ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContect.xml");
		  Scanner input = new Scanner(System.in);
		 // preparedstatement example
	    
		    EmployeePreparedDao pdao=(EmployeePreparedDao)ctx.getBean("edao1");  
		    EmployeeBean bean=new EmployeeBean();
		    bean.setId(1140);
		    bean.setName("MNR");
		    bean.setSalary(30000);
		    pdao.saveEmployeeByPreparedStatement(bean); 
		    
		    //Batch update
		    int rs =  pdao.saveEmployee(bean);
			   System.out.println(rs + "inserted");
			    List<Object[]> list = new ArrayList<Object[]>();
			    EmployeeBean employeeBean = null;
			    while(true){
			    	System.out.println("Please enter employee data to update/ to terminate enter 0, continue with any number");
			    	int exitValue = input.nextInt();
			    	if(exitValue == 0){
			    		break;
			    	}
			    	employeeBean = new EmployeeBean();
			    	System.out.println("Please enter employee Id");
			    	employeeBean.setId(input.nextInt());
			    	System.out.println("Please enter employee Name");
			    	employeeBean.setName(input.next());
			    	System.out.println("Please enter employee salary");
			    	employeeBean.setSalary(input.nextFloat());
			    	
			    	Object[] objArray = {employeeBean.getName(),employeeBean.getSalary(),employeeBean.getId()};
			    	list.add(objArray);
			    }
			    
			   int[] res =  pdao.batchUpdateEmployee(list);
			   System.out.println(res + "are updated");


	}

}
