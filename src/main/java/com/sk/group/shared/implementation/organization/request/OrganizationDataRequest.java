/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.organization.request;

import java.util.List;

import lombok.Data;

/**
@author - Shreyans Khobare
*/
@Data
public class OrganizationDataRequest {

	private Long organizationId;
	private String organizationName;
	private List<Long> organizationIdList;
	
}
