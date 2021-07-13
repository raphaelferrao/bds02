package com.devsuperior.bds02.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super(String.format("Resource not found with id %s", id));
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
