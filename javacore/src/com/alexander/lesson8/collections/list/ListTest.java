package com.alexander.lesson8.collections.list;

import java.awt.List;

public class ListTest {
	
	 public static void main(String[] args) {
	        LinkedList_1 ml = new LinkedList_1();
	        ml.addBack(1);
	        ml.addBack(2);
	        ml.addBack(3);
	        ml.addFront(6);
	 
	        ml.printList();
	        System.out.println();
	 
	        ml.delEl(6);
	        ml.delEl(5);
	        ml.delEl(12);
	        ml.delEl(2);
	 
	        ml.printList();
	        System.out.println();
	    }

}
