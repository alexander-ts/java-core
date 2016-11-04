package com.alexander.classwork.lesson11.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Demo0_1 {
	@Test
	public void stubUsageSample() throws Exception{
	  
	 // create mocked object
	 InterfaceForTest mockedObject = mock(InterfaceForTest.class);
	  
	 // describe expected behavior for our interface
	 when(mockedObject.getStringValue()).thenReturn("expectedValue");
	 
	 System.out.println(mockedObject.getStringValue());
	 
	 System.out.println("---------------");
	  
	 // we can define for one method different return values depending from input value
	 when(mockedObject.processMethod("input1")).thenReturn("value1");
	 when(mockedObject.processMethod("input2")).thenReturn("value2");
	// when(mockedObject.processMethod("input3")).thenThrow(new Exception("exception during method 'processMethod' call"));
	  
	 // also we can define expected value using another approach: doReturn 
	 doReturn("value4").when(mockedObject).processMethod("input4");
//	 doThrow(new Exception()).when(mockedObject).processMethod("method with exception parameter");
	  
	 // assert expected values, that method returns
	 assertEquals("value1", mockedObject.processMethod("input1"));
	 assertEquals("value2", mockedObject.processMethod("input2"));
	  
	 try {
	  mockedObject.processMethod("input3");
	 } catch (Exception ex) {
	  // we expect exception there
	  System.err.println(ex);
	 }
	  
	 // for non mocked input value we expect null
	 assertNull(mockedObject.processMethod("not mocked value"));
	  
	 assertEquals("getString value", "expectedValue", mockedObject.getStringValue());
	}

}
