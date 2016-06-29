package com.alexander.lesson11.mockito;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class Demo0 {
	
	@Test
	public void methodCallCheckSample() {
	 // create mock for interface
	 InterfaceForTest mockedObject = mock(InterfaceForTest.class);
	 
	 // call methods
	 mockedObject.setStringValue("value1");
	 mockedObject.actionMethod();
	 
	 // verify, that methods are called, please note that we check 
	 // also parameter value
	 verify(mockedObject).setStringValue("value1");
	 System.out.println(mockedObject.getStringValue());
	 verify(mockedObject).actionMethod(); 
	  
	 // in this point we expect exception, because method "getStringValue" not called
	 //verify(mockedObject).getStringValue();
	}

}
