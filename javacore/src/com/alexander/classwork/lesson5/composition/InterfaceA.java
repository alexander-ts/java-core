package com.alexander.classwork.lesson5.composition;

public interface InterfaceA {
    public void doSomething();
}

interface InterfaceB {
    public void doSomething();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    //same method is declared in InterfaceA and InterfaceB both
    public void doSomething();      
}