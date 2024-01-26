/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.organization.response;

import java.util.List;

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
public class GetAllOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3854686833869885738L;
	
	private List<Organization> organizations;
	
	@Getter
	@Setter
	public static class Organization {
		
		private long organizationId;
		private String organizationName;
		
	}

}
