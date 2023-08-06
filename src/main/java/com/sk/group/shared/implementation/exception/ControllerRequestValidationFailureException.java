/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.exception;

import org.springframework.http.HttpStatus;

/**
@author - Shreyans Khobare
*/
public class ControllerRequestValidationFailureException extends GroupException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4912259281921029889L;

	private ControllerRequestValidationFailureException(HttpStatus httpStatus, String errorCode, String errorMessage) {
		super(httpStatus, errorCode, errorMessage);
	}
	
	public ControllerRequestValidationFailureException(String errorCode, String errorMessage) {
		super(HttpStatus.BAD_REQUEST, errorCode, errorMessage);
	}

}
