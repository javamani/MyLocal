package com.javainuse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException {
	
	
	private static final long serialVersionUID = 5344320715962995240L;
	
	private String resourceName;
	private String fieldName;
	private Long fieldValue;
	
	


	public String getResourceName() {
		return resourceName;
	}


	public String getFieldName() {
		return fieldName;
	}


	public Long getFieldValue() {
		return fieldValue;
	}

	public ResourceNotFoundException(String resourceName , String fieldName , Long fieldValue){
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	

}
