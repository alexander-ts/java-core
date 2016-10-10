package com.alexander.doginterface;



/**
 * Created by alex on 1/31/16.
 */
public class Dog implements Bark{

    String B;

    Dog(String B){
        this.B = B;
    }

    @Override
    public void Barking() {
        System.out.println("Bark");

    }
}
