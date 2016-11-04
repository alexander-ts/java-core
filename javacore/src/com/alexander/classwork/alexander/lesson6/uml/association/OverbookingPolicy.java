package com.alexander.classwork.alexander.lesson6.uml.association;

public class OverbookingPolicy {

	public boolean isAllowed(Cargo cargo, Voyage voyage) {
		
		return (cargo.getSize() + voyage.bookedCargoSize()) <= (voyage
				.getCapacity() * 1.1);

	}

}
