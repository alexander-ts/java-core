package com.alexander.classwork.lesson14.generics;

import java.awt.Frame;

public class Demo0 {

	public static void main(final String[] args) {
		Object o;
		o = new Long(1);
		System.out.println(o.toString());
		o = new Frame();
		System.out.println(o.toString());
		o = new String();
		o = new Double(23);
	}

}
