package com.company;

import org.apache.log4j.PropertyConfigurator;

import java.util.logging.Logger;

public class Main {


    public static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");


        //Log in console in and log file
        LOG.warning("Log4j appender configuration is successful !!");
    }
}
