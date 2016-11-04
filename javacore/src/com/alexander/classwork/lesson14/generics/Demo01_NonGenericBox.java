package com.alexander.classwork.lesson14.generics;

public class Demo01_NonGenericBox {

	private Object object;

	public void set(final Object object) {
		this.object = object;
	}

	public Object get() {
		return this.object;
	}

	public void useOfNonGenericBox() {
		final Demo01_NonGenericBox aNonGenericBox = new Demo01_NonGenericBox();
		
		aNonGenericBox.set(new String());
		
		final String myString = (String) aNonGenericBox.get();
		
		System.out.println(myString);
	}
}
