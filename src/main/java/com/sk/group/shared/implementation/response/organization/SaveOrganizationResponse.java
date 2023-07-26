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
public class SaveOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8347785021997022483L;
	private Long organizationId;

}
