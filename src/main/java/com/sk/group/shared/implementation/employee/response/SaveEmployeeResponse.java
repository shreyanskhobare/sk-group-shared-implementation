/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.response;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class SaveEmployeeResponse extends ControllerResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6166573806881738923L;
	
	private Long employeeId;

}
