package com.alexander.classwork.lesson5.object_;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order("TV", 3, 500);
		Order o2 = new Order("TV", 3, 500);
		
		System.out.println("Equals: "+o1.equals(o2));
		System.out.println("HashCode: " + o1.hashCode()+" "+o2.hashCode());
		
		/*Order o3 = new Order("TV", 1, 100);
		System.out.println("Equals: "+o1.equals(o3));
		System.out.println("HashCode: " + o1.hashCode()+" "+o3.hashCode());*/
		

	}

}
