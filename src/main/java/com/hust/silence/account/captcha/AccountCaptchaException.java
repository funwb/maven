package com.hust.silence.account.captcha;

public class AccountCaptchaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5448044218638615725L;
	public AccountCaptchaException(String m){
		super(m);
	}
	public AccountCaptchaException(String m,Throwable throwable){
		super(m, throwable);
	}
}
