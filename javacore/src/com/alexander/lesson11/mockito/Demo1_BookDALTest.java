package com.alexander.lesson11.mockito;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class Demo1_BookDALTest {

	private static BookDAL mockedBookDAL;
	private static Book book1;
	private static Book book2;

	@BeforeClass
	public static void setUp() {
		// Create mock object of BookDAL
		mockedBookDAL = mock(BookDAL.class);

		// Create few instances of Book class.
		book1 = new Book("8131721019", "Compilers Principles", Arrays.asList(
				"D. Jeffrey Ulman", "Ravi Sethi", "Alfred V. Aho",
				"Monica S. Lam"), "Pearson Education Singapore Pte Ltd", 2008,
				1009, "BOOK_IMAGE");

		book2 = new Book("9788183331630", "Let Us C 13th Edition",
				Arrays.asList("Yashavant Kanetkar"), "BPB PUBLICATIONS", 2012,
				675, "BOOK_IMAGE");

		// Stubbing the methods of mocked BookDAL with mocked data.
		when(mockedBookDAL.getAllBooks()).thenReturn(
				Arrays.asList(book1, book2));
		when(mockedBookDAL.getBook("8131721019")).thenReturn(book1);
		when(mockedBookDAL.addBook(book1)).thenReturn(book1.getIsbn());
		when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getIsbn());
	}

	
	public void testGetAllBooks() throws Exception {
		
	}

	@Test
	public void testGetBook() throws Exception {
		assertEquals(book1, mockedBookDAL.getBook("8131721019"));
		assertEquals("Compilers Principles", mockedBookDAL.getBook("8131721019").getTitle());
	}

	public void testAddBook() throws Exception {
	}

	public void testUpdateBook() throws Exception {
	}

}
