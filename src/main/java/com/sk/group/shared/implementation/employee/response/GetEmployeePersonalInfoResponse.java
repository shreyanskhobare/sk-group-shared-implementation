/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author - Shreyans Khobare
 */
@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
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
