package com.javainuse.exception;
/**
* authorname Administrator
*/

public class UserNotFoundException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String userId){
		super("User not found "  + userId);
	}

}
