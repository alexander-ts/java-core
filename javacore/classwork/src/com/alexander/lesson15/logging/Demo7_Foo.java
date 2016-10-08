package com.alexander.lesson15.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class Demo7_Foo {
	
	final static Logger LOG = Logger.getLogger(Demo7_Foo.class);

    // GOOD: string literal, no dynamic objects
    public void good_method(Object arg) {
        LOG.debug("Method called with arg}" +arg);
    }

    // BAD: string varies with argument
    public void bad_method1(Object arg) {
        LOG.debug("Method called with arg " + arg);
    }

    // BAD: code clutter
    public void bad_method2(Object arg) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Method called with arg {}", arg);
        }
    }

    // BAD: wrong level of language, this would be okay on TRACE
    public bad_method3(Object arg) {
        LOG.debug("arg is {}", arg);
    }
}


