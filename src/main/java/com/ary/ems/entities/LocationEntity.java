package com.ary.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

@Data
@Entity
@Table(name = "location")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LocationEntity {

	@Column(name = "location_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationId;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;


}
