package com.alexander.classwork.alexander.lesson6.uml.example;

import java.util.Set;

public class BrokerageAccount {
	String countNumber;
	Customer customer;
	Set<Investment> investmants;

	public BrokerageAccount(String countNumber, Customer customer,
			Set investmants) {
		super();
		this.countNumber = countNumber;
		this.customer = customer;
		this.investmants = investmants;
	}

	public String getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(String countNumber) {
		this.countNumber = countNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set getInvestmants() {
		return investmants;
	}

	public void setInvestmants(Set investmants) {
		this.investmants = investmants;
	}

}
