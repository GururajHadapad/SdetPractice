package com.practice.genericUtility;

import java.util.Random;

public class JavaUtility {

	
	public int randomNumber() {
		Random ran = new Random();
		int randomnum = ran.nextInt(1000);
		return randomnum;
	}
}
