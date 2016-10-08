package com.alexander.lesson15.logging;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class Demo8_Foo2 {
	
	final static Logger LOG = Logger.getLogger(Demo7_Foo.class);

    // GOOD: note how there is no "{}" for ex
    public void good_method(Object arg) {
        try {
            doSomething(arg);
         
        } catch (SAXException ex) {
            LOG.warn("Failed to do something with {}, continuing", arg, ex);
        }
    }

    // BAD:
    // - exception is interpreted as an object
    // - exception chaining cause is lost
    // - stack trace is lost
    private void doSomething(Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void bad_method(Object arg) {
        try {
            doSomething(arg);
           
        } catch (SAXException ex) {
            LOG.warn("Failed to do something with {} because {}, continuing", arg, ex);
        }
    }
}


