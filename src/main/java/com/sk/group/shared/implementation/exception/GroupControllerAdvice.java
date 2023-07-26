/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sk.group.shared.implementation.response.controller.ControllerResponse;

import io.micrometer.common.util.StringUtils;

/**
 * @author - Shreyans Khobare
 */
@ControllerAdvice
public class GroupControllerAdvice {

	@Value("${sk.group.phone.number:YYYYYYYYYY}")
	private String groupPhone;

	private static final Logger LOGGER = LoggerFactory.getLogger(GroupControllerAdvice.class);
	private static final String GENERIC_ERROR_MESSAGE = "Oops! Something went wrong. Please call the number: {groupPhone} and mention error code: ";

	@Autowired
	private Environment environment;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ControllerResponse> handleNullPointerException(Exception e) {

		LOGGER.error("Generic Exception caught! Returning response accordingly. \n", e);
		ControllerResponse response = new ControllerResponse();
		response.setErrorCode(GroupErrorCodes.GENERIC_EXCEPTION);
		response.setErrorMessage(getErrorMessage(GroupErrorCodes.GENERIC_EXCEPTION));
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ControllerResponse> handleNullPointerException(NullPointerException e) {

		LOGGER.error("NullPointerException caught! Returning response accordingly. \n", e);
		ControllerResponse response = new ControllerResponse();
		response.setErrorCode(GroupErrorCodes.NULL_POINTER_EXCEPTION);
		response.setErrorMessage(getErrorMessage(GroupErrorCodes.NULL_POINTER_EXCEPTION));
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<ControllerResponse> handleArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException e) {

		LOGGER.error("ArrayIndexOutOfBoundsException caught! Returning response accordingly. \n", e);
		ControllerResponse response = new ControllerResponse();
		response.setErrorCode(GroupErrorCodes.ARRAY_INDEX_OUT_OF_EXCEPTION);
		response.setErrorMessage(getErrorMessage(GroupErrorCodes.ARRAY_INDEX_OUT_OF_EXCEPTION));
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(GroupException.class)
	public ResponseEntity<ControllerResponse> handleGroupException(GroupException e) {

		LOGGER.error("GroupException caught! Returning response accordingly. \n", e);
		ControllerResponse response = new ControllerResponse();
		response.setErrorCode(e.getErrorCode());

		if (StringUtils.isNotBlank(e.getErrorMessage())) {

			/*
			 * In case error message (mostly because of dynamic values) is explicitly passed
			 * while throwing exception
			 */
			response.setErrorMessage(e.getErrorMessage());

		} else {

			/*
			 * In case no explicit error message is passed (having dynamic values) while
			 * throwing exception
			 */
			response.setErrorMessage(getErrorMessage(e.getErrorCode()));

		}

		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	/**
	 * In this method, we return error message to be displayed based on errorcode.
	 * We have also performed blank checks so that generic error message is returned
	 * in case errorCode isn't passed or errorMessage is not defined in properties
	 * file
	 * 
	 * @param errorCode
	 * @return
	 */
	private String getErrorMessage(String errorCode) {

		if (StringUtils.isBlank(errorCode)) {
			// Set default error code. Ideally should never be blank!
			errorCode = GroupErrorCodes.GENERIC_EXCEPTION;
		}

		String message = environment.getProperty(errorCode);
		if (StringUtils.isBlank(message)) {
			String genericError = GENERIC_ERROR_MESSAGE.replace("{groupPhone}", groupPhone);
			message = genericError + errorCode;
		}
		return message;
	}

}
