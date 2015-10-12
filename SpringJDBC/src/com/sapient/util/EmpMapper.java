package com.sapient.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sapient.beans.Employee;

public class EmpMapper implements RowMapper<Employee> {
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
		Employee emp = new Employee();
		emp.setEmployee_id(rs.getInt("employee_id"));
		emp.setFirst_name(rs.getString("first_name"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
	}
	
}
