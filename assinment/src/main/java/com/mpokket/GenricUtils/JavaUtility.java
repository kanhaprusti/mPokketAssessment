package com.mpokket.GenricUtils;

import java.util.Random;
/**
 * 
 * @author Kanha
 *
 */
public class JavaUtility {
	
	/**
	 * This method will generate a random number
	 * @author Adarsh
	 * @return
	 */
	public int randomNumber() {
		Random random = new Random();
		int randomData=random.nextInt(5000);
		return randomData;
	}

}
