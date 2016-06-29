package com.alexander.lesson5.composition.service;

public class AggregatedCustomService {
	
	 // ���������
    private AbstractRepository repository; 
    public AggregatedCustomService(AbstractRepository repository) 
    { 
        repository = repository; 
    } 
    public void DoSomething() 
    { 
       
    }

}
