package com.alexander.lesson15.logging;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2_HandlerExample {

	private static final Logger LOGGER = Logger.getLogger(Demo2_HandlerExample.class.getName());
	
	
	public static void main(String[] args) {

		Handler consoleHandler = null;
		Handler fileHandler  = null;
		try{
			//Creating consoleHandler and fileHandler
			consoleHandler = new ConsoleHandler();
			fileHandler  = new FileHandler("./test.log");
			
			//Assigning handlers to LOGGER object
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fileHandler);
			
			
			//Setting levels to handlers and LOGGER
			consoleHandler.setLevel(Level.WARNING);
			fileHandler.setLevel(Level.INFO);
			LOGGER.setLevel(Level.ALL);
			LOGGER.info("Test info");
			
			LOGGER.config("Configuration done.");
			LOGGER.config("Configuration done2.");
			
			//Console handler removed
			LOGGER.removeHandler(consoleHandler);
			
			
			LOGGER.log(Level.ALL, "ALL logged");
			LOGGER.log(Level.CONFIG, "CONFIG logged");
			LOGGER.log(Level.FINE, "FINE logged");
			LOGGER.log(Level.FINER, "FINER logged");
			LOGGER.log(Level.FINEST, "FINEST logged");
			LOGGER.log(Level.INFO, "INFO logged");
			LOGGER.log(Level.SEVERE, "SEVERE logged");
			LOGGER.log(Level.WARNING, "WARNING logged");
		}catch(IOException exception){
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
		}
		
		LOGGER.finer("Finest example on LOGGER handler completed.");
		
	}
}

