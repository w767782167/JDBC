package com.etc._3customException;

/**
 * 自定义的异常类
 * @author Administrator
 *
 */
public class LoginException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
