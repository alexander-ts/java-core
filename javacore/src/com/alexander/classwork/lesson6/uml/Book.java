package com.alexander.classwork.lesson6.uml;

public class Book {

	private String author;
	private String name;

	public Book() {
		// TODO - implement Book.Book
		throw new UnsupportedOperationException();
	}

	public String getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}