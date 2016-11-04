package com.alexander.classwork.alexander.lesson5.inheritance;

public class ElectricBassGuitar extends StringedInstrument {
	
	public ElectricBassGuitar() {		
		this.name = "Bass Guitar";
		this.numberOfStrings = 4;
	}
	
	public ElectricBassGuitar(int numberOfStrings) {
		super();
		this.name = "Bass Guitar";
		this.numberOfStrings = numberOfStrings;
	}

	@Override
	public void play() {
		System.out.println("An electric " + numberOfStrings + "-string " + name
				+ " is rocking!");
	}

	@Override
	public void play2() {

	}
}
