/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.response.employee;

import java.util.Date;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
 * @author - Shreyans Khobare
 */
@Getter
@Setter
public class GetEmployeePersonalInfoResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5411544205482435618L;
	
	private Long employeeId;
	private Long id;
	private String mobileNumber;
	private String personalEmail;
	private String address;
	private Date joiningDate;
	private Date leavingDate;

}
