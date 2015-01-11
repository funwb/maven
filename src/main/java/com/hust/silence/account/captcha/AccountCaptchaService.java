package com.hust.silence.account.captcha;

import java.util.List;

public interface AccountCaptchaService {
	//生成主见
	String generateCaptchaKey() throws AccountCaptchaException;
	byte[] generateCaptchaImage(String captchaKey) throws AccountCaptchaException;
	//验证主键和值
	boolean validateCaptcha(String captchaKey, String captchaValue)throws AccountCaptchaException;
	List<String> getPreDefinedTexts();
	void setPreDefinedTexts(List<String> preDefinedTexts);
}
