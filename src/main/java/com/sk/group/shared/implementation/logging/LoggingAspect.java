/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.implementation.logging;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author - Shreyans Khobare
 */
@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("within(com.sk.group..*) " + "&& (@annotation(org.springframework.web.bind.annotation.GetMapping) "
			+ "|| @annotation(org.springframework.web.bind.annotation.DeleteMapping) "
			+ "|| @annotation(org.springframework.web.bind.annotation.PostMapping))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void logMethod(JoinPoint joinPoint) {

		Signature signature = joinPoint.getSignature();
		String arguments = null;

		if (ArrayUtils.isNotEmpty(joinPoint.getArgs())) {
			arguments = Arrays.toString(joinPoint.getArgs());
		}

		LOGGER.debug("Entering method: {} of Class: {} with arguments: {}", signature.getName(),
				signature.getDeclaringTypeName(), arguments);

	}

	@AfterReturning(pointcut = "pointcut()", returning = "result")
	public void logMethodAfter(JoinPoint joinPoint, ResponseEntity<?> result) {
		LOGGER.debug("Exiting method: {}", joinPoint.getSignature().getName());
	}

}
