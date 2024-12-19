package com.example.demo.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@NonNull
public class EmployeeDto {

	private String EmpName;
	private String EmpId;

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}
}
