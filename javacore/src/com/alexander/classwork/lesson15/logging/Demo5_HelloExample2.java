package com.alexander.classwork.lesson15.logging;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo5_HelloExample2{
	
	final static Logger logger = Logger.getLogger(Demo5_HelloExample2.class);
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties props = new Properties();
		props.load(new FileInputStream("c:\\log4j.properties"));
		PropertyConfigurator.configure(props);
	
		Demo5_HelloExample2 obj = new Demo5_HelloExample2();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			
			logger.error("Sorry, something wrong!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}