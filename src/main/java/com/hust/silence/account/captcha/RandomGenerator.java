package com.hust.silence.account.captcha;

import java.util.Random;

public class RandomGenerator {
	
		private static String rangeString = "0123456789qwertyuiopasdfghjklzxcvbnm";
		public static synchronized  String getRandomString(){
			Random random = new Random();
			StringBuffer result = new StringBuffer();
			for (int i = 0; i < 8; i++) {
				result.append(rangeString.charAt(random.nextInt(rangeString.length())));
			}
			return result.toString();
		}
		
	
}
