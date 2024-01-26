/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
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
