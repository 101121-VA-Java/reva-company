package com.revature.services;

import java.util.List;

import com.revature.daos.EmployeeDao;
import com.revature.daos.EmployeeList;
import com.revature.exceptions.LoginException;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.models.Role;

public class EmployeeService {

	private static EmployeeDao ed = new EmployeeList();
	
	public Employee addEmployee(Employee e) throws UsernameAlreadyExistsException {

		Employee newEmp = this.getEmployeeByUsername(e.getUsername());
		if(newEmp != null) {
			throw new UsernameAlreadyExistsException();
		}
		e.setRole(Role.BASIC_EMPLOYEE);
		e.setManager(ed.getById(0));
 
		return ed.add(e);
	}
	
	public Employee getEmployeeByUsername(String username){
		List<Employee> employees = ed.getAll();
		for(Employee e : employees) {
			if (e.getUsername().equals(username)) {
				return e;
			}
		}
		return null;
	}
	
	public Employee login(String username, String password) throws LoginException {
		Employee emp = this.getEmployeeByUsername(username);
		if(emp == null || !emp.getPassword().equals(password)) {
			throw new LoginException();
		}
		return emp;
	}
}
