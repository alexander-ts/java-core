package com.alexander.lesson15.logging;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Demo9_Foo {
	
	
	final static Logger LOG = Logger.getLogger(Demo9_Foo.class);

	    // VERY BAD:
	    // - no context provided
	    // - non-constant message string
	    // - assumes useful toString()
	    public bad_method1(Object arg) {
	        LOG.debug(arg.toString());
	    }

	    // VERY BAD:
	    // - no context provided
	    public bad_method2(Object arg) {
	        LOG.debug("{}", arg);
	    }

	    // COMPLETELY BAD:
	    // - silently ignoring errors!!!
	    public bad_method3(Object arg) {
	        try {
	            doSomething(arg);
	          
	        } catch (SAXParseException ex) {
	        }
	    }

	    // EXTREMELY BAD:
	    // - message is not constant
	    // - no context is provided
	    // - ex.getCause() is lost
	    // - call stack is lost
	    public void bad_method4(Object arg) {
	        try {
	            doSomething(arg);

	        } catch (SAXParseException ex) {
	            LOG.warn(ex.getMessage());
	        }
	    }

	    // EXTREMELY BAD:
	    // - message is not constant
	    // - no context is provided
	    // - ex.getCause() is probably lost
	    // - call stack is probably lost
	    // - assumes useful toString()
	    public void bad_method5(Object arg) {
			doSomething(arg);

		}

	    // VERY BAD:
	    // - no useful context is provided
	    // - ex.getCause() is probably lost
	    // - call stack is probably lost
	    // - administrators don't know what an Exception is!
	    public void bad_method6(Object arg) {
			doSomething(arg);

		}

		private void doSomething(Object arg) {
			// TODO Auto-generated method stub
			
		}
	}


