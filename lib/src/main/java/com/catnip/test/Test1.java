package com.catnip.test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Test1 {

	private static final Logger logger = LogManager.getLogger(Test1.class);
	
	public static void main(String[] args) {
		
		logger.info("Here be a message: ");
	}

}
