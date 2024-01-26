/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.request;

import java.util.Date;

import lombok.Data;

/**
@author - Shreyans Khobare
*/
@Data
public class SaveEmployeeRequest {

	private Long employeeId;
	private String title;
	private String firstName;
	private String lastName;
	private String organizationEmail;
	private boolean employmentActive = true;
	private String mobileNumber;
	private String personalEmail;
	private String address;
	private Date joiningDate;
	private Date leavingDate;
	private Long organizationId;
	
}
