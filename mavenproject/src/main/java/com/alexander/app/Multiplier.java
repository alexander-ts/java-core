package com.alexander.app;

public class Multiplier {

	public int multiply(final int factor1, final int factor2,
			final int... factors) {
		
		int product = factor1 * factor2;
		
		for (final int individualFactor : factors) {
			product *= individualFactor;
		}
		
		return product;
		
	}
}
