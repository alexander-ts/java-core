package com.alexander.classwork.alexander.lesson8.collections.set;

public class Order implements Comparable<Order>{
	
	private String product;
	private int quantity;
	private double price;
	

	public Order(String product, int quantity, double price) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String toString() {
		return getClass().getName() + " [product: " + product + ", quantity: "
				+ quantity + ", price: " + price + "]"+"\n";
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + quantity;
		return result;
	}


	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}


	@Override
	public int compareTo(Order o) {		
		return o.quantity- quantity;
	}
	
	/*@Override
	public int compareTo(Order o) {
		if( (quantity> o.quantity) && (int) price > o.price)
			return 1;
		else
			return 0;		
	}*/
	
	
	
	
}
