package com.ary.ems.entities;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "department")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DepartmentEntity {

	@Column(name = "department_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentId;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "location_id")
	private LocationEntity location;

}
