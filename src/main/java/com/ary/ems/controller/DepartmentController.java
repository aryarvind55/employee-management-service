package com.ary.ems.controller;

import java.util.List;

import com.ary.ems.dto.DepartmentDto;
import com.ary.ems.entities.DepartmentEntity;
import com.ary.ems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@RequestMapping(path = "/ems")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/departments")
	public List<DepartmentDto> getDepartmentList() {
		return departmentService.getDepartmentList();
	}

	@GetMapping("/department/{departmentId}")
	public DepartmentEntity getDepartmentList(@PathVariable("departmentId") Integer departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

	@PostMapping("/create-department")
	public DepartmentEntity createDepartment(@RequestBody DepartmentEntity employeeEntity) {
		return departmentService.createDepartment(employeeEntity);
	}

	@PutMapping("/update-department")
	public DepartmentEntity updateDepartment(@RequestBody DepartmentEntity employeeEntity) {
		return departmentService.updateDepartment(employeeEntity);
	}

	@DeleteMapping("/delete-employee/{departmentId}")
	public void updateDepartment(@PathVariable("departmentId") Integer departmentId) {
		departmentService.deleteDepartment(departmentId);
	}

}
