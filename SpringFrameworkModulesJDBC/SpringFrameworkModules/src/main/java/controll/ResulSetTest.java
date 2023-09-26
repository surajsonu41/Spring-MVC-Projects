package controll;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.EmployeeBean;
import dao.EmployeeResult;

public class ResulSetTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContect.xml");
// ResultSet Example

		EmployeeResult rdao = (EmployeeResult) ctx.getBean("edao2");
		List<EmployeeBean> list = rdao.getAllEmployees();

		for (EmployeeBean e : list)
			System.out.println(e.getId() + "\t " + e.getName() + "\t " + e.getSalary());

	}

}
