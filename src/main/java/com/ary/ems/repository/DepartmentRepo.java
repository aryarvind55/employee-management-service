package com.ary.ems.repository;

import com.ary.ems.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Integer> {

}
