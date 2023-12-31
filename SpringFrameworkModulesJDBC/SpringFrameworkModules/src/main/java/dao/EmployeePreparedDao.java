package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import bean.EmployeeBean;

public class EmployeePreparedDao 
{
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public Boolean saveEmployeeByPreparedStatement(final EmployeeBean e)
	{  
	    String query="insert into employee values(?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	   
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,e.getId());  
	        ps.setString(2,e.getName());  
	        ps.setFloat(3,e.getSalary());  
	              
	        return ps.execute();  
	              
	    }  
	    });  
	}  
	
	public int saveEmployee(EmployeeBean e){
		String query="insert into employee values(?,?,?)"; 
		
		return jdbcTemplate.update(query, new Object[]{100,"name",2500.00f});
	}
	
	public int saveOperation(String query, Object[] o){
		return jdbcTemplate.update(query, o);
	}
	 
	public int[] batchUpdateEmployee(List<Object[]> list){
		String query = "update employee set name = ?, salary = ? where id = ?";
		return jdbcTemplate.batchUpdate(query, list);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
