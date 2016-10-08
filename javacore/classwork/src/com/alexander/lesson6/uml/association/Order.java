package com.alexander.lesson6.uml.association;

import java.util.*;

public class Order {

	private Date dateReceived;
	private boolean isPrepaid;
	private Collesson<OrderLine> lineItems;

	public Order() {
		// TODO - implement Order.Order
		throw new UnsupportedOperationException();
	}

	public Date getDateReceived() {
		return this.dateReceived;
	}

	/**
	 * 
	 * @param dateReceived
	 */
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public boolean getIsPrepaid() {
		return this.isPrepaid;
	}

	/**
	 * 
	 * @param isPrepaid
	 */
	public void setIsPrepaid(boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}

	public OrderLine getLineItems() {
		// TODO - implement Order.getLineItems
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lineItems
	 */
	public void setLineItems(OrderLine lineItems) {
		// TODO - implement Order.setLineItems
		throw new UnsupportedOperationException();
	}

}