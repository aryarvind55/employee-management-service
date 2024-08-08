package com.ary.ems.service;

import com.ary.ems.dto.EmployeeDto;
import com.ary.ems.entities.EmployeeEntity;

import java.util.List;



public interface EmployeeService {

	List<EmployeeDto> getEmployeeList();

	EmployeeEntity createEmployee(EmployeeEntity employeeEntity);
	
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	
	void deleteEmployee(Integer employeeId);

	EmployeeEntity getEmployeeById(Integer employeeId);

}
