package com.enquero.EnqueroSocialMediaApp.helpers;

import java.text.SimpleDateFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalRestExceptionHandler {
	
	SimpleDateFormat sdf = new SimpleDateFormat();
	
	@ExceptionHandler
	public ResponseEntity<ResponseJson> handleException(UserActionException exc){
		ResponseJson response = new ResponseJson(
				HttpStatus.NOT_ACCEPTABLE.value(),
				exc.getMessage(),
				String.valueOf(sdf.format(System.currentTimeMillis()))
				);
		return new ResponseEntity<ResponseJson>(response,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ResponseJson> handleException(Exception exc){
		ResponseJson response = new ResponseJson(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				String.valueOf(sdf.format(System.currentTimeMillis()))
				);
		return new ResponseEntity<ResponseJson>(response,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler
	public ResponseEntity<ResponseJson> handleException(CommentActionException exc){
		ResponseJson response = new ResponseJson(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				String.valueOf(sdf.format(System.currentTimeMillis()))
				);
		return new ResponseEntity<ResponseJson>(response,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler
	public ResponseEntity<ResponseJson> handleException(LikeActionException exc){
		ResponseJson response = new ResponseJson(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				String.valueOf(sdf.format(System.currentTimeMillis()))
				);
		return new ResponseEntity<ResponseJson>(response,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler
	public ResponseEntity<ResponseJson> handleException(PostActionException exc){
		ResponseJson response = new ResponseJson(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				String.valueOf(sdf.format(System.currentTimeMillis()))
				);
		return new ResponseEntity<ResponseJson>(response,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
}
