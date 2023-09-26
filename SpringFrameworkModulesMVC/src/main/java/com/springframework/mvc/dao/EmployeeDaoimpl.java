package com.springframework.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.springframework.mvc.bean.Employee;

public class EmployeeDaoimpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean insertData(final Employee employee) {
		String query="insert into customer values(?,?,?,?,?,?,?)";  
	    return this.jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	   
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setString(1,employee.getFirstName());  
	        ps.setString(2,employee.getLastName());
	        ps.setString(3,employee.getAddress());
	        ps.setInt(4, employee.getZipCode());
	        ps.setString(5, employee.getCityName());
	        ps.setString(6, employee.getStateName());
	        ps.setInt(7, employee.getDob());
	              
	        return ps.execute();  
	              
	    }  
	    });  
	}

}
