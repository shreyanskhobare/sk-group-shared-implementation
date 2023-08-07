/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.organization.response;

import java.util.List;

import com.sk.group.shared.implementation.employee.response.FilterEmployeesResponse.ResponseEmployee;
import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class GetOrganizationEmployeesResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1595131312948398529L;
	private List<ResponseEmployee> employeeList;
	
}
