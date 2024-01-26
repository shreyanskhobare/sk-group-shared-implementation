/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.request;

import java.util.List;

import lombok.Data;

/**
 * @author - Shreyans Khobare
 */
@Data
public class FilterEmployeesRequest {

	private List<Long> organizationId;
	private List<Long> employeeId;
	private Boolean employmentActive;
	private Boolean returnEmployeePersonalInfo;

}
