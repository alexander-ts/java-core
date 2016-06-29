package com.alexander.lesson5.classes;

class Order {
	
	private String product;
	private int quantity;
	private double price;
	
	public Order(){
		
	}

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
				+ quantity + ", price: " + price + "]";
	}
	
	public Demo6_Order setCargoBuilder(Demo6_Order cargo){
		return cargo;
	}
}

class OrderBuilder {

	private String product;
	private int quantity;
	private double price;

	Order build() {
		return new Order(product, quantity, price);
	}

	public OrderBuilder product(String product) {
		this.product = product;
		return this;
	}

	public OrderBuilder quantiry(int quantity) {
		this.quantity = quantity;
		return this;

	}

	public OrderBuilder price(double price) {
		this.price = price;
		return this;
	}
}

public class Demo6_Order {
	
	public void test(){
		Demo3_Cargo cargo = new Demo3_Cargo();
		cargo.setDemo6(this);
	}

	public static void main(String[] args) {

		OrderBuilder builder = new OrderBuilder();

		Order order = builder.quantiry(3).product("Phone").price(45).build();
		StringBuilder stringBuilder = new StringBuilder();
		
		String string = stringBuilder.append("trt").append("sdsd").toString();
		
		Demo3_Cargo cargo = new Demo3_Cargo();
		//cargo.setDemo6(this);
		 
		/*Order order = new Order();
		order.setProduct("IPhone 10");
		order.setPrice(34.3);
		order.setQuantity(4);
		System.out.println(order.toString());*/
		
		
		

		/*System.out.println(order.toString());

		
		
		OrderBuilder builder2 = new OrderBuilder().product("TV");

		Order order2 = builder2.quantiry(3).build();
		

		System.out.println(order2.toString());*/

	}
}
