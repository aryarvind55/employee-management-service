package com.ary.ems.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.ary.ems.dto.DepartmentDto;
import com.ary.ems.entities.DepartmentEntity;
import com.ary.ems.repository.DepartmentRepo;
import com.ary.ems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public List<DepartmentDto> getDepartmentList() {
		return departmentRepo.findAll().stream().map(d -> {
			System.out.println(d);
			return DepartmentDto.builder().departmentId(d.getDepartmentId()).name(d.getName())
					.description(d.getDescription()).location(d.getLocation().getName()).build();
		}).collect(Collectors.toList());
	}

	@Override
	public DepartmentEntity createDepartment(DepartmentEntity departmentEntity) {
		return departmentRepo.save(departmentEntity);
	}

	@Override
	public DepartmentEntity updateDepartment(DepartmentEntity departmentEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(Integer departmentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public DepartmentEntity getDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
