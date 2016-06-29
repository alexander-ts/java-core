package com.alexander.lesson6.uml;

public class Employee extends Man {

	private String position;
   
    public Employee(String n, String s, String p){
        name = n;
        surname = s;
        position = p;
    }
    public void setPosition(String newPosition){
        position = newPosition;
    }
    public String getPosition(){
        return position;
    }
   
}
