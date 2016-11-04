package com.alexander.classwork.alexander.lesson5.static_;

public class Ticket {
	
	static {
		System.out.println("Test");
		
		
	}

	private static int numTicketsSold = 0; // shared
	public  static int T = 1;
	public String ticketNAme;
	public String testNAme;
	public Double number;
	private int ticketNum; // one per object

	public Ticket() {
		numTicketsSold++;
		ticketNum = numTicketsSold;
	}

	public static int getNumberSold() {
		return numTicketsSold;
	}

	public int getTicketNumber() {
		return ticketNum;
	}

	public String getInfo() {
		return "ticket # " + ticketNum + "; " + numTicketsSold
				+ " ticket(s) sold.";
	}

}
