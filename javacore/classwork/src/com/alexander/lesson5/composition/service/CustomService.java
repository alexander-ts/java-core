package com.alexander.lesson5.composition.service;

public class CustomService<IRepositoryFactory> {
	// ����������
    private  IRepositoryFactory _repositoryFactory; 
    public CustomService(IRepositoryFactory repositoryFactory) 
    { 
        _repositoryFactory = repositoryFactory; 
    } 
    public void DoSomething() 
    { 
         
    }

}
