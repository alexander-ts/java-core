package com.alexander.classwork.alexander.lesson5.inheritance;

abstract class StringedInstrument extends Instrument {
	
	public StringedInstrument() {
		System.out.println("StringedInstrument");
	}
	
	public StringedInstrument(int a, int b) {
		System.out.println("StringedInstrument2");
	}
	
	protected int numberOfStrings;
}
