package com.alexander.lesson14.generics;

public class Demo1_Version {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ParamVersion<String> stringVerison = new ParamVersion<>("String", 12);
		System.out.println(stringVerison.getVersion());
		ParamVersion<int[]> arrayVerison = new ParamVersion<int[]>(new int[] {10,22}, 2);
		System.out.println(arrayVerison.getVersion());
	}	

}

class ParamVersion<T>{
	private T value;
	private int version;
	
	public ParamVersion(T value, int version) {		
		this.value = value;
		this.version = version;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
