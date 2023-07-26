/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.response.organization;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class GetOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5959311531432680602L;

	private Long organizationId;
	private String organizationName;
	
}
