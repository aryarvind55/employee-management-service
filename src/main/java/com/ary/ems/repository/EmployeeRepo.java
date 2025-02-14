package com.ary.ems.repository;

import com.ary.ems.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
