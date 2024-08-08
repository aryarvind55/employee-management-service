package com.ary.ems.service;

import com.ary.ems.dto.DepartmentDto;
import com.ary.ems.entities.DepartmentEntity;

import java.util.List;



public interface DepartmentService {

	List<DepartmentDto> getDepartmentList();

	DepartmentEntity createDepartment(DepartmentEntity departmentEntity);

	DepartmentEntity updateDepartment(DepartmentEntity departmentEntity);

	void deleteDepartment(Integer departmentId);

	DepartmentEntity getDepartmentById(Integer departmentId);

}
