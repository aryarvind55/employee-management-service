package com.ary.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class EmployeeEntity {

	@Column(name = "employee_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_contact_number")
	private String contactNumber;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private DepartmentEntity department;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private CountryEntity country;

}
