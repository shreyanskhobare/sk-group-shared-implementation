/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.employee.response;

import java.util.Date;
import java.util.List;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import lombok.Getter;
import lombok.Setter;

/**
@author - Shreyans Khobare
*/
@Getter
@Setter
public class FilterEmployeesResponse extends ControllerResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2800678134497597013L;
	
	private List<ResponseEmployee> employeeList;

	@Getter
	@Setter
	public static class ResponseEmployee {
		
		private Long employeeId;
		private String title;
		private String firstName;
		private String lastName;
		private String organizationEmail;
		private boolean employmentActive;
		private Long organizationId;
		private Long employeePersonalInfoId;
		private ResponseEmployeePersonalInfo employeePersonalInfo;
		
		@Getter
		@Setter
		public static class ResponseEmployeePersonalInfo {
			
			private Long employeeId;
			private Long id;
			private String mobileNumber;
			private String personalEmail;
			private String address;
			private Date joiningDate;
			private Date leavingDate;
			
		}
		
	}

}
