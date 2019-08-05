package com.ok.example.h2example.exception;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The Global Exception Handler for all Controller.
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	/**
	 * @param request
	 *            HttpServletRequest
	 * @param ex
	 *            Exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleSQLException(final HttpServletRequest request, final Exception ex) {

		logger.error("Exception Occured: URL= {} Caused By : {}", request.getRequestURL(), ex);

		String errMsg = "{\"errorMessage\":\"Exception Occured, Caused By :" + ex.getMessage() + "\"}";
		// return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		return new ResponseEntity<>(errMsg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
