package com.alexander.lesson6.uml.association;

public class Voyage {

	private int capacity;

	private int bookedCargoSize;

	private Cargo[] cargos;

	private OverbookingPolicy overbookingPolicy = new OverbookingPolicy();

	public int bookedCargoSize() {
		return bookedCargoSize;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int makeBooking(Cargo cargo, Voyage voyage) {

		if (!overbookingPolicy.isAllowed(cargo, voyage))
			return -1;
		
		Object orderConfirmationSequence;
		int confirmation = orderConfirmationSequence.next();
		
		voyage.addCargo(cargo, confirmation);
		return confirmation;
	}

	private void addCargo(Cargo cargo, int confirmation) {

	}
}
