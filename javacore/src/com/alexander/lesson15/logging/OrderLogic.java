package com.alexander.lesson15.logging;

import org.apache.log4j.Logger;

public class OrderLogic {
	
    
    private static final Logger log = Logger.getLogger(OrderLogic.class);
 
    public void doOrder(){
        
        System.out.println("Order was done");
        
        log.info("Info messege");
        addToCart();
    }
 
    private void addToCart() {
        
        System.out.println("Order added to the card");
        log.trace("trace MSG");
        log.error("Error MSG");
    }
 
}