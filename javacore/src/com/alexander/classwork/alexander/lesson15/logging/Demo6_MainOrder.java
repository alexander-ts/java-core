package com.alexander.classwork.alexander.lesson15.logging;

public class Demo6_MainOrder {
    private static OrderLogic logic;
 
    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}