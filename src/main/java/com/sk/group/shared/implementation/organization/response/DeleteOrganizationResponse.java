/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.organization.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.ToString;

/**
@author - Shreyans Khobare
*/
@ToString
@JsonInclude(Include.NON_NULL)
public class DeleteOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3204511821447379638L;

}
