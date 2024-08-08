package com.ary.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	private Integer employeeId;

	private String employeeName;

	private String contactNumber;

	private String department;
	
	private String country;

}
