/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.response.employee;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class GetEmployeeResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6576244914732468467L;
	
	private Long employeeId;
	private String title;
	private String firstName;
	private String lastName;
	private String organizationEmail;
	private Boolean employmentActive;
	private Long organizationId;
	private Long employeePersonalInfoId;

}
