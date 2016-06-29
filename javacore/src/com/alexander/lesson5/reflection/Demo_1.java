package com.alexander.lesson5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedList;

import com.alexander.lesson5.object_.Order;
import com.alexander.lesson5.static_.Ticket;

public class Demo_1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//1
		Ticket ticket = new Ticket();
		Class classOfTicket = ticket.getClass();
		
		//2
		Class classOfTicket2 = Ticket.class;
		
		
		//3
		Class clazz = Class.forName("com.alexander.lesson5.static_.Ticket");
		
		
		System.out.println(clazz.getName());
		
		
		//1. access to class methods
		Field[] publicFields = clazz.getFields();		
		for (Field field : publicFields) { 
		    Class fieldType = field.getType(); 
		    System.out.println("Name:" + field.getName()); 
		    System.out.println("Type: " + fieldType.getTypeName()); 
		} 
		
		//2.
		int mods = clazz.getModifiers(); 
		if (Modifier.isPublic(mods)) { 
		    System.out.println("public"); 
		} 
		if (Modifier.isAbstract(mods)) { 
		    System.out.println("abstract"); 
		} 
		if (Modifier.isFinal(mods)) { 
		    System.out.println("final"); 
		} 
		
		//3. find class interface 
		Class c =  LinkedList.class; 
		Class[] interfaces = c.getInterfaces(); 
		for(Class cInterface : interfaces) { 
		    System.out.println( cInterface.getName() ); 
		} 
		
		
		
		//4. constructor research of the class
		Order order = new Order(null, mods, mods);
		
		Class cl = order.getClass(); 
		Constructor[] constructors = cl.getConstructors(); 
		for (Constructor constructor : constructors) { 
		    Class[] paramTypes = constructor.getParameterTypes(); 
		    for (Class paramType : paramTypes) { 
		        System.out.print(paramType.getName() + " "); 
		    } 
		    System.out.println(); 
		} 
		
		
		

	}

}
