/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.response.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class ControllerResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6102446844636923999L;
	
	// In case of success
	private String successMessage;
	
	// In case of failure
	private String errorMessage;
	private String errorCode;
	
}
