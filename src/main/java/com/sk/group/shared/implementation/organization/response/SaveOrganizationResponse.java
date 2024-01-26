/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.organization.response;

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
public class SaveOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8347785021997022483L;
	private Long organizationId;

}
