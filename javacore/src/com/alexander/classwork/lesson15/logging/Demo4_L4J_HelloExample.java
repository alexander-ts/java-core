package com.alexander.classwork.lesson15.logging;

import org.apache.log4j.Logger;

public class Demo4_L4J_HelloExample{
	
	final static Logger logger = Logger.getLogger(Demo4_L4J_HelloExample.class);
	
	public static void main(String[] args) {
	
		Demo4_L4J_HelloExample obj = new Demo4_L4J_HelloExample();			
		
		obj.runMe("My Log");	
		
		
	}
	
	private void runMe(String parameter){
		
		//if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
	//	}
		
		//if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
	//	}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}
	
}