package com.ary.ems.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.ary.ems.dto.EmployeeDto;
import com.ary.ems.entities.EmployeeEntity;
import com.ary.ems.repository.EmployeeRepo;
import com.ary.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<EmployeeDto> getEmployeeList() {
		return employeeRepo.findAll().stream().map(emp -> {
			System.out.println(emp);
			return EmployeeDto.builder().employeeId(emp.getEmployeeId()).employeeName(emp.getEmployeeName())
					.contactNumber(emp.getContactNumber()).department(emp.getDepartment().getName())
					.country(emp.getCountry().getName()).build();
		}).collect(Collectors.toList());
	}

	@Override
	public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
		System.out.println(employeeEntity);
		return employeeRepo.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		return employeeRepo.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeRepo.deleteById(employeeId);

	}

	@Override
	public EmployeeEntity getEmployeeById(Integer employeeId) {
		return employeeRepo.getById(employeeId);
	}

}
