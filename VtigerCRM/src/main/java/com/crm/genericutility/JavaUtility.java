package com.crm.genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author Thrinath
 */

public class JavaUtility {
	
	
	 public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method is used to generate random numbers within 1000
	 * @return integer
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}


}
