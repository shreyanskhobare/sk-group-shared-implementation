/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.exception;

/**
@author - Shreyans Khobare
*/
public class GroupErrorCodes {

	// Generic Errors
	public static final String GENERIC_EXCEPTION = "ERR01";
	public static final String NULL_POINTER_EXCEPTION = "ERR02";
	public static final String ARRAY_INDEX_OUT_OF_EXCEPTION = "ERR03";
	
	// Employee Checked Errors
	public static final String EMPLOYEE_NOT_FOUND = "EMP01";
	public static final String EMPLOYEE_EMAIL_EXISTS = "EMP02";
	public static final String EMPLOYEE_MOBILE_EXISTS = "EMP03";

	public static final String EMPLOYEE_PERSONAL_INFO_NOT_FOUND = "EPI01";
	
	// Organization Checked Errors
	public static final String ORGANIZATION_NOT_FOUND = "ORG01";
	
}
