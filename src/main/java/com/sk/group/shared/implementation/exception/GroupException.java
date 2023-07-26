/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
@author - Shreyans Khobare
*/
@Getter
public class GroupException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3259674087939160452L;
	private HttpStatus httpStatus;
	private String errorCode;
	private String errorMessage;
	
	public GroupException(HttpStatus httpStatus, String errorCode, String errorMessage) {
		this.httpStatus = httpStatus;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

}
