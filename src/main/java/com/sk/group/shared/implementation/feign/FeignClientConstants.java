/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.feign;

/**
@author - Shreyans Khobare
*/
public final class FeignClientConstants {
	
	public static final String API_GATEWAY_URL = "http://localhost:8080/";
	
	// Start - EMPLOYEE_SERVICE Feign entries
	public static final String EMPLOYEE_SERVICE_KEY = "EMPLOYEE-SERVICE";
	public static final String EMPLOYEE_SERVICE_BASE_MAPPING = "api/employee-service";
	public static final String EMPLOYEE_SERVICE_SAVE_EMPLOYEE = "/saveEmployee";
	public static final String EMPLOYEE_SERVICE_GET_PERSONAL_INFO = "/getEmployeePersonalInfo/{employeePersonalInfoId}";
	public static final String EMPLOYEE_SERVICE_GET_EMPLOYEE = "/getEmployee";
	public static final String EMPLOYEE_SERVICE_FILTER_EMPLOYEES = "/filterEmployees";
	// End - EMPLOYEE_SERVICE Feign entries
	
	// Start - ORGANIZATION Feign entries
	public static final String ORGANIZATION_SERVICE_KEY = "ORGANIZATION-SERVICE";
	public static final String ORGANIZATION_SERVICE_BASE_MAPPING = "api/organization-service";
	public static final String ORGANIZATION_SERVICE_SAVE_ORGANIZATION = "/saveOrganizationData";
	public static final String ORGANIZATION_SERVICE_GET_ORGANIZATION = "/getOrganization/{organizationId}";
	public static final String ORGANIZATION_SERVICE_DELETE_ORGANIZATION = "/deleteOrganization";
	public static final String ORGANIZATION_SERVICE_GET_ORGANIZATION_EMPLOYEES = "/getOrganizationEmployees";
	public static final String ORGANIZATION_SERVICE_GET_ALL_ORGANIZATIONS = "/getAllOrganizations";
	// End - ORGANIZATION Feign entries
	

}
