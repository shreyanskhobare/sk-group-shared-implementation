/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.response.organization;

import java.util.List;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class GetAllOrganizationResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3854686833869885738L;
	
	private List<Object> organizations;

}