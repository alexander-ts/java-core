package com.alexander.classwork.lesson8.collections.map;

import java.util.HashMap;
import java.util.Iterator;

public class Demo8_FailFast {
	
	public static void main(String[] args)
    {
		HashMap<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
    }

}
