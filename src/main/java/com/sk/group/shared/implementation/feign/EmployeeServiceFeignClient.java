/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.feign;

import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_FILTER_EMPLOYEES;
import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_GET_EMPLOYEE;
import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_GET_PERSONAL_INFO;
import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_KEY;
import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_SAVE_EMPLOYEE;
import static com.sk.group.shared.implementation.feign.FeignClientConstants.EMPLOYEE_SERVICE_BASE_MAPPING;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.group.shared.implementation.employee.request.FilterEmployeesRequest;
import com.sk.group.shared.implementation.employee.request.SaveEmployeeRequest;
import com.sk.group.shared.implementation.employee.response.FilterEmployeesResponse;
import com.sk.group.shared.implementation.employee.response.GetEmployeePersonalInfoResponse;
import com.sk.group.shared.implementation.employee.response.GetEmployeeResponse;
import com.sk.group.shared.implementation.employee.response.SaveEmployeeResponse;

/**
 * @author - Shreyans Khobare
 */
@FeignClient(value = EMPLOYEE_SERVICE_KEY)
public interface EmployeeServiceFeignClient {

	@PostMapping(value = EMPLOYEE_SERVICE_BASE_MAPPING + EMPLOYEE_SERVICE_SAVE_EMPLOYEE)
	public SaveEmployeeResponse saveEmployeeData(@RequestBody SaveEmployeeRequest employeePersonalInfo);

	@GetMapping(value = EMPLOYEE_SERVICE_BASE_MAPPING + EMPLOYEE_SERVICE_GET_PERSONAL_INFO)
	public GetEmployeePersonalInfoResponse getEmployeePersonalInfo(@PathVariable("employeePersonalInfoId") String employeePersonalInfoId);

	@GetMapping(value = EMPLOYEE_SERVICE_BASE_MAPPING + EMPLOYEE_SERVICE_GET_EMPLOYEE)
	public GetEmployeeResponse getEmployee(@RequestParam("employeeId") String employeeId);

	@GetMapping(value = EMPLOYEE_SERVICE_BASE_MAPPING + EMPLOYEE_SERVICE_FILTER_EMPLOYEES)
	public FilterEmployeesResponse filterEmployees(@RequestBody FilterEmployeesRequest filterEmployeeRequest);

}
