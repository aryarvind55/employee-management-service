package com.ary.ems.controller;

import java.util.List;

import com.ary.ems.dto.EmployeeDto;
import com.ary.ems.entities.EmployeeEntity;
import com.ary.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@RequestMapping(path="/ems")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/message")
	public String getMessage() {
		return "This is test message";
	}

	@GetMapping("/employees")
	public List<EmployeeDto> getEmployeeList() {
		return employeeService.getEmployeeList();
	}
	
	@GetMapping("/employee/{employeeId}")
	public EmployeeEntity getEmployeeList(@PathVariable("employeeId") Integer employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

	@PostMapping("/create-employee")
	public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.createEmployee(employeeEntity);
	}

	@PutMapping("/update-employee")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateEmployee(employeeEntity);
	}

	@DeleteMapping("/delete-employee/{employeeId}")
	public void updateEmployee(@PathVariable("employeeId") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	
	
	
	

}
