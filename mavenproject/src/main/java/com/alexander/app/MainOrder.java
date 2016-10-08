package com.alexander.app;

public class MainOrder {
    private static OrderLogic logic;
 
    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}