package com.alexander.lesson14.generics;

public class Demo_BoxPrinter_Generic<T>  { 
    private T val; 
 
    public Demo_BoxPrinter_Generic(T arg) { 
        val = arg; 
    } 
 
    public String toString() { 
        return "{" + val + "}"; 
    } 
 
    public T getValue() { 
        return val; 
    } 
} 
 
class Test { 
    public static void main(String[] args) { 
    	Demo_BoxPrinter_Generic<Integer> value1 = new Demo_BoxPrinter_Generic<Integer>(new Integer(10)); 
    	
        System.out.println(value1); 
        Integer intValue1 = value1.getValue(); 
        
        
        Demo_BoxPrinter_Generic<String> value2 = new Demo_BoxPrinter_Generic<String>("Hello world"); 
        System.out.println(value2);         
        
        
        // Error!!! Compile Error
       Integer intValue2 =  value2.getValue(); 
    } 
} 
