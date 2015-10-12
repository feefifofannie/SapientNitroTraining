package com.sapient.client.cui;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sapient.beans.Employee;
import com.sapient.util.EmpMapper;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = (DataSource)context.getBean("dataSource");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String SQL = "select first_name from emp where employee_id = ? and salary = ?";
		String name = jdbcTemplate.queryForObject(SQL, new Object[]{107,4200}, String.class);
		
		System.out.println(name);
		
		SQL = "select * from emp where employee_id = ?";
		Employee emp = jdbcTemplate.queryForObject(SQL, new Object[]{108}, new EmpMapper());
		
		System.out.println(emp);
		
		SQL = "select * from emp";
		List<Employee> emps = jdbcTemplate.query(SQL, new EmpMapper());
		
		for (Employee emprec : emps){
			System.out.println(emprec);
		}
		
		SQL = "insert into emp values (?, ?, ?)";
		jdbcTemplate.update(SQL, new Object[]{200, "Raj", 11000});
		
		SQL = "update emp set name = ? where id = ?";
		jdbcTemplate.update(SQL, new Object[]{"Raj", 200});
	}
	
}
